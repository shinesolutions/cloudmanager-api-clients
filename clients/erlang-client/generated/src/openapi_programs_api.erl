-module(openapi_programs_api).

-export([delete_program/5, delete_program/6,
         get_program/5, get_program/6,
         get_programs/4, get_programs/5]).

-define(BASE_URL, "").

%% @doc Delete Program
%% Delete an program
-spec delete_program(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, openapi_program:openapi_program(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_program(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey) ->
    delete_program(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec delete_program(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_program:openapi_program(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_program(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/api/program/", ProgramId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Program
%% Returns a program by its id
-spec get_program(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, openapi_program:openapi_program(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_program(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey) ->
    get_program(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_program(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_program:openapi_program(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_program(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Lists Programs
%% Returns all programs that the requesting user has access to
-spec get_programs(ctx:ctx(), binary(), binary(), binary()) -> {ok, openapi_program_list:openapi_program_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_programs(Ctx, XGwImsOrgId, Authorization, XApiKey) ->
    get_programs(Ctx, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_programs(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_program_list:openapi_program_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_programs(Ctx, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/programs"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


