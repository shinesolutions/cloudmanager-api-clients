/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.openapitools.api;

import org.openapitools.model.Pipeline;
import org.openapitools.model.PipelineList;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Cloud Manager API
 *
 * <p>This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * API tests for PipelinesApi 
 */
public class PipelinesApiTest {


    private PipelinesApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://cloudmanager.adobe.io", PipelinesApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Delete a Pipeline
     *
     * Delete a pipeline. All the data is wiped.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePipelineTest() {
        String programId = null;
        String pipelineId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        //api.deletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Get Pipeline
     *
     * Returns a pipeline by its id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineTest() {
        String programId = null;
        String pipelineId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        //Pipeline response = api.getPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * List Pipelines
     *
     * Returns all the pipelines that the requesting user has access to in an program
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelinesTest() {
        String programId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        //PipelineList response = api.getPipelines(programId, xGwImsOrgId, authorization, xApiKey);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Patches Pipeline
     *
     * Patches a pipeline within an program.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPipelineTest() {
        String programId = null;
        String pipelineId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        String contentType = null;
        Pipeline body = null;
        //Pipeline response = api.patchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
