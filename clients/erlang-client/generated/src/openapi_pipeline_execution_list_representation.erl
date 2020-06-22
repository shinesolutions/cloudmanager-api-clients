-module(openapi_pipeline_execution_list_representation).

-export([encode/1]).

-export_type([openapi_pipeline_execution_list_representation/0]).

-type openapi_pipeline_execution_list_representation() ::
    #{ '_totalNumberOfItems' => integer(),
       '_page' => openapi_requested_page_details:openapi_requested_page_details(),
       '_embedded' => openapi_pipeline_execution_list_representation__embedded:openapi_pipeline_execution_list_representation__embedded(),
       '_links' => openapi_pipeline_execution_list_representation__links:openapi_pipeline_execution_list_representation__links()
     }.

encode(#{ '_totalNumberOfItems' := TotalNumberOfItems,
          '_page' := Page,
          '_embedded' := Embedded,
          '_links' := Links
        }) ->
    #{ '_totalNumberOfItems' => TotalNumberOfItems,
       '_page' => Page,
       '_embedded' => Embedded,
       '_links' => Links
     }.
