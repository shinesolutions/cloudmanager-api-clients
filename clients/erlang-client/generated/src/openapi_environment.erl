-module(openapi_environment).

-export([encode/1]).

-export_type([openapi_environment/0]).

-type openapi_environment() ::
    #{ 'id' => binary(),
       'programId' => binary(),
       'name' => binary(),
       'description' => binary(),
       'type' => binary(),
       '_links' => openapi_environment__links:openapi_environment__links()
     }.

encode(#{ 'id' := Id,
          'programId' := ProgramId,
          'name' := Name,
          'description' := Description,
          'type' := Type,
          '_links' := Links
        }) ->
    #{ 'id' => Id,
       'programId' => ProgramId,
       'name' => Name,
       'description' => Description,
       'type' => Type,
       '_links' => Links
     }.
