//
// PipelineExecutionListRepresentationEmbedded.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class PipelineExecutionListRepresentationEmbedded: JSONEncodable {
    public var executions: [PipelineExecution]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["executions"] = self.executions?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
