#import "OAIProgramLinks.h"

@implementation OAIProgramLinks

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"httpNsAdobeComAdobecloudRelPipelines": @"http://ns.adobe.com/adobecloud/rel/pipelines", @"httpNsAdobeComAdobecloudRelEnvironments": @"http://ns.adobe.com/adobecloud/rel/environments", @"httpNsAdobeComAdobecloudRelRepositories": @"http://ns.adobe.com/adobecloud/rel/repositories", @"self": @"self" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"httpNsAdobeComAdobecloudRelPipelines", @"httpNsAdobeComAdobecloudRelEnvironments", @"httpNsAdobeComAdobecloudRelRepositories", @"self"];
  return [optionalProperties containsObject:propertyName];
}

@end
