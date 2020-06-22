-module(openapi_pipeline).

-export([encode/1]).

-export_type([openapi_pipeline/0]).

-type openapi_pipeline() ::
    #{ 'id' => binary(),
       'programId' => binary(),
       'name' := binary(),
       'trigger' => binary(),
       'status' => binary(),
       'createdAt' => openapi_date_time:openapi_date_time(),
       'updatedAt' => openapi_date_time:openapi_date_time(),
       'lastStartedAt' => openapi_date_time:openapi_date_time(),
       'lastFinishedAt' => openapi_date_time:openapi_date_time(),
       'phases' := list(),
       '_links' => openapi_pipeline__links:openapi_pipeline__links()
     }.

encode(#{ 'id' := Id,
          'programId' := ProgramId,
          'name' := Name,
          'trigger' := Trigger,
          'status' := Status,
          'createdAt' := CreatedAt,
          'updatedAt' := UpdatedAt,
          'lastStartedAt' := LastStartedAt,
          'lastFinishedAt' := LastFinishedAt,
          'phases' := Phases,
          '_links' := Links
        }) ->
    #{ 'id' => Id,
       'programId' => ProgramId,
       'name' => Name,
       'trigger' => Trigger,
       'status' => Status,
       'createdAt' => CreatedAt,
       'updatedAt' => UpdatedAt,
       'lastStartedAt' => LastStartedAt,
       'lastFinishedAt' => LastFinishedAt,
       'phases' => Phases,
       '_links' => Links
     }.
