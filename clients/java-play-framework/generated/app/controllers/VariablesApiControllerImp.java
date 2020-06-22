package controllers;

import java.util.List;
import apimodels.Variable;
import apimodels.VariableList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

public class VariablesApiControllerImp implements VariablesApiControllerImpInterface {
    @Override
    public VariableList getEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new VariableList();
    }

    @Override
    public VariableList patchEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body) throws Exception {
        //Do your magic!!!
        return new VariableList();
    }

}
