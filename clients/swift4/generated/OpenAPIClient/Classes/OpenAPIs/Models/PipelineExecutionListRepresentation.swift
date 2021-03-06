//
// PipelineExecutionListRepresentation.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/** List of pipeline executions */
public struct PipelineExecutionListRepresentation: Codable { 


    public var totalNumberOfItems: Int?
    public var page: RequestedPageDetails?
    public var embedded: PipelineExecutionListRepresentationEmbedded?
    public var links: PipelineExecutionListRepresentationLinks?

    public init(totalNumberOfItems: Int?, page: RequestedPageDetails?, embedded: PipelineExecutionListRepresentationEmbedded?, links: PipelineExecutionListRepresentationLinks?) {
        self.totalNumberOfItems = totalNumberOfItems
        self.page = page
        self.embedded = embedded
        self.links = links
    }

    public enum CodingKeys: String, CodingKey { 
        case totalNumberOfItems = "_totalNumberOfItems"
        case page = "_page"
        case embedded = "_embedded"
        case links = "_links"
    }

}
