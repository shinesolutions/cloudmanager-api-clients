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
    public class RepositoriesApiController : ControllerBase
    { 
        /// <summary>
        /// Lists Repositories
        /// </summary>
        /// <remarks>Lists all Repositories in an program</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <response code="200">successful operation</response>
        [HttpGet]
        [Route("/api/program/{programId}/repositories")]
        [ValidateModelState]
        [SwaggerOperation("GetRepositories")]
        [SwaggerResponse(statusCode: 200, type: typeof(RepositoryList), description: "successful operation")]
        public virtual IActionResult GetRepositories([FromRoute][Required]string programId, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(RepositoryList));
            string exampleJson = null;
            exampleJson = "{\n  \"_totalNumberOfItems\" : 0,\n  \"_embedded\" : {\n    \"repositories\" : [ {\n      \"_links\" : {\n        \"http://ns.adobe.com/adobecloud/rel/program\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/branches\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"self\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        }\n      },\n      \"repo\" : \"Adobe-Marketing-Cloud\",\n      \"description\" : \"Description\"\n    }, {\n      \"_links\" : {\n        \"http://ns.adobe.com/adobecloud/rel/program\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"http://ns.adobe.com/adobecloud/rel/branches\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        },\n        \"self\" : {\n          \"hreflang\" : \"hreflang\",\n          \"templated\" : false,\n          \"profile\" : \"profile\",\n          \"name\" : \"name\",\n          \"href\" : \"href\",\n          \"type\" : \"type\",\n          \"deprecation\" : \"deprecation\",\n          \"title\" : \"title\"\n        }\n      },\n      \"repo\" : \"Adobe-Marketing-Cloud\",\n      \"description\" : \"Description\"\n    } ]\n  },\n  \"_links\" : {\n    \"next\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"prev\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"self\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    }\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<RepositoryList>(exampleJson)
            : default(RepositoryList);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get Repository
        /// </summary>
        /// <remarks>Returns an repository by its id</remarks>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="repositoryId">Identifier of the repository</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <response code="200">successful operation</response>
        [HttpGet]
        [Route("/api/program/{programId}/repository/{repositoryId}")]
        [ValidateModelState]
        [SwaggerOperation("GetRepository")]
        [SwaggerResponse(statusCode: 200, type: typeof(Repository), description: "successful operation")]
        public virtual IActionResult GetRepository([FromRoute][Required]string programId, [FromRoute][Required]string repositoryId, [FromHeader][Required()]string xGwImsOrgId, [FromHeader][Required()]string authorization, [FromHeader][Required()]string xApiKey)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Repository));
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"http://ns.adobe.com/adobecloud/rel/program\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"http://ns.adobe.com/adobecloud/rel/branches\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    },\n    \"self\" : {\n      \"hreflang\" : \"hreflang\",\n      \"templated\" : false,\n      \"profile\" : \"profile\",\n      \"name\" : \"name\",\n      \"href\" : \"href\",\n      \"type\" : \"type\",\n      \"deprecation\" : \"deprecation\",\n      \"title\" : \"title\"\n    }\n  },\n  \"repo\" : \"Adobe-Marketing-Cloud\",\n  \"description\" : \"Description\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Repository>(exampleJson)
            : default(Repository);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
