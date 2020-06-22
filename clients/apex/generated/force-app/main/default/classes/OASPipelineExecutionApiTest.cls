@isTest
private class OASPipelineExecutionApiTest {
    /**
     * Advance
     *
     * Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
     */
    @isTest
    private static void advancePipelineExecutionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'pipelineId' => 'null',
            'executionId' => 'null',
            'phaseId' => 'null',
            'stepId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null',
            'contentType' => 'null',
            'body' => 
        };

        OASClient client;
        OASPipelineExecutionApi api;
        String js = '';

        api = new OASPipelineExecutionApi(new OASClient());

        api.advancePipelineExecution(params);
    }

    /**
     * Cancel
     *
     * Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
     */
    @isTest
    private static void cancelPipelineExecutionStepTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'pipelineId' => 'null',
            'executionId' => 'null',
            'phaseId' => 'null',
            'stepId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null',
            'contentType' => 'null',
            'body' => 
        };

        OASClient client;
        OASPipelineExecutionApi api;
        String js = '';

        api = new OASPipelineExecutionApi(new OASClient());

        api.cancelPipelineExecutionStep(params);
    }

    /**
     * Get current pipeline execution
     *
     * Returns current pipeline execution if any.
     */
    @isTest
    private static void getCurrentExecutionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'pipelineId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASPipelineExecutionApi api;
        OASPipelineExecution response;
        OASPipelineExecution expectedResponse;
        String js = '';

        api = new OASPipelineExecutionApi(new OASClient());

        js = JSON.serialize(OASPipelineExecution.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPipelineExecution.getExample();
        response = (OASPipelineExecution) api.getCurrentExecution(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pipeline execution
     *
     * Returns a pipeline execution by id
     */
    @isTest
    private static void getExecutionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'pipelineId' => 'null',
            'executionId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASPipelineExecutionApi api;
        OASPipelineExecution response;
        OASPipelineExecution expectedResponse;
        String js = '';

        api = new OASPipelineExecutionApi(new OASClient());

        js = JSON.serialize(OASPipelineExecution.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPipelineExecution.getExample();
        response = (OASPipelineExecution) api.getExecution(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List Executions
     *
     * Returns the history of pipeline executions in a newest to oldest order
     */
    @isTest
    private static void getExecutionsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'pipelineId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null',
            'start' => 'null',
            'r_limit' => ''
        };

        OASClient client;
        OASPipelineExecutionApi api;
        OASPipelineExecutionListRepresentati response;
        OASPipelineExecutionListRepresentati expectedResponse;
        String js = '';

        api = new OASPipelineExecutionApi(new OASClient());

        js = JSON.serialize(OASPipelineExecutionListRepresentati.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPipelineExecutionListRepresentati.getExample();
        response = (OASPipelineExecutionListRepresentati) api.getExecutions(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get logs
     *
     * Get the logs associated with a step.
     */
    @isTest
    private static void getStepLogsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'pipelineId' => 'null',
            'executionId' => 'null',
            'phaseId' => 'null',
            'stepId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null',
            'file' => 'null',
            'accept' => 'null'
        };

        OASClient client;
        OASPipelineExecutionApi api;
        String js = '';

        api = new OASPipelineExecutionApi(new OASClient());

        api.getStepLogs(params);
    }

    /**
     * Start the pipeline
     *
     * Starts the Pipeline. This works only if the pipeline is not already started.
     */
    @isTest
    private static void startPipelineTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'pipelineId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null',
            'contentType' => 'null'
        };

        OASClient client;
        OASPipelineExecutionApi api;
        String js = '';

        api = new OASPipelineExecutionApi(new OASClient());

        api.startPipeline(params);
    }

    /**
     * Get step metrics
     *
     * 
     */
    @isTest
    private static void stepMetricTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'pipelineId' => 'null',
            'executionId' => 'null',
            'phaseId' => 'null',
            'stepId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASPipelineExecutionApi api;
        OASPipelineStepMetrics response;
        OASPipelineStepMetrics expectedResponse;
        String js = '';

        api = new OASPipelineExecutionApi(new OASClient());

        js = JSON.serialize(OASPipelineStepMetrics.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPipelineStepMetrics.getExample();
        response = (OASPipelineStepMetrics) api.stepMetric(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get step state
     *
     * 
     */
    @isTest
    private static void stepStateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'pipelineId' => 'null',
            'executionId' => 'null',
            'phaseId' => 'null',
            'stepId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASPipelineExecutionApi api;
        OASPipelineExecutionStepState response;
        OASPipelineExecutionStepState expectedResponse;
        String js = '';

        api = new OASPipelineExecutionApi(new OASClient());

        js = JSON.serialize(OASPipelineExecutionStepState.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPipelineExecutionStepState.getExample();
        response = (OASPipelineExecutionStepState) api.stepState(params);
        System.assertEquals(expectedResponse, response);
    }
}