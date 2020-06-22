#import "OAIVariableListLinks.h"

@implementation OAIVariableListLinks

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"httpNsAdobeComAdobecloudRelEnvironment": @"http://ns.adobe.com/adobecloud/rel/environment", @"httpNsAdobeComAdobecloudRelProgram": @"http://ns.adobe.com/adobecloud/rel/program", @"self": @"self" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"httpNsAdobeComAdobecloudRelEnvironment", @"httpNsAdobeComAdobecloudRelProgram", @"self"];
  return [optionalProperties containsObject:propertyName];
}

@end
