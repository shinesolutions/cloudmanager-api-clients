-module(openapi_repository_branch).

-export([encode/1]).

-export_type([openapi_repository_branch/0]).

-type openapi_repository_branch() ::
    #{ 'programId' => binary(),
       'repositoryId' => integer(),
       'name' => binary(),
       '_links' => openapi_repository_branch__links:openapi_repository_branch__links()
     }.

encode(#{ 'programId' := ProgramId,
          'repositoryId' := RepositoryId,
          'name' := Name,
          '_links' := Links
        }) ->
    #{ 'programId' => ProgramId,
       'repositoryId' => RepositoryId,
       'name' => Name,
       '_links' => Links
     }.
