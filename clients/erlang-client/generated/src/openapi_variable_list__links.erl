-module(openapi_variable_list__links).

-export([encode/1]).

-export_type([openapi_variable_list__links/0]).

-type openapi_variable_list__links() ::
    #{ 'http__ns_adobe_com_adobecloud_rel_environment' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_program' => openapi_hal_link:openapi_hal_link(),
       'self' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'http__ns_adobe_com_adobecloud_rel_environment' := HttpNsAdobeComAdobecloudRelEnvironment,
          'http__ns_adobe_com_adobecloud_rel_program' := HttpNsAdobeComAdobecloudRelProgram,
          'self' := Self
        }) ->
    #{ 'http://ns.adobe.com/adobecloud/rel/environment' => HttpNsAdobeComAdobecloudRelEnvironment,
       'http://ns.adobe.com/adobecloud/rel/program' => HttpNsAdobeComAdobecloudRelProgram,
       'self' => Self
     }.
