-module(openapi_program__links).

-export([encode/1]).

-export_type([openapi_program__links/0]).

-type openapi_program__links() ::
    #{ 'http__ns_adobe_com_adobecloud_rel_pipelines' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_environments' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_repositories' => openapi_hal_link:openapi_hal_link(),
       'self' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'http__ns_adobe_com_adobecloud_rel_pipelines' := HttpNsAdobeComAdobecloudRelPipelines,
          'http__ns_adobe_com_adobecloud_rel_environments' := HttpNsAdobeComAdobecloudRelEnvironments,
          'http__ns_adobe_com_adobecloud_rel_repositories' := HttpNsAdobeComAdobecloudRelRepositories,
          'self' := Self
        }) ->
    #{ 'http://ns.adobe.com/adobecloud/rel/pipelines' => HttpNsAdobeComAdobecloudRelPipelines,
       'http://ns.adobe.com/adobecloud/rel/environments' => HttpNsAdobeComAdobecloudRelEnvironments,
       'http://ns.adobe.com/adobecloud/rel/repositories' => HttpNsAdobeComAdobecloudRelRepositories,
       'self' => Self
     }.
