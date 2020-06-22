//
// BadRequestError.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/** A Bad Request response error. */
public struct BadRequestError: Codable { 


    /** HTTP status code of the response. */
    public var status: Int?
    /** Error type identifier. */
    public var type: String?
    /** A short summary of the error. */
    public var title: String?
    /** Request&#39;s missing parameters. */
    public var missingParams: [MissingParameter]?
    /** Request&#39;s invalid parameters. */
    public var invalidParams: [InvalidParameter]?

    public init(status: Int?, type: String?, title: String?, missingParams: [MissingParameter]?, invalidParams: [InvalidParameter]?) {
        self.status = status
        self.type = type
        self.title = title
        self.missingParams = missingParams
        self.invalidParams = invalidParams
    }

}
