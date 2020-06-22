#import "OAIHalLink.h"

@implementation OAIHalLink

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.templated = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"href": @"href", @"templated": @"templated", @"type": @"type", @"deprecation": @"deprecation", @"profile": @"profile", @"title": @"title", @"hreflang": @"hreflang", @"name": @"name" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"href", @"templated", @"type", @"deprecation", @"profile", @"title", @"hreflang", @"name"];
  return [optionalProperties containsObject:propertyName];
}

@end
