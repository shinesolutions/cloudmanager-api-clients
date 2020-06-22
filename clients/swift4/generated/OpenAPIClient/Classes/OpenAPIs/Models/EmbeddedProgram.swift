//
// EmbeddedProgram.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/** Describes an __Embedded Program__ */
public struct EmbeddedProgram: Codable { 


    /** Identifier of the program. Unique within the space. */
    public var id: String?
    /** Name of the program */
    public var name: String?
    /** Whether this Program has been enabled for Cloud Manager usage */
    public var enabled: Bool? = false
    /** Tenant Id */
    public var tenantId: String?

    public init(id: String?, name: String?, enabled: Bool?, tenantId: String?) {
        self.id = id
        self.name = name
        self.enabled = enabled
        self.tenantId = tenantId
    }

}
