{-
   Cloud Manager API

   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   OpenAPI Version: 3.0.3
   Cloud Manager API API version: 1.0.0
   Contact: opensource@shinesolutions.com
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : CloudManager.API.Environments
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module CloudManager.API.Environments where

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


-- ** Environments

-- *** deleteEnvironment

-- | @DELETE \/api\/program\/{programId}\/environment\/{environmentId}@
-- 
-- DeleteEnvironment
-- 
-- Delete environment
-- 
deleteEnvironment 
  :: ProgramId -- ^ "programId" -  Identifier of the application
  -> EnvironmentId -- ^ "environmentId" -  Identifier of the environment
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest DeleteEnvironment MimeNoContent Environment MimeJSON
deleteEnvironment (ProgramId programId) (EnvironmentId environmentId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "DELETE" ["/api/program/",toPath programId,"/environment/",toPath environmentId]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data DeleteEnvironment  
-- | @application/json@
instance Produces DeleteEnvironment MimeJSON


-- *** downloadLogs

-- | @GET \/api\/program\/{programId}\/environment\/{environmentId}\/logs\/download@
-- 
-- Download Logs
-- 
-- Download environment logs
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
downloadLogs 
  :: ProgramId -- ^ "programId" -  Identifier of the program
  -> EnvironmentId -- ^ "environmentId" -  Identifier of the environment
  -> ServiceText -- ^ "service" -  Name of service
  -> NameText -- ^ "name" -  Name of log
  -> ParamDate -- ^ "date" -  date for which log is required
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest DownloadLogs MimeNoContent res MimeJSON
downloadLogs (ProgramId programId) (EnvironmentId environmentId) (ServiceText service) (NameText name) (ParamDate date) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/environment/",toPath environmentId,"/logs/download"]
    `setQuery` toQuery ("service", Just service)
    `setQuery` toQuery ("name", Just name)
    `setQuery` toQuery ("date", Just date)
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data DownloadLogs  

-- | /Optional Param/ "Accept" - Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
instance HasOptionalParam DownloadLogs ParamAccept where
  applyOptionalParam req (ParamAccept xs) =
    req `setHeader` toHeader ("Accept", xs)
-- | @application/json@
instance Produces DownloadLogs MimeJSON


-- *** getEnvironment

-- | @GET \/api\/program\/{programId}\/environment\/{environmentId}@
-- 
-- Get Environment
-- 
-- Returns an environment by its id
-- 
getEnvironment 
  :: ProgramId -- ^ "programId" -  Identifier of the program
  -> EnvironmentId -- ^ "environmentId" -  Identifier of the environment
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest GetEnvironment MimeNoContent Environment MimeJSON
getEnvironment (ProgramId programId) (EnvironmentId environmentId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/environment/",toPath environmentId]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data GetEnvironment  
-- | @application/json@
instance Produces GetEnvironment MimeJSON


-- *** getEnvironmentLogs

-- | @GET \/api\/program\/{programId}\/environment\/{environmentId}\/logs@
-- 
-- Get Environment Logs
-- 
-- List all logs available in environment
-- 
getEnvironmentLogs 
  :: ProgramId -- ^ "programId" -  Identifier of the program
  -> EnvironmentId -- ^ "environmentId" -  Identifier of the environment
  -> Days -- ^ "days" -  number of days for which logs are required
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest GetEnvironmentLogs MimeNoContent EnvironmentLogs MimeJSON
getEnvironmentLogs (ProgramId programId) (EnvironmentId environmentId) (Days days) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/environment/",toPath environmentId,"/logs"]
    `setQuery` toQuery ("days", Just days)
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data GetEnvironmentLogs  

-- | /Optional Param/ "service" - Names of services
instance HasOptionalParam GetEnvironmentLogs Service where
  applyOptionalParam req (Service xs) =
    req `setQuery` toQueryColl MultiParamArray ("service", Just xs)

-- | /Optional Param/ "name" - Names of log
instance HasOptionalParam GetEnvironmentLogs Name where
  applyOptionalParam req (Name xs) =
    req `setQuery` toQueryColl MultiParamArray ("name", Just xs)
-- | @application/json@
instance Produces GetEnvironmentLogs MimeJSON


-- *** getEnvironments

-- | @GET \/api\/program\/{programId}\/environments@
-- 
-- List Environments
-- 
-- Lists all environments in an program
-- 
getEnvironments 
  :: ProgramId -- ^ "programId" -  Identifier of the program
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest GetEnvironments MimeNoContent EnvironmentList MimeJSON
getEnvironments (ProgramId programId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/environments"]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data GetEnvironments  

-- | /Optional Param/ "type" - Type of the environment
instance HasOptionalParam GetEnvironments ParamType where
  applyOptionalParam req (ParamType xs) =
    req `setQuery` toQuery ("type", Just xs)
-- | @application/json@
instance Produces GetEnvironments MimeJSON

