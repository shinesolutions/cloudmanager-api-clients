# openapi::Variable

A named value than can be set on an Environment
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** | Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. | [optional] 
**value** | **character** | Value of the variable. Read-Write for non-secrets, write-only for secrets. | [optional] 
**type** | **character** | Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation. | [optional] 


