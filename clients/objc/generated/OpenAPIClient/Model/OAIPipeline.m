#import "OAIPipeline.h"

@implementation OAIPipeline

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"programId": @"programId", @"name": @"name", @"trigger": @"trigger", @"status": @"status", @"createdAt": @"createdAt", @"updatedAt": @"updatedAt", @"lastStartedAt": @"lastStartedAt", @"lastFinishedAt": @"lastFinishedAt", @"phases": @"phases", @"links": @"_links" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"programId", @"trigger", @"status", @"createdAt", @"updatedAt", @"lastStartedAt", @"lastFinishedAt", @"links"];
  return [optionalProperties containsObject:propertyName];
}

@end
