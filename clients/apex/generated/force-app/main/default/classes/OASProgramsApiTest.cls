@isTest
private class OASProgramsApiTest {
    /**
     * Delete Program
     *
     * Delete an program
     */
    @isTest
    private static void deleteProgramTest() {
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
        OASProgramsApi api;
        OASProgram response;
        OASProgram expectedResponse;
        String js = '';

        api = new OASProgramsApi(new OASClient());

        js = JSON.serialize(OASProgram.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProgram.getExample();
        response = (OASProgram) api.deleteProgram(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Program
     *
     * Returns a program by its id
     */
    @isTest
    private static void getProgramTest() {
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
        OASProgramsApi api;
        OASProgram response;
        OASProgram expectedResponse;
        String js = '';

        api = new OASProgramsApi(new OASClient());

        js = JSON.serialize(OASProgram.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProgram.getExample();
        response = (OASProgram) api.getProgram(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Lists Programs
     *
     * Returns all programs that the requesting user has access to
     */
    @isTest
    private static void getProgramsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASProgramsApi api;
        OASProgramList response;
        OASProgramList expectedResponse;
        String js = '';

        api = new OASProgramsApi(new OASClient());

        js = JSON.serialize(OASProgramList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProgramList.getExample();
        response = (OASProgramList) api.getPrograms(params);
        System.assertEquals(expectedResponse, response);
    }
}