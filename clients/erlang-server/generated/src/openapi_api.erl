-module(openapi_api).

-export([request_params/1]).
-export([request_param_info/2]).
-export([populate_request/3]).
-export([validate_response/4]).
%% exported to silence openapi complains
-export([get_value/3, validate_response_body/4]).

-type operation_id() :: atom().
-type request_param() :: atom().

-export_type([operation_id/0]).

-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].


request_params('GetBranches') ->
    [
        'programId',
        'repositoryId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];


request_params('DeleteEnvironment') ->
    [
        'programId',
        'environmentId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('DownloadLogs') ->
    [
        'programId',
        'environmentId',
        'service',
        'name',
        'date',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'Accept'
    ];

request_params('GetEnvironment') ->
    [
        'programId',
        'environmentId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('GetEnvironmentLogs') ->
    [
        'programId',
        'environmentId',
        'days',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'service',
        'name'
    ];

request_params('GetEnvironments') ->
    [
        'programId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'type'
    ];


request_params('AdvancePipelineExecution') ->
    [
        'programId',
        'pipelineId',
        'executionId',
        'phaseId',
        'stepId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'Content-Type',
        'object'
    ];

request_params('CancelPipelineExecutionStep') ->
    [
        'programId',
        'pipelineId',
        'executionId',
        'phaseId',
        'stepId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'Content-Type',
        'object'
    ];

request_params('GetCurrentExecution') ->
    [
        'programId',
        'pipelineId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('GetExecution') ->
    [
        'programId',
        'pipelineId',
        'executionId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('GetExecutions') ->
    [
        'programId',
        'pipelineId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'start',
        'limit'
    ];

request_params('GetStepLogs') ->
    [
        'programId',
        'pipelineId',
        'executionId',
        'phaseId',
        'stepId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'file',
        'Accept'
    ];

request_params('StartPipeline') ->
    [
        'programId',
        'pipelineId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'Content-Type'
    ];

request_params('StepMetric') ->
    [
        'programId',
        'pipelineId',
        'executionId',
        'phaseId',
        'stepId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('StepState') ->
    [
        'programId',
        'pipelineId',
        'executionId',
        'phaseId',
        'stepId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];


request_params('DeletePipeline') ->
    [
        'programId',
        'pipelineId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('GetPipeline') ->
    [
        'programId',
        'pipelineId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('GetPipelines') ->
    [
        'programId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('PatchPipeline') ->
    [
        'programId',
        'pipelineId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'Content-Type',
        'Pipeline'
    ];


request_params('DeleteProgram') ->
    [
        'programId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('GetProgram') ->
    [
        'programId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('GetPrograms') ->
    [
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];


request_params('GetRepositories') ->
    [
        'programId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('GetRepository') ->
    [
        'programId',
        'repositoryId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];


request_params('GetEnvironmentVariables') ->
    [
        'programId',
        'environmentId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key'
    ];

request_params('PatchEnvironmentVariables') ->
    [
        'programId',
        'environmentId',
        'x-gw-ims-org-id',
        'Authorization',
        'x-api-key',
        'Content-Type',
        'list'
    ];

request_params(_) ->
    error(unknown_operation).

-type rule() ::
    {type, 'binary'} |
    {type, 'integer'} |
    {type, 'float'} |
    {type, 'binary'} |
    {type, 'boolean'} |
    {type, 'date'} |
    {type, 'datetime'} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    schema |
    required |
    not_required.

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) -> #{
    source => qs_val | binding | header | body,
    rules => [rule()]
}.



request_param_info('GetBranches', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetBranches', 'repositoryId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetBranches', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetBranches', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetBranches', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };


request_param_info('DeleteEnvironment', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteEnvironment', 'environmentId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteEnvironment', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteEnvironment', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteEnvironment', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadLogs', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadLogs', 'environmentId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadLogs', 'service') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadLogs', 'name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadLogs', 'date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadLogs', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadLogs', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadLogs', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DownloadLogs', 'Accept') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('GetEnvironment', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironment', 'environmentId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironment', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironment', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironment', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentLogs', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentLogs', 'environmentId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentLogs', 'days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetEnvironmentLogs', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentLogs', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentLogs', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentLogs', 'service') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('GetEnvironmentLogs', 'name') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('GetEnvironments', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironments', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironments', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironments', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironments', 'type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['dev', 'stage', 'prod'] },
            not_required
        ]
    };


request_param_info('AdvancePipelineExecution', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AdvancePipelineExecution', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AdvancePipelineExecution', 'executionId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AdvancePipelineExecution', 'phaseId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AdvancePipelineExecution', 'stepId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AdvancePipelineExecution', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AdvancePipelineExecution', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AdvancePipelineExecution', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AdvancePipelineExecution', 'Content-Type') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AdvancePipelineExecution', 'object') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'executionId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'phaseId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'stepId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'Content-Type') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CancelPipelineExecutionStep', 'object') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetCurrentExecution', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetCurrentExecution', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetCurrentExecution', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetCurrentExecution', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetCurrentExecution', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecution', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecution', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecution', 'executionId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecution', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecution', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecution', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecutions', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecutions', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecutions', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecutions', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecutions', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetExecutions', 'start') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('GetExecutions', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetStepLogs', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetStepLogs', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetStepLogs', 'executionId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetStepLogs', 'phaseId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetStepLogs', 'stepId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetStepLogs', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetStepLogs', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetStepLogs', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetStepLogs', 'file') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('GetStepLogs', 'Accept') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('StartPipeline', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StartPipeline', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StartPipeline', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StartPipeline', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StartPipeline', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StartPipeline', 'Content-Type') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepMetric', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepMetric', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepMetric', 'executionId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepMetric', 'phaseId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepMetric', 'stepId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepMetric', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepMetric', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepMetric', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepState', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepState', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepState', 'executionId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepState', 'phaseId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepState', 'stepId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepState', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepState', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('StepState', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };


request_param_info('DeletePipeline', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeletePipeline', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeletePipeline', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeletePipeline', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeletePipeline', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPipeline', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPipeline', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPipeline', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPipeline', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPipeline', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPipelines', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPipelines', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPipelines', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPipelines', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchPipeline', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchPipeline', 'pipelineId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchPipeline', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchPipeline', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchPipeline', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchPipeline', 'Content-Type') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchPipeline', 'Pipeline') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('DeleteProgram', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteProgram', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteProgram', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteProgram', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetProgram', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetProgram', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetProgram', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetProgram', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPrograms', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPrograms', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPrograms', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };


request_param_info('GetRepositories', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetRepositories', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetRepositories', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetRepositories', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetRepository', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetRepository', 'repositoryId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetRepository', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetRepository', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetRepository', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };


request_param_info('GetEnvironmentVariables', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentVariables', 'environmentId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentVariables', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentVariables', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetEnvironmentVariables', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchEnvironmentVariables', 'programId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchEnvironmentVariables', 'environmentId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchEnvironmentVariables', 'x-gw-ims-org-id') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchEnvironmentVariables', 'Authorization') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchEnvironmentVariables', 'x-api-key') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchEnvironmentVariables', 'Content-Type') ->
    #{
        source =>   header,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchEnvironmentVariables', 'list') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request(
    OperationID :: operation_id(),
    Req :: cowboy_req:req(),
    ValidatorState :: jesse_state:state()
) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.

populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};

populate_request_params(OperationID, [FieldParams | T], Req0, ValidatorState, Model) ->
    case populate_request_param(OperationID, FieldParams, Req0, ValidatorState) of
        {ok, K, V, Req} ->
            populate_request_params(OperationID, T, Req, ValidatorState, maps:put(K, V, Model));
        Error ->
            Error
    end.

populate_request_param(OperationID, Name, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, Name),
    case get_value(Source, Name, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, Name, Value, ValidatorState) of
                {ok, Result} -> {ok, Name, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

-spec validate_response(
    OperationID :: operation_id(),
    Code :: 200..599,
    Body :: jesse:json_term(),
    ValidatorState :: jesse_state:state()
) -> ok | no_return().


validate_response('GetBranches', 200, Body, ValidatorState) ->
    validate_response_body('branchList', 'branchList', Body, ValidatorState);


validate_response('DeleteEnvironment', 201, Body, ValidatorState) ->
    validate_response_body('Environment', 'Environment', Body, ValidatorState);
validate_response('DeleteEnvironment', 400, Body, ValidatorState) ->
    validate_response_body('BadRequestError', 'BadRequestError', Body, ValidatorState);
validate_response('DeleteEnvironment', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('DownloadLogs', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DownloadLogs', 400, Body, ValidatorState) ->
    validate_response_body('BadRequestError', 'BadRequestError', Body, ValidatorState);
validate_response('DownloadLogs', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetEnvironment', 200, Body, ValidatorState) ->
    validate_response_body('Environment', 'Environment', Body, ValidatorState);

validate_response('GetEnvironmentLogs', 200, Body, ValidatorState) ->
    validate_response_body('EnvironmentLogs', 'EnvironmentLogs', Body, ValidatorState);
validate_response('GetEnvironmentLogs', 400, Body, ValidatorState) ->
    validate_response_body('BadRequestError', 'BadRequestError', Body, ValidatorState);
validate_response('GetEnvironmentLogs', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetEnvironments', 200, Body, ValidatorState) ->
    validate_response_body('environmentList', 'environmentList', Body, ValidatorState);
validate_response('GetEnvironments', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);


validate_response('AdvancePipelineExecution', 202, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('AdvancePipelineExecution', 403, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('AdvancePipelineExecution', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('CancelPipelineExecutionStep', 202, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('CancelPipelineExecutionStep', 403, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('CancelPipelineExecutionStep', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetCurrentExecution', 200, Body, ValidatorState) ->
    validate_response_body('pipelineExecution', 'pipelineExecution', Body, ValidatorState);
validate_response('GetCurrentExecution', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetExecution', 200, Body, ValidatorState) ->
    validate_response_body('pipelineExecution', 'pipelineExecution', Body, ValidatorState);
validate_response('GetExecution', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetExecutions', 200, Body, ValidatorState) ->
    validate_response_body('PipelineExecutionListRepresentation', 'PipelineExecutionListRepresentation', Body, ValidatorState);
validate_response('GetExecutions', 403, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('GetExecutions', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetStepLogs', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('GetStepLogs', 403, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('GetStepLogs', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('StartPipeline', 201, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('StartPipeline', 400, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('StartPipeline', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('StartPipeline', 412, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('StepMetric', 200, Body, ValidatorState) ->
    validate_response_body('pipelineStepMetrics', 'pipelineStepMetrics', Body, ValidatorState);
validate_response('StepMetric', 403, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('StepMetric', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('StepState', 200, Body, ValidatorState) ->
    validate_response_body('pipelineExecutionStepState', 'pipelineExecutionStepState', Body, ValidatorState);
validate_response('StepState', 403, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('StepState', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);


validate_response('DeletePipeline', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetPipeline', 200, Body, ValidatorState) ->
    validate_response_body('Pipeline', 'Pipeline', Body, ValidatorState);
validate_response('GetPipeline', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetPipelines', 200, Body, ValidatorState) ->
    validate_response_body('pipelineList', 'pipelineList', Body, ValidatorState);

validate_response('PatchPipeline', 200, Body, ValidatorState) ->
    validate_response_body('Pipeline', 'Pipeline', Body, ValidatorState);


validate_response('DeleteProgram', 200, Body, ValidatorState) ->
    validate_response_body('Program', 'Program', Body, ValidatorState);
validate_response('DeleteProgram', 202, Body, ValidatorState) ->
    validate_response_body('Program', 'Program', Body, ValidatorState);
validate_response('DeleteProgram', 403, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DeleteProgram', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DeleteProgram', 412, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetProgram', 200, Body, ValidatorState) ->
    validate_response_body('Program', 'Program', Body, ValidatorState);
validate_response('GetProgram', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetPrograms', 200, Body, ValidatorState) ->
    validate_response_body('programList', 'programList', Body, ValidatorState);


validate_response('GetRepositories', 200, Body, ValidatorState) ->
    validate_response_body('repositoryList', 'repositoryList', Body, ValidatorState);

validate_response('GetRepository', 200, Body, ValidatorState) ->
    validate_response_body('Repository', 'Repository', Body, ValidatorState);


validate_response('GetEnvironmentVariables', 200, Body, ValidatorState) ->
    validate_response_body('variableList', 'variableList', Body, ValidatorState);
validate_response('GetEnvironmentVariables', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PatchEnvironmentVariables', 200, Body, ValidatorState) ->
    validate_response_body('variableList', 'variableList', Body, ValidatorState);
validate_response('PatchEnvironmentVariables', 404, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);


validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

validate_response_body('list', ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, ReturnBaseType, Item, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, ReturnBaseType, Body, ValidatorState).

%%%
validate(Rule = required, Name, Value, _ValidatorState) ->
    case Value of
        undefined -> validation_error(Rule, Name);
        _ -> ok
    end;

validate(not_required, _Name, _Value, _ValidatorState) ->
    ok;

validate(_, _Name, undefined, _ValidatorState) ->
    ok;

validate(Rule = {type, 'integer'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_int(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'float'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'binary'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(_Rule = {type, 'boolean'}, _Name, Value, _ValidatorState) when is_boolean(Value) ->
    {ok, Value};

validate(Rule = {type, 'boolean'}, Name, Value, _ValidatorState) ->
    V = binary_to_lower(Value),
    try
        case binary_to_existing_atom(V, utf8) of
            B when is_boolean(B) -> {ok, B};
            _ -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'date'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {type, 'datetime'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {enum, Values}, Name, Value, _ValidatorState) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {max, Max}, Name, Value, _ValidatorState) ->
    case Value =< Max of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_max, ExclusiveMax}, Name, Value, _ValidatorState) ->
    case Value > ExclusiveMax of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min, Min}, Name, Value, _ValidatorState) ->
    case Value >= Min of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_min, ExclusiveMin}, Name, Value, _ValidatorState) ->
    case Value =< ExclusiveMin of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {max_length, MaxLength}, Name, Value, _ValidatorState) ->
    case size(Value) =< MaxLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min_length, MinLength}, Name, Value, _ValidatorState) ->
    case size(Value) >= MinLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {pattern, Pattern}, Name, Value, _ValidatorState) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, Name)
    end;

validate(Rule = schema, Name, Value, ValidatorState) ->
    Definition =  list_to_binary("#/components/schemas/" ++ openapi_utils:to_list(Name)),
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, Name, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, Name, Info)
    end;

validate(Rule, Name, _Value, _ValidatorState) ->
    error_logger:info_msg("Can't validate ~p with ~p", [Name, Rule]),
    error({unknown_validation_rule, Rule}).

-spec validation_error(Rule :: any(), Name :: any()) -> no_return().

validation_error(ViolatedRule, Name) ->
    validation_error(ViolatedRule, Name, #{}).

-spec validation_error(Rule :: any(), Name :: any(), Info :: #{}) -> no_return().

validation_error(ViolatedRule, Name, Info) ->
    throw({wrong_param, Name, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, Name :: any(), Req0 :: cowboy_req:req()) ->
    {Value :: any(), Req :: cowboy_req:req()} | 
    {error, Reason :: any(), Req :: cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = cowboy_req:read_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;

get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = openapi_utils:get_opt(openapi_utils:to_qs(Name), QS),
    {Value, Req};

get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value =  maps:get(openapi_utils:to_header(Name), Headers, undefined),
    {Value, Req};

get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(openapi_utils:to_binding(Name), Req),
    {Value, Req}.

prepare_body(Body) ->
    case Body of
        <<"">> -> <<"">>;
        _ ->
            try
                jsx:decode(Body, [return_maps]) 
            catch
              error:_ ->
                {error, {invalid_body, not_json, Body}}
            end
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

prepare_param(Rules, Name, Value, ValidatorState) ->
    try
        Result = lists:foldl(
            fun(Rule, Acc) ->
                case validate(Rule, Name, Acc, ValidatorState) of
                    ok -> Acc;
                    {ok, Prepared} -> Prepared
                end
            end,
            Value,
            Rules
        ),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

binary_to_lower(V) when is_binary(V) ->
    list_to_binary(string:to_lower(openapi_utils:to_list(V))).
