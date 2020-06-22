-module(openapi_pipeline_execution_step_state__links).

-export([encode/1]).

-export_type([openapi_pipeline_execution_step_state__links/0]).

-type openapi_pipeline_execution_step_state__links() ::
    #{ 'http__ns_adobe_com_adobecloud_rel_execution' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_pipeline' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_pipeline_logs' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_pipeline_metrics' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_pipeline_advance' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_pipeline_cancel' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_program' => openapi_hal_link:openapi_hal_link(),
       'self' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'http__ns_adobe_com_adobecloud_rel_execution' := HttpNsAdobeComAdobecloudRelExecution,
          'http__ns_adobe_com_adobecloud_rel_pipeline' := HttpNsAdobeComAdobecloudRelPipeline,
          'http__ns_adobe_com_adobecloud_rel_pipeline_logs' := HttpNsAdobeComAdobecloudRelPipelineLogs,
          'http__ns_adobe_com_adobecloud_rel_pipeline_metrics' := HttpNsAdobeComAdobecloudRelPipelineMetrics,
          'http__ns_adobe_com_adobecloud_rel_pipeline_advance' := HttpNsAdobeComAdobecloudRelPipelineAdvance,
          'http__ns_adobe_com_adobecloud_rel_pipeline_cancel' := HttpNsAdobeComAdobecloudRelPipelineCancel,
          'http__ns_adobe_com_adobecloud_rel_program' := HttpNsAdobeComAdobecloudRelProgram,
          'self' := Self
        }) ->
    #{ 'http://ns.adobe.com/adobecloud/rel/execution' => HttpNsAdobeComAdobecloudRelExecution,
       'http://ns.adobe.com/adobecloud/rel/pipeline' => HttpNsAdobeComAdobecloudRelPipeline,
       'http://ns.adobe.com/adobecloud/rel/pipeline/logs' => HttpNsAdobeComAdobecloudRelPipelineLogs,
       'http://ns.adobe.com/adobecloud/rel/pipeline/metrics' => HttpNsAdobeComAdobecloudRelPipelineMetrics,
       'http://ns.adobe.com/adobecloud/rel/pipeline/advance' => HttpNsAdobeComAdobecloudRelPipelineAdvance,
       'http://ns.adobe.com/adobecloud/rel/pipeline/cancel' => HttpNsAdobeComAdobecloudRelPipelineCancel,
       'http://ns.adobe.com/adobecloud/rel/program' => HttpNsAdobeComAdobecloudRelProgram,
       'self' => Self
     }.
