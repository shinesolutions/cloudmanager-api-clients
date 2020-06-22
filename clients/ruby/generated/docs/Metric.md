# AemCloudManagerApiClient::Metric

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | KPI result identifier | [optional] 
**severity** | **String** | Severity of the metric | [optional] 
**passed** | **Boolean** | Whether metric is considered passed | [optional] [default to false]
**override** | **Boolean** | Whether user override the failed metric | [optional] [default to false]
**actual_value** | **String** | Expected value for the metric | [optional] 
**expected_value** | **String** | Expected value for the metric | [optional] 
**comparator** | **String** | Comparator used for the metric | [optional] 
**kpi** | **String** | KPI identifier | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::Metric.new(id: null,
                                 severity: null,
                                 passed: null,
                                 override: null,
                                 actual_value: null,
                                 expected_value: null,
                                 comparator: null,
                                 kpi: null)
```


