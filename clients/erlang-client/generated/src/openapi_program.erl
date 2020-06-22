-module(openapi_program).

-export([encode/1]).

-export_type([openapi_program/0]).

-type openapi_program() ::
    #{ 'id' => binary(),
       'name' := binary(),
       'enabled' => boolean(),
       'tenantId' => binary(),
       'imsOrgId' => binary(),
       '_links' => openapi_program__links:openapi_program__links()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'enabled' := Enabled,
          'tenantId' := TenantId,
          'imsOrgId' := ImsOrgId,
          '_links' := Links
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'enabled' => Enabled,
       'tenantId' => TenantId,
       'imsOrgId' => ImsOrgId,
       '_links' => Links
     }.
