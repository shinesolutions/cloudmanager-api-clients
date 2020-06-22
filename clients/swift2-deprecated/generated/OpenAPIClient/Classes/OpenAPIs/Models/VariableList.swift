//
// VariableList.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class VariableList: JSONEncodable {
    public var totalNumberOfItems: Int32?
    public var embedded: VariableListEmbedded?
    public var links: VariableListLinks?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["_totalNumberOfItems"] = self.totalNumberOfItems?.encodeToJSON()
        nillableDictionary["_embedded"] = self.embedded?.encodeToJSON()
        nillableDictionary["_links"] = self.links?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
