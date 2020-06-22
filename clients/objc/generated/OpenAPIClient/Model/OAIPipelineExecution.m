#import "OAIPipelineExecution.h"

@implementation OAIPipelineExecution

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"programId": @"programId", @"pipelineId": @"pipelineId", @"artifactsVersion": @"artifactsVersion", @"user": @"user", @"status": @"status", @"trigger": @"trigger", @"createdAt": @"createdAt", @"updatedAt": @"updatedAt", @"finishedAt": @"finishedAt", @"embedded": @"_embedded", @"links": @"_links" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"programId", @"pipelineId", @"artifactsVersion", @"user", @"status", @"trigger", @"createdAt", @"updatedAt", @"finishedAt", @"embedded", @"links"];
  return [optionalProperties containsObject:propertyName];
}

@end
