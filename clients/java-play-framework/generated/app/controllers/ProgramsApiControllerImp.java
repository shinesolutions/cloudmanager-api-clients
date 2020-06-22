package controllers;

import apimodels.Program;
import apimodels.ProgramList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

public class ProgramsApiControllerImp implements ProgramsApiControllerImpInterface {
    @Override
    public Program deleteProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new Program();
    }

    @Override
    public Program getProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new Program();
    }

    @Override
    public ProgramList getPrograms(String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new ProgramList();
    }

}
