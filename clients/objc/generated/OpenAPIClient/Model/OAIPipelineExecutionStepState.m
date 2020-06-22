#import "OAIPipelineExecutionStepState.h"

@implementation OAIPipelineExecutionStepState

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"stepId": @"stepId", @"phaseId": @"phaseId", @"action": @"action", @"repository": @"repository", @"branch": @"branch", @"environment": @"environment", @"environmentType": @"environmentType", @"startedAt": @"startedAt", @"finishedAt": @"finishedAt", @"details": @"details", @"status": @"status", @"links": @"_links" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"stepId", @"phaseId", @"action", @"repository", @"branch", @"environment", @"environmentType", @"startedAt", @"finishedAt", @"details", @"status", @"links"];
  return [optionalProperties containsObject:propertyName];
}

@end
