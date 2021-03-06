//
// InvalidParameter.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public struct InvalidParameter: Codable { 


    /** Name of the invalid parameter. */
    public var name: String?
    /** Reason of why the parameter&#39;s value is not accepted. */
    public var reason: String?

    public init(name: String?, reason: String?) {
        self.name = name
        self.reason = reason
    }

}
