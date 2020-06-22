package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Program;
import org.openapitools.server.api.model.ProgramList;

public final class ProgramsApiException extends MainApiException {
    public ProgramsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final ProgramsApiException Programs_deleteProgram_202_Exception = new ProgramsApiException(202, "Delete was successful.");
    public static final ProgramsApiException Programs_deleteProgram_403_Exception = new ProgramsApiException(403, "Forbidden.");
    public static final ProgramsApiException Programs_deleteProgram_404_Exception = new ProgramsApiException(404, "Program not found.");
    public static final ProgramsApiException Programs_deleteProgram_412_Exception = new ProgramsApiException(412, "Deletion not supported");
    public static final ProgramsApiException Programs_getProgram_404_Exception = new ProgramsApiException(404, "Program not found");
    

}