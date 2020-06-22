# AemCloudManagerApiClient::Variable

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. | [optional] 
**value** | **String** | Value of the variable. Read-Write for non-secrets, write-only for secrets. | [optional] 
**type** | **String** | Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation. | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::Variable.new(name: MY_VAR1,
                                 value: myValue,
                                 type: string)
```


