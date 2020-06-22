-module(openapi_pipeline__links).

-export([encode/1]).

-export_type([openapi_pipeline__links/0]).

-type openapi_pipeline__links() ::
    #{ 'http__ns_adobe_com_adobecloud_rel_program' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_execution' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_executions' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecution' => openapi_hal_link:openapi_hal_link(),
       'self' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'http__ns_adobe_com_adobecloud_rel_program' := HttpNsAdobeComAdobecloudRelProgram,
          'http__ns_adobe_com_adobecloud_rel_execution' := HttpNsAdobeComAdobecloudRelExecution,
          'http__ns_adobe_com_adobecloud_rel_executions' := HttpNsAdobeComAdobecloudRelExecutions,
          'http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecution' := HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution,
          'self' := Self
        }) ->
    #{ 'http://ns.adobe.com/adobecloud/rel/program' => HttpNsAdobeComAdobecloudRelProgram,
       'http://ns.adobe.com/adobecloud/rel/execution' => HttpNsAdobeComAdobecloudRelExecution,
       'http://ns.adobe.com/adobecloud/rel/executions' => HttpNsAdobeComAdobecloudRelExecutions,
       'http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution' => HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution,
       'self' => Self
     }.
