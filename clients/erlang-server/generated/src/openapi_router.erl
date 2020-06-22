-module(openapi_router).

-export([get_paths/1]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorState :: jesse_state:state()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'GetBranches' => #{
            path => "/api/program/:programId/repository/:repositoryId/branches",
            method => <<"GET">>,
            handler => 'openapi_branches_handler'
        },
        'DeleteEnvironment' => #{
            path => "/api/program/:programId/environment/:environmentId",
            method => <<"DELETE">>,
            handler => 'openapi_environments_handler'
        },
        'DownloadLogs' => #{
            path => "/api/program/:programId/environment/:environmentId/logs/download",
            method => <<"GET">>,
            handler => 'openapi_environments_handler'
        },
        'GetEnvironment' => #{
            path => "/api/program/:programId/environment/:environmentId",
            method => <<"GET">>,
            handler => 'openapi_environments_handler'
        },
        'GetEnvironmentLogs' => #{
            path => "/api/program/:programId/environment/:environmentId/logs",
            method => <<"GET">>,
            handler => 'openapi_environments_handler'
        },
        'GetEnvironments' => #{
            path => "/api/program/:programId/environments",
            method => <<"GET">>,
            handler => 'openapi_environments_handler'
        },
        'AdvancePipelineExecution' => #{
            path => "/api/program/:programId/pipeline/:pipelineId/execution/:executionId/phase/:phaseId/step/:stepId/advance",
            method => <<"PUT">>,
            handler => 'openapi_pipeline_execution_handler'
        },
        'CancelPipelineExecutionStep' => #{
            path => "/api/program/:programId/pipeline/:pipelineId/execution/:executionId/phase/:phaseId/step/:stepId/cancel",
            method => <<"PUT">>,
            handler => 'openapi_pipeline_execution_handler'
        },
        'GetCurrentExecution' => #{
            path => "/api/program/:programId/pipeline/:pipelineId/execution",
            method => <<"GET">>,
            handler => 'openapi_pipeline_execution_handler'
        },
        'GetExecution' => #{
            path => "/api/program/:programId/pipeline/:pipelineId/execution/:executionId",
            method => <<"GET">>,
            handler => 'openapi_pipeline_execution_handler'
        },
        'GetExecutions' => #{
            path => "/api/program/:programId/pipeline/:pipelineId/executions",
            method => <<"GET">>,
            handler => 'openapi_pipeline_execution_handler'
        },
        'GetStepLogs' => #{
            path => "/api/program/:programId/pipeline/:pipelineId/execution/:executionId/phase/:phaseId/step/:stepId/logs",
            method => <<"GET">>,
            handler => 'openapi_pipeline_execution_handler'
        },
        'StartPipeline' => #{
            path => "/api/program/:programId/pipeline/:pipelineId/execution",
            method => <<"PUT">>,
            handler => 'openapi_pipeline_execution_handler'
        },
        'StepMetric' => #{
            path => "/api/program/:programId/pipeline/:pipelineId/execution/:executionId/phase/:phaseId/step/:stepId/metrics",
            method => <<"GET">>,
            handler => 'openapi_pipeline_execution_handler'
        },
        'StepState' => #{
            path => "/api/program/:programId/pipeline/:pipelineId/execution/:executionId/phase/:phaseId/step/:stepId",
            method => <<"GET">>,
            handler => 'openapi_pipeline_execution_handler'
        },
        'DeletePipeline' => #{
            path => "/api/program/:programId/pipeline/:pipelineId",
            method => <<"DELETE">>,
            handler => 'openapi_pipelines_handler'
        },
        'GetPipeline' => #{
            path => "/api/program/:programId/pipeline/:pipelineId",
            method => <<"GET">>,
            handler => 'openapi_pipelines_handler'
        },
        'GetPipelines' => #{
            path => "/api/program/:programId/pipelines",
            method => <<"GET">>,
            handler => 'openapi_pipelines_handler'
        },
        'PatchPipeline' => #{
            path => "/api/program/:programId/pipeline/:pipelineId",
            method => <<"PATCH">>,
            handler => 'openapi_pipelines_handler'
        },
        'DeleteProgram' => #{
            path => "/api/program/:programId",
            method => <<"DELETE">>,
            handler => 'openapi_programs_handler'
        },
        'GetProgram' => #{
            path => "/api/program/:programId",
            method => <<"GET">>,
            handler => 'openapi_programs_handler'
        },
        'GetPrograms' => #{
            path => "/api/programs",
            method => <<"GET">>,
            handler => 'openapi_programs_handler'
        },
        'GetRepositories' => #{
            path => "/api/program/:programId/repositories",
            method => <<"GET">>,
            handler => 'openapi_repositories_handler'
        },
        'GetRepository' => #{
            path => "/api/program/:programId/repository/:repositoryId",
            method => <<"GET">>,
            handler => 'openapi_repositories_handler'
        },
        'GetEnvironmentVariables' => #{
            path => "/api/program/:programId/environment/:environmentId/variables",
            method => <<"GET">>,
            handler => 'openapi_variables_handler'
        },
        'PatchEnvironmentVariables' => #{
            path => "/api/program/:programId/environment/:environmentId/variables",
            method => <<"PATCH">>,
            handler => 'openapi_variables_handler'
        }
    }.

prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]).


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").


