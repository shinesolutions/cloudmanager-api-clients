@isTest
private class OASVariablesApiTest {
    /**
     * List User Environment Variables
     *
     * List the user defined variables for an environment (Cloud Service only).
     */
    @isTest
    private static void getEnvironmentVariablesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 2351,
            'environmentId' => 128,
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASVariablesApi api;
        OASVariableList response;
        OASVariableList expectedResponse;
        String js = '';

        api = new OASVariablesApi(new OASClient());

        js = JSON.serialize(OASVariableList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVariableList.getExample();
        response = (OASVariableList) api.getEnvironmentVariables(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Patch User Environment Variables
     *
     * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
     */
    @isTest
    private static void patchEnvironmentVariablesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'environmentId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null',
            'contentType' => 'null',
            'body' => new List<OASVariable>{OASVariable.getExample()}
        };

        OASClient client;
        OASVariablesApi api;
        OASVariableList response;
        OASVariableList expectedResponse;
        String js = '';

        api = new OASVariablesApi(new OASClient());

        js = JSON.serialize(OASVariableList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVariableList.getExample();
        response = (OASVariableList) api.patchEnvironmentVariables(params);
        System.assertEquals(expectedResponse, response);
    }
}