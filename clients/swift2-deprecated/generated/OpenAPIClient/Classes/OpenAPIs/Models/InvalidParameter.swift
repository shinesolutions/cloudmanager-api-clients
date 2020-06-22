//
// InvalidParameter.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class InvalidParameter: JSONEncodable {
    /** Name of the invalid parameter. */
    public var name: String?
    /** Reason of why the parameter&#39;s value is not accepted. */
    public var reason: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["name"] = self.name
        nillableDictionary["reason"] = self.reason
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
