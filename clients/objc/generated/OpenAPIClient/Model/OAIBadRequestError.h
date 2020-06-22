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


#import "OAIInvalidParameter.h"
#import "OAIMissingParameter.h"
@protocol OAIInvalidParameter;
@class OAIInvalidParameter;
@protocol OAIMissingParameter;
@class OAIMissingParameter;



@protocol OAIBadRequestError
@end

@interface OAIBadRequestError : OAIObject

/* HTTP status code of the response. [optional]
 */
@property(nonatomic) NSNumber* status;
/* Error type identifier. [optional]
 */
@property(nonatomic) NSString* type;
/* A short summary of the error. [optional]
 */
@property(nonatomic) NSString* title;
/* Request's missing parameters. [optional]
 */
@property(nonatomic) NSArray<OAIMissingParameter>* missingParams;
/* Request's invalid parameters. [optional]
 */
@property(nonatomic) NSArray<OAIInvalidParameter>* invalidParams;

@end
