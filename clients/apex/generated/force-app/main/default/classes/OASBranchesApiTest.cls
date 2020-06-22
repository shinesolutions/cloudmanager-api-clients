@isTest
private class OASBranchesApiTest {
    /**
     * List Branches
     *
     * Returns the list of branches from a repository
     */
    @isTest
    private static void getBranchesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'programId' => 'null',
            'repositoryId' => 'null',
            'xGwImsOrgId' => 'null',
            'authorization' => 'null',
            'xApiKey' => 'null'
        };

        OASClient client;
        OASBranchesApi api;
        OASBranchList response;
        OASBranchList expectedResponse;
        String js = '';

        api = new OASBranchesApi(new OASClient());

        js = JSON.serialize(OASBranchList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBranchList.getExample();
        response = (OASBranchList) api.getBranches(params);
        System.assertEquals(expectedResponse, response);
    }
}