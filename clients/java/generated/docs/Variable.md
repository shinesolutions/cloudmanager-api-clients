

# Variable

A named value than can be set on an Environment
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. |  [optional]
**value** | **String** | Value of the variable. Read-Write for non-secrets, write-only for secrets. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;
SECRETSTRING | &quot;secretString&quot;



