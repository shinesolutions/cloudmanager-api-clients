-module(openapi_repository).

-export([encode/1]).

-export_type([openapi_repository/0]).

-type openapi_repository() ::
    #{ 'repo' => binary(),
       'description' => binary(),
       '_links' => openapi_repository__links:openapi_repository__links()
     }.

encode(#{ 'repo' := Repo,
          'description' := Description,
          '_links' := Links
        }) ->
    #{ 'repo' => Repo,
       'description' => Description,
       '_links' => Links
     }.
