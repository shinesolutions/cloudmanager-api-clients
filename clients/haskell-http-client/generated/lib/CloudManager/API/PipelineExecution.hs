{-
   Cloud Manager API

   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   OpenAPI Version: 3.0.3
   Cloud Manager API API version: 1.0.0
   Contact: opensource@shinesolutions.com
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : CloudManager.API.PipelineExecution
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module CloudManager.API.PipelineExecution where

import CloudManager.Core
import CloudManager.MimeTypes
import CloudManager.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** PipelineExecution

-- *** advancePipelineExecution

-- | @PUT \/api\/program\/{programId}\/pipeline\/{pipelineId}\/execution\/{executionId}\/phase\/{phaseId}\/step\/{stepId}\/advance@
-- 
-- Advance
-- 
-- Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
-- 
advancePipelineExecution 
  :: (Consumes AdvancePipelineExecution MimeJSON, MimeRender MimeJSON Body)
  => Body -- ^ "body" -  Input for advance. See documentation for details.
  -> ProgramId -- ^ "programId" -  Identifier of the program.
  -> PipelineId -- ^ "pipelineId" -  Identifier of the pipeline
  -> ExecutionId -- ^ "executionId" -  Identifier of the execution
  -> PhaseId -- ^ "phaseId" -  Identifier of the phase
  -> StepId -- ^ "stepId" -  Identifier of the step
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> ParamContentType -- ^ "_contentType" -  Must always be application/json
  -> CloudManagerRequest AdvancePipelineExecution MimeJSON NoContent MimeNoContent
advancePipelineExecution body (ProgramId programId) (PipelineId pipelineId) (ExecutionId executionId) (PhaseId phaseId) (StepId stepId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) (ParamContentType _contentType) =
  _mkRequest "PUT" ["/api/program/",toPath programId,"/pipeline/",toPath pipelineId,"/execution/",toPath executionId,"/phase/",toPath phaseId,"/step/",toPath stepId,"/advance"]
    `setBodyParam` body
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)
    `setHeader` toHeader ("Content-Type", _contentType)

data AdvancePipelineExecution 

-- | /Body Param/ "body" - Input for advance. See documentation for details.
instance HasBodyParam AdvancePipelineExecution Body 

-- | @application/json@
instance Consumes AdvancePipelineExecution MimeJSON

instance Produces AdvancePipelineExecution MimeNoContent


-- *** cancelPipelineExecutionStep

-- | @PUT \/api\/program\/{programId}\/pipeline\/{pipelineId}\/execution\/{executionId}\/phase\/{phaseId}\/step\/{stepId}\/cancel@
-- 
-- Cancel
-- 
-- Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
-- 
cancelPipelineExecutionStep 
  :: (Consumes CancelPipelineExecutionStep MimeJSON, MimeRender MimeJSON Body)
  => Body -- ^ "body" -  Input for advance. See documentation for details.
  -> ProgramId -- ^ "programId" -  Identifier of the program.
  -> PipelineId -- ^ "pipelineId" -  Identifier of the pipeline
  -> ExecutionId -- ^ "executionId" -  Identifier of the execution
  -> PhaseId -- ^ "phaseId" -  Identifier of the phase
  -> StepId -- ^ "stepId" -  Identifier of the step
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> ParamContentType -- ^ "_contentType" -  Must always be application/json
  -> CloudManagerRequest CancelPipelineExecutionStep MimeJSON NoContent MimeNoContent
cancelPipelineExecutionStep body (ProgramId programId) (PipelineId pipelineId) (ExecutionId executionId) (PhaseId phaseId) (StepId stepId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) (ParamContentType _contentType) =
  _mkRequest "PUT" ["/api/program/",toPath programId,"/pipeline/",toPath pipelineId,"/execution/",toPath executionId,"/phase/",toPath phaseId,"/step/",toPath stepId,"/cancel"]
    `setBodyParam` body
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)
    `setHeader` toHeader ("Content-Type", _contentType)

data CancelPipelineExecutionStep 

-- | /Body Param/ "body" - Input for advance. See documentation for details.
instance HasBodyParam CancelPipelineExecutionStep Body 

-- | @application/json@
instance Consumes CancelPipelineExecutionStep MimeJSON

instance Produces CancelPipelineExecutionStep MimeNoContent


-- *** getCurrentExecution

-- | @GET \/api\/program\/{programId}\/pipeline\/{pipelineId}\/execution@
-- 
-- Get current pipeline execution
-- 
-- Returns current pipeline execution if any.
-- 
getCurrentExecution 
  :: ProgramId -- ^ "programId" -  Identifier of the program.
  -> PipelineId -- ^ "pipelineId" -  Identifier of the pipeline
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest GetCurrentExecution MimeNoContent PipelineExecution MimeJSON
getCurrentExecution (ProgramId programId) (PipelineId pipelineId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/pipeline/",toPath pipelineId,"/execution"]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data GetCurrentExecution  
-- | @application/json@
instance Produces GetCurrentExecution MimeJSON


-- *** getExecution

-- | @GET \/api\/program\/{programId}\/pipeline\/{pipelineId}\/execution\/{executionId}@
-- 
-- Get pipeline execution
-- 
-- Returns a pipeline execution by id
-- 
getExecution 
  :: ProgramId -- ^ "programId" -  Identifier of the program.
  -> PipelineId -- ^ "pipelineId" -  Identifier of the pipeline
  -> ExecutionId -- ^ "executionId" -  Identifier of the execution
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest GetExecution MimeNoContent PipelineExecution MimeJSON
getExecution (ProgramId programId) (PipelineId pipelineId) (ExecutionId executionId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/pipeline/",toPath pipelineId,"/execution/",toPath executionId]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data GetExecution  
-- | @application/json@
instance Produces GetExecution MimeJSON


-- *** getExecutions

-- | @GET \/api\/program\/{programId}\/pipeline\/{pipelineId}\/executions@
-- 
-- List Executions
-- 
-- Returns the history of pipeline executions in a newest to oldest order
-- 
getExecutions 
  :: ProgramId -- ^ "programId" -  Identifier of the program.
  -> PipelineId -- ^ "pipelineId" -  Identifier of the pipeline
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest GetExecutions MimeNoContent PipelineExecutionListRepresentation MimeJSON
getExecutions (ProgramId programId) (PipelineId pipelineId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/pipeline/",toPath pipelineId,"/executions"]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data GetExecutions  

-- | /Optional Param/ "start" - Pagination start parameter
instance HasOptionalParam GetExecutions Start where
  applyOptionalParam req (Start xs) =
    req `setQuery` toQuery ("start", Just xs)

-- | /Optional Param/ "limit" - Pagination limit parameter
instance HasOptionalParam GetExecutions Limit where
  applyOptionalParam req (Limit xs) =
    req `setQuery` toQuery ("limit", Just xs)
-- | @application/json@
instance Produces GetExecutions MimeJSON


-- *** getStepLogs

-- | @GET \/api\/program\/{programId}\/pipeline\/{pipelineId}\/execution\/{executionId}\/phase\/{phaseId}\/step\/{stepId}\/logs@
-- 
-- Get logs
-- 
-- Get the logs associated with a step.
-- 
getStepLogs 
  :: ProgramId -- ^ "programId" -  Identifier of the program.
  -> PipelineId -- ^ "pipelineId" -  Identifier of the pipeline
  -> ExecutionId -- ^ "executionId" -  Identifier of the execution
  -> PhaseId -- ^ "phaseId" -  Identifier of the phase
  -> StepId -- ^ "stepId" -  Identifier of the step
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest GetStepLogs MimeNoContent NoContent MimeNoContent
getStepLogs (ProgramId programId) (PipelineId pipelineId) (ExecutionId executionId) (PhaseId phaseId) (StepId stepId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/pipeline/",toPath pipelineId,"/execution/",toPath executionId,"/phase/",toPath phaseId,"/step/",toPath stepId,"/logs"]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data GetStepLogs  

-- | /Optional Param/ "file" - Identifier of the log file
instance HasOptionalParam GetStepLogs File where
  applyOptionalParam req (File xs) =
    req `setQuery` toQuery ("file", Just xs)

-- | /Optional Param/ "Accept" - Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
instance HasOptionalParam GetStepLogs ParamAccept where
  applyOptionalParam req (ParamAccept xs) =
    req `setHeader` toHeader ("Accept", xs)
instance Produces GetStepLogs MimeNoContent


-- *** startPipeline

-- | @PUT \/api\/program\/{programId}\/pipeline\/{pipelineId}\/execution@
-- 
-- Start the pipeline
-- 
-- Starts the Pipeline. This works only if the pipeline is not already started.
-- 
startPipeline 
  :: ProgramId -- ^ "programId" -  Identifier of the program.
  -> PipelineId -- ^ "pipelineId" -  Identifier of the pipeline
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> ParamContentType -- ^ "_contentType" -  Must always be application/json
  -> CloudManagerRequest StartPipeline MimeNoContent NoContent MimeNoContent
startPipeline (ProgramId programId) (PipelineId pipelineId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) (ParamContentType _contentType) =
  _mkRequest "PUT" ["/api/program/",toPath programId,"/pipeline/",toPath pipelineId,"/execution"]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)
    `setHeader` toHeader ("Content-Type", _contentType)

data StartPipeline  
instance Produces StartPipeline MimeNoContent


-- *** stepMetric

-- | @GET \/api\/program\/{programId}\/pipeline\/{pipelineId}\/execution\/{executionId}\/phase\/{phaseId}\/step\/{stepId}\/metrics@
-- 
-- Get step metrics
-- 
stepMetric 
  :: ProgramId -- ^ "programId" -  Identifier of the program.
  -> PipelineId -- ^ "pipelineId" -  Identifier of the pipeline
  -> ExecutionId -- ^ "executionId" -  Identifier of the execution
  -> PhaseId -- ^ "phaseId" -  Identifier of the phase
  -> StepId -- ^ "stepId" -  Identifier of the step
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest StepMetric MimeNoContent PipelineStepMetrics MimeJSON
stepMetric (ProgramId programId) (PipelineId pipelineId) (ExecutionId executionId) (PhaseId phaseId) (StepId stepId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/pipeline/",toPath pipelineId,"/execution/",toPath executionId,"/phase/",toPath phaseId,"/step/",toPath stepId,"/metrics"]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data StepMetric  
-- | @application/json@
instance Produces StepMetric MimeJSON


-- *** stepState

-- | @GET \/api\/program\/{programId}\/pipeline\/{pipelineId}\/execution\/{executionId}\/phase\/{phaseId}\/step\/{stepId}@
-- 
-- Get step state
-- 
stepState 
  :: ProgramId -- ^ "programId" -  Identifier of the program.
  -> PipelineId -- ^ "pipelineId" -  Identifier of the pipeline
  -> ExecutionId -- ^ "executionId" -  Identifier of the execution
  -> PhaseId -- ^ "phaseId" -  Identifier of the phase
  -> StepId -- ^ "stepId" -  Identifier of the step
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest StepState MimeNoContent PipelineExecutionStepState MimeJSON
stepState (ProgramId programId) (PipelineId pipelineId) (ExecutionId executionId) (PhaseId phaseId) (StepId stepId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/pipeline/",toPath pipelineId,"/execution/",toPath executionId,"/phase/",toPath phaseId,"/step/",toPath stepId]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data StepState  
-- | @application/json@
instance Produces StepState MimeJSON

