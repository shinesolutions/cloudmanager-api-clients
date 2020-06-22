-module(openapi_pipeline_list__embedded).

-export([encode/1]).

-export_type([openapi_pipeline_list__embedded/0]).

-type openapi_pipeline_list__embedded() ::
    #{ 'pipelines' => list()
     }.

encode(#{ 'pipelines' := Pipelines
        }) ->
    #{ 'pipelines' => Pipelines
     }.
