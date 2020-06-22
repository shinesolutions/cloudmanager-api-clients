-module(openapi_pipeline_execution_step_state).

-export([encode/1]).

-export_type([openapi_pipeline_execution_step_state/0]).

-type openapi_pipeline_execution_step_state() ::
    #{ 'id' => binary(),
       'stepId' => binary(),
       'phaseId' => binary(),
       'action' => binary(),
       'repository' => binary(),
       'branch' => binary(),
       'environment' => binary(),
       'environmentType' => binary(),
       'startedAt' => openapi_date_time:openapi_date_time(),
       'finishedAt' => openapi_date_time:openapi_date_time(),
       'details' => maps:map(),
       'status' => binary(),
       '_links' => openapi_pipeline_execution_step_state__links:openapi_pipeline_execution_step_state__links()
     }.

encode(#{ 'id' := Id,
          'stepId' := StepId,
          'phaseId' := PhaseId,
          'action' := Action,
          'repository' := Repository,
          'branch' := Branch,
          'environment' := Environment,
          'environmentType' := EnvironmentType,
          'startedAt' := StartedAt,
          'finishedAt' := FinishedAt,
          'details' := Details,
          'status' := Status,
          '_links' := Links
        }) ->
    #{ 'id' => Id,
       'stepId' => StepId,
       'phaseId' => PhaseId,
       'action' => Action,
       'repository' => Repository,
       'branch' => Branch,
       'environment' => Environment,
       'environmentType' => EnvironmentType,
       'startedAt' => StartedAt,
       'finishedAt' => FinishedAt,
       'details' => Details,
       'status' => Status,
       '_links' => Links
     }.
