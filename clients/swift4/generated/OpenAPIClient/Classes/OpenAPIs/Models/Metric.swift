//
// Metric.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/** Describes a __Metric__ */
public struct Metric: Codable { 


    public enum Severity: String, Codable {
        case critical = "critical"
        case important = "important"
        case informational = "informational"
    }
    public enum Comparator: String, Codable {
        case gt = "GT"
        case gte = "GTE"
        case lt = "LT"
        case lte = "LTE"
        case eq = "EQ"
        case neq = "NEQ"
    }
    /** KPI result identifier */
    public var id: String?
    /** Severity of the metric */
    public var severity: Severity?
    /** Whether metric is considered passed */
    public var passed: Bool? = false
    /** Whether user override the failed metric */
    public var _override: Bool? = false
    /** Expected value for the metric */
    public var actualValue: String?
    /** Expected value for the metric */
    public var expectedValue: String?
    /** Comparator used for the metric */
    public var comparator: Comparator?
    /** KPI identifier */
    public var kpi: String?

    public init(id: String?, severity: Severity?, passed: Bool?, _override: Bool?, actualValue: String?, expectedValue: String?, comparator: Comparator?, kpi: String?) {
        self.id = id
        self.severity = severity
        self.passed = passed
        self._override = _override
        self.actualValue = actualValue
        self.expectedValue = expectedValue
        self.comparator = comparator
        self.kpi = kpi
    }

    public enum CodingKeys: String, CodingKey { 
        case id
        case severity
        case passed
        case _override = "override"
        case actualValue
        case expectedValue
        case comparator
        case kpi
    }

}
