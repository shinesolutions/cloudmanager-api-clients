-module(openapi_pipeline_execution_list_representation__links).

-export([encode/1]).

-export_type([openapi_pipeline_execution_list_representation__links/0]).

-type openapi_pipeline_execution_list_representation__links() ::
    #{ 'next' => openapi_hal_link:openapi_hal_link(),
       'page' => openapi_hal_link:openapi_hal_link(),
       'prev' => openapi_hal_link:openapi_hal_link(),
       'self' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'next' := Next,
          'page' := Page,
          'prev' := Prev,
          'self' := Self
        }) ->
    #{ 'next' => Next,
       'page' => Page,
       'prev' => Prev,
       'self' => Self
     }.
