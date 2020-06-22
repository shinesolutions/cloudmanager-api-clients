package controllers;

import apimodels.Pipeline;
import apimodels.PipelineList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

public class PipelinesApiControllerImp implements PipelinesApiControllerImpInterface {
    @Override
    public void deletePipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Pipeline getPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new Pipeline();
    }

    @Override
    public PipelineList getPipelines(String programId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new PipelineList();
    }

    @Override
    public Pipeline patchPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Pipeline body) throws Exception {
        //Do your magic!!!
        return new Pipeline();
    }

}
