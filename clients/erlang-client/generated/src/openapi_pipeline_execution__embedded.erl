-module(openapi_pipeline_execution__embedded).

-export([encode/1]).

-export_type([openapi_pipeline_execution__embedded/0]).

-type openapi_pipeline_execution__embedded() ::
    #{ 'stepStates' => list()
     }.

encode(#{ 'stepStates' := StepStates
        }) ->
    #{ 'stepStates' => StepStates
     }.
