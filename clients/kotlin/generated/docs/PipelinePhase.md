
# PipelinePhase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#TypeEnum) | Type of the phase | 
**name** | **kotlin.String** | Name of the phase |  [optional]
**repositoryId** | **kotlin.String** | Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD |  [optional]
**branch** | **kotlin.String** | Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing. |  [optional]
**environmentId** | **kotlin.String** | Identifier of the target environment. Mandatory if type&#x3D;DEPLOY |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | VALIDATE, BUILD, DEPLOY



