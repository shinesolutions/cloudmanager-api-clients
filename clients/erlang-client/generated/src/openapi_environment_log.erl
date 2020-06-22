-module(openapi_environment_log).

-export([encode/1]).

-export_type([openapi_environment_log/0]).

-type openapi_environment_log() ::
    #{ 'service' => binary(),
       'name' => binary(),
       'date' => binary(),
       'programId' => integer(),
       'environmentId' => integer(),
       '_links' => openapi_environment_log__links:openapi_environment_log__links()
     }.

encode(#{ 'service' := Service,
          'name' := Name,
          'date' := Date,
          'programId' := ProgramId,
          'environmentId' := EnvironmentId,
          '_links' := Links
        }) ->
    #{ 'service' => Service,
       'name' => Name,
       'date' => Date,
       'programId' => ProgramId,
       'environmentId' => EnvironmentId,
       '_links' => Links
     }.
