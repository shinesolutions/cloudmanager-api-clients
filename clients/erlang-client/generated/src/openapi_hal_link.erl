-module(openapi_hal_link).

-export([encode/1]).

-export_type([openapi_hal_link/0]).

-type openapi_hal_link() ::
    #{ 'href' => binary(),
       'templated' => boolean(),
       'type' => binary(),
       'deprecation' => binary(),
       'profile' => binary(),
       'title' => binary(),
       'hreflang' => binary(),
       'name' => binary()
     }.

encode(#{ 'href' := Href,
          'templated' := Templated,
          'type' := Type,
          'deprecation' := Deprecation,
          'profile' := Profile,
          'title' := Title,
          'hreflang' := Hreflang,
          'name' := Name
        }) ->
    #{ 'href' => Href,
       'templated' => Templated,
       'type' => Type,
       'deprecation' => Deprecation,
       'profile' => Profile,
       'title' => Title,
       'hreflang' => Hreflang,
       'name' => Name
     }.
