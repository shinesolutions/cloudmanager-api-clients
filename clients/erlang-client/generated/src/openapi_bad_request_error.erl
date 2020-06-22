-module(openapi_bad_request_error).

-export([encode/1]).

-export_type([openapi_bad_request_error/0]).

-type openapi_bad_request_error() ::
    #{ 'status' => integer(),
       'type' => binary(),
       'title' => binary(),
       'missingParams' => list(),
       'invalidParams' => list()
     }.

encode(#{ 'status' := Status,
          'type' := Type,
          'title' := Title,
          'missingParams' := MissingParams,
          'invalidParams' := InvalidParams
        }) ->
    #{ 'status' => Status,
       'type' => Type,
       'title' => Title,
       'missingParams' => MissingParams,
       'invalidParams' => InvalidParams
     }.
