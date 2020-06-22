-module(openapi_pipeline_execution).

-export([encode/1]).

-export_type([openapi_pipeline_execution/0]).

-type openapi_pipeline_execution() ::
    #{ 'id' => binary(),
       'programId' => binary(),
       'pipelineId' => binary(),
       'artifactsVersion' => binary(),
       'user' => binary(),
       'status' => binary(),
       'trigger' => binary(),
       'createdAt' => openapi_date_time:openapi_date_time(),
       'updatedAt' => openapi_date_time:openapi_date_time(),
       'finishedAt' => openapi_date_time:openapi_date_time(),
       '_embedded' => openapi_pipeline_execution__embedded:openapi_pipeline_execution__embedded(),
       '_links' => openapi_pipeline_execution__links:openapi_pipeline_execution__links()
     }.

encode(#{ 'id' := Id,
          'programId' := ProgramId,
          'pipelineId' := PipelineId,
          'artifactsVersion' := ArtifactsVersion,
          'user' := User,
          'status' := Status,
          'trigger' := Trigger,
          'createdAt' := CreatedAt,
          'updatedAt' := UpdatedAt,
          'finishedAt' := FinishedAt,
          '_embedded' := Embedded,
          '_links' := Links
        }) ->
    #{ 'id' => Id,
       'programId' => ProgramId,
       'pipelineId' => PipelineId,
       'artifactsVersion' => ArtifactsVersion,
       'user' => User,
       'status' => Status,
       'trigger' => Trigger,
       'createdAt' => CreatedAt,
       'updatedAt' => UpdatedAt,
       'finishedAt' => FinishedAt,
       '_embedded' => Embedded,
       '_links' => Links
     }.
