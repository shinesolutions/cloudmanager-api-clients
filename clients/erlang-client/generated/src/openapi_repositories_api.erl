-module(openapi_repositories_api).

-export([get_repositories/5, get_repositories/6,
         get_repository/6, get_repository/7]).

-define(BASE_URL, "").

%% @doc Lists Repositories
%% Lists all Repositories in an program
-spec get_repositories(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, openapi_repository_list:openapi_repository_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_repositories(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey) ->
    get_repositories(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_repositories(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_repository_list:openapi_repository_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_repositories(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/repositories"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Repository
%% Returns an repository by its id
-spec get_repository(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_repository:openapi_repository(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_repository(Ctx, ProgramId, RepositoryId, XGwImsOrgId, Authorization, XApiKey) ->
    get_repository(Ctx, ProgramId, RepositoryId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_repository(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_repository:openapi_repository(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_repository(Ctx, ProgramId, RepositoryId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/repository/", RepositoryId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


