-module(openapi_pipeline_phase).

-export([encode/1]).

-export_type([openapi_pipeline_phase/0]).

-type openapi_pipeline_phase() ::
    #{ 'name' => binary(),
       'type' := binary(),
       'repositoryId' => binary(),
       'branch' => binary(),
       'environmentId' => binary()
     }.

encode(#{ 'name' := Name,
          'type' := Type,
          'repositoryId' := RepositoryId,
          'branch' := Branch,
          'environmentId' := EnvironmentId
        }) ->
    #{ 'name' => Name,
       'type' => Type,
       'repositoryId' => RepositoryId,
       'branch' => Branch,
       'environmentId' => EnvironmentId
     }.
