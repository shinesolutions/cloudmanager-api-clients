package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BadRequestError;
import org.openapitools.server.api.model.Environment;
import org.openapitools.server.api.model.EnvironmentList;
import org.openapitools.server.api.model.EnvironmentLogs;
import org.openapitools.server.api.MainApiException;

public final class EnvironmentsApiException extends MainApiException {
    public EnvironmentsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final EnvironmentsApiException Environments_deleteEnvironment_400_Exception = new EnvironmentsApiException(400, "Environment deletion in progress");
    public static final EnvironmentsApiException Environments_deleteEnvironment_404_Exception = new EnvironmentsApiException(404, "Environment not found");
    public static final EnvironmentsApiException Environments_downloadLogs_400_Exception = new EnvironmentsApiException(400, "invalid parameters");
    public static final EnvironmentsApiException Environments_downloadLogs_404_Exception = new EnvironmentsApiException(404, "Environment not found");
    public static final EnvironmentsApiException Environments_getEnvironmentLogs_400_Exception = new EnvironmentsApiException(400, "invalid parameters");
    public static final EnvironmentsApiException Environments_getEnvironmentLogs_404_Exception = new EnvironmentsApiException(404, "Environment not found");
    public static final EnvironmentsApiException Environments_getEnvironments_404_Exception = new EnvironmentsApiException(404, "Program not found");
    

}