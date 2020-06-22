-module(openapi_requested_page_details).

-export([encode/1]).

-export_type([openapi_requested_page_details/0]).

-type openapi_requested_page_details() ::
    #{ 'start' => integer(),
       'limit' => integer(),
       'orderBy' => binary(),
       'property' => list(),
       'type' => binary(),
       'next' => integer(),
       'prev' => integer()
     }.

encode(#{ 'start' := Start,
          'limit' := Limit,
          'orderBy' := OrderBy,
          'property' := Property,
          'type' := Type,
          'next' := Next,
          'prev' := Prev
        }) ->
    #{ 'start' => Start,
       'limit' => Limit,
       'orderBy' => OrderBy,
       'property' => Property,
       'type' => Type,
       'next' => Next,
       'prev' => Prev
     }.
