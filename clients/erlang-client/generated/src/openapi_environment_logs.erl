-module(openapi_environment_logs).

-export([encode/1]).

-export_type([openapi_environment_logs/0]).

-type openapi_environment_logs() ::
    #{ 'service' => list(),
       'name' => list(),
       'days' => integer(),
       '_links' => openapi_environment_logs__links:openapi_environment_logs__links(),
       '_embedded' => openapi_environment_logs__embedded:openapi_environment_logs__embedded()
     }.

encode(#{ 'service' := Service,
          'name' := Name,
          'days' := Days,
          '_links' := Links,
          '_embedded' := Embedded
        }) ->
    #{ 'service' => Service,
       'name' => Name,
       'days' => Days,
       '_links' => Links,
       '_embedded' => Embedded
     }.
