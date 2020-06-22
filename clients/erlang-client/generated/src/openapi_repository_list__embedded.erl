-module(openapi_repository_list__embedded).

-export([encode/1]).

-export_type([openapi_repository_list__embedded/0]).

-type openapi_repository_list__embedded() ::
    #{ 'repositories' => list()
     }.

encode(#{ 'repositories' := Repositories
        }) ->
    #{ 'repositories' => Repositories
     }.
