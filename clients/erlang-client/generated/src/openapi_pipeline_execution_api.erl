-module(openapi_pipeline_execution_api).

-export([advance_pipeline_execution/11, advance_pipeline_execution/12,
         cancel_pipeline_execution_step/11, cancel_pipeline_execution_step/12,
         get_current_execution/6, get_current_execution/7,
         get_execution/7, get_execution/8,
         get_executions/6, get_executions/7,
         get_step_logs/9, get_step_logs/10,
         start_pipeline/7, start_pipeline/8,
         step_metric/9, step_metric/10,
         step_state/9, step_state/10]).

-define(BASE_URL, "").

%% @doc Advance
%% Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
-spec advance_pipeline_execution(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advance_pipeline_execution(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body) ->
    advance_pipeline_execution(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body, #{}).

-spec advance_pipeline_execution(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
advance_pipeline_execution(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = put,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, "/execution/", ExecutionId, "/phase/", PhaseId, "/step/", StepId, "/advance"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}  {<<"Content-Type">>, ContentType}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = Body,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Cancel
%% Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
-spec cancel_pipeline_execution_step(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_pipeline_execution_step(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body) ->
    cancel_pipeline_execution_step(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body, #{}).

-spec cancel_pipeline_execution_step(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
cancel_pipeline_execution_step(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, ContentType, Body, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = put,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, "/execution/", ExecutionId, "/phase/", PhaseId, "/step/", StepId, "/cancel"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}  {<<"Content-Type">>, ContentType}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = Body,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get current pipeline execution
%% Returns current pipeline execution if any.
-spec get_current_execution(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_pipeline_execution:openapi_pipeline_execution(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_current_execution(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey) ->
    get_current_execution(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_current_execution(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_pipeline_execution:openapi_pipeline_execution(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_current_execution(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, "/execution"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get pipeline execution
%% Returns a pipeline execution by id
-spec get_execution(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_pipeline_execution:openapi_pipeline_execution(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_execution(Ctx, ProgramId, PipelineId, ExecutionId, XGwImsOrgId, Authorization, XApiKey) ->
    get_execution(Ctx, ProgramId, PipelineId, ExecutionId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_execution(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_pipeline_execution:openapi_pipeline_execution(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_execution(Ctx, ProgramId, PipelineId, ExecutionId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, "/execution/", ExecutionId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List Executions
%% Returns the history of pipeline executions in a newest to oldest order
-spec get_executions(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_pipeline_execution_list_representation:openapi_pipeline_execution_list_representation(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_executions(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey) ->
    get_executions(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_executions(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_pipeline_execution_list_representation:openapi_pipeline_execution_list_representation(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_executions(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, "/executions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['start', 'limit'], _OptionalParams),
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get logs
%% Get the logs associated with a step.
-spec get_step_logs(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_step_logs(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey) ->
    get_step_logs(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec get_step_logs(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_step_logs(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, "/execution/", ExecutionId, "/phase/", PhaseId, "/step/", StepId, "/logs"],
    QS = lists:flatten([])++openapi_utils:optional_params(['file'], _OptionalParams),
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params(['Accept'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Start the pipeline
%% Starts the Pipeline. This works only if the pipeline is not already started.
-spec start_pipeline(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
start_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, ContentType) ->
    start_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, ContentType, #{}).

-spec start_pipeline(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
start_pipeline(Ctx, ProgramId, PipelineId, XGwImsOrgId, Authorization, XApiKey, ContentType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = put,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, "/execution"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}  {<<"Content-Type">>, ContentType}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get step metrics
%% 
-spec step_metric(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_pipeline_step_metrics:openapi_pipeline_step_metrics(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
step_metric(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey) ->
    step_metric(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec step_metric(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_pipeline_step_metrics:openapi_pipeline_step_metrics(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
step_metric(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, "/execution/", ExecutionId, "/phase/", PhaseId, "/step/", StepId, "/metrics"],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get step state
%% 
-spec step_state(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary()) -> {ok, openapi_pipeline_execution_step_state:openapi_pipeline_execution_step_state(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
step_state(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey) ->
    step_state(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, #{}).

-spec step_state(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, openapi_pipeline_execution_step_state:openapi_pipeline_execution_step_state(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
step_state(Ctx, ProgramId, PipelineId, ExecutionId, PhaseId, StepId, XGwImsOrgId, Authorization, XApiKey, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/program/", ProgramId, "/pipeline/", PipelineId, "/execution/", ExecutionId, "/phase/", PhaseId, "/step/", StepId, ""],
    QS = [],
    Headers = [  {<<"x-gw-ims-org-id">>, XGwImsOrgId}  {<<"Authorization">>, Authorization}  {<<"x-api-key">>, XApiKey}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


