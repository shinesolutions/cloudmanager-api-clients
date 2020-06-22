-module(openapi_environment_log__links).

-export([encode/1]).

-export_type([openapi_environment_log__links/0]).

-type openapi_environment_log__links() ::
    #{ 'http__ns_adobe_com_adobecloud_rel_logs_download' => openapi_hal_link:openapi_hal_link(),
       'http__ns_adobe_com_adobecloud_rel_logs_tail' => openapi_hal_link:openapi_hal_link()
     }.

encode(#{ 'http__ns_adobe_com_adobecloud_rel_logs_download' := HttpNsAdobeComAdobecloudRelLogsDownload,
          'http__ns_adobe_com_adobecloud_rel_logs_tail' := HttpNsAdobeComAdobecloudRelLogsTail
        }) ->
    #{ 'http://ns.adobe.com/adobecloud/rel/logs/download' => HttpNsAdobeComAdobecloudRelLogsDownload,
       'http://ns.adobe.com/adobecloud/rel/logs/tail' => HttpNsAdobeComAdobecloudRelLogsTail
     }.
