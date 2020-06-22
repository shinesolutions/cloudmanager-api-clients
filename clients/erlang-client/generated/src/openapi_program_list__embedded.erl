-module(openapi_program_list__embedded).

-export([encode/1]).

-export_type([openapi_program_list__embedded/0]).

-type openapi_program_list__embedded() ::
    #{ 'programs' => list()
     }.

encode(#{ 'programs' := Programs
        }) ->
    #{ 'programs' => Programs
     }.
