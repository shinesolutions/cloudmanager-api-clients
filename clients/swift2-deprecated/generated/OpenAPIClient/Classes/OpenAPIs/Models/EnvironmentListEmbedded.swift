//
// EnvironmentListEmbedded.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class EnvironmentListEmbedded: JSONEncodable {
    public var environments: [Environment]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["environments"] = self.environments?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
