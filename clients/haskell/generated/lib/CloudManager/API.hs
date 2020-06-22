{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module CloudManager.API
  -- * Client and Server
  ( Config(..)
  , CloudManagerBackend(..)
  , createCloudManagerClient
  , runCloudManagerServer
  , runCloudManagerMiddlewareServer
  , runCloudManagerClient
  , runCloudManagerClientWithManager
  , callCloudManager
  , CloudManagerClient
  , CloudManagerClientError(..)
  -- ** Servant
  , CloudManagerAPI
  ) where

import           CloudManager.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware)
import qualified Network.Wai.Handler.Warp           as Warp
import           Servant                            (ServerError, serve)
import           Servant.API
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application)
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData




-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList


-- | Servant type-level API, generated from the OpenAPI spec for CloudManager.
type CloudManagerAPI
    =    "api" :> "program" :> Capture "programId" Text :> "repository" :> Capture "repositoryId" Text :> "branches" :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] BranchList -- 'getBranches' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "environment" :> Capture "environmentId" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'DELETE 200 '[JSON] Environment -- 'deleteEnvironment' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "environment" :> Capture "environmentId" Text :> "logs" :> "download" :> QueryParam "service" Text :> QueryParam "name" Text :> QueryParam "date" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Header "Accept" Text :> Verb 'GET 200 '[JSON] () -- 'downloadLogs' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "environment" :> Capture "environmentId" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] Environment -- 'getEnvironment' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "environment" :> Capture "environmentId" Text :> "logs" :> QueryParam "service" (QueryList 'MultiParamArray (Text)) :> QueryParam "name" (QueryList 'MultiParamArray (Text)) :> QueryParam "days" Int :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] EnvironmentLogs -- 'getEnvironmentLogs' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "environments" :> QueryParam "type" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] EnvironmentList -- 'getEnvironments' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> "execution" :> Capture "executionId" Text :> "phase" :> Capture "phaseId" Text :> "step" :> Capture "stepId" Text :> "advance" :> ReqBody '[JSON] Value :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Header "Content-Type" Text :> Verb 'PUT 200 '[JSON] () -- 'advancePipelineExecution' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> "execution" :> Capture "executionId" Text :> "phase" :> Capture "phaseId" Text :> "step" :> Capture "stepId" Text :> "cancel" :> ReqBody '[JSON] Value :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Header "Content-Type" Text :> Verb 'PUT 200 '[JSON] () -- 'cancelPipelineExecutionStep' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> "execution" :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] PipelineExecution -- 'getCurrentExecution' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> "execution" :> Capture "executionId" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] PipelineExecution -- 'getExecution' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> "executions" :> QueryParam "start" Text :> QueryParam "limit" Int :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] PipelineExecutionListRepresentation -- 'getExecutions' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> "execution" :> Capture "executionId" Text :> "phase" :> Capture "phaseId" Text :> "step" :> Capture "stepId" Text :> "logs" :> QueryParam "file" Text :> Header "Accept" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] () -- 'getStepLogs' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> "execution" :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Header "Content-Type" Text :> Verb 'PUT 200 '[JSON] () -- 'startPipeline' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> "execution" :> Capture "executionId" Text :> "phase" :> Capture "phaseId" Text :> "step" :> Capture "stepId" Text :> "metrics" :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] PipelineStepMetrics -- 'stepMetric' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> "execution" :> Capture "executionId" Text :> "phase" :> Capture "phaseId" Text :> "step" :> Capture "stepId" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] PipelineExecutionStepState -- 'stepState' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'DELETE 200 '[JSON] () -- 'deletePipeline' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] Pipeline -- 'getPipeline' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipelines" :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] PipelineList -- 'getPipelines' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "pipeline" :> Capture "pipelineId" Text :> ReqBody '[JSON] Pipeline :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Header "Content-Type" Text :> Verb 'PATCH 200 '[JSON] Pipeline -- 'patchPipeline' route
    :<|> "api" :> "program" :> Capture "programId" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'DELETE 200 '[JSON] Program -- 'deleteProgram' route
    :<|> "api" :> "program" :> Capture "programId" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] Program -- 'getProgram' route
    :<|> "api" :> "programs" :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] ProgramList -- 'getPrograms' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "repositories" :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] RepositoryList -- 'getRepositories' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "repository" :> Capture "repositoryId" Text :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] Repository -- 'getRepository' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "environment" :> Capture "environmentId" Text :> "variables" :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Verb 'GET 200 '[JSON] VariableList -- 'getEnvironmentVariables' route
    :<|> "api" :> "program" :> Capture "programId" Text :> "environment" :> Capture "environmentId" Text :> "variables" :> ReqBody '[JSON] [Variable] :> Header "x-gw-ims-org-id" Text :> Header "Authorization" Text :> Header "x-api-key" Text :> Header "Content-Type" Text :> Verb 'PATCH 200 '[JSON] VariableList -- 'patchEnvironmentVariables' route
    :<|> Raw 


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype CloudManagerClientError = CloudManagerClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for CloudManager.
-- The backend can be used both for the client and the server. The client generated from the CloudManager OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createCloudManagerClient@). Alternatively, provided
-- a backend, the API can be served using @runCloudManagerMiddlewareServer@.
data CloudManagerBackend m = CloudManagerBackend
  { getBranches :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m BranchList{- ^ Returns the list of branches from a repository -}
  , deleteEnvironment :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m Environment{- ^ Delete environment -}
  , downloadLogs :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^ Download environment logs -}
  , getEnvironment :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m Environment{- ^ Returns an environment by its id -}
  , getEnvironmentLogs :: Text -> Text -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> m EnvironmentLogs{- ^ List all logs available in environment -}
  , getEnvironments :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m EnvironmentList{- ^ Lists all environments in an program -}
  , advancePipelineExecution :: Text -> Text -> Text -> Text -> Text -> Value -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^ Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped. -}
  , cancelPipelineExecutionStep :: Text -> Text -> Text -> Text -> Text -> Value -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^ Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case. -}
  , getCurrentExecution :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m PipelineExecution{- ^ Returns current pipeline execution if any. -}
  , getExecution :: Text -> Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m PipelineExecution{- ^ Returns a pipeline execution by id -}
  , getExecutions :: Text -> Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> m PipelineExecutionListRepresentation{- ^ Returns the history of pipeline executions in a newest to oldest order -}
  , getStepLogs :: Text -> Text -> Text -> Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^ Get the logs associated with a step. -}
  , startPipeline :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^ Starts the Pipeline. This works only if the pipeline is not already started. -}
  , stepMetric :: Text -> Text -> Text -> Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m PipelineStepMetrics{- ^  -}
  , stepState :: Text -> Text -> Text -> Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m PipelineExecutionStepState{- ^  -}
  , deletePipeline :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m (){- ^ Delete a pipeline. All the data is wiped. -}
  , getPipeline :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m Pipeline{- ^ Returns a pipeline by its id -}
  , getPipelines :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> m PipelineList{- ^ Returns all the pipelines that the requesting user has access to in an program -}
  , patchPipeline :: Text -> Text -> Pipeline -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m Pipeline{- ^ Patches a pipeline within an program. -}
  , deleteProgram :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> m Program{- ^ Delete an program -}
  , getProgram :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> m Program{- ^ Returns a program by its id -}
  , getPrograms :: Maybe Text -> Maybe Text -> Maybe Text -> m ProgramList{- ^ Returns all programs that the requesting user has access to -}
  , getRepositories :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> m RepositoryList{- ^ Lists all Repositories in an program -}
  , getRepository :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m Repository{- ^ Returns an repository by its id -}
  , getEnvironmentVariables :: Text -> Text -> Maybe Text -> Maybe Text -> Maybe Text -> m VariableList{- ^ List the user defined variables for an environment (Cloud Service only). -}
  , patchEnvironmentVariables :: Text -> Text -> [Variable] -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m VariableList{- ^ Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value. -}
  }

newtype CloudManagerClient a = CloudManagerClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative CloudManagerClient where
  pure x = CloudManagerClient (\_ -> pure x)
  (CloudManagerClient f) <*> (CloudManagerClient x) =
    CloudManagerClient (\env -> f env <*> x env)

instance Monad CloudManagerClient where
  (CloudManagerClient a) >>= f =
    CloudManagerClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO CloudManagerClient where
  liftIO io = CloudManagerClient (\_ -> liftIO io)

createCloudManagerClient :: CloudManagerBackend CloudManagerClient
createCloudManagerClient = CloudManagerBackend{..}
  where
    ((coerce -> getBranches) :<|>
     (coerce -> deleteEnvironment) :<|>
     (coerce -> downloadLogs) :<|>
     (coerce -> getEnvironment) :<|>
     (coerce -> getEnvironmentLogs) :<|>
     (coerce -> getEnvironments) :<|>
     (coerce -> advancePipelineExecution) :<|>
     (coerce -> cancelPipelineExecutionStep) :<|>
     (coerce -> getCurrentExecution) :<|>
     (coerce -> getExecution) :<|>
     (coerce -> getExecutions) :<|>
     (coerce -> getStepLogs) :<|>
     (coerce -> startPipeline) :<|>
     (coerce -> stepMetric) :<|>
     (coerce -> stepState) :<|>
     (coerce -> deletePipeline) :<|>
     (coerce -> getPipeline) :<|>
     (coerce -> getPipelines) :<|>
     (coerce -> patchPipeline) :<|>
     (coerce -> deleteProgram) :<|>
     (coerce -> getProgram) :<|>
     (coerce -> getPrograms) :<|>
     (coerce -> getRepositories) :<|>
     (coerce -> getRepository) :<|>
     (coerce -> getEnvironmentVariables) :<|>
     (coerce -> patchEnvironmentVariables) :<|>
     _) = client (Proxy :: Proxy CloudManagerAPI)

-- | Run requests in the CloudManagerClient monad.
runCloudManagerClient :: Config -> CloudManagerClient a -> ExceptT ClientError IO a
runCloudManagerClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runCloudManagerClientWithManager manager clientConfig cl

-- | Run requests in the CloudManagerClient monad using a custom manager.
runCloudManagerClientWithManager :: Manager -> Config -> CloudManagerClient a -> ExceptT ClientError IO a
runCloudManagerClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a CloudManagerClientError
callCloudManager
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> CloudManagerClient a -> m a
callCloudManager env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (CloudManagerClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the CloudManager server at the provided host and port.
runCloudManagerServer
  :: (MonadIO m, MonadThrow m)
  => Config -> CloudManagerBackend (ExceptT ServerError IO) -> m ()
runCloudManagerServer config backend = runCloudManagerMiddlewareServer config requestMiddlewareId backend

-- | Run the CloudManager server at the provided host and port.
runCloudManagerMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> CloudManagerBackend (ExceptT ServerError IO) -> m ()
runCloudManagerMiddlewareServer Config{..} middleware backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serve (Proxy :: Proxy CloudManagerAPI) (serverFromBackend backend)
  where
    serverFromBackend CloudManagerBackend{..} =
      (coerce getBranches :<|>
       coerce deleteEnvironment :<|>
       coerce downloadLogs :<|>
       coerce getEnvironment :<|>
       coerce getEnvironmentLogs :<|>
       coerce getEnvironments :<|>
       coerce advancePipelineExecution :<|>
       coerce cancelPipelineExecutionStep :<|>
       coerce getCurrentExecution :<|>
       coerce getExecution :<|>
       coerce getExecutions :<|>
       coerce getStepLogs :<|>
       coerce startPipeline :<|>
       coerce stepMetric :<|>
       coerce stepState :<|>
       coerce deletePipeline :<|>
       coerce getPipeline :<|>
       coerce getPipelines :<|>
       coerce patchPipeline :<|>
       coerce deleteProgram :<|>
       coerce getProgram :<|>
       coerce getPrograms :<|>
       coerce getRepositories :<|>
       coerce getRepository :<|>
       coerce getEnvironmentVariables :<|>
       coerce patchEnvironmentVariables :<|>
       serveDirectoryFileServer "static")
