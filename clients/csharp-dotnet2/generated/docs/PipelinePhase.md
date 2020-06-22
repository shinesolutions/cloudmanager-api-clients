# Org.OpenAPITools.Model.PipelinePhase
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the phase | [optional] 
**Type** | **string** | Type of the phase | 
**RepositoryId** | **string** | Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD | [optional] 
**Branch** | **string** | Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing. | [optional] 
**EnvironmentId** | **string** | Identifier of the target environment. Mandatory if type&#x3D;DEPLOY | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

