
# Metric

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | KPI result identifier |  [optional]
**severity** | [**inline**](#SeverityEnum) | Severity of the metric |  [optional]
**passed** | **kotlin.Boolean** | Whether metric is considered passed |  [optional]
**override** | **kotlin.Boolean** | Whether user override the failed metric |  [optional]
**actualValue** | **kotlin.String** | Expected value for the metric |  [optional]
**expectedValue** | **kotlin.String** | Expected value for the metric |  [optional]
**comparator** | [**inline**](#ComparatorEnum) | Comparator used for the metric |  [optional]
**kpi** | **kotlin.String** | KPI identifier |  [optional]


<a name="SeverityEnum"></a>
## Enum: severity
Name | Value
---- | -----
severity | critical, important, informational


<a name="ComparatorEnum"></a>
## Enum: comparator
Name | Value
---- | -----
comparator | GT, GTE, LT, LTE, EQ, NEQ



