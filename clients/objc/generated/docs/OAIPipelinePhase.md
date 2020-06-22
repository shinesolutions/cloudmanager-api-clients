# OAIPipelinePhase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **NSString*** | Name of the phase | [optional] 
**type** | **NSString*** | Type of the phase | 
**repositoryId** | **NSString*** | Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD | [optional] 
**branch** | **NSString*** | Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing. | [optional] 
**environmentId** | **NSString*** | Identifier of the target environment. Mandatory if type&#x3D;DEPLOY | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


