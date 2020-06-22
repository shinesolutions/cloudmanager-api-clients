-module(openapi_branches_api).

-export([get_branches/6, get_branches/7]).

-define(BASE_URL, "").

%% @doc List Branches
%% Returns the list of branches from a repository
-spec get_branches(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_branch_list:openapi_branch_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_branches(Ctx, ProgramId, RepositoryId, XGwImsOrgId, Authorization, XApiKey) ->
    get_branches(Ctx, ProgramId, RepositoryId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_branches(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_branch_list:openapi_branch_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_branches(Ctx, ProgramId, RepositoryId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/repository/", RepositoryId, "/branches"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


