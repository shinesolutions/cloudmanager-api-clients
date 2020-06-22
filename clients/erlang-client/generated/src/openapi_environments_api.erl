-module(openapi_environments_api).

-export([delete_environment/6, delete_environment/7,
         download_logs/9, download_logs/10,
         get_environment/6, get_environment/7,
         get_environment_logs/7, get_environment_logs/8,
         get_environments/5, get_environments/6]).

-define(BASE_URL, "").

%% @doc DeleteEnvironment
%% Delete environment
-spec delete_environment(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_environment:openapi_environment(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_environment(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey) ->
    delete_environment(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec delete_environment(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_environment:openapi_environment(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_environment(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/api/program/", ProgramId, "/environment/", EnvironmentId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Logs
%% Download environment logs
-spec download_logs(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
download_logs(Ctx, ProgramId, EnvironmentId, Service, Name, Date, XGwImsOrgId, Authorization, XApiKey) ->
    download_logs(Ctx, ProgramId, EnvironmentId, Service, Name, Date, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec download_logs(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
download_logs(Ctx, ProgramId, EnvironmentId, Service, Name, Date, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/environment/", EnvironmentId, "/logs/download"],
    QS = lists:flatten([{<<"service">>, Service}, {<<"name">>, Name}, {<<"date">>, Date}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params(['Accept'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Environment
%% Returns an environment by its id
-spec get_environment(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_environment:openapi_environment(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_environment(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey) ->
    get_environment(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_environment(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_environment:openapi_environment(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_environment(Ctx, ProgramId, EnvironmentId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/environment/", EnvironmentId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Environment Logs
%% List all logs available in environment
-spec get_environment_logs(ctx:ctx(), binary(), binary(), integer(), binary(), binary(), binary()) -> {ok, openapi_environment_logs:openapi_environment_logs(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_environment_logs(Ctx, ProgramId, EnvironmentId, Days, XGwImsOrgId, Authorization, XApiKey) ->
    get_environment_logs(Ctx, ProgramId, EnvironmentId, Days, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_environment_logs(ctx:ctx(), binary(), binary(), integer(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_environment_logs:openapi_environment_logs(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_environment_logs(Ctx, ProgramId, EnvironmentId, Days, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/environment/", EnvironmentId, "/logs"],
    QS = lists:flatten([{<<"days">>, Days}])++openapi_utils:optional_params(['service', 'name'], _OptionalParams),
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List Environments
%% Lists all environments in an program
-spec get_environments(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, openapi_environment_list:openapi_environment_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_environments(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey) ->
    get_environments(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_environments(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_environment_list:openapi_environment_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_environments(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/environments"],
    QS = lists:flatten([])++openapi_utils:optional_params(['type'], _OptionalParams),
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


