@isTest
private class OASRepositoriesApiTest {
    /**
     * Lists Repositories
     *
     * Lists all Repositories in an program
     */
    @isTest
    private static void getRepositoriesTest() {
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
        OASRepositoriesApi api;
        OASRepositoryList response;
        OASRepositoryList expectedResponse;
        String js = '';

        api = new OASRepositoriesApi(new OASClient());

        js = JSON.serialize(OASRepositoryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRepositoryList.getExample();
        response = (OASRepositoryList) api.getRepositories(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Repository
     *
     * Returns an repository by its id
     */
    @isTest
    private static void getRepositoryTest() {
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
        OASRepositoriesApi api;
        OASRepository response;
        OASRepository expectedResponse;
        String js = '';

        api = new OASRepositoriesApi(new OASClient());

        js = JSON.serialize(OASRepository.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRepository.getExample();
        response = (OASRepository) api.getRepository(params);
        System.assertEquals(expectedResponse, response);
    }
}