package controllers;

import apimodels.BranchList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface BranchesApiControllerImpInterface {
    BranchList getBranches(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

}
