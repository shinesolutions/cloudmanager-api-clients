# openapi::Metric

Describes a __Metric__
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | KPI result identifier | [optional] 
**severity** | **character** | Severity of the metric | [optional] 
**passed** | **character** | Whether metric is considered passed | [optional] [default to FALSE]
**override** | **character** | Whether user override the failed metric | [optional] [default to FALSE]
**actualValue** | **character** | Expected value for the metric | [optional] 
**expectedValue** | **character** | Expected value for the metric | [optional] 
**comparator** | **character** | Comparator used for the metric | [optional] 
**kpi** | **character** | KPI identifier | [optional] 


