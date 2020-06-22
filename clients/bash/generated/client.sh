#!/usr/bin/env bash

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

#
# This is a Bash client for Cloud Manager API.
#
# LICENSE:
# http://www.apache.org/licenses/LICENSE-2.0.html
#
# CONTACT:
# opensource@shinesolutions.com
#
# MORE INFORMATION:
# 
#

# For improved pattern matching in case statemets
shopt -s extglob

###############################################################################
#
# Make sure Bash is at least in version 4.3
#
###############################################################################
if ! ( (("${BASH_VERSION:0:1}" == "4")) && (("${BASH_VERSION:2:1}" >= "3")) ) \
  && ! (("${BASH_VERSION:0:1}" >= "5")); then
    echo ""
    echo "Sorry - your Bash version is ${BASH_VERSION}"
    echo ""
    echo "You need at least Bash 4.3 to run this script."
    echo ""
    exit 1
fi

###############################################################################
#
# Global variables
#
###############################################################################

##
# The filename of this script for help messages
script_name=$(basename "$0")

##
# Map for headers passed after operation as KEY:VALUE
declare -A header_arguments


##
# Map for operation parameters passed after operation as PARAMETER=VALUE
# These will be mapped to appropriate path or query parameters
# The values in operation_parameters are arrays, so that multiple values
# can be provided for the same parameter if allowed by API specification
declare -A operation_parameters

##
# Declare colors with autodection if output is terminal
if [ -t 1 ]; then
    RED="$(tput setaf 1)"
    GREEN="$(tput setaf 2)"
    YELLOW="$(tput setaf 3)"
    BLUE="$(tput setaf 4)"
    MAGENTA="$(tput setaf 5)"
    CYAN="$(tput setaf 6)"
    WHITE="$(tput setaf 7)"
    BOLD="$(tput bold)"
    OFF="$(tput sgr0)"
else
    RED=""
    GREEN=""
    YELLOW=""
    BLUE=""
    MAGENTA=""
    CYAN=""
    WHITE=""
    BOLD=""
    OFF=""
fi

declare -a result_color_table=( "$WHITE" "$WHITE" "$GREEN" "$YELLOW" "$WHITE" "$MAGENTA" "$WHITE" )

##
# This array stores the minimum number of required occurrences for parameter
# 0 - optional
# 1 - required
declare -A operation_parameters_minimum_occurrences
operation_parameters_minimum_occurrences["getBranches:::programId"]=1
operation_parameters_minimum_occurrences["getBranches:::repositoryId"]=1
operation_parameters_minimum_occurrences["getBranches:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getBranches:::Authorization"]=1
operation_parameters_minimum_occurrences["getBranches:::x-api-key"]=1
operation_parameters_minimum_occurrences["deleteEnvironment:::programId"]=1
operation_parameters_minimum_occurrences["deleteEnvironment:::environmentId"]=1
operation_parameters_minimum_occurrences["deleteEnvironment:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["deleteEnvironment:::Authorization"]=1
operation_parameters_minimum_occurrences["deleteEnvironment:::x-api-key"]=1
operation_parameters_minimum_occurrences["downloadLogs:::programId"]=1
operation_parameters_minimum_occurrences["downloadLogs:::environmentId"]=1
operation_parameters_minimum_occurrences["downloadLogs:::service"]=1
operation_parameters_minimum_occurrences["downloadLogs:::name"]=1
operation_parameters_minimum_occurrences["downloadLogs:::date"]=1
operation_parameters_minimum_occurrences["downloadLogs:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["downloadLogs:::Authorization"]=1
operation_parameters_minimum_occurrences["downloadLogs:::x-api-key"]=1
operation_parameters_minimum_occurrences["downloadLogs:::Accept"]=0
operation_parameters_minimum_occurrences["getEnvironment:::programId"]=1
operation_parameters_minimum_occurrences["getEnvironment:::environmentId"]=1
operation_parameters_minimum_occurrences["getEnvironment:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getEnvironment:::Authorization"]=1
operation_parameters_minimum_occurrences["getEnvironment:::x-api-key"]=1
operation_parameters_minimum_occurrences["getEnvironmentLogs:::programId"]=1
operation_parameters_minimum_occurrences["getEnvironmentLogs:::environmentId"]=1
operation_parameters_minimum_occurrences["getEnvironmentLogs:::days"]=1
operation_parameters_minimum_occurrences["getEnvironmentLogs:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getEnvironmentLogs:::Authorization"]=1
operation_parameters_minimum_occurrences["getEnvironmentLogs:::x-api-key"]=1
operation_parameters_minimum_occurrences["getEnvironmentLogs:::service"]=0
operation_parameters_minimum_occurrences["getEnvironmentLogs:::name"]=0
operation_parameters_minimum_occurrences["getEnvironments:::programId"]=1
operation_parameters_minimum_occurrences["getEnvironments:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getEnvironments:::Authorization"]=1
operation_parameters_minimum_occurrences["getEnvironments:::x-api-key"]=1
operation_parameters_minimum_occurrences["getEnvironments:::type"]=0
operation_parameters_minimum_occurrences["advancePipelineExecution:::programId"]=1
operation_parameters_minimum_occurrences["advancePipelineExecution:::pipelineId"]=1
operation_parameters_minimum_occurrences["advancePipelineExecution:::executionId"]=1
operation_parameters_minimum_occurrences["advancePipelineExecution:::phaseId"]=1
operation_parameters_minimum_occurrences["advancePipelineExecution:::stepId"]=1
operation_parameters_minimum_occurrences["advancePipelineExecution:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["advancePipelineExecution:::Authorization"]=1
operation_parameters_minimum_occurrences["advancePipelineExecution:::x-api-key"]=1
operation_parameters_minimum_occurrences["advancePipelineExecution:::Content-Type"]=1
operation_parameters_minimum_occurrences["advancePipelineExecution:::body"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::programId"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::pipelineId"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::executionId"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::phaseId"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::stepId"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::Authorization"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::x-api-key"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::Content-Type"]=1
operation_parameters_minimum_occurrences["cancelPipelineExecutionStep:::body"]=1
operation_parameters_minimum_occurrences["getCurrentExecution:::programId"]=1
operation_parameters_minimum_occurrences["getCurrentExecution:::pipelineId"]=1
operation_parameters_minimum_occurrences["getCurrentExecution:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getCurrentExecution:::Authorization"]=1
operation_parameters_minimum_occurrences["getCurrentExecution:::x-api-key"]=1
operation_parameters_minimum_occurrences["getExecution:::programId"]=1
operation_parameters_minimum_occurrences["getExecution:::pipelineId"]=1
operation_parameters_minimum_occurrences["getExecution:::executionId"]=1
operation_parameters_minimum_occurrences["getExecution:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getExecution:::Authorization"]=1
operation_parameters_minimum_occurrences["getExecution:::x-api-key"]=1
operation_parameters_minimum_occurrences["getExecutions:::programId"]=1
operation_parameters_minimum_occurrences["getExecutions:::pipelineId"]=1
operation_parameters_minimum_occurrences["getExecutions:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getExecutions:::Authorization"]=1
operation_parameters_minimum_occurrences["getExecutions:::x-api-key"]=1
operation_parameters_minimum_occurrences["getExecutions:::start"]=0
operation_parameters_minimum_occurrences["getExecutions:::limit"]=0
operation_parameters_minimum_occurrences["getStepLogs:::programId"]=1
operation_parameters_minimum_occurrences["getStepLogs:::pipelineId"]=1
operation_parameters_minimum_occurrences["getStepLogs:::executionId"]=1
operation_parameters_minimum_occurrences["getStepLogs:::phaseId"]=1
operation_parameters_minimum_occurrences["getStepLogs:::stepId"]=1
operation_parameters_minimum_occurrences["getStepLogs:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getStepLogs:::Authorization"]=1
operation_parameters_minimum_occurrences["getStepLogs:::x-api-key"]=1
operation_parameters_minimum_occurrences["getStepLogs:::file"]=0
operation_parameters_minimum_occurrences["getStepLogs:::Accept"]=0
operation_parameters_minimum_occurrences["startPipeline:::programId"]=1
operation_parameters_minimum_occurrences["startPipeline:::pipelineId"]=1
operation_parameters_minimum_occurrences["startPipeline:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["startPipeline:::Authorization"]=1
operation_parameters_minimum_occurrences["startPipeline:::x-api-key"]=1
operation_parameters_minimum_occurrences["startPipeline:::Content-Type"]=1
operation_parameters_minimum_occurrences["stepMetric:::programId"]=1
operation_parameters_minimum_occurrences["stepMetric:::pipelineId"]=1
operation_parameters_minimum_occurrences["stepMetric:::executionId"]=1
operation_parameters_minimum_occurrences["stepMetric:::phaseId"]=1
operation_parameters_minimum_occurrences["stepMetric:::stepId"]=1
operation_parameters_minimum_occurrences["stepMetric:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["stepMetric:::Authorization"]=1
operation_parameters_minimum_occurrences["stepMetric:::x-api-key"]=1
operation_parameters_minimum_occurrences["stepState:::programId"]=1
operation_parameters_minimum_occurrences["stepState:::pipelineId"]=1
operation_parameters_minimum_occurrences["stepState:::executionId"]=1
operation_parameters_minimum_occurrences["stepState:::phaseId"]=1
operation_parameters_minimum_occurrences["stepState:::stepId"]=1
operation_parameters_minimum_occurrences["stepState:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["stepState:::Authorization"]=1
operation_parameters_minimum_occurrences["stepState:::x-api-key"]=1
operation_parameters_minimum_occurrences["deletePipeline:::programId"]=1
operation_parameters_minimum_occurrences["deletePipeline:::pipelineId"]=1
operation_parameters_minimum_occurrences["deletePipeline:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["deletePipeline:::Authorization"]=1
operation_parameters_minimum_occurrences["deletePipeline:::x-api-key"]=1
operation_parameters_minimum_occurrences["getPipeline:::programId"]=1
operation_parameters_minimum_occurrences["getPipeline:::pipelineId"]=1
operation_parameters_minimum_occurrences["getPipeline:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getPipeline:::Authorization"]=1
operation_parameters_minimum_occurrences["getPipeline:::x-api-key"]=1
operation_parameters_minimum_occurrences["getPipelines:::programId"]=1
operation_parameters_minimum_occurrences["getPipelines:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getPipelines:::Authorization"]=1
operation_parameters_minimum_occurrences["getPipelines:::x-api-key"]=1
operation_parameters_minimum_occurrences["patchPipeline:::programId"]=1
operation_parameters_minimum_occurrences["patchPipeline:::pipelineId"]=1
operation_parameters_minimum_occurrences["patchPipeline:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["patchPipeline:::Authorization"]=1
operation_parameters_minimum_occurrences["patchPipeline:::x-api-key"]=1
operation_parameters_minimum_occurrences["patchPipeline:::Content-Type"]=1
operation_parameters_minimum_occurrences["patchPipeline:::body"]=1
operation_parameters_minimum_occurrences["deleteProgram:::programId"]=1
operation_parameters_minimum_occurrences["deleteProgram:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["deleteProgram:::Authorization"]=1
operation_parameters_minimum_occurrences["deleteProgram:::x-api-key"]=1
operation_parameters_minimum_occurrences["getProgram:::programId"]=1
operation_parameters_minimum_occurrences["getProgram:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getProgram:::Authorization"]=1
operation_parameters_minimum_occurrences["getProgram:::x-api-key"]=1
operation_parameters_minimum_occurrences["getPrograms:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getPrograms:::Authorization"]=1
operation_parameters_minimum_occurrences["getPrograms:::x-api-key"]=1
operation_parameters_minimum_occurrences["getRepositories:::programId"]=1
operation_parameters_minimum_occurrences["getRepositories:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getRepositories:::Authorization"]=1
operation_parameters_minimum_occurrences["getRepositories:::x-api-key"]=1
operation_parameters_minimum_occurrences["getRepository:::programId"]=1
operation_parameters_minimum_occurrences["getRepository:::repositoryId"]=1
operation_parameters_minimum_occurrences["getRepository:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getRepository:::Authorization"]=1
operation_parameters_minimum_occurrences["getRepository:::x-api-key"]=1
operation_parameters_minimum_occurrences["getEnvironmentVariables:::programId"]=1
operation_parameters_minimum_occurrences["getEnvironmentVariables:::environmentId"]=1
operation_parameters_minimum_occurrences["getEnvironmentVariables:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["getEnvironmentVariables:::Authorization"]=1
operation_parameters_minimum_occurrences["getEnvironmentVariables:::x-api-key"]=1
operation_parameters_minimum_occurrences["patchEnvironmentVariables:::programId"]=1
operation_parameters_minimum_occurrences["patchEnvironmentVariables:::environmentId"]=1
operation_parameters_minimum_occurrences["patchEnvironmentVariables:::x-gw-ims-org-id"]=1
operation_parameters_minimum_occurrences["patchEnvironmentVariables:::Authorization"]=1
operation_parameters_minimum_occurrences["patchEnvironmentVariables:::x-api-key"]=1
operation_parameters_minimum_occurrences["patchEnvironmentVariables:::Content-Type"]=1
operation_parameters_minimum_occurrences["patchEnvironmentVariables:::body"]=1

##
# This array stores the maximum number of allowed occurrences for parameter
# 1 - single value
# 2 - 2 values
# N - N values
# 0 - unlimited
declare -A operation_parameters_maximum_occurrences
operation_parameters_maximum_occurrences["getBranches:::programId"]=0
operation_parameters_maximum_occurrences["getBranches:::repositoryId"]=0
operation_parameters_maximum_occurrences["getBranches:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getBranches:::Authorization"]=0
operation_parameters_maximum_occurrences["getBranches:::x-api-key"]=0
operation_parameters_maximum_occurrences["deleteEnvironment:::programId"]=0
operation_parameters_maximum_occurrences["deleteEnvironment:::environmentId"]=0
operation_parameters_maximum_occurrences["deleteEnvironment:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["deleteEnvironment:::Authorization"]=0
operation_parameters_maximum_occurrences["deleteEnvironment:::x-api-key"]=0
operation_parameters_maximum_occurrences["downloadLogs:::programId"]=0
operation_parameters_maximum_occurrences["downloadLogs:::environmentId"]=0
operation_parameters_maximum_occurrences["downloadLogs:::service"]=0
operation_parameters_maximum_occurrences["downloadLogs:::name"]=0
operation_parameters_maximum_occurrences["downloadLogs:::date"]=0
operation_parameters_maximum_occurrences["downloadLogs:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["downloadLogs:::Authorization"]=0
operation_parameters_maximum_occurrences["downloadLogs:::x-api-key"]=0
operation_parameters_maximum_occurrences["downloadLogs:::Accept"]=0
operation_parameters_maximum_occurrences["getEnvironment:::programId"]=0
operation_parameters_maximum_occurrences["getEnvironment:::environmentId"]=0
operation_parameters_maximum_occurrences["getEnvironment:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getEnvironment:::Authorization"]=0
operation_parameters_maximum_occurrences["getEnvironment:::x-api-key"]=0
operation_parameters_maximum_occurrences["getEnvironmentLogs:::programId"]=0
operation_parameters_maximum_occurrences["getEnvironmentLogs:::environmentId"]=0
operation_parameters_maximum_occurrences["getEnvironmentLogs:::days"]=0
operation_parameters_maximum_occurrences["getEnvironmentLogs:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getEnvironmentLogs:::Authorization"]=0
operation_parameters_maximum_occurrences["getEnvironmentLogs:::x-api-key"]=0
operation_parameters_maximum_occurrences["getEnvironmentLogs:::service"]=0
operation_parameters_maximum_occurrences["getEnvironmentLogs:::name"]=0
operation_parameters_maximum_occurrences["getEnvironments:::programId"]=0
operation_parameters_maximum_occurrences["getEnvironments:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getEnvironments:::Authorization"]=0
operation_parameters_maximum_occurrences["getEnvironments:::x-api-key"]=0
operation_parameters_maximum_occurrences["getEnvironments:::type"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::programId"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::pipelineId"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::executionId"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::phaseId"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::stepId"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::Authorization"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::x-api-key"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::Content-Type"]=0
operation_parameters_maximum_occurrences["advancePipelineExecution:::body"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::programId"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::pipelineId"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::executionId"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::phaseId"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::stepId"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::Authorization"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::x-api-key"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::Content-Type"]=0
operation_parameters_maximum_occurrences["cancelPipelineExecutionStep:::body"]=0
operation_parameters_maximum_occurrences["getCurrentExecution:::programId"]=0
operation_parameters_maximum_occurrences["getCurrentExecution:::pipelineId"]=0
operation_parameters_maximum_occurrences["getCurrentExecution:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getCurrentExecution:::Authorization"]=0
operation_parameters_maximum_occurrences["getCurrentExecution:::x-api-key"]=0
operation_parameters_maximum_occurrences["getExecution:::programId"]=0
operation_parameters_maximum_occurrences["getExecution:::pipelineId"]=0
operation_parameters_maximum_occurrences["getExecution:::executionId"]=0
operation_parameters_maximum_occurrences["getExecution:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getExecution:::Authorization"]=0
operation_parameters_maximum_occurrences["getExecution:::x-api-key"]=0
operation_parameters_maximum_occurrences["getExecutions:::programId"]=0
operation_parameters_maximum_occurrences["getExecutions:::pipelineId"]=0
operation_parameters_maximum_occurrences["getExecutions:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getExecutions:::Authorization"]=0
operation_parameters_maximum_occurrences["getExecutions:::x-api-key"]=0
operation_parameters_maximum_occurrences["getExecutions:::start"]=0
operation_parameters_maximum_occurrences["getExecutions:::limit"]=0
operation_parameters_maximum_occurrences["getStepLogs:::programId"]=0
operation_parameters_maximum_occurrences["getStepLogs:::pipelineId"]=0
operation_parameters_maximum_occurrences["getStepLogs:::executionId"]=0
operation_parameters_maximum_occurrences["getStepLogs:::phaseId"]=0
operation_parameters_maximum_occurrences["getStepLogs:::stepId"]=0
operation_parameters_maximum_occurrences["getStepLogs:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getStepLogs:::Authorization"]=0
operation_parameters_maximum_occurrences["getStepLogs:::x-api-key"]=0
operation_parameters_maximum_occurrences["getStepLogs:::file"]=0
operation_parameters_maximum_occurrences["getStepLogs:::Accept"]=0
operation_parameters_maximum_occurrences["startPipeline:::programId"]=0
operation_parameters_maximum_occurrences["startPipeline:::pipelineId"]=0
operation_parameters_maximum_occurrences["startPipeline:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["startPipeline:::Authorization"]=0
operation_parameters_maximum_occurrences["startPipeline:::x-api-key"]=0
operation_parameters_maximum_occurrences["startPipeline:::Content-Type"]=0
operation_parameters_maximum_occurrences["stepMetric:::programId"]=0
operation_parameters_maximum_occurrences["stepMetric:::pipelineId"]=0
operation_parameters_maximum_occurrences["stepMetric:::executionId"]=0
operation_parameters_maximum_occurrences["stepMetric:::phaseId"]=0
operation_parameters_maximum_occurrences["stepMetric:::stepId"]=0
operation_parameters_maximum_occurrences["stepMetric:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["stepMetric:::Authorization"]=0
operation_parameters_maximum_occurrences["stepMetric:::x-api-key"]=0
operation_parameters_maximum_occurrences["stepState:::programId"]=0
operation_parameters_maximum_occurrences["stepState:::pipelineId"]=0
operation_parameters_maximum_occurrences["stepState:::executionId"]=0
operation_parameters_maximum_occurrences["stepState:::phaseId"]=0
operation_parameters_maximum_occurrences["stepState:::stepId"]=0
operation_parameters_maximum_occurrences["stepState:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["stepState:::Authorization"]=0
operation_parameters_maximum_occurrences["stepState:::x-api-key"]=0
operation_parameters_maximum_occurrences["deletePipeline:::programId"]=0
operation_parameters_maximum_occurrences["deletePipeline:::pipelineId"]=0
operation_parameters_maximum_occurrences["deletePipeline:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["deletePipeline:::Authorization"]=0
operation_parameters_maximum_occurrences["deletePipeline:::x-api-key"]=0
operation_parameters_maximum_occurrences["getPipeline:::programId"]=0
operation_parameters_maximum_occurrences["getPipeline:::pipelineId"]=0
operation_parameters_maximum_occurrences["getPipeline:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getPipeline:::Authorization"]=0
operation_parameters_maximum_occurrences["getPipeline:::x-api-key"]=0
operation_parameters_maximum_occurrences["getPipelines:::programId"]=0
operation_parameters_maximum_occurrences["getPipelines:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getPipelines:::Authorization"]=0
operation_parameters_maximum_occurrences["getPipelines:::x-api-key"]=0
operation_parameters_maximum_occurrences["patchPipeline:::programId"]=0
operation_parameters_maximum_occurrences["patchPipeline:::pipelineId"]=0
operation_parameters_maximum_occurrences["patchPipeline:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["patchPipeline:::Authorization"]=0
operation_parameters_maximum_occurrences["patchPipeline:::x-api-key"]=0
operation_parameters_maximum_occurrences["patchPipeline:::Content-Type"]=0
operation_parameters_maximum_occurrences["patchPipeline:::body"]=0
operation_parameters_maximum_occurrences["deleteProgram:::programId"]=0
operation_parameters_maximum_occurrences["deleteProgram:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["deleteProgram:::Authorization"]=0
operation_parameters_maximum_occurrences["deleteProgram:::x-api-key"]=0
operation_parameters_maximum_occurrences["getProgram:::programId"]=0
operation_parameters_maximum_occurrences["getProgram:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getProgram:::Authorization"]=0
operation_parameters_maximum_occurrences["getProgram:::x-api-key"]=0
operation_parameters_maximum_occurrences["getPrograms:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getPrograms:::Authorization"]=0
operation_parameters_maximum_occurrences["getPrograms:::x-api-key"]=0
operation_parameters_maximum_occurrences["getRepositories:::programId"]=0
operation_parameters_maximum_occurrences["getRepositories:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getRepositories:::Authorization"]=0
operation_parameters_maximum_occurrences["getRepositories:::x-api-key"]=0
operation_parameters_maximum_occurrences["getRepository:::programId"]=0
operation_parameters_maximum_occurrences["getRepository:::repositoryId"]=0
operation_parameters_maximum_occurrences["getRepository:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getRepository:::Authorization"]=0
operation_parameters_maximum_occurrences["getRepository:::x-api-key"]=0
operation_parameters_maximum_occurrences["getEnvironmentVariables:::programId"]=0
operation_parameters_maximum_occurrences["getEnvironmentVariables:::environmentId"]=0
operation_parameters_maximum_occurrences["getEnvironmentVariables:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["getEnvironmentVariables:::Authorization"]=0
operation_parameters_maximum_occurrences["getEnvironmentVariables:::x-api-key"]=0
operation_parameters_maximum_occurrences["patchEnvironmentVariables:::programId"]=0
operation_parameters_maximum_occurrences["patchEnvironmentVariables:::environmentId"]=0
operation_parameters_maximum_occurrences["patchEnvironmentVariables:::x-gw-ims-org-id"]=0
operation_parameters_maximum_occurrences["patchEnvironmentVariables:::Authorization"]=0
operation_parameters_maximum_occurrences["patchEnvironmentVariables:::x-api-key"]=0
operation_parameters_maximum_occurrences["patchEnvironmentVariables:::Content-Type"]=0
operation_parameters_maximum_occurrences["patchEnvironmentVariables:::body"]=0

##
# The type of collection for specifying multiple values for parameter:
# - multi, csv, ssv, tsv
declare -A operation_parameters_collection_type
operation_parameters_collection_type["getBranches:::programId"]=""
operation_parameters_collection_type["getBranches:::repositoryId"]=""
operation_parameters_collection_type["getBranches:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getBranches:::Authorization"]=""
operation_parameters_collection_type["getBranches:::x-api-key"]=""
operation_parameters_collection_type["deleteEnvironment:::programId"]=""
operation_parameters_collection_type["deleteEnvironment:::environmentId"]=""
operation_parameters_collection_type["deleteEnvironment:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["deleteEnvironment:::Authorization"]=""
operation_parameters_collection_type["deleteEnvironment:::x-api-key"]=""
operation_parameters_collection_type["downloadLogs:::programId"]=""
operation_parameters_collection_type["downloadLogs:::environmentId"]=""
operation_parameters_collection_type["downloadLogs:::service"]=""
operation_parameters_collection_type["downloadLogs:::name"]=""
operation_parameters_collection_type["downloadLogs:::date"]=""
operation_parameters_collection_type["downloadLogs:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["downloadLogs:::Authorization"]=""
operation_parameters_collection_type["downloadLogs:::x-api-key"]=""
operation_parameters_collection_type["downloadLogs:::Accept"]=""
operation_parameters_collection_type["getEnvironment:::programId"]=""
operation_parameters_collection_type["getEnvironment:::environmentId"]=""
operation_parameters_collection_type["getEnvironment:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getEnvironment:::Authorization"]=""
operation_parameters_collection_type["getEnvironment:::x-api-key"]=""
operation_parameters_collection_type["getEnvironmentLogs:::programId"]=""
operation_parameters_collection_type["getEnvironmentLogs:::environmentId"]=""
operation_parameters_collection_type["getEnvironmentLogs:::days"]=""
operation_parameters_collection_type["getEnvironmentLogs:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getEnvironmentLogs:::Authorization"]=""
operation_parameters_collection_type["getEnvironmentLogs:::x-api-key"]=""
operation_parameters_collection_type["getEnvironmentLogs:::service"]="multi"
operation_parameters_collection_type["getEnvironmentLogs:::name"]="multi"
operation_parameters_collection_type["getEnvironments:::programId"]=""
operation_parameters_collection_type["getEnvironments:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getEnvironments:::Authorization"]=""
operation_parameters_collection_type["getEnvironments:::x-api-key"]=""
operation_parameters_collection_type["getEnvironments:::type"]=""
operation_parameters_collection_type["advancePipelineExecution:::programId"]=""
operation_parameters_collection_type["advancePipelineExecution:::pipelineId"]=""
operation_parameters_collection_type["advancePipelineExecution:::executionId"]=""
operation_parameters_collection_type["advancePipelineExecution:::phaseId"]=""
operation_parameters_collection_type["advancePipelineExecution:::stepId"]=""
operation_parameters_collection_type["advancePipelineExecution:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["advancePipelineExecution:::Authorization"]=""
operation_parameters_collection_type["advancePipelineExecution:::x-api-key"]=""
operation_parameters_collection_type["advancePipelineExecution:::Content-Type"]=""
operation_parameters_collection_type["advancePipelineExecution:::body"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::programId"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::pipelineId"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::executionId"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::phaseId"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::stepId"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::Authorization"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::x-api-key"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::Content-Type"]=""
operation_parameters_collection_type["cancelPipelineExecutionStep:::body"]=""
operation_parameters_collection_type["getCurrentExecution:::programId"]=""
operation_parameters_collection_type["getCurrentExecution:::pipelineId"]=""
operation_parameters_collection_type["getCurrentExecution:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getCurrentExecution:::Authorization"]=""
operation_parameters_collection_type["getCurrentExecution:::x-api-key"]=""
operation_parameters_collection_type["getExecution:::programId"]=""
operation_parameters_collection_type["getExecution:::pipelineId"]=""
operation_parameters_collection_type["getExecution:::executionId"]=""
operation_parameters_collection_type["getExecution:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getExecution:::Authorization"]=""
operation_parameters_collection_type["getExecution:::x-api-key"]=""
operation_parameters_collection_type["getExecutions:::programId"]=""
operation_parameters_collection_type["getExecutions:::pipelineId"]=""
operation_parameters_collection_type["getExecutions:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getExecutions:::Authorization"]=""
operation_parameters_collection_type["getExecutions:::x-api-key"]=""
operation_parameters_collection_type["getExecutions:::start"]=""
operation_parameters_collection_type["getExecutions:::limit"]=""
operation_parameters_collection_type["getStepLogs:::programId"]=""
operation_parameters_collection_type["getStepLogs:::pipelineId"]=""
operation_parameters_collection_type["getStepLogs:::executionId"]=""
operation_parameters_collection_type["getStepLogs:::phaseId"]=""
operation_parameters_collection_type["getStepLogs:::stepId"]=""
operation_parameters_collection_type["getStepLogs:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getStepLogs:::Authorization"]=""
operation_parameters_collection_type["getStepLogs:::x-api-key"]=""
operation_parameters_collection_type["getStepLogs:::file"]=""
operation_parameters_collection_type["getStepLogs:::Accept"]=""
operation_parameters_collection_type["startPipeline:::programId"]=""
operation_parameters_collection_type["startPipeline:::pipelineId"]=""
operation_parameters_collection_type["startPipeline:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["startPipeline:::Authorization"]=""
operation_parameters_collection_type["startPipeline:::x-api-key"]=""
operation_parameters_collection_type["startPipeline:::Content-Type"]=""
operation_parameters_collection_type["stepMetric:::programId"]=""
operation_parameters_collection_type["stepMetric:::pipelineId"]=""
operation_parameters_collection_type["stepMetric:::executionId"]=""
operation_parameters_collection_type["stepMetric:::phaseId"]=""
operation_parameters_collection_type["stepMetric:::stepId"]=""
operation_parameters_collection_type["stepMetric:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["stepMetric:::Authorization"]=""
operation_parameters_collection_type["stepMetric:::x-api-key"]=""
operation_parameters_collection_type["stepState:::programId"]=""
operation_parameters_collection_type["stepState:::pipelineId"]=""
operation_parameters_collection_type["stepState:::executionId"]=""
operation_parameters_collection_type["stepState:::phaseId"]=""
operation_parameters_collection_type["stepState:::stepId"]=""
operation_parameters_collection_type["stepState:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["stepState:::Authorization"]=""
operation_parameters_collection_type["stepState:::x-api-key"]=""
operation_parameters_collection_type["deletePipeline:::programId"]=""
operation_parameters_collection_type["deletePipeline:::pipelineId"]=""
operation_parameters_collection_type["deletePipeline:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["deletePipeline:::Authorization"]=""
operation_parameters_collection_type["deletePipeline:::x-api-key"]=""
operation_parameters_collection_type["getPipeline:::programId"]=""
operation_parameters_collection_type["getPipeline:::pipelineId"]=""
operation_parameters_collection_type["getPipeline:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getPipeline:::Authorization"]=""
operation_parameters_collection_type["getPipeline:::x-api-key"]=""
operation_parameters_collection_type["getPipelines:::programId"]=""
operation_parameters_collection_type["getPipelines:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getPipelines:::Authorization"]=""
operation_parameters_collection_type["getPipelines:::x-api-key"]=""
operation_parameters_collection_type["patchPipeline:::programId"]=""
operation_parameters_collection_type["patchPipeline:::pipelineId"]=""
operation_parameters_collection_type["patchPipeline:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["patchPipeline:::Authorization"]=""
operation_parameters_collection_type["patchPipeline:::x-api-key"]=""
operation_parameters_collection_type["patchPipeline:::Content-Type"]=""
operation_parameters_collection_type["patchPipeline:::body"]=""
operation_parameters_collection_type["deleteProgram:::programId"]=""
operation_parameters_collection_type["deleteProgram:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["deleteProgram:::Authorization"]=""
operation_parameters_collection_type["deleteProgram:::x-api-key"]=""
operation_parameters_collection_type["getProgram:::programId"]=""
operation_parameters_collection_type["getProgram:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getProgram:::Authorization"]=""
operation_parameters_collection_type["getProgram:::x-api-key"]=""
operation_parameters_collection_type["getPrograms:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getPrograms:::Authorization"]=""
operation_parameters_collection_type["getPrograms:::x-api-key"]=""
operation_parameters_collection_type["getRepositories:::programId"]=""
operation_parameters_collection_type["getRepositories:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getRepositories:::Authorization"]=""
operation_parameters_collection_type["getRepositories:::x-api-key"]=""
operation_parameters_collection_type["getRepository:::programId"]=""
operation_parameters_collection_type["getRepository:::repositoryId"]=""
operation_parameters_collection_type["getRepository:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getRepository:::Authorization"]=""
operation_parameters_collection_type["getRepository:::x-api-key"]=""
operation_parameters_collection_type["getEnvironmentVariables:::programId"]=""
operation_parameters_collection_type["getEnvironmentVariables:::environmentId"]=""
operation_parameters_collection_type["getEnvironmentVariables:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["getEnvironmentVariables:::Authorization"]=""
operation_parameters_collection_type["getEnvironmentVariables:::x-api-key"]=""
operation_parameters_collection_type["patchEnvironmentVariables:::programId"]=""
operation_parameters_collection_type["patchEnvironmentVariables:::environmentId"]=""
operation_parameters_collection_type["patchEnvironmentVariables:::x-gw-ims-org-id"]=""
operation_parameters_collection_type["patchEnvironmentVariables:::Authorization"]=""
operation_parameters_collection_type["patchEnvironmentVariables:::x-api-key"]=""
operation_parameters_collection_type["patchEnvironmentVariables:::Content-Type"]=""
operation_parameters_collection_type["patchEnvironmentVariables:::body"]=


##
# Map for body parameters passed after operation as
# PARAMETER==STRING_VALUE or PARAMETER:=NUMERIC_VALUE
# These will be mapped to top level json keys ( { "PARAMETER": "VALUE" })
declare -A body_parameters

##
# These arguments will be directly passed to cURL
curl_arguments=""

##
# The host for making the request
host=""

##
# The user credentials for basic authentication
basic_auth_credential=""


##
# If true, the script will only output the actual cURL command that would be
# used
print_curl=false

##
# The operation ID passed on the command line
operation=""

##
# The provided Accept header value
header_accept=""

##
# The provided Content-type header value
header_content_type=""

##
# If there is any body content on the stdin pass it to the body of the request
body_content_temp_file=""

##
# If this variable is set to true, the request will be performed even
# if parameters for required query, header or body values are not provided
# (path parameters are still required).
force=false

##
# Declare some mime types abbreviations for easier content-type and accepts
# headers specification
declare -A mime_type_abbreviations
# text/*
mime_type_abbreviations["text"]="text/plain"
mime_type_abbreviations["html"]="text/html"
mime_type_abbreviations["md"]="text/x-markdown"
mime_type_abbreviations["csv"]="text/csv"
mime_type_abbreviations["css"]="text/css"
mime_type_abbreviations["rtf"]="text/rtf"
# application/*
mime_type_abbreviations["json"]="application/json"
mime_type_abbreviations["xml"]="application/xml"
mime_type_abbreviations["yaml"]="application/yaml"
mime_type_abbreviations["js"]="application/javascript"
mime_type_abbreviations["bin"]="application/octet-stream"
mime_type_abbreviations["rdf"]="application/rdf+xml"
# image/*
mime_type_abbreviations["jpg"]="image/jpeg"
mime_type_abbreviations["png"]="image/png"
mime_type_abbreviations["gif"]="image/gif"
mime_type_abbreviations["bmp"]="image/bmp"
mime_type_abbreviations["tiff"]="image/tiff"


##############################################################################
#
# Escape special URL characters
# Based on table at http://www.w3schools.com/tags/ref_urlencode.asp
#
##############################################################################
url_escape() {
    local raw_url="$1"

    value=$(sed -e 's/ /%20/g' \
       -e 's/!/%21/g' \
       -e 's/"/%22/g' \
       -e 's/#/%23/g' \
       -e 's/\&/%26/g' \
       -e 's/'\''/%28/g' \
       -e 's/(/%28/g' \
       -e 's/)/%29/g' \
       -e 's/:/%3A/g' \
       -e 's/\t/%09/g' \
       -e 's/?/%3F/g' <<<"$raw_url");

    echo "$value"
}

##############################################################################
#
# Lookup the mime type abbreviation in the mime_type_abbreviations array.
# If not present assume the user provided a valid mime type
#
##############################################################################
lookup_mime_type() {
    local mime_type="$1"

    if [[ ${mime_type_abbreviations[$mime_type]} ]]; then
        echo "${mime_type_abbreviations[$mime_type]}"
    else
        echo "$mime_type"
    fi
}

##############################################################################
#
# Converts an associative array into a list of cURL header
# arguments (-H "KEY: VALUE")
#
##############################################################################
header_arguments_to_curl() {
    local headers_curl=""

    for key in "${!header_arguments[@]}"; do
        headers_curl+="-H \"${key}: ${header_arguments[${key}]}\" "
    done
    headers_curl+=" "

    echo "${headers_curl}"
}

##############################################################################
#
# Converts an associative array into a simple JSON with keys as top
# level object attributes
#
# \todo Add conversion of more complex attributes using paths
#
##############################################################################
body_parameters_to_json() {
    local body_json="-d '{"
    local count=0
    for key in "${!body_parameters[@]}"; do
        if [[ $((count++)) -gt 0 ]]; then
            body_json+=", "
        fi
        body_json+="\"${key}\": ${body_parameters[${key}]}"
    done
    body_json+="}'"

    if [[ "${#body_parameters[@]}" -eq 0 ]]; then
        echo ""
    else
        echo "${body_json}"
    fi
}

##############################################################################
#
# Helper method for showing error because for example echo in
# build_request_path() is evaluated as part of command line not printed on
# output. Anyway better idea for resource clean up ;-).
#
##############################################################################
ERROR_MSG=""
function finish {
    if [[ -n "$ERROR_MSG" ]]; then
        echo >&2 "${OFF}${RED}$ERROR_MSG"
        echo >&2 "${OFF}Check usage: '${script_name} --help'"
    fi
}
trap finish EXIT


##############################################################################
#
# Validate and build request path including query parameters
#
##############################################################################
build_request_path() {
    local path_template=$1
    local -n path_params=$2
    local -n query_params=$3


    #
    # Check input parameters count against minimum and maximum required
    #
    if [[ "$force" = false ]]; then
        local was_error=""
        for qparam in "${query_params[@]}" "${path_params[@]}"; do
            local parameter_values
            mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")

            #
            # Check if the number of provided values is not less than minimum required
            #
            if [[ ${#parameter_values[@]} -lt ${operation_parameters_minimum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too few values provided for '${qparam}' parameter."
                was_error=true
            fi

            #
            # Check if the number of provided values is not more than maximum
            #
            if [[ ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} -gt 0 \
                  && ${#parameter_values[@]} -gt ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too many values provided for '${qparam}' parameter"
                was_error=true
            fi
        done
        if [[ -n "$was_error" ]]; then
            exit 1
        fi
    fi

    # First replace all path parameters in the path
    for pparam in "${path_params[@]}"; do
        local path_regex="(.*)(\\{$pparam\\})(.*)"
        if [[ $path_template =~ $path_regex ]]; then
            path_template=${BASH_REMATCH[1]}${operation_parameters[$pparam]}${BASH_REMATCH[3]}
        fi
    done

    local query_request_part=""

    for qparam in "${query_params[@]}"; do
        if [[ "${operation_parameters[$qparam]}" == "" ]]; then
            continue
        fi

        # Get the array of parameter values
        local parameter_value=""
        local parameter_values
        mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")



        #
        # Append parameters without specific cardinality
        #
        local collection_type="${operation_parameters_collection_type["${operation}:::${qparam}"]}"
        if [[ "${collection_type}" == "" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'mutli' collections i.e. param=value1&param=value2&...
        #
        elif [[ "${collection_type}" == "multi" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'csv' collections i.e. param=value1,value2,...
        #
        elif [[ "${collection_type}" == "csv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=","
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'ssv' collections i.e. param="value1 value2 ..."
        #
        elif [[ "${collection_type}" == "ssv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=" "
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'tsv' collections i.e. param="value1\tvalue2\t..."
        #
        elif [[ "${collection_type}" == "tsv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="\\t"
                fi
                parameter_value+="${qvalue}"
            done
        else
            echo "Unsupported collection format \"${collection_type}\""
            exit 1
        fi

        if [[ -n "${parameter_value}" ]]; then
            if [[ -n "${query_request_part}" ]]; then
                query_request_part+="&"
            fi
            query_request_part+="${parameter_value}"
        fi

    done


    # Now append query parameters - if any
    if [[ -n "${query_request_part}" ]]; then
        path_template+="?${query_request_part}"
    fi

    echo "$path_template"
}



###############################################################################
#
# Print main help message
#
###############################################################################
print_help() {
cat <<EOF

${BOLD}${WHITE}Cloud Manager API command line client (API version 1.0.0)${OFF}

${BOLD}${WHITE}Usage${OFF}

  ${GREEN}${script_name}${OFF} [-h|--help] [-V|--version] [--about] [${RED}<curl-options>${OFF}]
           [-ac|--accept ${GREEN}<mime-type>${OFF}] [-ct,--content-type ${GREEN}<mime-type>${OFF}]
           [--host ${CYAN}<url>${OFF}] [--dry-run] [-nc|--no-colors] ${YELLOW}<operation>${OFF} [-h|--help]
           [${BLUE}<headers>${OFF}] [${MAGENTA}<parameters>${OFF}] [${MAGENTA}<body-parameters>${OFF}]

  - ${CYAN}<url>${OFF} - endpoint of the REST service without basepath

  - ${RED}<curl-options>${OFF} - any valid cURL options can be passed before ${YELLOW}<operation>${OFF}
  - ${GREEN}<mime-type>${OFF} - either full mime-type or one of supported abbreviations:
                   (text, html, md, csv, css, rtf, json, xml, yaml, js, bin,
                    rdf, jpg, png, gif, bmp, tiff)
  - ${BLUE}<headers>${OFF} - HTTP headers can be passed in the form ${YELLOW}HEADER${OFF}:${BLUE}VALUE${OFF}
  - ${MAGENTA}<parameters>${OFF} - REST operation parameters can be passed in the following
                   forms:
                   * ${YELLOW}KEY${OFF}=${BLUE}VALUE${OFF} - path or query parameters
  - ${MAGENTA}<body-parameters>${OFF} - simple JSON body content (first level only) can be build
                        using the following arguments:
                        * ${YELLOW}KEY${OFF}==${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": "${BLUE}VALUE${OFF}", ... }'
                        * ${YELLOW}KEY${OFF}:=${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": ${BLUE}VALUE${OFF}, ... }'

EOF
    echo -e "${BOLD}${WHITE}Operations (grouped by tags)${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}[branches]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getBranches${OFF};List Branches
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[environments]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}deleteEnvironment${OFF};DeleteEnvironment
  ${CYAN}downloadLogs${OFF};Download Logs
  ${CYAN}getEnvironment${OFF};Get Environment
  ${CYAN}getEnvironmentLogs${OFF};Get Environment Logs
  ${CYAN}getEnvironments${OFF};List Environments
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[pipelineExecution]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}advancePipelineExecution${OFF};Advance
  ${CYAN}cancelPipelineExecutionStep${OFF};Cancel
  ${CYAN}getCurrentExecution${OFF};Get current pipeline execution
  ${CYAN}getExecution${OFF};Get pipeline execution
  ${CYAN}getExecutions${OFF};List Executions
  ${CYAN}getStepLogs${OFF};Get logs
  ${CYAN}startPipeline${OFF};Start the pipeline
  ${CYAN}stepMetric${OFF};Get step metrics
  ${CYAN}stepState${OFF};Get step state
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[pipelines]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}deletePipeline${OFF};Delete a Pipeline
  ${CYAN}getPipeline${OFF};Get Pipeline
  ${CYAN}getPipelines${OFF};List Pipelines
  ${CYAN}patchPipeline${OFF};Patches Pipeline
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[programs]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}deleteProgram${OFF};Delete Program
  ${CYAN}getProgram${OFF};Get Program
  ${CYAN}getPrograms${OFF};Lists Programs
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[repositories]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getRepositories${OFF};Lists Repositories
  ${CYAN}getRepository${OFF};Get Repository
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[variables]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getEnvironmentVariables${OFF};List User Environment Variables
  ${CYAN}patchEnvironmentVariables${OFF};Patch User Environment Variables
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}Options${OFF}"
    echo -e "  -h,--help\\t\\t\\t\\tPrint this help"
    echo -e "  -V,--version\\t\\t\\t\\tPrint API version"
    echo -e "  --about\\t\\t\\t\\tPrint the information about service"
    echo -e "  --host ${CYAN}<url>${OFF}\\t\\t\\t\\tSpecify the host URL "
echo -e "              \\t\\t\\t\\t(e.g. 'https://cloudmanager.adobe.io')"

    echo -e "  --force\\t\\t\\t\\tForce command invocation in spite of missing"
    echo -e "         \\t\\t\\t\\trequired parameters or wrong content type"
    echo -e "  --dry-run\\t\\t\\t\\tPrint out the cURL command without"
    echo -e "           \\t\\t\\t\\texecuting it"
    echo -e "  -nc,--no-colors\\t\\t\\tEnforce print without colors, otherwise autodected"
    echo -e "  -ac,--accept ${YELLOW}<mime-type>${OFF}\\t\\tSet the 'Accept' header in the request"
    echo -e "  -ct,--content-type ${YELLOW}<mime-type>${OFF}\\tSet the 'Content-type' header in "
    echo -e "                                \\tthe request"
    echo ""
}


##############################################################################
#
# Print REST service description
#
##############################################################################
print_about() {
    echo ""
    echo -e "${BOLD}${WHITE}Cloud Manager API command line client (API version 1.0.0)${OFF}"
    echo ""
    echo -e "License: The Apache License, Version 2.0"
    echo -e "Contact: opensource@shinesolutions.com"
    echo ""
read -r -d '' appdescription <<EOF

This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
EOF
echo "$appdescription" | paste -sd' ' | fold -sw 80
}


##############################################################################
#
# Print REST api version
#
##############################################################################
print_version() {
    echo ""
    echo -e "${BOLD}Cloud Manager API command line client (API version 1.0.0)${OFF}"
    echo ""
}

##############################################################################
#
# Print help for getBranches operation
#
##############################################################################
print_getBranches_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getBranches - List Branches${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns the list of branches from a repository" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}repositoryId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the repository ${YELLOW}Specify as: repositoryId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of the list of repository branches${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteEnvironment operation
#
##############################################################################
print_deleteEnvironment_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteEnvironment - DeleteEnvironment${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete environment" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the application ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}environmentId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the environment ${YELLOW}Specify as: environmentId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=201
    echo -e "${result_color_table[${code:0:1}]}  201;Environment deleted${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Environment deletion in progress${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Environment not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for downloadLogs operation
#
##############################################################################
print_downloadLogs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}downloadLogs - Download Logs${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Download environment logs" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}environmentId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the environment ${YELLOW}Specify as: environmentId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}service${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Name of service${YELLOW} Specify as: service=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Name of log${YELLOW} Specify as: name=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}date${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - date for which log is required${YELLOW} Specify as: date=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Accept${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. ${YELLOW}Specify as: Accept:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of logs${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;invalid parameters${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Environment not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getEnvironment operation
#
##############################################################################
print_getEnvironment_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getEnvironment - Get Environment${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns an environment by its id" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}environmentId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the environment ${YELLOW}Specify as: environmentId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;successful operation${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getEnvironmentLogs operation
#
##############################################################################
print_getEnvironmentLogs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getEnvironmentLogs - Get Environment Logs${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List all logs available in environment" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}environmentId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the environment ${YELLOW}Specify as: environmentId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}days${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - number of days for which logs are required${YELLOW} Specify as: days=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}service${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Names of services${YELLOW} Specify as: service=value1 service=value2 service=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}name${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Names of log${YELLOW} Specify as: name=value1 name=value2 name=...${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of logs for an environment${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;invalid parameters${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Environment not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getEnvironments operation
#
##############################################################################
print_getEnvironments_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getEnvironments - List Environments${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Lists all environments in an program" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}type${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Type of the environment${YELLOW} Specify as: type=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of environment list${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Program not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for advancePipelineExecution operation
#
##############################################################################
print_advancePipelineExecution_help() {
    echo ""
    echo -e "${BOLD}${WHITE}advancePipelineExecution - Advance${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}executionId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the execution ${YELLOW}Specify as: executionId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}phaseId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the phase ${YELLOW}Specify as: phaseId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stepId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the step ${YELLOW}Specify as: stepId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Content-Type${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Must always be application/json ${YELLOW}Specify as: Content-Type:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Input for advance. See documentation for details." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=202
    echo -e "${result_color_table[${code:0:1}]}  202;Successful resume of pipeline execution${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Missing permission for user to advance the pipeline execution${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;No pipeline execution exits or unknown pipeline or program${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for cancelPipelineExecutionStep operation
#
##############################################################################
print_cancelPipelineExecutionStep_help() {
    echo ""
    echo -e "${BOLD}${WHITE}cancelPipelineExecutionStep - Cancel${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}executionId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the execution ${YELLOW}Specify as: executionId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}phaseId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the phase ${YELLOW}Specify as: phaseId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stepId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the step ${YELLOW}Specify as: stepId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Content-Type${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Must always be application/json ${YELLOW}Specify as: Content-Type:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Input for advance. See documentation for details." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=202
    echo -e "${result_color_table[${code:0:1}]}  202;Successful cancel of pipeline execution${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Missing permission for user to cancel the current pipeline execution${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;No pipeline execution exits or unknown pipeline or program${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getCurrentExecution operation
#
##############################################################################
print_getCurrentExecution_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getCurrentExecution - Get current pipeline execution${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns current pipeline execution if any." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of current execution${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;No pipeline execution exits or unknown pipeline or program${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getExecution operation
#
##############################################################################
print_getExecution_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getExecution - Get pipeline execution${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns a pipeline execution by id" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}executionId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the execution ${YELLOW}Specify as: executionId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of execution${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;No pipeline execution exits or unknown pipeline or application${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getExecutions operation
#
##############################################################################
print_getExecutions_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getExecutions - List Executions${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns the history of pipeline executions in a newest to oldest order" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Pagination start parameter${YELLOW} Specify as: start=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Pagination limit parameter${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of execution history${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Missing permission for user to read executions${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Pipeline does not exist${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getStepLogs operation
#
##############################################################################
print_getStepLogs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getStepLogs - Get logs${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the logs associated with a step." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}executionId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the execution ${YELLOW}Specify as: executionId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}phaseId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the phase ${YELLOW}Specify as: phaseId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stepId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the step ${YELLOW}Specify as: stepId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}file${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Identifier of the log file${YELLOW} Specify as: file=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Accept${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. ${YELLOW}Specify as: Accept:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of logs${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Missing permission for user to read logs${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Pipeline execution does not exist${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for startPipeline operation
#
##############################################################################
print_startPipeline_help() {
    echo ""
    echo -e "${BOLD}${WHITE}startPipeline - Start the pipeline${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Starts the Pipeline. This works only if the pipeline is not already started." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Content-Type${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Must always be application/json ${YELLOW}Specify as: Content-Type:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=201
    echo -e "${result_color_table[${code:0:1}]}  201;Successful started pipeline execution${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Request conflicts with the expected state of pipeline${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;No pipeline execution exits or unknown pipeline or application${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=412
    echo -e "${result_color_table[${code:0:1}]}  412;Cannot start execution: programId={programId}, pipelineId={pipelineId} currentExecutionId={executionId}, reason='Execution already in progress.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for stepMetric operation
#
##############################################################################
print_stepMetric_help() {
    echo ""
    echo -e "${BOLD}${WHITE}stepMetric - Get step metrics${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}executionId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the execution ${YELLOW}Specify as: executionId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}phaseId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the phase ${YELLOW}Specify as: phaseId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stepId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the step ${YELLOW}Specify as: stepId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of metrics${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Missing permission for user to read metrics${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Pipeline execution does not exist${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for stepState operation
#
##############################################################################
print_stepState_help() {
    echo ""
    echo -e "${BOLD}${WHITE}stepState - Get step state${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program. ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}executionId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the execution ${YELLOW}Specify as: executionId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}phaseId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the phase ${YELLOW}Specify as: phaseId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}stepId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the step ${YELLOW}Specify as: stepId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of step state${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Missing permission for user to read step${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Pipeline execution does not exist${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deletePipeline operation
#
##############################################################################
print_deletePipeline_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deletePipeline - Delete a Pipeline${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a pipeline. All the data is wiped." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;successful operation${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getPipeline operation
#
##############################################################################
print_getPipeline_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getPipeline - Get Pipeline${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns a pipeline by its id" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of pipeline${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Pipeline not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getPipelines operation
#
##############################################################################
print_getPipelines_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getPipelines - List Pipelines${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns all the pipelines that the requesting user has access to in an program" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;successful operation${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for patchPipeline operation
#
##############################################################################
print_patchPipeline_help() {
    echo ""
    echo -e "${BOLD}${WHITE}patchPipeline - Patches Pipeline${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Patches a pipeline within an program." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}pipelineId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the pipeline ${YELLOW}Specify as: pipelineId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Content-Type${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Must always be application/json ${YELLOW}Specify as: Content-Type:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The updated Pipeline" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;successful operation${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteProgram operation
#
##############################################################################
print_deleteProgram_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteProgram - Delete Program${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete an program" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;successful operation${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=202
    echo -e "${result_color_table[${code:0:1}]}  202;Delete was successful.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=403
    echo -e "${result_color_table[${code:0:1}]}  403;Forbidden.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Program not found.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=412
    echo -e "${result_color_table[${code:0:1}]}  412;Deletion not supported${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getProgram operation
#
##############################################################################
print_getProgram_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getProgram - Get Program${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns a program by its id" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of program${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Program not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getPrograms operation
#
##############################################################################
print_getPrograms_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getPrograms - Lists Programs${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns all programs that the requesting user has access to" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;successful operation${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getRepositories operation
#
##############################################################################
print_getRepositories_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getRepositories - Lists Repositories${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Lists all Repositories in an program" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;successful operation${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getRepository operation
#
##############################################################################
print_getRepository_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getRepository - Get Repository${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Returns an repository by its id" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}repositoryId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the repository ${YELLOW}Specify as: repositoryId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;successful operation${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getEnvironmentVariables operation
#
##############################################################################
print_getEnvironmentVariables_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getEnvironmentVariables - List User Environment Variables${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List the user defined variables for an environment (Cloud Service only)." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}environmentId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the environment ${YELLOW}Specify as: environmentId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful retrieval of environment variables${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Environment not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for patchEnvironmentVariables operation
#
##############################################################################
print_patchEnvironmentVariables_help() {
    echo ""
    echo -e "${BOLD}${WHITE}patchEnvironmentVariables - Patch User Environment Variables${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}programId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the program ${YELLOW}Specify as: programId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}environmentId${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Identifier of the environment ${YELLOW}Specify as: environmentId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-gw-ims-org-id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS organization ID that the request is being made under. ${YELLOW}Specify as: x-gw-ims-org-id:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Authorization${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Bearer [token] - An access token for the technical account created through integration with Adobe IO ${YELLOW}Specify as: Authorization:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}x-api-key${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io ${YELLOW}Specify as: x-api-key:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}Content-Type${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Must always be application/json ${YELLOW}Specify as: Content-Type:value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successful update of environment variables${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=404
    echo -e "${result_color_table[${code:0:1}]}  404;Environment not found${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}


##############################################################################
#
# Call getBranches operation
#
##############################################################################
call_getBranches() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId repositoryId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/repository/{repositoryId}/branches" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteEnvironment operation
#
##############################################################################
call_deleteEnvironment() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId environmentId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/environment/{environmentId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call downloadLogs operation
#
##############################################################################
call_downloadLogs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId environmentId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(service name date)
    local path

    if ! path=$(build_request_path "/api/program/{programId}/environment/{environmentId}/logs/download" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getEnvironment operation
#
##############################################################################
call_getEnvironment() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId environmentId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/environment/{environmentId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getEnvironmentLogs operation
#
##############################################################################
call_getEnvironmentLogs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId environmentId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(service name days)
    local path

    if ! path=$(build_request_path "/api/program/{programId}/environment/{environmentId}/logs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getEnvironments operation
#
##############################################################################
call_getEnvironments() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(type)
    local path

    if ! path=$(build_request_path "/api/program/{programId}/environments" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call advancePipelineExecution operation
#
##############################################################################
call_advancePipelineExecution() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId executionId phaseId stepId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PUT"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call cancelPipelineExecutionStep operation
#
##############################################################################
call_cancelPipelineExecutionStep() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId executionId phaseId stepId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PUT"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getCurrentExecution operation
#
##############################################################################
call_getCurrentExecution() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}/execution" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getExecution operation
#
##############################################################################
call_getExecution() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId executionId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getExecutions operation
#
##############################################################################
call_getExecutions() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start limit)
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}/executions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getStepLogs operation
#
##############################################################################
call_getStepLogs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId executionId phaseId stepId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(file)
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call startPipeline operation
#
##############################################################################
call_startPipeline() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}/execution" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PUT"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call stepMetric operation
#
##############################################################################
call_stepMetric() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId executionId phaseId stepId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call stepState operation
#
##############################################################################
call_stepState() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId executionId phaseId stepId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deletePipeline operation
#
##############################################################################
call_deletePipeline() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getPipeline operation
#
##############################################################################
call_getPipeline() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getPipelines operation
#
##############################################################################
call_getPipelines() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipelines" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call patchPipeline operation
#
##############################################################################
call_patchPipeline() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId pipelineId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/pipeline/{pipelineId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call deleteProgram operation
#
##############################################################################
call_deleteProgram() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getProgram operation
#
##############################################################################
call_getProgram() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getPrograms operation
#
##############################################################################
call_getPrograms() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/programs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getRepositories operation
#
##############################################################################
call_getRepositories() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/repositories" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getRepository operation
#
##############################################################################
call_getRepository() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId repositoryId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/repository/{repositoryId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getEnvironmentVariables operation
#
##############################################################################
call_getEnvironmentVariables() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId environmentId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/environment/{environmentId}/variables" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call patchEnvironmentVariables operation
#
##############################################################################
call_patchEnvironmentVariables() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(programId environmentId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/api/program/{programId}/environment/{environmentId}/variables" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}



##############################################################################
#
# Main
#
##############################################################################


# Check dependencies
type curl >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'cURL' installed."; exit 1; }
type sed >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'sed' installed."; exit 1; }
type column >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'bsdmainutils' installed."; exit 1; }

#
# Process command line
#
# Pass all arguments before 'operation' to cURL except the ones we override
#
take_user=false
take_host=false
take_accept_header=false
take_contenttype_header=false

for key in "$@"; do
# Take the value of -u|--user argument
if [[ "$take_user" = true ]]; then
    basic_auth_credential="$key"
    take_user=false
    continue
fi
# Take the value of --host argument
if [[ "$take_host" = true ]]; then
    host="$key"
    take_host=false
    continue
fi
# Take the value of --accept argument
if [[ "$take_accept_header" = true ]]; then
    header_accept=$(lookup_mime_type "$key")
    take_accept_header=false
    continue
fi
# Take the value of --content-type argument
if [[ "$take_contenttype_header" = true ]]; then
    header_content_type=$(lookup_mime_type "$key")
    take_contenttype_header=false
    continue
fi
case $key in
    -h|--help)
    if [[ "x$operation" == "x" ]]; then
        print_help
        exit 0
    else
        eval "print_${operation}_help"
        exit 0
    fi
    ;;
    -V|--version)
    print_version
    exit 0
    ;;
    --about)
    print_about
    exit 0
    ;;
    -u|--user)
    take_user=true
    ;;
    --host)
    take_host=true
    ;;
    --force)
    force=true
    ;;
    -ac|--accept)
    take_accept_header=true
    ;;
    -ct|--content-type)
    take_contenttype_header=true
    ;;
    --dry-run)
    print_curl=true
    ;;
    -nc|--no-colors)
        RED=""
        GREEN=""
        YELLOW=""
        BLUE=""
        MAGENTA=""
        CYAN=""
        WHITE=""
        BOLD=""
        OFF=""
        result_color_table=( "" "" "" "" "" "" "" )
    ;;
    getBranches)
    operation="getBranches"
    ;;
    deleteEnvironment)
    operation="deleteEnvironment"
    ;;
    downloadLogs)
    operation="downloadLogs"
    ;;
    getEnvironment)
    operation="getEnvironment"
    ;;
    getEnvironmentLogs)
    operation="getEnvironmentLogs"
    ;;
    getEnvironments)
    operation="getEnvironments"
    ;;
    advancePipelineExecution)
    operation="advancePipelineExecution"
    ;;
    cancelPipelineExecutionStep)
    operation="cancelPipelineExecutionStep"
    ;;
    getCurrentExecution)
    operation="getCurrentExecution"
    ;;
    getExecution)
    operation="getExecution"
    ;;
    getExecutions)
    operation="getExecutions"
    ;;
    getStepLogs)
    operation="getStepLogs"
    ;;
    startPipeline)
    operation="startPipeline"
    ;;
    stepMetric)
    operation="stepMetric"
    ;;
    stepState)
    operation="stepState"
    ;;
    deletePipeline)
    operation="deletePipeline"
    ;;
    getPipeline)
    operation="getPipeline"
    ;;
    getPipelines)
    operation="getPipelines"
    ;;
    patchPipeline)
    operation="patchPipeline"
    ;;
    deleteProgram)
    operation="deleteProgram"
    ;;
    getProgram)
    operation="getProgram"
    ;;
    getPrograms)
    operation="getPrograms"
    ;;
    getRepositories)
    operation="getRepositories"
    ;;
    getRepository)
    operation="getRepository"
    ;;
    getEnvironmentVariables)
    operation="getEnvironmentVariables"
    ;;
    patchEnvironmentVariables)
    operation="patchEnvironmentVariables"
    ;;
    *==*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content as strings
    if [[ "$operation" ]]; then
        IFS='==' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]="\"${body_value}\""
    fi
    ;;
    *:=*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content without qoutes
    if [[ "$operation" ]]; then
        # ignore error about 'sep' being unused
        # shellcheck disable=SC2034
        IFS=':=' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]=${body_value}
    fi
    ;;
    +\([^=]\):*)
    # Parse header arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS=':' read -r header_name header_value <<< "$key"
        header_arguments[$header_name]=$header_value
    else
        curl_arguments+=" $key"
    fi
    ;;
    -)
    body_content_temp_file=$(mktemp)
    cat - > "$body_content_temp_file"
    ;;
    *=*)
    # Parse operation arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS='=' read -r parameter_name parameter_value <<< "$key"
        if [[ -z "${operation_parameters[$parameter_name]+foo}" ]]; then
            operation_parameters[$parameter_name]=$(url_escape "${parameter_value}")
        else
            operation_parameters[$parameter_name]+=":::"$(url_escape "${parameter_value}")
        fi
    else
        curl_arguments+=" $key"
    fi
    ;;
    *)
    # If we are before the operation, treat the arguments as cURL arguments
    if [[ "x$operation" == "x" ]]; then
        # Maintain quotes around cURL arguments if necessary
        space_regexp="[[:space:]]"
        if [[ $key =~ $space_regexp ]]; then
            curl_arguments+=" \"$key\""
        else
            curl_arguments+=" $key"
        fi
    fi
    ;;
esac
done


# Check if user provided host name
if [[ -z "$host" ]]; then
    ERROR_MSG="ERROR: No hostname provided!!! You have to  provide on command line option '--host ...'"
    exit 1
fi

# Check if user specified operation ID
if [[ -z "$operation" ]]; then
    ERROR_MSG="ERROR: No operation specified!!!"
    exit 1
fi


# Run cURL command based on the operation ID
case $operation in
    getBranches)
    call_getBranches
    ;;
    deleteEnvironment)
    call_deleteEnvironment
    ;;
    downloadLogs)
    call_downloadLogs
    ;;
    getEnvironment)
    call_getEnvironment
    ;;
    getEnvironmentLogs)
    call_getEnvironmentLogs
    ;;
    getEnvironments)
    call_getEnvironments
    ;;
    advancePipelineExecution)
    call_advancePipelineExecution
    ;;
    cancelPipelineExecutionStep)
    call_cancelPipelineExecutionStep
    ;;
    getCurrentExecution)
    call_getCurrentExecution
    ;;
    getExecution)
    call_getExecution
    ;;
    getExecutions)
    call_getExecutions
    ;;
    getStepLogs)
    call_getStepLogs
    ;;
    startPipeline)
    call_startPipeline
    ;;
    stepMetric)
    call_stepMetric
    ;;
    stepState)
    call_stepState
    ;;
    deletePipeline)
    call_deletePipeline
    ;;
    getPipeline)
    call_getPipeline
    ;;
    getPipelines)
    call_getPipelines
    ;;
    patchPipeline)
    call_patchPipeline
    ;;
    deleteProgram)
    call_deleteProgram
    ;;
    getProgram)
    call_getProgram
    ;;
    getPrograms)
    call_getPrograms
    ;;
    getRepositories)
    call_getRepositories
    ;;
    getRepository)
    call_getRepository
    ;;
    getEnvironmentVariables)
    call_getEnvironmentVariables
    ;;
    patchEnvironmentVariables)
    call_patchEnvironmentVariables
    ;;
    *)
    ERROR_MSG="ERROR: Unknown operation: $operation"
    exit 1
esac
