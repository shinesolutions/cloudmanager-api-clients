//
// Variable.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/** A named value than can be set on an Environment */
public struct Variable: Codable { 


    public enum ModelType: String, Codable {
        case string = "string"
        case secretstring = "secretString"
    }
    /** Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. */
    public var name: String?
    /** Value of the variable. Read-Write for non-secrets, write-only for secrets. */
    public var value: String?
    /** Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation. */
    public var type: ModelType?

    public init(name: String?, value: String?, type: ModelType?) {
        self.name = name
        self.value = value
        self.type = type
    }

}
