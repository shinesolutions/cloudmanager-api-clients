-module(openapi_environment__links).

-export([encode/1]).

-export_type([openapi_environment__links/0]).

-type openapi_environment__links() ::
    #{ 'http__ns_adobe_com_adobecloud_rel_program' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_pipeline' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_author' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_publish' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_developerConsole' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_logs' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_variables' => openapi_hal_link:openapi_hal_link(),
       'self' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'http__ns_adobe_com_adobecloud_rel_program' := HttpNsAdobeComAdobecloudRelProgram,
          'http__ns_adobe_com_adobecloud_rel_pipeline' := HttpNsAdobeComAdobecloudRelPipeline,
          'http__ns_adobe_com_adobecloud_rel_author' := HttpNsAdobeComAdobecloudRelAuthor,
          'http__ns_adobe_com_adobecloud_rel_publish' := HttpNsAdobeComAdobecloudRelPublish,
          'http__ns_adobe_com_adobecloud_rel_developerConsole' := HttpNsAdobeComAdobecloudRelDeveloperConsole,
          'http__ns_adobe_com_adobecloud_rel_logs' := HttpNsAdobeComAdobecloudRelLogs,
          'http__ns_adobe_com_adobecloud_rel_variables' := HttpNsAdobeComAdobecloudRelVariables,
          'self' := Self
        }) ->
    #{ 'http://ns.adobe.com/adobecloud/rel/program' => HttpNsAdobeComAdobecloudRelProgram,
       'http://ns.adobe.com/adobecloud/rel/pipeline' => HttpNsAdobeComAdobecloudRelPipeline,
       'http://ns.adobe.com/adobecloud/rel/author' => HttpNsAdobeComAdobecloudRelAuthor,
       'http://ns.adobe.com/adobecloud/rel/publish' => HttpNsAdobeComAdobecloudRelPublish,
       'http://ns.adobe.com/adobecloud/rel/developerConsole' => HttpNsAdobeComAdobecloudRelDeveloperConsole,
       'http://ns.adobe.com/adobecloud/rel/logs' => HttpNsAdobeComAdobecloudRelLogs,
       'http://ns.adobe.com/adobecloud/rel/variables' => HttpNsAdobeComAdobecloudRelVariables,
       'self' => Self
     }.
