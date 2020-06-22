package controllers;

import apimodels.BranchList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

public class BranchesApiControllerImp implements BranchesApiControllerImpInterface {
    @Override
    public BranchList getBranches(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new BranchList();
    }

}
