-module(openapi_variables_api).

-export([get_environment_variables/6, get_environment_variables/7,
         patch_environment_variables/8, patch_environment_variables/9]).

-define(BASE_URL, "").

%% @doc List User Environment Variables
%% List the user defined variables for an environment (Cloud Service only).
-spec get_environment_variables(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_variable_list:openapi_variable_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_environment_variables(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey) ->
    get_environment_variables(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_environment_variables(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_variable_list:openapi_variable_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_environment_variables(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/environment/", EnvironmentId, "/variables"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Patch User Environment Variables
%% Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
-spec patch_environment_variables(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), list()) -> {ok, openapi_variable_list:openapi_variable_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
patch_environment_variables(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body) ->
    patch_environment_variables(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body, #{}).

-spec patch_environment_variables(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), list(), maps:map()) -> {ok, openapi_variable_list:openapi_variable_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
patch_environment_variables(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = ["/api/program/", ProgramId, "/environment/", EnvironmentId, "/variables"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}  {<<"Content-Type">>, ContentType}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = Body,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


