# NodeAemCloudmanagerApiClient.Metric

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | KPI result identifier | [optional] 
**severity** | **String** | Severity of the metric | [optional] 
**passed** | **Boolean** | Whether metric is considered passed | [optional] [default to false]
**override** | **Boolean** | Whether user override the failed metric | [optional] [default to false]
**actualValue** | **String** | Expected value for the metric | [optional] 
**expectedValue** | **String** | Expected value for the metric | [optional] 
**comparator** | **String** | Comparator used for the metric | [optional] 
**kpi** | **String** | KPI identifier | [optional] 



## Enum: SeverityEnum


* `critical` (value: `"critical"`)

* `important` (value: `"important"`)

* `informational` (value: `"informational"`)





## Enum: ComparatorEnum


* `GT` (value: `"GT"`)

* `GTE` (value: `"GTE"`)

* `LT` (value: `"LT"`)

* `LTE` (value: `"LTE"`)

* `EQ` (value: `"EQ"`)

* `NEQ` (value: `"NEQ"`)




