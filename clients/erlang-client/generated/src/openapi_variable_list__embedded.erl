-module(openapi_variable_list__embedded).

-export([encode/1]).

-export_type([openapi_variable_list__embedded/0]).

-type openapi_variable_list__embedded() ::
    #{ 'variables' => list()
     }.

encode(#{ 'variables' := Variables
        }) ->
    #{ 'variables' => Variables
     }.
