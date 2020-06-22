-module(openapi_environment_logs__embedded).

-export([encode/1]).

-export_type([openapi_environment_logs__embedded/0]).

-type openapi_environment_logs__embedded() ::
    #{ 'downloads' => list()
     }.

encode(#{ 'downloads' := Downloads
        }) ->
    #{ 'downloads' => Downloads
     }.
