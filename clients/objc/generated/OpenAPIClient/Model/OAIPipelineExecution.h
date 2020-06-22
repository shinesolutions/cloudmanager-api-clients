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


#import "OAIPipelineExecutionEmbedded.h"
#import "OAIPipelineExecutionLinks.h"
@protocol OAIPipelineExecutionEmbedded;
@class OAIPipelineExecutionEmbedded;
@protocol OAIPipelineExecutionLinks;
@class OAIPipelineExecutionLinks;



@protocol OAIPipelineExecution
@end

@interface OAIPipelineExecution : OAIObject

/* Pipeline execution identifier [optional]
 */
@property(nonatomic) NSString* _id;
/* Identifier of the program. Unique within the space. [optional]
 */
@property(nonatomic) NSString* programId;
/* Identifier of the pipeline. Unique within the space. [optional]
 */
@property(nonatomic) NSString* pipelineId;
/* Version of the artifacts generated during this execution [optional]
 */
@property(nonatomic) NSString* artifactsVersion;
/* AdobeID who started the pipeline. Empty for auto triggered builds [optional]
 */
@property(nonatomic) NSString* user;
/* Status of the execution [optional]
 */
@property(nonatomic) NSString* status;
/* How the execution was triggered. [optional]
 */
@property(nonatomic) NSString* trigger;
/* Start time [optional]
 */
@property(nonatomic) NSDate* createdAt;
/* Date of last status change [optional]
 */
@property(nonatomic) NSDate* updatedAt;
/* Date the execution reached a final state [optional]
 */
@property(nonatomic) NSDate* finishedAt;

@property(nonatomic) OAIPipelineExecutionEmbedded* embedded;

@property(nonatomic) OAIPipelineExecutionLinks* links;

@end
