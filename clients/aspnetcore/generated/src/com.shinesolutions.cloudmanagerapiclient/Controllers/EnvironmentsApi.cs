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
    public class EnvironmentsApiController : ControllerBase
    { 
        /// <summary>
        /// DeleteEnvironment
        /// </summary>
        /// <remarks>Delete environment</remarks>
        /// <param name="programId">Identifier of the application</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <response code="201">Environment deleted</response>
        /// <response code="400">Environment deletion in progress</response>
        /// <response code="404">Environment not found</response>
        [HttpDelete]
        [Route("/api/program/{programId}/environment/{environmentId}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteEnvironment")]
        [SwaggerResponse(statusCode: 201, type: typeof(Environment), description: "Environment deleted")]
        [SwaggerResponse(statusCode: 400, type: typeof(BadRequestError), description: "Environment deletion in progress")]
        public virtual IActionResult DeleteEnvironment([FromRoute][Required]string programId, [FromRoute][Required]string environmentId, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey)
        { 

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(Environment));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(BadRequestError));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"http://ns.adobe.com/adobecloud/rel/author\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/publish\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/variables\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/program\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/pipeline\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/developerConsole\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"self\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/logs\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    }\n  },\n  \"name\" : \"AcmeCorp Dev1 Environment\",\n  \"description\" : \"This is our primary development environment\",\n  \"id\" : \"id\",\n  \"type\" : \"dev\",\n  \"programId\" : \"14\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Environment>(exampleJson)
            : default(Environment);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Download Logs
        /// </summary>
        /// <remarks>Download environment logs</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="service">Name of service</param>
        /// <param name="name">Name of log</param>
        /// <param name="date">date for which log is required</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="accept">Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.</param>
        /// <response code="200">Successful retrieval of logs</response>
        /// <response code="400">invalid parameters</response>
        /// <response code="404">Environment not found</response>
        [HttpGet]
        [Route("/api/program/{programId}/environment/{environmentId}/logs/download")]
        [ValidateModelState]
        [SwaggerOperation("DownloadLogs")]
        [SwaggerResponse(statusCode: 400, type: typeof(BadRequestError), description: "invalid parameters")]
        public virtual IActionResult DownloadLogs([FromRoute][Required]string programId, [FromRoute][Required]string environmentId, [FromQuery][Required()]string service, [FromQuery][Required()]string name, [FromQuery][Required()]string date, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey, [FromHeader]string accept)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(BadRequestError));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get Environment
        /// </summary>
        /// <remarks>Returns an environment by its id</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <response code="200">successful operation</response>
        [HttpGet]
        [Route("/api/program/{programId}/environment/{environmentId}")]
        [ValidateModelState]
        [SwaggerOperation("GetEnvironment")]
        [SwaggerResponse(statusCode: 200, type: typeof(Environment), description: "successful operation")]
        public virtual IActionResult GetEnvironment([FromRoute][Required]string programId, [FromRoute][Required]string environmentId, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Environment));
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"http://ns.adobe.com/adobecloud/rel/author\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/publish\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/variables\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/program\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/pipeline\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/developerConsole\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"self\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/logs\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    }\n  },\n  \"name\" : \"AcmeCorp Dev1 Environment\",\n  \"description\" : \"This is our primary development environment\",\n  \"id\" : \"id\",\n  \"type\" : \"dev\",\n  \"programId\" : \"14\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Environment>(exampleJson)
            : default(Environment);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get Environment Logs
        /// </summary>
        /// <remarks>List all logs available in environment</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="days">number of days for which logs are required</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="service">Names of services</param>
        /// <param name="name">Names of log</param>
        /// <response code="200">Successful retrieval of logs for an environment</response>
        /// <response code="400">invalid parameters</response>
        /// <response code="404">Environment not found</response>
        [HttpGet]
        [Route("/api/program/{programId}/environment/{environmentId}/logs")]
        [ValidateModelState]
        [SwaggerOperation("GetEnvironmentLogs")]
        [SwaggerResponse(statusCode: 200, type: typeof(EnvironmentLogs), description: "Successful retrieval of logs for an environment")]
        [SwaggerResponse(statusCode: 400, type: typeof(BadRequestError), description: "invalid parameters")]
        public virtual IActionResult GetEnvironmentLogs([FromRoute][Required]string programId, [FromRoute][Required]string environmentId, [FromQuery][Required()]int days, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey, [FromQuery]List<string> service, [FromQuery]List<string> name)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(EnvironmentLogs));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(BadRequestError));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"http://ns.adobe.com/adobecloud/rel/program\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"self\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    }\n  },\n  \"_embedded\" : {\n    \"downloads\" : [ {\n      \"date\" : \"2019-04-05\",\n      \"environmentId\" : 6,\n      \"_links\" : {\n        \"http://ns.adobe.com/adobecloud/rel/logs/tail\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/logs/download\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        }\n      },\n      \"service\" : \"author\",\n      \"name\" : \"aemerror\",\n      \"programId\" : 0\n    }, {\n      \"date\" : \"2019-04-05\",\n      \"environmentId\" : 6,\n      \"_links\" : {\n        \"http://ns.adobe.com/adobecloud/rel/logs/tail\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/logs/download\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        }\n      },\n      \"service\" : \"author\",\n      \"name\" : \"aemerror\",\n      \"programId\" : 0\n    } ]\n  },\n  \"service\" : \"author\",\n  \"name\" : \"aemerror\",\n  \"days\" : 2\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<EnvironmentLogs>(exampleJson)
            : default(EnvironmentLogs);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List Environments
        /// </summary>
        /// <remarks>Lists all environments in an program</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="type">Type of the environment</param>
        /// <response code="200">Successful retrieval of environment list</response>
        /// <response code="404">Program not found</response>
        [HttpGet]
        [Route("/api/program/{programId}/environments")]
        [ValidateModelState]
        [SwaggerOperation("GetEnvironments")]
        [SwaggerResponse(statusCode: 200, type: typeof(EnvironmentList), description: "Successful retrieval of environment list")]
        public virtual IActionResult GetEnvironments([FromRoute][Required]string programId, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey, [FromQuery]string type)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(EnvironmentList));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"_totalNumberOfItems\" : 0,\n  \"_embedded\" : {\n    \"environments\" : [ {\n      \"_links\" : {\n        \"http://ns.adobe.com/adobecloud/rel/author\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/publish\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/variables\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/program\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/pipeline\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/developerConsole\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"self\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/logs\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        }\n      },\n      \"name\" : \"AcmeCorp Dev1 Environment\",\n      \"description\" : \"This is our primary development environment\",\n      \"id\" : \"id\",\n      \"type\" : \"dev\",\n      \"programId\" : \"14\"\n    }, {\n      \"_links\" : {\n        \"http://ns.adobe.com/adobecloud/rel/author\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/publish\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/variables\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/program\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/pipeline\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/developerConsole\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"self\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/logs\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        }\n      },\n      \"name\" : \"AcmeCorp Dev1 Environment\",\n      \"description\" : \"This is our primary development environment\",\n      \"id\" : \"id\",\n      \"type\" : \"dev\",\n      \"programId\" : \"14\"\n    } ]\n  },\n  \"_links\" : {\n    \"next\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"prev\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"self\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    }\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<EnvironmentList>(exampleJson)
            : default(EnvironmentList);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
