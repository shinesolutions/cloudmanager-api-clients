#import "OAIEmbeddedProgram.h"

@implementation OAIEmbeddedProgram

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.enabled = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"enabled": @"enabled", @"tenantId": @"tenantId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"name", @"enabled", @"tenantId"];
  return [optionalProperties containsObject:propertyName];
}

@end
