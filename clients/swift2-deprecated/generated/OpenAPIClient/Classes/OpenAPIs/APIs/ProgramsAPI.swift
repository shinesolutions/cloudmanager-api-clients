//
// ProgramsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Alamofire



public class ProgramsAPI: APIBase {
    /**
     Delete Program
     
     - parameter programId: (path) Identifier of the program 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteProgram(programId programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: ((data: Program?, error: ErrorType?) -> Void)) {
        deleteProgramWithRequestBuilder(programId: programId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Delete Program
     - DELETE /api/program/{programId}
     - Delete an program     - examples: [{contentType=application/json, example={
  "_links" : {
    "http://ns.adobe.com/adobecloud/rel/environments" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/repositories" : {
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
    "http://ns.adobe.com/adobecloud/rel/pipelines" : {
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
  "name" : "AcmeCorp Main Site",
  "tenantId" : "acmeCorp",
  "id" : "14",
  "enabled" : false,
  "imsOrgId" : "6522A55453334E247F120101@AdobeOrg"
}, statusCode=200}]
     - parameter programId: (path) Identifier of the program 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 

     - returns: RequestBuilder<Program> 
     */
    public class func deleteProgramWithRequestBuilder(programId programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) -> RequestBuilder<Program> {
        var path = "/api/program/{programId}"
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
 
        let requestBuilder: RequestBuilder<Program>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true, headers: headerParameters)
    }

    /**
     Get Program
     
     - parameter programId: (path) Identifier of the program 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getProgram(programId programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: ((data: Program?, error: ErrorType?) -> Void)) {
        getProgramWithRequestBuilder(programId: programId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Get Program
     - GET /api/program/{programId}
     - Returns a program by its id     - examples: [{contentType=application/json, example={
  "_links" : {
    "http://ns.adobe.com/adobecloud/rel/environments" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/repositories" : {
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
    "http://ns.adobe.com/adobecloud/rel/pipelines" : {
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
  "name" : "AcmeCorp Main Site",
  "tenantId" : "acmeCorp",
  "id" : "14",
  "enabled" : false,
  "imsOrgId" : "6522A55453334E247F120101@AdobeOrg"
}, statusCode=200}]
     - parameter programId: (path) Identifier of the program 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 

     - returns: RequestBuilder<Program> 
     */
    public class func getProgramWithRequestBuilder(programId programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) -> RequestBuilder<Program> {
        var path = "/api/program/{programId}"
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
 
        let requestBuilder: RequestBuilder<Program>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true, headers: headerParameters)
    }

    /**
     Lists Programs
     
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getPrograms(xGwImsOrgId xGwImsOrgId: String, authorization: String, xApiKey: String, completion: ((data: ProgramList?, error: ErrorType?) -> Void)) {
        getProgramsWithRequestBuilder(xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Lists Programs
     - GET /api/programs
     - Returns all programs that the requesting user has access to     - examples: [{contentType=application/json, example={
  "_totalNumberOfItems" : 0,
  "_embedded" : {
    "programs" : [ {
      "name" : "AcmeCorp Main Site",
      "tenantId" : "acmeCorp",
      "id" : "14",
      "enabled" : false
    }, {
      "name" : "AcmeCorp Main Site",
      "tenantId" : "acmeCorp",
      "id" : "14",
      "enabled" : false
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
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 

     - returns: RequestBuilder<ProgramList> 
     */
    public class func getProgramsWithRequestBuilder(xGwImsOrgId xGwImsOrgId: String, authorization: String, xApiKey: String) -> RequestBuilder<ProgramList> {
        let path = "/api/programs"
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
 
        let requestBuilder: RequestBuilder<ProgramList>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true, headers: headerParameters)
    }

}
