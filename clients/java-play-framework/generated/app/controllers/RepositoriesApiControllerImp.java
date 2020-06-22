package controllers;

import apimodels.Repository;
import apimodels.RepositoryList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

public class RepositoriesApiControllerImp implements RepositoriesApiControllerImpInterface {
    @Override
    public RepositoryList getRepositories(String programId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new RepositoryList();
    }

    @Override
    public Repository getRepository(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new Repository();
    }

}
