-module(openapi_variable).

-export([encode/1]).

-export_type([openapi_variable/0]).

-type openapi_variable() ::
    #{ 'name' => binary(),
       'value' => binary(),
       'type' => binary()
     }.

encode(#{ 'name' := Name,
          'value' := Value,
          'type' := Type
        }) ->
    #{ 'name' => Name,
       'value' => Value,
       'type' => Type
     }.
