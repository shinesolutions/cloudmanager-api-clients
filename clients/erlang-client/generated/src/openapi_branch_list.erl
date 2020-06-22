-module(openapi_branch_list).

-export([encode/1]).

-export_type([openapi_branch_list/0]).

-type openapi_branch_list() ::
    #{ '_totalNumberOfItems' => integer(),
       '_embedded' => openapi_branch_list__embedded:openapi_branch_list__embedded(),
       '_links' => openapi_program_list__links:openapi_program_list__links()
     }.

encode(#{ '_totalNumberOfItems' := TotalNumberOfItems,
          '_embedded' := Embedded,
          '_links' := Links
        }) ->
    #{ '_totalNumberOfItems' => TotalNumberOfItems,
       '_embedded' => Embedded,
       '_links' => Links
     }.
