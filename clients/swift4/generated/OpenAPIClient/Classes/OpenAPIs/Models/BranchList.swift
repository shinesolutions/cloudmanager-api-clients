//
// BranchList.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public struct BranchList: Codable { 


    public var totalNumberOfItems: Int?
    public var embedded: BranchListEmbedded?
    public var links: ProgramListLinks?

    public init(totalNumberOfItems: Int?, embedded: BranchListEmbedded?, links: ProgramListLinks?) {
        self.totalNumberOfItems = totalNumberOfItems
        self.embedded = embedded
        self.links = links
    }

    public enum CodingKeys: String, CodingKey { 
        case totalNumberOfItems = "_totalNumberOfItems"
        case embedded = "_embedded"
        case links = "_links"
    }

}
