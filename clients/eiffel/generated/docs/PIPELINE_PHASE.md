# PIPELINE_PHASE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**STRING_32**](STRING_32.md) | Name of the phase | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Type of the phase | [default to null]
**repository_id** | [**STRING_32**](STRING_32.md) | Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD | [optional] [default to null]
**branch** | [**STRING_32**](STRING_32.md) | Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing. | [optional] [default to null]
**environment_id** | [**STRING_32**](STRING_32.md) | Identifier of the target environment. Mandatory if type&#x3D;DEPLOY | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


