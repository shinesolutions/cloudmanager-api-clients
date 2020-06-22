-module(openapi_pipeline_execution_list_representation__embedded).

-export([encode/1]).

-export_type([openapi_pipeline_execution_list_representation__embedded/0]).

-type openapi_pipeline_execution_list_representation__embedded() ::
    #{ 'executions' => list()
     }.

encode(#{ 'executions' := Executions
        }) ->
    #{ 'executions' => Executions
     }.
