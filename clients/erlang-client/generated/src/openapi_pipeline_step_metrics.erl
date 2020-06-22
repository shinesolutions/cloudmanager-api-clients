-module(openapi_pipeline_step_metrics).

-export([encode/1]).

-export_type([openapi_pipeline_step_metrics/0]).

-type openapi_pipeline_step_metrics() ::
    #{ 'metrics' => list()
     }.

encode(#{ 'metrics' := Metrics
        }) ->
    #{ 'metrics' => Metrics
     }.
