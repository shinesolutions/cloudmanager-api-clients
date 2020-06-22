package controllers;

import apimodels.Pipeline;
import apimodels.PipelineList;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface PipelinesApiControllerImpInterface {
    void deletePipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    Pipeline getPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    PipelineList getPipelines(String programId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    Pipeline patchPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Pipeline body) throws Exception;

}
