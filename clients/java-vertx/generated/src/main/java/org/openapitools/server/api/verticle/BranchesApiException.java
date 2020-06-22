package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BranchList;
import org.openapitools.server.api.MainApiException;

public final class BranchesApiException extends MainApiException {
    public BranchesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}