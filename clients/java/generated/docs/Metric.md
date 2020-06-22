

# Metric

Describes a __Metric__
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | KPI result identifier |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | Severity of the metric |  [optional]
**passed** | **Boolean** | Whether metric is considered passed |  [optional]
**override** | **Boolean** | Whether user override the failed metric |  [optional]
**actualValue** | **String** | Expected value for the metric |  [optional]
**expectedValue** | **String** | Expected value for the metric |  [optional]
**comparator** | [**ComparatorEnum**](#ComparatorEnum) | Comparator used for the metric |  [optional]
**kpi** | **String** | KPI identifier |  [optional]



## Enum: SeverityEnum

Name | Value
---- | -----
CRITICAL | &quot;critical&quot;
IMPORTANT | &quot;important&quot;
INFORMATIONAL | &quot;informational&quot;



## Enum: ComparatorEnum

Name | Value
---- | -----
GT | &quot;GT&quot;
GTE | &quot;GTE&quot;
LT | &quot;LT&quot;
LTE | &quot;LTE&quot;
EQ | &quot;EQ&quot;
NEQ | &quot;NEQ&quot;



