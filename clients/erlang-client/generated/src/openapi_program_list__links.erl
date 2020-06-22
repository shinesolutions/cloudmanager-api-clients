-module(openapi_program_list__links).

-export([encode/1]).

-export_type([openapi_program_list__links/0]).

-type openapi_program_list__links() ::
    #{ 'next' => openapi_hal_link:openapi_hal_link(),
       'prev' => openapi_hal_link:openapi_hal_link(),
       'self' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'next' := Next,
          'prev' := Prev,
          'self' := Self
        }) ->
    #{ 'next' => Next,
       'prev' => Prev,
       'self' => Self
     }.
