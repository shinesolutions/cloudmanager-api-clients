# AemCloudManagerApiClient::VariableListEmbedded

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**variables** | [**Array&lt;Variable&gt;**](Variable.md) | Variables set on environment | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::VariableListEmbedded.new(variables: [{ &#39;name&#39;:&#39;variable1Name&#39;, &#39;value&#39;:&#39;variable1Value&#39;}, { &#39;name&#39;:&#39;variable2Name&#39;, &#39;type&#39;:&#39;secretString&#39;, &#39;value&#39;:&#39;variable2SecretValue&#39;}])
```


