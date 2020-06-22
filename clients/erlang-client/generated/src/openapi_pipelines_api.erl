-module(openapi_pipelines_api).

-export([delete_pipeline/6, delete_pipeline/7,
         get_pipeline/6, get_pipeline/7,
         get_pipelines/5, get_pipelines/6,
         patch_pipeline/8, patch_pipeline/9]).

-define(BASE_URL, "").

%% @doc Delete a Pipeline
%% Delete a pipeline. All the data is wiped.
-spec delete_pipeline(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey) ->
    delete_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec delete_pipeline(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Pipeline
%% Returns a pipeline by its id
-spec get_pipeline(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_pipeline:openapi_pipeline(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey) ->
    get_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_pipeline(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_pipeline:openapi_pipeline(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List Pipelines
%% Returns all the pipelines that the requesting user has access to in an program
-spec get_pipelines(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, openapi_pipeline_list:openapi_pipeline_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_pipelines(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey) ->
    get_pipelines(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_pipelines(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_pipeline_list:openapi_pipeline_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_pipelines(Ctx, ProgramId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/pipelines"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Patches Pipeline
%% Patches a pipeline within an program.
-spec patch_pipeline(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), openapi_pipeline:openapi_pipeline()) -> {ok, openapi_pipeline:openapi_pipeline(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
patch_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body) ->
    patch_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body, #{}).

-spec patch_pipeline(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), openapi_pipeline:openapi_pipeline(), maps:map()) -> {ok, openapi_pipeline:openapi_pipeline(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
patch_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = patch,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}  {<<"Content-Type">>, ContentType}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = Body,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


