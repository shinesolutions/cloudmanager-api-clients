# openapi::PipelinePhase

Describes a phase of a pipeline
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** | Name of the phase | [optional] 
**type** | **character** | Type of the phase | 
**repositoryId** | **character** | Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD | [optional] 
**branch** | **character** | Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing. | [optional] 
**environmentId** | **character** | Identifier of the target environment. Mandatory if type&#x3D;DEPLOY | [optional] 


