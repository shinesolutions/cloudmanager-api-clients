-module(openapi_repository_branch__links).

-export([encode/1]).

-export_type([openapi_repository_branch__links/0]).

-type openapi_repository_branch__links() ::
    #{ 'http__ns_adobe_com_adobecloud_rel_program' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_repository' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'http__ns_adobe_com_adobecloud_rel_program' := HttpNsAdobeComAdobecloudRelProgram,
          'http__ns_adobe_com_adobecloud_rel_repository' := HttpNsAdobeComAdobecloudRelRepository
        }) ->
    #{ 'http://ns.adobe.com/adobecloud/rel/program' => HttpNsAdobeComAdobecloudRelProgram,
       'http://ns.adobe.com/adobecloud/rel/repository' => HttpNsAdobeComAdobecloudRelRepository
     }.
