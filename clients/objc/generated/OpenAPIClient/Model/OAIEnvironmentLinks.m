#import "OAIEnvironmentLinks.h"

@implementation OAIEnvironmentLinks

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"httpNsAdobeComAdobecloudRelProgram": @"http://ns.adobe.com/adobecloud/rel/program", @"httpNsAdobeComAdobecloudRelPipeline": @"http://ns.adobe.com/adobecloud/rel/pipeline", @"httpNsAdobeComAdobecloudRelAuthor": @"http://ns.adobe.com/adobecloud/rel/author", @"httpNsAdobeComAdobecloudRelPublish": @"http://ns.adobe.com/adobecloud/rel/publish", @"httpNsAdobeComAdobecloudRelDeveloperConsole": @"http://ns.adobe.com/adobecloud/rel/developerConsole", @"httpNsAdobeComAdobecloudRelLogs": @"http://ns.adobe.com/adobecloud/rel/logs", @"httpNsAdobeComAdobecloudRelVariables": @"http://ns.adobe.com/adobecloud/rel/variables", @"self": @"self" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"httpNsAdobeComAdobecloudRelProgram", @"httpNsAdobeComAdobecloudRelPipeline", @"httpNsAdobeComAdobecloudRelAuthor", @"httpNsAdobeComAdobecloudRelPublish", @"httpNsAdobeComAdobecloudRelDeveloperConsole", @"httpNsAdobeComAdobecloudRelLogs", @"httpNsAdobeComAdobecloudRelVariables", @"self"];
  return [optionalProperties containsObject:propertyName];
}

@end
