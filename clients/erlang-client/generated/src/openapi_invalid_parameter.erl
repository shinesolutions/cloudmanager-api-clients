-module(openapi_invalid_parameter).

-export([encode/1]).

-export_type([openapi_invalid_parameter/0]).

-type openapi_invalid_parameter() ::
    #{ 'name' => binary(),
       'reason' => binary()
     }.

encode(#{ 'name' := Name,
          'reason' := Reason
        }) ->
    #{ 'name' => Name,
       'reason' => Reason
     }.
