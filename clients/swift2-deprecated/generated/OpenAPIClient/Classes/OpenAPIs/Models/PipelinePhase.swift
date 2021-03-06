//
// PipelinePhase.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Describes a phase of a pipeline */
public class PipelinePhase: JSONEncodable {
    public enum ModelType: String { 
        case Validate = "VALIDATE"
        case Build = "BUILD"
        case Deploy = "DEPLOY"
    }
    /** Name of the phase */
    public var name: String?
    /** Type of the phase */
    public var type: ModelType?
    /** Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD */
    public var repositoryId: String?
    /** Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing. */
    public var branch: String?
    /** Identifier of the target environment. Mandatory if type&#x3D;DEPLOY */
    public var environmentId: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["name"] = self.name
        nillableDictionary["type"] = self.type?.rawValue
        nillableDictionary["repositoryId"] = self.repositoryId
        nillableDictionary["branch"] = self.branch
        nillableDictionary["environmentId"] = self.environmentId
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
