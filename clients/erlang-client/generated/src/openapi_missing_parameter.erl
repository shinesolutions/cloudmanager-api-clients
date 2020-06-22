-module(openapi_missing_parameter).

-export([encode/1]).

-export_type([openapi_missing_parameter/0]).

-type openapi_missing_parameter() ::
    #{ 'name' => binary(),
       'type' => binary()
     }.

encode(#{ 'name' := Name,
          'type' := Type
        }) ->
    #{ 'name' => Name,
       'type' => Type
     }.
