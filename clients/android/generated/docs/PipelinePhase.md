

# PipelinePhase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the phase |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the phase | 
**repositoryId** | **String** | Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD |  [optional]
**branch** | **String** | Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing. |  [optional]
**environmentId** | **String** | Identifier of the target environment. Mandatory if type&#x3D;DEPLOY |  [optional]


## Enum: TypeEnum

Name | Value
---- | -----




