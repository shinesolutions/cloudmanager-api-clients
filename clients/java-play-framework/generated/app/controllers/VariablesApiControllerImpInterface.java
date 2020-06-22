package controllers;

import java.util.List;
import apimodels.Variable;
import apimodels.VariableList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface VariablesApiControllerImpInterface {
    VariableList getEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    VariableList patchEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body) throws Exception;

}
