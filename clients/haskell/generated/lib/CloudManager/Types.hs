{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module CloudManager.Types (
  BadRequestError (..),
  BranchList (..),
  BranchListEmbedded (..),
  EmbeddedProgram (..),
  Environment (..),
  EnvironmentLinks (..),
  EnvironmentList (..),
  EnvironmentListEmbedded (..),
  EnvironmentLog (..),
  EnvironmentLogLinks (..),
  EnvironmentLogs (..),
  EnvironmentLogsEmbedded (..),
  EnvironmentLogsLinks (..),
  HalLink (..),
  InvalidParameter (..),
  Metric (..),
  MissingParameter (..),
  Pipeline (..),
  PipelineExecution (..),
  PipelineExecutionEmbedded (..),
  PipelineExecutionLinks (..),
  PipelineExecutionListRepresentation (..),
  PipelineExecutionListRepresentationEmbedded (..),
  PipelineExecutionListRepresentationLinks (..),
  PipelineExecutionStepState (..),
  PipelineExecutionStepStateLinks (..),
  PipelineLinks (..),
  PipelineList (..),
  PipelineListEmbedded (..),
  PipelinePhase (..),
  PipelineStepMetrics (..),
  Program (..),
  ProgramLinks (..),
  ProgramList (..),
  ProgramListEmbedded (..),
  ProgramListLinks (..),
  Repository (..),
  RepositoryBranch (..),
  RepositoryBranchLinks (..),
  RepositoryLinks (..),
  RepositoryList (..),
  RepositoryListEmbedded (..),
  RequestedPageDetails (..),
  Variable (..),
  VariableList (..),
  VariableListEmbedded (..),
  VariableListLinks (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Set (Set)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | A Bad Request response error.
data BadRequestError = BadRequestError
  { badRequestErrorStatus :: Maybe Int -- ^ HTTP status code of the response.
  , badRequestErrorType :: Maybe Text -- ^ Error type identifier.
  , badRequestErrorTitle :: Maybe Text -- ^ A short summary of the error.
  , badRequestErrorMissingParams :: Maybe [MissingParameter] -- ^ Request's missing parameters.
  , badRequestErrorInvalidParams :: Maybe [InvalidParameter] -- ^ Request's invalid parameters.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BadRequestError where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "badRequestError")
instance ToJSON BadRequestError where
  toJSON = genericToJSON (removeFieldLabelPrefix False "badRequestError")


-- | 
data BranchList = BranchList
  { branchListUnderscoretotalNumberOfItems :: Maybe Int -- ^ 
  , branchListUnderscoreembedded :: Maybe BranchListEmbedded -- ^ 
  , branchListUnderscorelinks :: Maybe ProgramListLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BranchList where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "branchList")
instance ToJSON BranchList where
  toJSON = genericToJSON (removeFieldLabelPrefix False "branchList")


-- | 
data BranchListEmbedded = BranchListEmbedded
  { branchListEmbeddedBranches :: Maybe [RepositoryBranch] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BranchListEmbedded where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "branchListEmbedded")
instance ToJSON BranchListEmbedded where
  toJSON = genericToJSON (removeFieldLabelPrefix False "branchListEmbedded")


-- | Describes an __Embedded Program__
data EmbeddedProgram = EmbeddedProgram
  { embeddedProgramId :: Maybe Text -- ^ Identifier of the program. Unique within the space.
  , embeddedProgramName :: Maybe Text -- ^ Name of the program
  , embeddedProgramEnabled :: Maybe Bool -- ^ Whether this Program has been enabled for Cloud Manager usage
  , embeddedProgramTenantId :: Maybe Text -- ^ Tenant Id
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EmbeddedProgram where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "embeddedProgram")
instance ToJSON EmbeddedProgram where
  toJSON = genericToJSON (removeFieldLabelPrefix False "embeddedProgram")


-- | An Environment that 
data Environment = Environment
  { environmentId :: Maybe Text -- ^ id
  , environmentProgramId :: Maybe Text -- ^ Identifier of the program. Unique within the space.
  , environmentName :: Maybe Text -- ^ Name of the environment
  , environmentDescription :: Maybe Text -- ^ Description of the environment
  , environmentType :: Maybe Text -- ^ Type of the environment
  , environmentUnderscorelinks :: Maybe EnvironmentLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Environment where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "environment")
instance ToJSON Environment where
  toJSON = genericToJSON (removeFieldLabelPrefix False "environment")


-- | 
data EnvironmentLinks = EnvironmentLinks
  { environmentLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram :: Maybe HalLink -- ^ 
  , environmentLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipeline :: Maybe HalLink -- ^ 
  , environmentLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashauthor :: Maybe HalLink -- ^ 
  , environmentLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpublish :: Maybe HalLink -- ^ 
  , environmentLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashdeveloperConsole :: Maybe HalLink -- ^ 
  , environmentLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogs :: Maybe HalLink -- ^ 
  , environmentLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashvariables :: Maybe HalLink -- ^ 
  , environmentLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EnvironmentLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "environmentLinks")
instance ToJSON EnvironmentLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "environmentLinks")


-- | 
data EnvironmentList = EnvironmentList
  { environmentListUnderscoretotalNumberOfItems :: Maybe Int -- ^ 
  , environmentListUnderscoreembedded :: Maybe EnvironmentListEmbedded -- ^ 
  , environmentListUnderscorelinks :: Maybe ProgramListLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EnvironmentList where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "environmentList")
instance ToJSON EnvironmentList where
  toJSON = genericToJSON (removeFieldLabelPrefix False "environmentList")


-- | 
data EnvironmentListEmbedded = EnvironmentListEmbedded
  { environmentListEmbeddedEnvironments :: Maybe [Environment] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EnvironmentListEmbedded where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "environmentListEmbedded")
instance ToJSON EnvironmentListEmbedded where
  toJSON = genericToJSON (removeFieldLabelPrefix False "environmentListEmbedded")


-- | Log from Environment
data EnvironmentLog = EnvironmentLog
  { environmentLogService :: Maybe Text -- ^ Name of the service
  , environmentLogName :: Maybe Text -- ^ Name of the Log
  , environmentLogDate :: Maybe Text -- ^ date of the Log
  , environmentLogProgramId :: Maybe Integer -- ^ 
  , environmentLogEnvironmentId :: Maybe Integer -- ^ 
  , environmentLogUnderscorelinks :: Maybe EnvironmentLogLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EnvironmentLog where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "environmentLog")
instance ToJSON EnvironmentLog where
  toJSON = genericToJSON (removeFieldLabelPrefix False "environmentLog")


-- | 
data EnvironmentLogLinks = EnvironmentLogLinks
  { environmentLogLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashdownload :: Maybe HalLink -- ^ 
  , environmentLogLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashtail :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EnvironmentLogLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "environmentLogLinks")
instance ToJSON EnvironmentLogLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "environmentLogLinks")


-- | Logs of an Environment
data EnvironmentLogs = EnvironmentLogs
  { environmentLogsService :: Maybe [Text] -- ^ Name of the service
  , environmentLogsName :: Maybe [Text] -- ^ Name of the Log
  , environmentLogsDays :: Maybe Int -- ^ Number of days
  , environmentLogsUnderscorelinks :: Maybe EnvironmentLogsLinks -- ^ 
  , environmentLogsUnderscoreembedded :: Maybe EnvironmentLogsEmbedded -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EnvironmentLogs where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "environmentLogs")
instance ToJSON EnvironmentLogs where
  toJSON = genericToJSON (removeFieldLabelPrefix False "environmentLogs")


-- | 
data EnvironmentLogsEmbedded = EnvironmentLogsEmbedded
  { environmentLogsEmbeddedDownloads :: Maybe [EnvironmentLog] -- ^ Links to logs
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EnvironmentLogsEmbedded where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "environmentLogsEmbedded")
instance ToJSON EnvironmentLogsEmbedded where
  toJSON = genericToJSON (removeFieldLabelPrefix False "environmentLogsEmbedded")


-- | 
data EnvironmentLogsLinks = EnvironmentLogsLinks
  { environmentLogsLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram :: Maybe HalLink -- ^ 
  , environmentLogsLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EnvironmentLogsLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "environmentLogsLinks")
instance ToJSON EnvironmentLogsLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "environmentLogsLinks")


-- | 
data HalLink = HalLink
  { halLinkHref :: Maybe Text -- ^ 
  , halLinkTemplated :: Maybe Bool -- ^ 
  , halLinkType :: Maybe Text -- ^ 
  , halLinkDeprecation :: Maybe Text -- ^ 
  , halLinkProfile :: Maybe Text -- ^ 
  , halLinkTitle :: Maybe Text -- ^ 
  , halLinkHreflang :: Maybe Text -- ^ 
  , halLinkName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON HalLink where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "halLink")
instance ToJSON HalLink where
  toJSON = genericToJSON (removeFieldLabelPrefix False "halLink")


-- | 
data InvalidParameter = InvalidParameter
  { invalidParameterName :: Maybe Text -- ^ Name of the invalid parameter.
  , invalidParameterReason :: Maybe Text -- ^ Reason of why the parameter's value is not accepted.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InvalidParameter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "invalidParameter")
instance ToJSON InvalidParameter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "invalidParameter")


-- | Describes a __Metric__
data Metric = Metric
  { metricId :: Maybe Text -- ^ KPI result identifier
  , metricSeverity :: Maybe Text -- ^ Severity of the metric
  , metricPassed :: Maybe Bool -- ^ Whether metric is considered passed
  , metricOverride :: Maybe Bool -- ^ Whether user override the failed metric
  , metricActualValue :: Maybe Text -- ^ Expected value for the metric
  , metricExpectedValue :: Maybe Text -- ^ Expected value for the metric
  , metricComparator :: Maybe Text -- ^ Comparator used for the metric
  , metricKpi :: Maybe Text -- ^ KPI identifier
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Metric where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "metric")
instance ToJSON Metric where
  toJSON = genericToJSON (removeFieldLabelPrefix False "metric")


-- | 
data MissingParameter = MissingParameter
  { missingParameterName :: Maybe Text -- ^ Name of the missing parameter.
  , missingParameterType :: Maybe Text -- ^ Type of the missing parameter.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MissingParameter where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "missingParameter")
instance ToJSON MissingParameter where
  toJSON = genericToJSON (removeFieldLabelPrefix False "missingParameter")


-- | Describes a __CI/CD Pipeline__
data Pipeline = Pipeline
  { pipelineId :: Maybe Text -- ^ Identifier of the pipeline. Unique within the program.
  , pipelineProgramId :: Maybe Text -- ^ Identifier of the program. Unique within the space.
  , pipelineName :: Text -- ^ Name of the pipeline
  , pipelineTrigger :: Maybe Text -- ^ How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
  , pipelineStatus :: Maybe Text -- ^ Pipeline status
  , pipelineCreatedAt :: Maybe UTCTime -- ^ Create date
  , pipelineUpdatedAt :: Maybe UTCTime -- ^ Update date
  , pipelineLastStartedAt :: Maybe UTCTime -- ^ Last pipeline execution start
  , pipelineLastFinishedAt :: Maybe UTCTime -- ^ Last pipeline execution end
  , pipelinePhases :: [PipelinePhase] -- ^ Pipeline phases in execution order
  , pipelineUnderscorelinks :: Maybe PipelineLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Pipeline where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipeline")
instance ToJSON Pipeline where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipeline")


-- | Wraps a pipeline execution
data PipelineExecution = PipelineExecution
  { pipelineExecutionId :: Maybe Text -- ^ Pipeline execution identifier
  , pipelineExecutionProgramId :: Maybe Text -- ^ Identifier of the program. Unique within the space.
  , pipelineExecutionPipelineId :: Maybe Text -- ^ Identifier of the pipeline. Unique within the space.
  , pipelineExecutionArtifactsVersion :: Maybe Text -- ^ Version of the artifacts generated during this execution
  , pipelineExecutionUser :: Maybe Text -- ^ AdobeID who started the pipeline. Empty for auto triggered builds
  , pipelineExecutionStatus :: Maybe Text -- ^ Status of the execution
  , pipelineExecutionTrigger :: Maybe Text -- ^ How the execution was triggered.
  , pipelineExecutionCreatedAt :: Maybe UTCTime -- ^ Start time
  , pipelineExecutionUpdatedAt :: Maybe UTCTime -- ^ Date of last status change
  , pipelineExecutionFinishedAt :: Maybe UTCTime -- ^ Date the execution reached a final state
  , pipelineExecutionUnderscoreembedded :: Maybe PipelineExecutionEmbedded -- ^ 
  , pipelineExecutionUnderscorelinks :: Maybe PipelineExecutionLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineExecution where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineExecution")
instance ToJSON PipelineExecution where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineExecution")


-- | 
data PipelineExecutionEmbedded = PipelineExecutionEmbedded
  { pipelineExecutionEmbeddedStepStates :: Maybe [PipelineExecutionStepState] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineExecutionEmbedded where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineExecutionEmbedded")
instance ToJSON PipelineExecutionEmbedded where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineExecutionEmbedded")


-- | 
data PipelineExecutionLinks = PipelineExecutionLinks
  { pipelineExecutionLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram :: Maybe HalLink -- ^ 
  , pipelineExecutionLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipeline :: Maybe HalLink -- ^ 
  , pipelineExecutionLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineExecutionLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineExecutionLinks")
instance ToJSON PipelineExecutionLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineExecutionLinks")


-- | List of pipeline executions
data PipelineExecutionListRepresentation = PipelineExecutionListRepresentation
  { pipelineExecutionListRepresentationUnderscoretotalNumberOfItems :: Maybe Int -- ^ 
  , pipelineExecutionListRepresentationUnderscorepage :: Maybe RequestedPageDetails -- ^ 
  , pipelineExecutionListRepresentationUnderscoreembedded :: Maybe PipelineExecutionListRepresentationEmbedded -- ^ 
  , pipelineExecutionListRepresentationUnderscorelinks :: Maybe PipelineExecutionListRepresentationLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineExecutionListRepresentation where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineExecutionListRepresentation")
instance ToJSON PipelineExecutionListRepresentation where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineExecutionListRepresentation")


-- | 
data PipelineExecutionListRepresentationEmbedded = PipelineExecutionListRepresentationEmbedded
  { pipelineExecutionListRepresentationEmbeddedExecutions :: Maybe [PipelineExecution] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineExecutionListRepresentationEmbedded where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineExecutionListRepresentationEmbedded")
instance ToJSON PipelineExecutionListRepresentationEmbedded where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineExecutionListRepresentationEmbedded")


-- | 
data PipelineExecutionListRepresentationLinks = PipelineExecutionListRepresentationLinks
  { pipelineExecutionListRepresentationLinksNext :: Maybe HalLink -- ^ 
  , pipelineExecutionListRepresentationLinksPage :: Maybe HalLink -- ^ 
  , pipelineExecutionListRepresentationLinksPrev :: Maybe HalLink -- ^ 
  , pipelineExecutionListRepresentationLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineExecutionListRepresentationLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineExecutionListRepresentationLinks")
instance ToJSON PipelineExecutionListRepresentationLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineExecutionListRepresentationLinks")


-- | Describes the status of a particular pipeline execution step for display purposes
data PipelineExecutionStepState = PipelineExecutionStepState
  { pipelineExecutionStepStateId :: Maybe Text -- ^ 
  , pipelineExecutionStepStateStepId :: Maybe Text -- ^ 
  , pipelineExecutionStepStatePhaseId :: Maybe Text -- ^ 
  , pipelineExecutionStepStateAction :: Maybe Text -- ^ Name of the action
  , pipelineExecutionStepStateRepository :: Maybe Text -- ^ Target repository
  , pipelineExecutionStepStateBranch :: Maybe Text -- ^ Target branch
  , pipelineExecutionStepStateEnvironment :: Maybe Text -- ^ Target environment
  , pipelineExecutionStepStateEnvironmentType :: Maybe Text -- ^ Target environment type
  , pipelineExecutionStepStateStartedAt :: Maybe UTCTime -- ^ Start time
  , pipelineExecutionStepStateFinishedAt :: Maybe UTCTime -- ^ Date the execution reached a final state
  , pipelineExecutionStepStateDetails :: Maybe (Map.Map String Value) -- ^ Information about step result
  , pipelineExecutionStepStateStatus :: Maybe Text -- ^ Action status
  , pipelineExecutionStepStateUnderscorelinks :: Maybe PipelineExecutionStepStateLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineExecutionStepState where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineExecutionStepState")
instance ToJSON PipelineExecutionStepState where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineExecutionStepState")


-- | 
data PipelineExecutionStepStateLinks = PipelineExecutionStepStateLinks
  { pipelineExecutionStepStateLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecution :: Maybe HalLink -- ^ 
  , pipelineExecutionStepStateLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipeline :: Maybe HalLink -- ^ 
  , pipelineExecutionStepStateLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashlogs :: Maybe HalLink -- ^ 
  , pipelineExecutionStepStateLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashmetrics :: Maybe HalLink -- ^ 
  , pipelineExecutionStepStateLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashadvance :: Maybe HalLink -- ^ 
  , pipelineExecutionStepStateLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashcancel :: Maybe HalLink -- ^ 
  , pipelineExecutionStepStateLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram :: Maybe HalLink -- ^ 
  , pipelineExecutionStepStateLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineExecutionStepStateLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineExecutionStepStateLinks")
instance ToJSON PipelineExecutionStepStateLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineExecutionStepStateLinks")


-- | 
data PipelineLinks = PipelineLinks
  { pipelineLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram :: Maybe HalLink -- ^ 
  , pipelineLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecution :: Maybe HalLink -- ^ 
  , pipelineLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecutions :: Maybe HalLink -- ^ 
  , pipelineLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrollbackLastSuccessfulExecution :: Maybe HalLink -- ^ 
  , pipelineLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineLinks")
instance ToJSON PipelineLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineLinks")


-- | 
data PipelineList = PipelineList
  { pipelineListUnderscoretotalNumberOfItems :: Maybe Int -- ^ 
  , pipelineListUnderscoreembedded :: Maybe PipelineListEmbedded -- ^ 
  , pipelineListUnderscorelinks :: Maybe ProgramListLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineList where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineList")
instance ToJSON PipelineList where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineList")


-- | 
data PipelineListEmbedded = PipelineListEmbedded
  { pipelineListEmbeddedPipelines :: Maybe [Pipeline] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineListEmbedded where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineListEmbedded")
instance ToJSON PipelineListEmbedded where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineListEmbedded")


-- | Describes a phase of a pipeline
data PipelinePhase = PipelinePhase
  { pipelinePhaseName :: Maybe Text -- ^ Name of the phase
  , pipelinePhaseType :: Text -- ^ Type of the phase
  , pipelinePhaseRepositoryId :: Maybe Text -- ^ Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
  , pipelinePhaseBranch :: Maybe Text -- ^ Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
  , pipelinePhaseEnvironmentId :: Maybe Text -- ^ Identifier of the target environment. Mandatory if type=DEPLOY
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelinePhase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelinePhase")
instance ToJSON PipelinePhase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelinePhase")


-- | 
data PipelineStepMetrics = PipelineStepMetrics
  { pipelineStepMetricsMetrics :: Maybe [Metric] -- ^ metrics
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PipelineStepMetrics where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pipelineStepMetrics")
instance ToJSON PipelineStepMetrics where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pipelineStepMetrics")


-- | Describes a __Program__
data Program = Program
  { programId :: Maybe Text -- ^ Identifier of the program. Unique within the space.
  , programName :: Text -- ^ Name of the program
  , programEnabled :: Maybe Bool -- ^ Whether this Program has been enabled for Cloud Manager usage
  , programTenantId :: Maybe Text -- ^ Tenant Id
  , programImsOrgId :: Maybe Text -- ^ Organisation Id
  , programUnderscorelinks :: Maybe ProgramLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Program where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "program")
instance ToJSON Program where
  toJSON = genericToJSON (removeFieldLabelPrefix False "program")


-- | 
data ProgramLinks = ProgramLinks
  { programLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelines :: Maybe HalLink -- ^ 
  , programLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashenvironments :: Maybe HalLink -- ^ 
  , programLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrepositories :: Maybe HalLink -- ^ 
  , programLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ProgramLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "programLinks")
instance ToJSON ProgramLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "programLinks")


-- | 
data ProgramList = ProgramList
  { programListUnderscoretotalNumberOfItems :: Maybe Int -- ^ 
  , programListUnderscoreembedded :: Maybe ProgramListEmbedded -- ^ 
  , programListUnderscorelinks :: Maybe ProgramListLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ProgramList where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "programList")
instance ToJSON ProgramList where
  toJSON = genericToJSON (removeFieldLabelPrefix False "programList")


-- | 
data ProgramListEmbedded = ProgramListEmbedded
  { programListEmbeddedPrograms :: Maybe [EmbeddedProgram] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ProgramListEmbedded where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "programListEmbedded")
instance ToJSON ProgramListEmbedded where
  toJSON = genericToJSON (removeFieldLabelPrefix False "programListEmbedded")


-- | 
data ProgramListLinks = ProgramListLinks
  { programListLinksNext :: Maybe HalLink -- ^ 
  , programListLinksPrev :: Maybe HalLink -- ^ 
  , programListLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ProgramListLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "programListLinks")
instance ToJSON ProgramListLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "programListLinks")


-- | A sourcecode repository
data Repository = Repository
  { repositoryRepo :: Maybe Text -- ^ Repository name
  , repositoryDescription :: Maybe Text -- ^ description
  , repositoryUnderscorelinks :: Maybe RepositoryLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Repository where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "repository")
instance ToJSON Repository where
  toJSON = genericToJSON (removeFieldLabelPrefix False "repository")


-- | Represents a Git Branch
data RepositoryBranch = RepositoryBranch
  { repositoryBranchProgramId :: Maybe Text -- ^ Identifier of the program. Unique within the space
  , repositoryBranchRepositoryId :: Maybe Integer -- ^ Identifier of the repository
  , repositoryBranchName :: Maybe Text -- ^ Name of the branch
  , repositoryBranchUnderscorelinks :: Maybe RepositoryBranchLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RepositoryBranch where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "repositoryBranch")
instance ToJSON RepositoryBranch where
  toJSON = genericToJSON (removeFieldLabelPrefix False "repositoryBranch")


-- | 
data RepositoryBranchLinks = RepositoryBranchLinks
  { repositoryBranchLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram :: Maybe HalLink -- ^ 
  , repositoryBranchLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrepository :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RepositoryBranchLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "repositoryBranchLinks")
instance ToJSON RepositoryBranchLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "repositoryBranchLinks")


-- | 
data RepositoryLinks = RepositoryLinks
  { repositoryLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram :: Maybe HalLink -- ^ 
  , repositoryLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashbranches :: Maybe HalLink -- ^ 
  , repositoryLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RepositoryLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "repositoryLinks")
instance ToJSON RepositoryLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "repositoryLinks")


-- | 
data RepositoryList = RepositoryList
  { repositoryListUnderscoretotalNumberOfItems :: Maybe Int -- ^ 
  , repositoryListUnderscoreembedded :: Maybe RepositoryListEmbedded -- ^ 
  , repositoryListUnderscorelinks :: Maybe ProgramListLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RepositoryList where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "repositoryList")
instance ToJSON RepositoryList where
  toJSON = genericToJSON (removeFieldLabelPrefix False "repositoryList")


-- | 
data RepositoryListEmbedded = RepositoryListEmbedded
  { repositoryListEmbeddedRepositories :: Maybe [Repository] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RepositoryListEmbedded where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "repositoryListEmbedded")
instance ToJSON RepositoryListEmbedded where
  toJSON = genericToJSON (removeFieldLabelPrefix False "repositoryListEmbedded")


-- | Filtering and sorting page details
data RequestedPageDetails = RequestedPageDetails
  { requestedPageDetailsStart :: Maybe Int -- ^ 
  , requestedPageDetailsLimit :: Maybe Int -- ^ 
  , requestedPageDetailsOrderBy :: Maybe Text -- ^ 
  , requestedPageDetailsProperty :: Maybe [Text] -- ^ 
  , requestedPageDetailsType :: Maybe Text -- ^ 
  , requestedPageDetailsNext :: Maybe Int -- ^ 
  , requestedPageDetailsPrev :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RequestedPageDetails where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "requestedPageDetails")
instance ToJSON RequestedPageDetails where
  toJSON = genericToJSON (removeFieldLabelPrefix False "requestedPageDetails")


-- | A named value than can be set on an Environment
data Variable = Variable
  { variableName :: Maybe Text -- ^ Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
  , variableValue :: Maybe Text -- ^ Value of the variable. Read-Write for non-secrets, write-only for secrets.
  , variableType :: Maybe Text -- ^ Type of the variable. Default `string` if missing. Cannot be changed after creation.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Variable where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "variable")
instance ToJSON Variable where
  toJSON = genericToJSON (removeFieldLabelPrefix False "variable")


-- | 
data VariableList = VariableList
  { variableListUnderscoretotalNumberOfItems :: Maybe Int -- ^ 
  , variableListUnderscoreembedded :: Maybe VariableListEmbedded -- ^ 
  , variableListUnderscorelinks :: Maybe VariableListLinks -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VariableList where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "variableList")
instance ToJSON VariableList where
  toJSON = genericToJSON (removeFieldLabelPrefix False "variableList")


-- | 
data VariableListEmbedded = VariableListEmbedded
  { variableListEmbeddedVariables :: Maybe [Variable] -- ^ Variables set on environment
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VariableListEmbedded where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "variableListEmbedded")
instance ToJSON VariableListEmbedded where
  toJSON = genericToJSON (removeFieldLabelPrefix False "variableListEmbedded")


-- | 
data VariableListLinks = VariableListLinks
  { variableListLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashenvironment :: Maybe HalLink -- ^ 
  , variableListLinksHttpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram :: Maybe HalLink -- ^ 
  , variableListLinksSelf :: Maybe HalLink -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VariableListLinks where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "variableListLinks")
instance ToJSON VariableListLinks where
  toJSON = genericToJSON (removeFieldLabelPrefix False "variableListLinks")


uncapitalize :: String -> String
uncapitalize (first:rest) = Char.toLower first : rest
uncapitalize [] = []

-- | Remove a field label prefix during JSON parsing.
--   Also perform any replacements for special characters.
--   The @forParsing@ parameter is to distinguish between the cases in which we're using this
--   to power a @FromJSON@ or a @ToJSON@ instance. In the first case we're parsing, and we want
--   to replace special characters with their quoted equivalents (because we cannot have special
--   chars in identifier names), while we want to do viceversa when sending data instead.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = uncapitalize . fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars =
      [ ("@", "'At")
      , ("\\", "'Back_Slash")
      , ("<=", "'Less_Than_Or_Equal_To")
      , ("\"", "'Double_Quote")
      , ("[", "'Left_Square_Bracket")
      , ("]", "'Right_Square_Bracket")
      , ("^", "'Caret")
      , ("_", "'Underscore")
      , ("`", "'Backtick")
      , ("!", "'Exclamation")
      , ("#", "'Hash")
      , ("$", "'Dollar")
      , ("%", "'Percent")
      , ("&", "'Ampersand")
      , ("'", "'Quote")
      , ("(", "'Left_Parenthesis")
      , (")", "'Right_Parenthesis")
      , ("*", "'Star")
      , ("+", "'Plus")
      , (",", "'Comma")
      , ("-", "'Dash")
      , (".", "'Period")
      , ("/", "'Slash")
      , (":", "'Colon")
      , ("{", "'Left_Curly_Bracket")
      , ("|", "'Pipe")
      , ("<", "'LessThan")
      , ("!=", "'Not_Equal")
      , ("=", "'Equal")
      , ("}", "'Right_Curly_Bracket")
      , (">", "'GreaterThan")
      , ("~", "'Tilde")
      , ("?", "'Question_Mark")
      , (">=", "'Greater_Than_Or_Equal_To")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer =
      if forParsing
        then flip T.replace
        else T.replace
