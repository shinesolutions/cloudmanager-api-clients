//
// PipelinesAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Alamofire



public class PipelinesAPI: APIBase {
    /**
     Delete a Pipeline
     
     - parameter programId: (path) Identifier of the program 
     - parameter pipelineId: (path) Identifier of the pipeline 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deletePipeline(programId programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: ((error: ErrorType?) -> Void)) {
        deletePipelineWithRequestBuilder(programId: programId, pipelineId: pipelineId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     Delete a Pipeline
     - DELETE /api/program/{programId}/pipeline/{pipelineId}
     - Delete a pipeline. All the data is wiped.     - parameter programId: (path) Identifier of the program 
     - parameter pipelineId: (path) Identifier of the pipeline 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 

     - returns: RequestBuilder<Void> 
     */
    public class func deletePipelineWithRequestBuilder(programId programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) -> RequestBuilder<Void> {
        var path = "/api/program/{programId}/pipeline/{pipelineId}"
        path = path.stringByReplacingOccurrencesOfString("{programId}", withString: "\(programId)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{pipelineId}", withString: "\(pipelineId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
        let nillableHeaders: [String: AnyObject?] = [
            "x-gw-ims-org-id": xGwImsOrgId,
            "Authorization": authorization,
            "x-api-key": xApiKey
        ]
        let headerParameters = APIHelper.rejectNilHeaders(nillableHeaders)
 
        let requestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true, headers: headerParameters)
    }

    /**
     Get Pipeline
     
     - parameter programId: (path) Identifier of the program 
     - parameter pipelineId: (path) Identifier of the pipeline 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getPipeline(programId programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: ((data: Pipeline?, error: ErrorType?) -> Void)) {
        getPipelineWithRequestBuilder(programId: programId, pipelineId: pipelineId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Get Pipeline
     - GET /api/program/{programId}/pipeline/{pipelineId}
     - Returns a pipeline by its id     - examples: [{contentType=application/json, example={
  "createdAt" : "2000-01-23T04:56:07.000+00:00",
  "_links" : {
    "http://ns.adobe.com/adobecloud/rel/program" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "self" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/executions" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/execution" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    }
  },
  "lastStartedAt" : "2000-01-23T04:56:07.000+00:00",
  "name" : "AcmeCorp Main Pipeline",
  "lastFinishedAt" : "2000-01-23T04:56:07.000+00:00",
  "id" : "29",
  "trigger" : "MANUAL",
  "programId" : "14",
  "phases" : [ {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  } ],
  "status" : "RUNNING,FAILED",
  "updatedAt" : "2000-01-23T04:56:07.000+00:00"
}, statusCode=200}]
     - parameter programId: (path) Identifier of the program 
     - parameter pipelineId: (path) Identifier of the pipeline 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 

     - returns: RequestBuilder<Pipeline> 
     */
    public class func getPipelineWithRequestBuilder(programId programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) -> RequestBuilder<Pipeline> {
        var path = "/api/program/{programId}/pipeline/{pipelineId}"
        path = path.stringByReplacingOccurrencesOfString("{programId}", withString: "\(programId)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{pipelineId}", withString: "\(pipelineId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
        let nillableHeaders: [String: AnyObject?] = [
            "x-gw-ims-org-id": xGwImsOrgId,
            "Authorization": authorization,
            "x-api-key": xApiKey
        ]
        let headerParameters = APIHelper.rejectNilHeaders(nillableHeaders)
 
        let requestBuilder: RequestBuilder<Pipeline>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true, headers: headerParameters)
    }

    /**
     List Pipelines
     
     - parameter programId: (path) Identifier of the program 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getPipelines(programId programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: ((data: PipelineList?, error: ErrorType?) -> Void)) {
        getPipelinesWithRequestBuilder(programId: programId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     List Pipelines
     - GET /api/program/{programId}/pipelines
     - Returns all the pipelines that the requesting user has access to in an program     - examples: [{contentType=application/json, example={
  "_totalNumberOfItems" : 0,
  "_embedded" : {
    "pipelines" : [ {
      "createdAt" : "2000-01-23T04:56:07.000+00:00",
      "_links" : {
        "http://ns.adobe.com/adobecloud/rel/program" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        },
        "self" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        },
        "http://ns.adobe.com/adobecloud/rel/executions" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        },
        "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        },
        "http://ns.adobe.com/adobecloud/rel/execution" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        }
      },
      "lastStartedAt" : "2000-01-23T04:56:07.000+00:00",
      "name" : "AcmeCorp Main Pipeline",
      "lastFinishedAt" : "2000-01-23T04:56:07.000+00:00",
      "id" : "29",
      "trigger" : "MANUAL",
      "programId" : "14",
      "phases" : [ {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      }, {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      }, {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      }, {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      }, {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      } ],
      "status" : "RUNNING,FAILED",
      "updatedAt" : "2000-01-23T04:56:07.000+00:00"
    }, {
      "createdAt" : "2000-01-23T04:56:07.000+00:00",
      "_links" : {
        "http://ns.adobe.com/adobecloud/rel/program" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        },
        "self" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        },
        "http://ns.adobe.com/adobecloud/rel/executions" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        },
        "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        },
        "http://ns.adobe.com/adobecloud/rel/execution" : {
          "hreflang" : "hreflang",
          "templated" : false,
          "profile" : "profile",
          "name" : "name",
          "href" : "href",
          "type" : "type",
          "deprecation" : "deprecation",
          "title" : "title"
        }
      },
      "lastStartedAt" : "2000-01-23T04:56:07.000+00:00",
      "name" : "AcmeCorp Main Pipeline",
      "lastFinishedAt" : "2000-01-23T04:56:07.000+00:00",
      "id" : "29",
      "trigger" : "MANUAL",
      "programId" : "14",
      "phases" : [ {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      }, {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      }, {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      }, {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      }, {
        "environmentId" : "environmentId",
        "name" : "DEV Build",
        "repositoryId" : "repositoryId",
        "type" : "DEPLOY",
        "branch" : "branch"
      } ],
      "status" : "RUNNING,FAILED",
      "updatedAt" : "2000-01-23T04:56:07.000+00:00"
    } ]
  },
  "_links" : {
    "next" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "prev" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "self" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    }
  }
}, statusCode=200}]
     - parameter programId: (path) Identifier of the program 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 

     - returns: RequestBuilder<PipelineList> 
     */
    public class func getPipelinesWithRequestBuilder(programId programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) -> RequestBuilder<PipelineList> {
        var path = "/api/program/{programId}/pipelines"
        path = path.stringByReplacingOccurrencesOfString("{programId}", withString: "\(programId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
        let nillableHeaders: [String: AnyObject?] = [
            "x-gw-ims-org-id": xGwImsOrgId,
            "Authorization": authorization,
            "x-api-key": xApiKey
        ]
        let headerParameters = APIHelper.rejectNilHeaders(nillableHeaders)
 
        let requestBuilder: RequestBuilder<PipelineList>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true, headers: headerParameters)
    }

    /**
     Patches Pipeline
     
     - parameter programId: (path) Identifier of the program 
     - parameter pipelineId: (path) Identifier of the pipeline 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter contentType: (header) Must always be application/json 
     - parameter body: (body) The updated Pipeline 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func patchPipeline(programId programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Pipeline, completion: ((data: Pipeline?, error: ErrorType?) -> Void)) {
        patchPipelineWithRequestBuilder(programId: programId, pipelineId: pipelineId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, contentType: contentType, body: body).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Patches Pipeline
     - PATCH /api/program/{programId}/pipeline/{pipelineId}
     - Patches a pipeline within an program.     - examples: [{contentType=application/json, example={
  "createdAt" : "2000-01-23T04:56:07.000+00:00",
  "_links" : {
    "http://ns.adobe.com/adobecloud/rel/program" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "self" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/executions" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/execution" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    }
  },
  "lastStartedAt" : "2000-01-23T04:56:07.000+00:00",
  "name" : "AcmeCorp Main Pipeline",
  "lastFinishedAt" : "2000-01-23T04:56:07.000+00:00",
  "id" : "29",
  "trigger" : "MANUAL",
  "programId" : "14",
  "phases" : [ {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  } ],
  "status" : "RUNNING,FAILED",
  "updatedAt" : "2000-01-23T04:56:07.000+00:00"
}, statusCode=200}]
     - parameter programId: (path) Identifier of the program 
     - parameter pipelineId: (path) Identifier of the pipeline 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter contentType: (header) Must always be application/json 
     - parameter body: (body) The updated Pipeline 

     - returns: RequestBuilder<Pipeline> 
     */
    public class func patchPipelineWithRequestBuilder(programId programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Pipeline) -> RequestBuilder<Pipeline> {
        var path = "/api/program/{programId}/pipeline/{pipelineId}"
        path = path.stringByReplacingOccurrencesOfString("{programId}", withString: "\(programId)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{pipelineId}", withString: "\(pipelineId)", options: .LiteralSearch, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
        let nillableHeaders: [String: AnyObject?] = [
            "x-gw-ims-org-id": xGwImsOrgId,
            "Authorization": authorization,
            "x-api-key": xApiKey,
            "Content-Type": contentType
        ]
        let headerParameters = APIHelper.rejectNilHeaders(nillableHeaders)
 
        let requestBuilder: RequestBuilder<Pipeline>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: URLString, parameters: convertedParameters, isBody: true, headers: headerParameters)
    }

}
