@isTest
private class OASPipelinesApiTest {
    /**
     * Delete a Pipeline
     *
     * Delete a pipeline. All the data is wiped.
     */
    @isTest
    private static void deletePipelineTest() {
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
        OASPipelinesApi api;
        String js = '';

        api = new OASPipelinesApi(new OASClient());

        api.deletePipeline(params);
    }

    /**
     * Get Pipeline
     *
     * Returns a pipeline by its id
     */
    @isTest
    private static void getPipelineTest() {
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
        OASPipelinesApi api;
        OASPipeline response;
        OASPipeline expectedResponse;
        String js = '';

        api = new OASPipelinesApi(new OASClient());

        js = JSON.serialize(OASPipeline.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPipeline.getExample();
        response = (OASPipeline) api.getPipeline(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List Pipelines
     *
     * Returns all the pipelines that the requesting user has access to in an program
     */
    @isTest
    private static void getPipelinesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASPipelinesApi api;
        OASPipelineList response;
        OASPipelineList expectedResponse;
        String js = '';

        api = new OASPipelinesApi(new OASClient());

        js = JSON.serialize(OASPipelineList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPipelineList.getExample();
        response = (OASPipelineList) api.getPipelines(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Patches Pipeline
     *
     * Patches a pipeline within an program.
     */
    @isTest
    private static void patchPipelineTest() {
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
            'contentType' => 'null',
            'body' => ''
        };

        OASClient client;
        OASPipelinesApi api;
        OASPipeline response;
        OASPipeline expectedResponse;
        String js = '';

        api = new OASPipelinesApi(new OASClient());

        js = JSON.serialize(OASPipeline.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPipeline.getExample();
        response = (OASPipeline) api.patchPipeline(params);
        System.assertEquals(expectedResponse, response);
    }
}