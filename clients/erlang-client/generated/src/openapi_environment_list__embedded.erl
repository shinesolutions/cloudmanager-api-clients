-module(openapi_environment_list__embedded).

-export([encode/1]).

-export_type([openapi_environment_list__embedded/0]).

-type openapi_environment_list__embedded() ::
    #{ 'environments' => list()
     }.

encode(#{ 'environments' := Environments
        }) ->
    #{ 'environments' => Environments
     }.
