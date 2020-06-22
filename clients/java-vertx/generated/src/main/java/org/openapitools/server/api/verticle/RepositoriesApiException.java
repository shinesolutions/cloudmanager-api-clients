package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Repository;
import org.openapitools.server.api.model.RepositoryList;

public final class RepositoriesApiException extends MainApiException {
    public RepositoriesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}