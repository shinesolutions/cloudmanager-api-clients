//
// VariablesAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



open class VariablesAPI {
    /**
     List User Environment Variables
     
     - parameter programId: (path) Identifier of the program 
     - parameter environmentId: (path) Identifier of the environment 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping ((_ data: VariableList?,_ error: Error?) -> Void)) {
        getEnvironmentVariablesWithRequestBuilder(programId: programId, environmentId: environmentId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     List User Environment Variables
     - GET /api/program/{programId}/environment/{environmentId}/variables
     - List the user defined variables for an environment (Cloud Service only).
     - parameter programId: (path) Identifier of the program 
     - parameter environmentId: (path) Identifier of the environment 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - returns: RequestBuilder<VariableList> 
     */
    open class func getEnvironmentVariablesWithRequestBuilder(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) -> RequestBuilder<VariableList> {
        var path = "/api/program/{programId}/environment/{environmentId}/variables"
        let programIdPreEscape = "\(APIHelper.mapValueToPathItem(programId))"
        let programIdPostEscape = programIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{programId}", with: programIdPostEscape, options: .literal, range: nil)
        let environmentIdPreEscape = "\(APIHelper.mapValueToPathItem(environmentId))"
        let environmentIdPostEscape = environmentIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{environmentId}", with: environmentIdPostEscape, options: .literal, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)
        let nillableHeaders: [String: Any?] = [
            "x-gw-ims-org-id": xGwImsOrgId.encodeToJSON(),
            "Authorization": authorization.encodeToJSON(),
            "x-api-key": xApiKey.encodeToJSON()
        ]
        let headerParameters = APIHelper.rejectNilHeaders(nillableHeaders)

        let requestBuilder: RequestBuilder<VariableList>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false, headers: headerParameters)
    }

    /**
     Patch User Environment Variables
     
     - parameter programId: (path) Identifier of the program 
     - parameter environmentId: (path) Identifier of the environment 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter contentType: (header) Must always be application/json 
     - parameter body: (body) The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func patchEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: [Variable], completion: @escaping ((_ data: VariableList?,_ error: Error?) -> Void)) {
        patchEnvironmentVariablesWithRequestBuilder(programId: programId, environmentId: environmentId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, contentType: contentType, body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }

    /**
     Patch User Environment Variables
     - PATCH /api/program/{programId}/environment/{environmentId}/variables
     - Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
     - parameter programId: (path) Identifier of the program 
     - parameter environmentId: (path) Identifier of the environment 
     - parameter xGwImsOrgId: (header) IMS organization ID that the request is being made under. 
     - parameter authorization: (header) Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     - parameter xApiKey: (header) IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     - parameter contentType: (header) Must always be application/json 
     - parameter body: (body) The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. 
     - returns: RequestBuilder<VariableList> 
     */
    open class func patchEnvironmentVariablesWithRequestBuilder(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: [Variable]) -> RequestBuilder<VariableList> {
        var path = "/api/program/{programId}/environment/{environmentId}/variables"
        let programIdPreEscape = "\(APIHelper.mapValueToPathItem(programId))"
        let programIdPostEscape = programIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{programId}", with: programIdPostEscape, options: .literal, range: nil)
        let environmentIdPreEscape = "\(APIHelper.mapValueToPathItem(environmentId))"
        let environmentIdPostEscape = environmentIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{environmentId}", with: environmentIdPostEscape, options: .literal, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let url = URLComponents(string: URLString)
        let nillableHeaders: [String: Any?] = [
            "x-gw-ims-org-id": xGwImsOrgId.encodeToJSON(),
            "Authorization": authorization.encodeToJSON(),
            "x-api-key": xApiKey.encodeToJSON(),
            "Content-Type": contentType.encodeToJSON()
        ]
        let headerParameters = APIHelper.rejectNilHeaders(nillableHeaders)

        let requestBuilder: RequestBuilder<VariableList>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true, headers: headerParameters)
    }

}
