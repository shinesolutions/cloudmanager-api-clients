{-
   Cloud Manager API

   This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

   OpenAPI Version: 3.0.3
   Cloud Manager API API version: 1.0.0
   Contact: opensource@shinesolutions.com
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : CloudManager.API.Repositories
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module CloudManager.API.Repositories where

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


-- ** Repositories

-- *** getRepositories

-- | @GET \/api\/program\/{programId}\/repositories@
-- 
-- Lists Repositories
-- 
-- Lists all Repositories in an program
-- 
getRepositories 
  :: ProgramId -- ^ "programId" -  Identifier of the program
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest GetRepositories MimeNoContent RepositoryList MimeJSON
getRepositories (ProgramId programId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/repositories"]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data GetRepositories  
-- | @application/json@
instance Produces GetRepositories MimeJSON


-- *** getRepository

-- | @GET \/api\/program\/{programId}\/repository\/{repositoryId}@
-- 
-- Get Repository
-- 
-- Returns an repository by its id
-- 
getRepository 
  :: ProgramId -- ^ "programId" -  Identifier of the program
  -> RepositoryId -- ^ "repositoryId" -  Identifier of the repository
  -> XGwImsOrgId -- ^ "xGwImsOrgId" -  IMS organization ID that the request is being made under.
  -> Authorization -- ^ "authorization" -  Bearer [token] - An access token for the technical account created through integration with Adobe IO
  -> XApiKey -- ^ "xApiKey" -  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  -> CloudManagerRequest GetRepository MimeNoContent Repository MimeJSON
getRepository (ProgramId programId) (RepositoryId repositoryId) (XGwImsOrgId xGwImsOrgId) (Authorization authorization) (XApiKey xApiKey) =
  _mkRequest "GET" ["/api/program/",toPath programId,"/repository/",toPath repositoryId]
    `setHeader` toHeader ("x-gw-ims-org-id", xGwImsOrgId)
    `setHeader` toHeader ("Authorization", authorization)
    `setHeader` toHeader ("x-api-key", xApiKey)

data GetRepository  
-- | @application/json@
instance Produces GetRepository MimeJSON

