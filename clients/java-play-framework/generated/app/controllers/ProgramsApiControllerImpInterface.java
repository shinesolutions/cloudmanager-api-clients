package controllers;

import apimodels.Program;
import apimodels.ProgramList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface ProgramsApiControllerImpInterface {
    Program deleteProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    Program getProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    ProgramList getPrograms(String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

}
