/*
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using com.shinesolutions.cloudmanagerapiclient.Attributes;
using Microsoft.AspNetCore.Authorization;
using com.shinesolutions.cloudmanagerapiclient.Models;

namespace com.shinesolutions.cloudmanagerapiclient.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class PipelinesApiController : ControllerBase
    { 
        /// <summary>
        /// Delete a Pipeline
        /// </summary>
        /// <remarks>Delete a pipeline. All the data is wiped.</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <response code="0">successful operation</response>
        [HttpDelete]
        [Route("/api/program/{programId}/pipeline/{pipelineId}")]
        [ValidateModelState]
        [SwaggerOperation("DeletePipeline")]
        public virtual IActionResult DeletePipeline([FromRoute][Required]string programId, [FromRoute][Required]string pipelineId, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey)
        { 

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get Pipeline
        /// </summary>
        /// <remarks>Returns a pipeline by its id</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <response code="200">Successful retrieval of pipeline</response>
        /// <response code="404">Pipeline not found</response>
        [HttpGet]
        [Route("/api/program/{programId}/pipeline/{pipelineId}")]
        [ValidateModelState]
        [SwaggerOperation("GetPipeline")]
        [SwaggerResponse(statusCode: 200, type: typeof(Pipeline), description: "Successful retrieval of pipeline")]
        public virtual IActionResult GetPipeline([FromRoute][Required]string programId, [FromRoute][Required]string pipelineId, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Pipeline));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"_links\" : {\n    \"http://ns.adobe.com/adobecloud/rel/program\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"self\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/executions\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/execution\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    }\n  },\n  \"lastStartedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"name\" : \"AcmeCorp Main Pipeline\",\n  \"lastFinishedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"29\",\n  \"trigger\" : \"MANUAL\",\n  \"programId\" : \"14\",\n  \"phases\" : [ {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  }, {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  }, {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  }, {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  }, {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  } ],\n  \"status\" : \"RUNNING,FAILED\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Pipeline>(exampleJson)
            : default(Pipeline);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List Pipelines
        /// </summary>
        /// <remarks>Returns all the pipelines that the requesting user has access to in an program</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <response code="200">successful operation</response>
        [HttpGet]
        [Route("/api/program/{programId}/pipelines")]
        [ValidateModelState]
        [SwaggerOperation("GetPipelines")]
        [SwaggerResponse(statusCode: 200, type: typeof(PipelineList), description: "successful operation")]
        public virtual IActionResult GetPipelines([FromRoute][Required]string programId, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PipelineList));
            string exampleJson = null;
            exampleJson = "{\n  \"_totalNumberOfItems\" : 0,\n  \"_embedded\" : {\n    \"pipelines\" : [ {\n      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"_links\" : {\n        \"http://ns.adobe.com/adobecloud/rel/program\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"self\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/executions\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/execution\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        }\n      },\n      \"lastStartedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"name\" : \"AcmeCorp Main Pipeline\",\n      \"lastFinishedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"id\" : \"29\",\n      \"trigger\" : \"MANUAL\",\n      \"programId\" : \"14\",\n      \"phases\" : [ {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      }, {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      }, {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      }, {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      }, {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      } ],\n      \"status\" : \"RUNNING,FAILED\",\n      \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n    }, {\n      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"_links\" : {\n        \"http://ns.adobe.com/adobecloud/rel/program\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"self\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/executions\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/execution\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        }\n      },\n      \"lastStartedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"name\" : \"AcmeCorp Main Pipeline\",\n      \"lastFinishedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"id\" : \"29\",\n      \"trigger\" : \"MANUAL\",\n      \"programId\" : \"14\",\n      \"phases\" : [ {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      }, {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      }, {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      }, {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      }, {\n        \"environmentId\" : \"environmentId\",\n        \"name\" : \"DEV Build\",\n        \"repositoryId\" : \"repositoryId\",\n        \"type\" : \"DEPLOY\",\n        \"branch\" : \"branch\"\n      } ],\n      \"status\" : \"RUNNING,FAILED\",\n      \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n    } ]\n  },\n  \"_links\" : {\n    \"next\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"prev\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"self\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    }\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PipelineList>(exampleJson)
            : default(PipelineList);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Patches Pipeline
        /// </summary>
        /// <remarks>Patches a pipeline within an program.</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="contentType">Must always be application/json</param>
        /// <param name="body">The updated Pipeline</param>
        /// <response code="200">successful operation</response>
        [HttpPatch]
        [Route("/api/program/{programId}/pipeline/{pipelineId}")]
        [ValidateModelState]
        [SwaggerOperation("PatchPipeline")]
        [SwaggerResponse(statusCode: 200, type: typeof(Pipeline), description: "successful operation")]
        public virtual IActionResult PatchPipeline([FromRoute][Required]string programId, [FromRoute][Required]string pipelineId, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey, [FromHeader][Required()]string contentType, [FromBody]Pipeline body)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Pipeline));
            string exampleJson = null;
            exampleJson = "{\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"_links\" : {\n    \"http://ns.adobe.com/adobecloud/rel/program\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"self\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/executions\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/execution\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    }\n  },\n  \"lastStartedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"name\" : \"AcmeCorp Main Pipeline\",\n  \"lastFinishedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"29\",\n  \"trigger\" : \"MANUAL\",\n  \"programId\" : \"14\",\n  \"phases\" : [ {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  }, {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  }, {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  }, {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  }, {\n    \"environmentId\" : \"environmentId\",\n    \"name\" : \"DEV Build\",\n    \"repositoryId\" : \"repositoryId\",\n    \"type\" : \"DEPLOY\",\n    \"branch\" : \"branch\"\n  } ],\n  \"status\" : \"RUNNING,FAILED\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Pipeline>(exampleJson)
            : default(Pipeline);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
