-module(openapi_pipeline_execution__links).

-export([encode/1]).

-export_type([openapi_pipeline_execution__links/0]).

-type openapi_pipeline_execution__links() ::
    #{ 'http__ns_adobe_com_adobecloud_rel_program' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_pipeline' => openapi_hal_link:openapi_hal_link(),
       'self' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'http__ns_adobe_com_adobecloud_rel_program' := HttpNsAdobeComAdobecloudRelProgram,
          'http__ns_adobe_com_adobecloud_rel_pipeline' := HttpNsAdobeComAdobecloudRelPipeline,
          'self' := Self
        }) ->
    #{ 'http://ns.adobe.com/adobecloud/rel/program' => HttpNsAdobeComAdobecloudRelProgram,
       'http://ns.adobe.com/adobecloud/rel/pipeline' => HttpNsAdobeComAdobecloudRelPipeline,
       'self' => Self
     }.
