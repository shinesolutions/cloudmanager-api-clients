import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for PipelineExecutionApi
void main() {
  var instance = PipelineExecutionApi();

  group('tests for PipelineExecutionApi', () {
    // Advance
    //
    // Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
    //
    //Future advancePipelineExecution(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) async 
    test('test advancePipelineExecution', () async {
      // TODO
    });

    // Cancel
    //
    // Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
    //
    //Future cancelPipelineExecutionStep(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) async 
    test('test cancelPipelineExecutionStep', () async {
      // TODO
    });

    // Get current pipeline execution
    //
    // Returns current pipeline execution if any.
    //
    //Future<PipelineExecution> getCurrentExecution(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test getCurrentExecution', () async {
      // TODO
    });

    // Get pipeline execution
    //
    // Returns a pipeline execution by id
    //
    //Future<PipelineExecution> getExecution(String programId, String pipelineId, String executionId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test getExecution', () async {
      // TODO
    });

    // List Executions
    //
    // Returns the history of pipeline executions in a newest to oldest order
    //
    //Future<PipelineExecutionListRepresentation> getExecutions(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, { String start, int limit }) async 
    test('test getExecutions', () async {
      // TODO
    });

    // Get logs
    //
    // Get the logs associated with a step.
    //
    //Future getStepLogs(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, { String file, String accept }) async 
    test('test getStepLogs', () async {
      // TODO
    });

    // Start the pipeline
    //
    // Starts the Pipeline. This works only if the pipeline is not already started.
    //
    //Future startPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType) async 
    test('test startPipeline', () async {
      // TODO
    });

    // Get step metrics
    //
    //Future<PipelineStepMetrics> stepMetric(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test stepMetric', () async {
      // TODO
    });

    // Get step state
    //
    //Future<PipelineExecutionStepState> stepState(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test stepState', () async {
      // TODO
    });

  });
}
