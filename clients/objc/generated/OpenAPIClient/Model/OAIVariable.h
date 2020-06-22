#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Cloud Manager API
* This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
*
* The version of the OpenAPI document: 1.0.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/





@protocol OAIVariable
@end

@interface OAIVariable : OAIObject

/* Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. [optional]
 */
@property(nonatomic) NSString* name;
/* Value of the variable. Read-Write for non-secrets, write-only for secrets. [optional]
 */
@property(nonatomic) NSString* value;
/* Type of the variable. Default `string` if missing. Cannot be changed after creation. [optional]
 */
@property(nonatomic) NSString* type;

@end
