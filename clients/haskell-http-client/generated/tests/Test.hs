{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import CloudManager.Model
import CloudManager.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy BadRequestError)
      propMimeEq MimeJSON (Proxy :: Proxy BranchList)
      propMimeEq MimeJSON (Proxy :: Proxy BranchListEmbedded)
      propMimeEq MimeJSON (Proxy :: Proxy EmbeddedProgram)
      propMimeEq MimeJSON (Proxy :: Proxy Environment)
      propMimeEq MimeJSON (Proxy :: Proxy EnvironmentLinks)
      propMimeEq MimeJSON (Proxy :: Proxy EnvironmentList)
      propMimeEq MimeJSON (Proxy :: Proxy EnvironmentListEmbedded)
      propMimeEq MimeJSON (Proxy :: Proxy EnvironmentLog)
      propMimeEq MimeJSON (Proxy :: Proxy EnvironmentLogLinks)
      propMimeEq MimeJSON (Proxy :: Proxy EnvironmentLogs)
      propMimeEq MimeJSON (Proxy :: Proxy EnvironmentLogsEmbedded)
      propMimeEq MimeJSON (Proxy :: Proxy EnvironmentLogsLinks)
      propMimeEq MimeJSON (Proxy :: Proxy HalLink)
      propMimeEq MimeJSON (Proxy :: Proxy InvalidParameter)
      propMimeEq MimeJSON (Proxy :: Proxy Metric)
      propMimeEq MimeJSON (Proxy :: Proxy MissingParameter)
      propMimeEq MimeJSON (Proxy :: Proxy Pipeline)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineExecution)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineExecutionEmbedded)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineExecutionLinks)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineExecutionListRepresentation)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineExecutionListRepresentationEmbedded)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineExecutionListRepresentationLinks)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineExecutionStepState)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineExecutionStepStateLinks)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineLinks)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineList)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineListEmbedded)
      propMimeEq MimeJSON (Proxy :: Proxy PipelinePhase)
      propMimeEq MimeJSON (Proxy :: Proxy PipelineStepMetrics)
      propMimeEq MimeJSON (Proxy :: Proxy Program)
      propMimeEq MimeJSON (Proxy :: Proxy ProgramLinks)
      propMimeEq MimeJSON (Proxy :: Proxy ProgramList)
      propMimeEq MimeJSON (Proxy :: Proxy ProgramListEmbedded)
      propMimeEq MimeJSON (Proxy :: Proxy ProgramListLinks)
      propMimeEq MimeJSON (Proxy :: Proxy Repository)
      propMimeEq MimeJSON (Proxy :: Proxy RepositoryBranch)
      propMimeEq MimeJSON (Proxy :: Proxy RepositoryBranchLinks)
      propMimeEq MimeJSON (Proxy :: Proxy RepositoryLinks)
      propMimeEq MimeJSON (Proxy :: Proxy RepositoryList)
      propMimeEq MimeJSON (Proxy :: Proxy RepositoryListEmbedded)
      propMimeEq MimeJSON (Proxy :: Proxy RequestedPageDetails)
      propMimeEq MimeJSON (Proxy :: Proxy Variable)
      propMimeEq MimeJSON (Proxy :: Proxy VariableList)
      propMimeEq MimeJSON (Proxy :: Proxy VariableListEmbedded)
      propMimeEq MimeJSON (Proxy :: Proxy VariableListLinks)
      
