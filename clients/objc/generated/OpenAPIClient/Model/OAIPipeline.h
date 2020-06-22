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


#import "OAIPipelineLinks.h"
#import "OAIPipelinePhase.h"
@protocol OAIPipelineLinks;
@class OAIPipelineLinks;
@protocol OAIPipelinePhase;
@class OAIPipelinePhase;



@protocol OAIPipeline
@end

@interface OAIPipeline : OAIObject

/* Identifier of the pipeline. Unique within the program. [optional]
 */
@property(nonatomic) NSString* _id;
/* Identifier of the program. Unique within the space. [optional]
 */
@property(nonatomic) NSString* programId;
/* Name of the pipeline 
 */
@property(nonatomic) NSString* name;
/* How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} [optional]
 */
@property(nonatomic) NSString* trigger;
/* Pipeline status [optional]
 */
@property(nonatomic) NSString* status;
/* Create date [optional]
 */
@property(nonatomic) NSDate* createdAt;
/* Update date [optional]
 */
@property(nonatomic) NSDate* updatedAt;
/* Last pipeline execution start [optional]
 */
@property(nonatomic) NSDate* lastStartedAt;
/* Last pipeline execution end [optional]
 */
@property(nonatomic) NSDate* lastFinishedAt;
/* Pipeline phases in execution order 
 */
@property(nonatomic) NSArray<OAIPipelinePhase>* phases;

@property(nonatomic) OAIPipelineLinks* links;

@end
