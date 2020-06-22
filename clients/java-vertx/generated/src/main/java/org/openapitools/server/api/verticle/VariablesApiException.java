package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Variable;
import org.openapitools.server.api.model.VariableList;

public final class VariablesApiException extends MainApiException {
    public VariablesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final VariablesApiException Variables_getEnvironmentVariables_404_Exception = new VariablesApiException(404, "Environment not found");
    public static final VariablesApiException Variables_patchEnvironmentVariables_404_Exception = new VariablesApiException(404, "Environment not found");
    

}