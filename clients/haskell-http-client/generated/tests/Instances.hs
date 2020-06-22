{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import CloudManager.Model
import CloudManager.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (T.pack k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays
    
-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)
    
arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models
 
instance Arbitrary BadRequestError where
  arbitrary = sized genBadRequestError

genBadRequestError :: Int -> Gen BadRequestError
genBadRequestError n =
  BadRequestError
    <$> arbitraryReducedMaybe n -- badRequestErrorStatus :: Maybe Int
    <*> arbitraryReducedMaybe n -- badRequestErrorType :: Maybe Text
    <*> arbitraryReducedMaybe n -- badRequestErrorTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- badRequestErrorMissingParams :: Maybe [MissingParameter]
    <*> arbitraryReducedMaybe n -- badRequestErrorInvalidParams :: Maybe [InvalidParameter]
  
instance Arbitrary BranchList where
  arbitrary = sized genBranchList

genBranchList :: Int -> Gen BranchList
genBranchList n =
  BranchList
    <$> arbitraryReducedMaybe n -- branchListTotalNumberOfItems :: Maybe Int
    <*> arbitraryReducedMaybe n -- branchListEmbedded :: Maybe BranchListEmbedded
    <*> arbitraryReducedMaybe n -- branchListLinks :: Maybe ProgramListLinks
  
instance Arbitrary BranchListEmbedded where
  arbitrary = sized genBranchListEmbedded

genBranchListEmbedded :: Int -> Gen BranchListEmbedded
genBranchListEmbedded n =
  BranchListEmbedded
    <$> arbitraryReducedMaybe n -- branchListEmbeddedBranches :: Maybe [RepositoryBranch]
  
instance Arbitrary EmbeddedProgram where
  arbitrary = sized genEmbeddedProgram

genEmbeddedProgram :: Int -> Gen EmbeddedProgram
genEmbeddedProgram n =
  EmbeddedProgram
    <$> arbitraryReducedMaybe n -- embeddedProgramId :: Maybe Text
    <*> arbitraryReducedMaybe n -- embeddedProgramName :: Maybe Text
    <*> arbitraryReducedMaybe n -- embeddedProgramEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- embeddedProgramTenantId :: Maybe Text
  
instance Arbitrary Environment where
  arbitrary = sized genEnvironment

genEnvironment :: Int -> Gen Environment
genEnvironment n =
  Environment
    <$> arbitraryReducedMaybe n -- environmentId :: Maybe Text
    <*> arbitraryReducedMaybe n -- environmentProgramId :: Maybe Text
    <*> arbitraryReducedMaybe n -- environmentName :: Maybe Text
    <*> arbitraryReducedMaybe n -- environmentDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- environmentType :: Maybe E'Type2
    <*> arbitraryReducedMaybe n -- environmentLinks :: Maybe EnvironmentLinks
  
instance Arbitrary EnvironmentLinks where
  arbitrary = sized genEnvironmentLinks

genEnvironmentLinks :: Int -> Gen EnvironmentLinks
genEnvironmentLinks n =
  EnvironmentLinks
    <$> arbitraryReducedMaybe n -- environmentLinksHttpNsAdobeComAdobecloudRelProgram :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- environmentLinksHttpNsAdobeComAdobecloudRelPipeline :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- environmentLinksHttpNsAdobeComAdobecloudRelAuthor :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- environmentLinksHttpNsAdobeComAdobecloudRelPublish :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- environmentLinksHttpNsAdobeComAdobecloudRelDeveloperConsole :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- environmentLinksHttpNsAdobeComAdobecloudRelLogs :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- environmentLinksHttpNsAdobeComAdobecloudRelVariables :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- environmentLinksSelf :: Maybe HalLink
  
instance Arbitrary EnvironmentList where
  arbitrary = sized genEnvironmentList

genEnvironmentList :: Int -> Gen EnvironmentList
genEnvironmentList n =
  EnvironmentList
    <$> arbitraryReducedMaybe n -- environmentListTotalNumberOfItems :: Maybe Int
    <*> arbitraryReducedMaybe n -- environmentListEmbedded :: Maybe EnvironmentListEmbedded
    <*> arbitraryReducedMaybe n -- environmentListLinks :: Maybe ProgramListLinks
  
instance Arbitrary EnvironmentListEmbedded where
  arbitrary = sized genEnvironmentListEmbedded

genEnvironmentListEmbedded :: Int -> Gen EnvironmentListEmbedded
genEnvironmentListEmbedded n =
  EnvironmentListEmbedded
    <$> arbitraryReducedMaybe n -- environmentListEmbeddedEnvironments :: Maybe [Environment]
  
instance Arbitrary EnvironmentLog where
  arbitrary = sized genEnvironmentLog

genEnvironmentLog :: Int -> Gen EnvironmentLog
genEnvironmentLog n =
  EnvironmentLog
    <$> arbitraryReducedMaybe n -- environmentLogService :: Maybe Text
    <*> arbitraryReducedMaybe n -- environmentLogName :: Maybe Text
    <*> arbitraryReducedMaybe n -- environmentLogDate :: Maybe Text
    <*> arbitraryReducedMaybe n -- environmentLogProgramId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- environmentLogEnvironmentId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- environmentLogLinks :: Maybe EnvironmentLogLinks
  
instance Arbitrary EnvironmentLogLinks where
  arbitrary = sized genEnvironmentLogLinks

genEnvironmentLogLinks :: Int -> Gen EnvironmentLogLinks
genEnvironmentLogLinks n =
  EnvironmentLogLinks
    <$> arbitraryReducedMaybe n -- environmentLogLinksHttpNsAdobeComAdobecloudRelLogsDownload :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- environmentLogLinksHttpNsAdobeComAdobecloudRelLogsTail :: Maybe HalLink
  
instance Arbitrary EnvironmentLogs where
  arbitrary = sized genEnvironmentLogs

genEnvironmentLogs :: Int -> Gen EnvironmentLogs
genEnvironmentLogs n =
  EnvironmentLogs
    <$> arbitraryReducedMaybe n -- environmentLogsService :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- environmentLogsName :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- environmentLogsDays :: Maybe Int
    <*> arbitraryReducedMaybe n -- environmentLogsLinks :: Maybe EnvironmentLogsLinks
    <*> arbitraryReducedMaybe n -- environmentLogsEmbedded :: Maybe EnvironmentLogsEmbedded
  
instance Arbitrary EnvironmentLogsEmbedded where
  arbitrary = sized genEnvironmentLogsEmbedded

genEnvironmentLogsEmbedded :: Int -> Gen EnvironmentLogsEmbedded
genEnvironmentLogsEmbedded n =
  EnvironmentLogsEmbedded
    <$> arbitraryReducedMaybe n -- environmentLogsEmbeddedDownloads :: Maybe [EnvironmentLog]
  
instance Arbitrary EnvironmentLogsLinks where
  arbitrary = sized genEnvironmentLogsLinks

genEnvironmentLogsLinks :: Int -> Gen EnvironmentLogsLinks
genEnvironmentLogsLinks n =
  EnvironmentLogsLinks
    <$> arbitraryReducedMaybe n -- environmentLogsLinksHttpNsAdobeComAdobecloudRelProgram :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- environmentLogsLinksSelf :: Maybe HalLink
  
instance Arbitrary HalLink where
  arbitrary = sized genHalLink

genHalLink :: Int -> Gen HalLink
genHalLink n =
  HalLink
    <$> arbitraryReducedMaybe n -- halLinkHref :: Maybe Text
    <*> arbitraryReducedMaybe n -- halLinkTemplated :: Maybe Bool
    <*> arbitraryReducedMaybe n -- halLinkType :: Maybe Text
    <*> arbitraryReducedMaybe n -- halLinkDeprecation :: Maybe Text
    <*> arbitraryReducedMaybe n -- halLinkProfile :: Maybe Text
    <*> arbitraryReducedMaybe n -- halLinkTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- halLinkHreflang :: Maybe Text
    <*> arbitraryReducedMaybe n -- halLinkName :: Maybe Text
  
instance Arbitrary InvalidParameter where
  arbitrary = sized genInvalidParameter

genInvalidParameter :: Int -> Gen InvalidParameter
genInvalidParameter n =
  InvalidParameter
    <$> arbitraryReducedMaybe n -- invalidParameterName :: Maybe Text
    <*> arbitraryReducedMaybe n -- invalidParameterReason :: Maybe Text
  
instance Arbitrary Metric where
  arbitrary = sized genMetric

genMetric :: Int -> Gen Metric
genMetric n =
  Metric
    <$> arbitraryReducedMaybe n -- metricId :: Maybe Text
    <*> arbitraryReducedMaybe n -- metricSeverity :: Maybe E'Severity
    <*> arbitraryReducedMaybe n -- metricPassed :: Maybe Bool
    <*> arbitraryReducedMaybe n -- metricOverride :: Maybe Bool
    <*> arbitraryReducedMaybe n -- metricActualValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- metricExpectedValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- metricComparator :: Maybe E'Comparator
    <*> arbitraryReducedMaybe n -- metricKpi :: Maybe Text
  
instance Arbitrary MissingParameter where
  arbitrary = sized genMissingParameter

genMissingParameter :: Int -> Gen MissingParameter
genMissingParameter n =
  MissingParameter
    <$> arbitraryReducedMaybe n -- missingParameterName :: Maybe Text
    <*> arbitraryReducedMaybe n -- missingParameterType :: Maybe Text
  
instance Arbitrary Pipeline where
  arbitrary = sized genPipeline

genPipeline :: Int -> Gen Pipeline
genPipeline n =
  Pipeline
    <$> arbitraryReducedMaybe n -- pipelineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineProgramId :: Maybe Text
    <*> arbitrary -- pipelineName :: Text
    <*> arbitraryReducedMaybe n -- pipelineTrigger :: Maybe E'Trigger
    <*> arbitraryReducedMaybe n -- pipelineStatus :: Maybe E'Status
    <*> arbitraryReducedMaybe n -- pipelineCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pipelineUpdatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pipelineLastStartedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pipelineLastFinishedAt :: Maybe DateTime
    <*> arbitraryReduced n -- pipelinePhases :: [PipelinePhase]
    <*> arbitraryReducedMaybe n -- pipelineLinks :: Maybe PipelineLinks
  
instance Arbitrary PipelineExecution where
  arbitrary = sized genPipelineExecution

genPipelineExecution :: Int -> Gen PipelineExecution
genPipelineExecution n =
  PipelineExecution
    <$> arbitraryReducedMaybe n -- pipelineExecutionId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionProgramId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionPipelineId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionArtifactsVersion :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionUser :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionStatus :: Maybe E'Status2
    <*> arbitraryReducedMaybe n -- pipelineExecutionTrigger :: Maybe E'Trigger2
    <*> arbitraryReducedMaybe n -- pipelineExecutionCreatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pipelineExecutionUpdatedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pipelineExecutionFinishedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pipelineExecutionEmbedded :: Maybe PipelineExecutionEmbedded
    <*> arbitraryReducedMaybe n -- pipelineExecutionLinks :: Maybe PipelineExecutionLinks
  
instance Arbitrary PipelineExecutionEmbedded where
  arbitrary = sized genPipelineExecutionEmbedded

genPipelineExecutionEmbedded :: Int -> Gen PipelineExecutionEmbedded
genPipelineExecutionEmbedded n =
  PipelineExecutionEmbedded
    <$> arbitraryReducedMaybe n -- pipelineExecutionEmbeddedStepStates :: Maybe [PipelineExecutionStepState]
  
instance Arbitrary PipelineExecutionLinks where
  arbitrary = sized genPipelineExecutionLinks

genPipelineExecutionLinks :: Int -> Gen PipelineExecutionLinks
genPipelineExecutionLinks n =
  PipelineExecutionLinks
    <$> arbitraryReducedMaybe n -- pipelineExecutionLinksHttpNsAdobeComAdobecloudRelProgram :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionLinksHttpNsAdobeComAdobecloudRelPipeline :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionLinksSelf :: Maybe HalLink
  
instance Arbitrary PipelineExecutionListRepresentation where
  arbitrary = sized genPipelineExecutionListRepresentation

genPipelineExecutionListRepresentation :: Int -> Gen PipelineExecutionListRepresentation
genPipelineExecutionListRepresentation n =
  PipelineExecutionListRepresentation
    <$> arbitraryReducedMaybe n -- pipelineExecutionListRepresentationTotalNumberOfItems :: Maybe Int
    <*> arbitraryReducedMaybe n -- pipelineExecutionListRepresentationPage :: Maybe RequestedPageDetails
    <*> arbitraryReducedMaybe n -- pipelineExecutionListRepresentationEmbedded :: Maybe PipelineExecutionListRepresentationEmbedded
    <*> arbitraryReducedMaybe n -- pipelineExecutionListRepresentationLinks :: Maybe PipelineExecutionListRepresentationLinks
  
instance Arbitrary PipelineExecutionListRepresentationEmbedded where
  arbitrary = sized genPipelineExecutionListRepresentationEmbedded

genPipelineExecutionListRepresentationEmbedded :: Int -> Gen PipelineExecutionListRepresentationEmbedded
genPipelineExecutionListRepresentationEmbedded n =
  PipelineExecutionListRepresentationEmbedded
    <$> arbitraryReducedMaybe n -- pipelineExecutionListRepresentationEmbeddedExecutions :: Maybe [PipelineExecution]
  
instance Arbitrary PipelineExecutionListRepresentationLinks where
  arbitrary = sized genPipelineExecutionListRepresentationLinks

genPipelineExecutionListRepresentationLinks :: Int -> Gen PipelineExecutionListRepresentationLinks
genPipelineExecutionListRepresentationLinks n =
  PipelineExecutionListRepresentationLinks
    <$> arbitraryReducedMaybe n -- pipelineExecutionListRepresentationLinksNext :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionListRepresentationLinksPage :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionListRepresentationLinksPrev :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionListRepresentationLinksSelf :: Maybe HalLink
  
instance Arbitrary PipelineExecutionStepState where
  arbitrary = sized genPipelineExecutionStepState

genPipelineExecutionStepState :: Int -> Gen PipelineExecutionStepState
genPipelineExecutionStepState n =
  PipelineExecutionStepState
    <$> arbitraryReducedMaybe n -- pipelineExecutionStepStateId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateStepId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStatePhaseId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateAction :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateRepository :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateBranch :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateEnvironment :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateEnvironmentType :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateStartedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateFinishedAt :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateDetails :: Maybe (Map.Map String A.Value)
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateStatus :: Maybe E'Status3
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateLinks :: Maybe PipelineExecutionStepStateLinks
  
instance Arbitrary PipelineExecutionStepStateLinks where
  arbitrary = sized genPipelineExecutionStepStateLinks

genPipelineExecutionStepStateLinks :: Int -> Gen PipelineExecutionStepStateLinks
genPipelineExecutionStepStateLinks n =
  PipelineExecutionStepStateLinks
    <$> arbitraryReducedMaybe n -- pipelineExecutionStepStateLinksHttpNsAdobeComAdobecloudRelExecution :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateLinksHttpNsAdobeComAdobecloudRelPipeline :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateLinksHttpNsAdobeComAdobecloudRelPipelineLogs :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateLinksHttpNsAdobeComAdobecloudRelPipelineMetrics :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateLinksHttpNsAdobeComAdobecloudRelPipelineAdvance :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateLinksHttpNsAdobeComAdobecloudRelPipelineCancel :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateLinksHttpNsAdobeComAdobecloudRelProgram :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineExecutionStepStateLinksSelf :: Maybe HalLink
  
instance Arbitrary PipelineLinks where
  arbitrary = sized genPipelineLinks

genPipelineLinks :: Int -> Gen PipelineLinks
genPipelineLinks n =
  PipelineLinks
    <$> arbitraryReducedMaybe n -- pipelineLinksHttpNsAdobeComAdobecloudRelProgram :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineLinksHttpNsAdobeComAdobecloudRelExecution :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineLinksHttpNsAdobeComAdobecloudRelExecutions :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineLinksHttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- pipelineLinksSelf :: Maybe HalLink
  
instance Arbitrary PipelineList where
  arbitrary = sized genPipelineList

genPipelineList :: Int -> Gen PipelineList
genPipelineList n =
  PipelineList
    <$> arbitraryReducedMaybe n -- pipelineListTotalNumberOfItems :: Maybe Int
    <*> arbitraryReducedMaybe n -- pipelineListEmbedded :: Maybe PipelineListEmbedded
    <*> arbitraryReducedMaybe n -- pipelineListLinks :: Maybe ProgramListLinks
  
instance Arbitrary PipelineListEmbedded where
  arbitrary = sized genPipelineListEmbedded

genPipelineListEmbedded :: Int -> Gen PipelineListEmbedded
genPipelineListEmbedded n =
  PipelineListEmbedded
    <$> arbitraryReducedMaybe n -- pipelineListEmbeddedPipelines :: Maybe [Pipeline]
  
instance Arbitrary PipelinePhase where
  arbitrary = sized genPipelinePhase

genPipelinePhase :: Int -> Gen PipelinePhase
genPipelinePhase n =
  PipelinePhase
    <$> arbitraryReducedMaybe n -- pipelinePhaseName :: Maybe Text
    <*> arbitrary -- pipelinePhaseType :: E'Type
    <*> arbitraryReducedMaybe n -- pipelinePhaseRepositoryId :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelinePhaseBranch :: Maybe Text
    <*> arbitraryReducedMaybe n -- pipelinePhaseEnvironmentId :: Maybe Text
  
instance Arbitrary PipelineStepMetrics where
  arbitrary = sized genPipelineStepMetrics

genPipelineStepMetrics :: Int -> Gen PipelineStepMetrics
genPipelineStepMetrics n =
  PipelineStepMetrics
    <$> arbitraryReducedMaybe n -- pipelineStepMetricsMetrics :: Maybe [Metric]
  
instance Arbitrary Program where
  arbitrary = sized genProgram

genProgram :: Int -> Gen Program
genProgram n =
  Program
    <$> arbitraryReducedMaybe n -- programId :: Maybe Text
    <*> arbitrary -- programName :: Text
    <*> arbitraryReducedMaybe n -- programEnabled :: Maybe Bool
    <*> arbitraryReducedMaybe n -- programTenantId :: Maybe Text
    <*> arbitraryReducedMaybe n -- programImsOrgId :: Maybe Text
    <*> arbitraryReducedMaybe n -- programLinks :: Maybe ProgramLinks
  
instance Arbitrary ProgramLinks where
  arbitrary = sized genProgramLinks

genProgramLinks :: Int -> Gen ProgramLinks
genProgramLinks n =
  ProgramLinks
    <$> arbitraryReducedMaybe n -- programLinksHttpNsAdobeComAdobecloudRelPipelines :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- programLinksHttpNsAdobeComAdobecloudRelEnvironments :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- programLinksHttpNsAdobeComAdobecloudRelRepositories :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- programLinksSelf :: Maybe HalLink
  
instance Arbitrary ProgramList where
  arbitrary = sized genProgramList

genProgramList :: Int -> Gen ProgramList
genProgramList n =
  ProgramList
    <$> arbitraryReducedMaybe n -- programListTotalNumberOfItems :: Maybe Int
    <*> arbitraryReducedMaybe n -- programListEmbedded :: Maybe ProgramListEmbedded
    <*> arbitraryReducedMaybe n -- programListLinks :: Maybe ProgramListLinks
  
instance Arbitrary ProgramListEmbedded where
  arbitrary = sized genProgramListEmbedded

genProgramListEmbedded :: Int -> Gen ProgramListEmbedded
genProgramListEmbedded n =
  ProgramListEmbedded
    <$> arbitraryReducedMaybe n -- programListEmbeddedPrograms :: Maybe [EmbeddedProgram]
  
instance Arbitrary ProgramListLinks where
  arbitrary = sized genProgramListLinks

genProgramListLinks :: Int -> Gen ProgramListLinks
genProgramListLinks n =
  ProgramListLinks
    <$> arbitraryReducedMaybe n -- programListLinksNext :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- programListLinksPrev :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- programListLinksSelf :: Maybe HalLink
  
instance Arbitrary Repository where
  arbitrary = sized genRepository

genRepository :: Int -> Gen Repository
genRepository n =
  Repository
    <$> arbitraryReducedMaybe n -- repositoryRepo :: Maybe Text
    <*> arbitraryReducedMaybe n -- repositoryDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- repositoryLinks :: Maybe RepositoryLinks
  
instance Arbitrary RepositoryBranch where
  arbitrary = sized genRepositoryBranch

genRepositoryBranch :: Int -> Gen RepositoryBranch
genRepositoryBranch n =
  RepositoryBranch
    <$> arbitraryReducedMaybe n -- repositoryBranchProgramId :: Maybe Text
    <*> arbitraryReducedMaybe n -- repositoryBranchRepositoryId :: Maybe Integer
    <*> arbitraryReducedMaybe n -- repositoryBranchName :: Maybe Text
    <*> arbitraryReducedMaybe n -- repositoryBranchLinks :: Maybe RepositoryBranchLinks
  
instance Arbitrary RepositoryBranchLinks where
  arbitrary = sized genRepositoryBranchLinks

genRepositoryBranchLinks :: Int -> Gen RepositoryBranchLinks
genRepositoryBranchLinks n =
  RepositoryBranchLinks
    <$> arbitraryReducedMaybe n -- repositoryBranchLinksHttpNsAdobeComAdobecloudRelProgram :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- repositoryBranchLinksHttpNsAdobeComAdobecloudRelRepository :: Maybe HalLink
  
instance Arbitrary RepositoryLinks where
  arbitrary = sized genRepositoryLinks

genRepositoryLinks :: Int -> Gen RepositoryLinks
genRepositoryLinks n =
  RepositoryLinks
    <$> arbitraryReducedMaybe n -- repositoryLinksHttpNsAdobeComAdobecloudRelProgram :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- repositoryLinksHttpNsAdobeComAdobecloudRelBranches :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- repositoryLinksSelf :: Maybe HalLink
  
instance Arbitrary RepositoryList where
  arbitrary = sized genRepositoryList

genRepositoryList :: Int -> Gen RepositoryList
genRepositoryList n =
  RepositoryList
    <$> arbitraryReducedMaybe n -- repositoryListTotalNumberOfItems :: Maybe Int
    <*> arbitraryReducedMaybe n -- repositoryListEmbedded :: Maybe RepositoryListEmbedded
    <*> arbitraryReducedMaybe n -- repositoryListLinks :: Maybe ProgramListLinks
  
instance Arbitrary RepositoryListEmbedded where
  arbitrary = sized genRepositoryListEmbedded

genRepositoryListEmbedded :: Int -> Gen RepositoryListEmbedded
genRepositoryListEmbedded n =
  RepositoryListEmbedded
    <$> arbitraryReducedMaybe n -- repositoryListEmbeddedRepositories :: Maybe [Repository]
  
instance Arbitrary RequestedPageDetails where
  arbitrary = sized genRequestedPageDetails

genRequestedPageDetails :: Int -> Gen RequestedPageDetails
genRequestedPageDetails n =
  RequestedPageDetails
    <$> arbitraryReducedMaybe n -- requestedPageDetailsStart :: Maybe Int
    <*> arbitraryReducedMaybe n -- requestedPageDetailsLimit :: Maybe Int
    <*> arbitraryReducedMaybe n -- requestedPageDetailsOrderBy :: Maybe Text
    <*> arbitraryReducedMaybe n -- requestedPageDetailsProperty :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- requestedPageDetailsType :: Maybe Text
    <*> arbitraryReducedMaybe n -- requestedPageDetailsNext :: Maybe Int
    <*> arbitraryReducedMaybe n -- requestedPageDetailsPrev :: Maybe Int
  
instance Arbitrary Variable where
  arbitrary = sized genVariable

genVariable :: Int -> Gen Variable
genVariable n =
  Variable
    <$> arbitraryReducedMaybe n -- variableName :: Maybe Text
    <*> arbitraryReducedMaybe n -- variableValue :: Maybe Text
    <*> arbitraryReducedMaybe n -- variableType :: Maybe E'Type3
  
instance Arbitrary VariableList where
  arbitrary = sized genVariableList

genVariableList :: Int -> Gen VariableList
genVariableList n =
  VariableList
    <$> arbitraryReducedMaybe n -- variableListTotalNumberOfItems :: Maybe Int
    <*> arbitraryReducedMaybe n -- variableListEmbedded :: Maybe VariableListEmbedded
    <*> arbitraryReducedMaybe n -- variableListLinks :: Maybe VariableListLinks
  
instance Arbitrary VariableListEmbedded where
  arbitrary = sized genVariableListEmbedded

genVariableListEmbedded :: Int -> Gen VariableListEmbedded
genVariableListEmbedded n =
  VariableListEmbedded
    <$> arbitraryReducedMaybe n -- variableListEmbeddedVariables :: Maybe [Variable]
  
instance Arbitrary VariableListLinks where
  arbitrary = sized genVariableListLinks

genVariableListLinks :: Int -> Gen VariableListLinks
genVariableListLinks n =
  VariableListLinks
    <$> arbitraryReducedMaybe n -- variableListLinksHttpNsAdobeComAdobecloudRelEnvironment :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- variableListLinksHttpNsAdobeComAdobecloudRelProgram :: Maybe HalLink
    <*> arbitraryReducedMaybe n -- variableListLinksSelf :: Maybe HalLink
  



instance Arbitrary E'Comparator where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Severity where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Status3 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Trigger where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Trigger2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type3 where
  arbitrary = arbitraryBoundedEnum

