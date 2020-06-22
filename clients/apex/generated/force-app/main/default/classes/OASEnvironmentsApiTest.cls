@isTest
private class OASEnvironmentsApiTest {
    /**
     * DeleteEnvironment
     *
     * Delete environment
     */
    @isTest
    private static void deleteEnvironmentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'environmentId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASEnvironmentsApi api;
        OASEnvironment response;
        OASEnvironment expectedResponse;
        String js = '';

        api = new OASEnvironmentsApi(new OASClient());

        js = JSON.serialize(OASEnvironment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEnvironment.getExample();
        response = (OASEnvironment) api.deleteEnvironment(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Download Logs
     *
     * Download environment logs
     */
    @isTest
    private static void downloadLogsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'environmentId' => 'null',
            'service' => 'null',
            'name' => 'null',
            'r_date' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null',
            'accept' => 'null'
        };

        OASClient client;
        OASEnvironmentsApi api;
        String js = '';

        api = new OASEnvironmentsApi(new OASClient());

        api.downloadLogs(params);
    }

    /**
     * Get Environment
     *
     * Returns an environment by its id
     */
    @isTest
    private static void getEnvironmentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'environmentId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASEnvironmentsApi api;
        OASEnvironment response;
        OASEnvironment expectedResponse;
        String js = '';

        api = new OASEnvironmentsApi(new OASClient());

        js = JSON.serialize(OASEnvironment.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEnvironment.getExample();
        response = (OASEnvironment) api.getEnvironment(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Environment Logs
     *
     * List all logs available in environment
     */
    @isTest
    private static void getEnvironmentLogsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'environmentId' => 'null',
            'days' => '',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null',
            'service' => new List<String>{''},
            'name' => new List<String>{''}
        };

        OASClient client;
        OASEnvironmentsApi api;
        OASEnvironmentLogs response;
        OASEnvironmentLogs expectedResponse;
        String js = '';

        api = new OASEnvironmentsApi(new OASClient());

        js = JSON.serialize(OASEnvironmentLogs.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEnvironmentLogs.getExample();
        response = (OASEnvironmentLogs) api.getEnvironmentLogs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List Environments
     *
     * Lists all environments in an program
     */
    @isTest
    private static void getEnvironmentsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null',
            'r_type' => dev
        };

        OASClient client;
        OASEnvironmentsApi api;
        OASEnvironmentList response;
        OASEnvironmentList expectedResponse;
        String js = '';

        api = new OASEnvironmentsApi(new OASClient());

        js = JSON.serialize(OASEnvironmentList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEnvironmentList.getExample();
        response = (OASEnvironmentList) api.getEnvironments(params);
        System.assertEquals(expectedResponse, response);
    }
}