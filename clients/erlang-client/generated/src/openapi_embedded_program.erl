-module(openapi_embedded_program).

-export([encode/1]).

-export_type([openapi_embedded_program/0]).

-type openapi_embedded_program() ::
    #{ 'id' => binary(),
       'name' => binary(),
       'enabled' => boolean(),
       'tenantId' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'enabled' := Enabled,
          'tenantId' := TenantId
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'enabled' => Enabled,
       'tenantId' => TenantId
     }.
