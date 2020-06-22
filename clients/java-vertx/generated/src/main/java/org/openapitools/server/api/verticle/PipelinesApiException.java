package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Pipeline;
import org.openapitools.server.api.model.PipelineList;

public final class PipelinesApiException extends MainApiException {
    public PipelinesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final PipelinesApiException Pipelines_getPipeline_404_Exception = new PipelinesApiException(404, "Pipeline not found");
    

}