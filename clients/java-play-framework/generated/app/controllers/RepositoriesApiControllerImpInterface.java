package controllers;

import apimodels.Repository;
import apimodels.RepositoryList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface RepositoriesApiControllerImpInterface {
    RepositoryList getRepositories(String programId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    Repository getRepository(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

}
