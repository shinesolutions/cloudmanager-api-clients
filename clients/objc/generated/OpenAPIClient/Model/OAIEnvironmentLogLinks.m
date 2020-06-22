#import "OAIEnvironmentLogLinks.h"

@implementation OAIEnvironmentLogLinks

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"httpNsAdobeComAdobecloudRelLogsDownload": @"http://ns.adobe.com/adobecloud/rel/logs/download", @"httpNsAdobeComAdobecloudRelLogsTail": @"http://ns.adobe.com/adobecloud/rel/logs/tail" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"httpNsAdobeComAdobecloudRelLogsDownload", @"httpNsAdobeComAdobecloudRelLogsTail"];
  return [optionalProperties containsObject:propertyName];
}

@end
