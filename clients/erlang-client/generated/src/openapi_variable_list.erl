-module(openapi_variable_list).

-export([encode/1]).

-export_type([openapi_variable_list/0]).

-type openapi_variable_list() ::
    #{ '_totalNumberOfItems' => integer(),
       '_embedded' => openapi_variable_list__embedded:openapi_variable_list__embedded(),
       '_links' => openapi_variable_list__links:openapi_variable_list__links()
     }.

encode(#{ '_totalNumberOfItems' := TotalNumberOfItems,
          '_embedded' := Embedded,
          '_links' := Links
        }) ->
    #{ '_totalNumberOfItems' => TotalNumberOfItems,
       '_embedded' => Embedded,
       '_links' => Links
     }.
