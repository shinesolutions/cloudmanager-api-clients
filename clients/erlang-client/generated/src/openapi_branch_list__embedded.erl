-module(openapi_branch_list__embedded).

-export([encode/1]).

-export_type([openapi_branch_list__embedded/0]).

-type openapi_branch_list__embedded() ::
    #{ 'branches' => list()
     }.

encode(#{ 'branches' := Branches
        }) ->
    #{ 'branches' => Branches
     }.
