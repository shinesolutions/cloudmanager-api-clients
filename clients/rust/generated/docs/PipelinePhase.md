# PipelinePhase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | Option<**String**> | Name of the phase | [optional]
**_type** | **String** | Type of the phase | 
**repository_id** | Option<**String**> | Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD | [optional]
**branch** | Option<**String**> | Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing. | [optional]
**environment_id** | Option<**String**> | Identifier of the target environment. Mandatory if type=DEPLOY | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


