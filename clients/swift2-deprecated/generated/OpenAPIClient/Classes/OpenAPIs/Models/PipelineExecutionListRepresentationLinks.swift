//
// PipelineExecutionListRepresentationLinks.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class PipelineExecutionListRepresentationLinks: JSONEncodable {
    public var next: HalLink?
    public var page: HalLink?
    public var prev: HalLink?
    public var _self: HalLink?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["next"] = self.next?.encodeToJSON()
        nillableDictionary["page"] = self.page?.encodeToJSON()
        nillableDictionary["prev"] = self.prev?.encodeToJSON()
        nillableDictionary["self"] = self._self?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
