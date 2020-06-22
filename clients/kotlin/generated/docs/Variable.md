
# Variable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. |  [optional]
**value** | **kotlin.String** | Value of the variable. Read-Write for non-secrets, write-only for secrets. |  [optional]
**type** | [**inline**](#TypeEnum) | Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation. |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | string, secretString



