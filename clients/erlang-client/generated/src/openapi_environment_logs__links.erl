-module(openapi_environment_logs__links).

-export([encode/1]).

-export_type([openapi_environment_logs__links/0]).

-type openapi_environment_logs__links() ::
    #{ 'http__ns_adobe_com_adobecloud_rel_program' => openapi_hal_link:openapi_hal_link(),
       'self' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'http__ns_adobe_com_adobecloud_rel_program' := HttpNsAdobeComAdobecloudRelProgram,
          'self' := Self
        }) ->
    #{ 'http://ns.adobe.com/adobecloud/rel/program' => HttpNsAdobeComAdobecloudRelProgram,
       'self' => Self
     }.
