#import "OAIPipelineLinks.h"

@implementation OAIPipelineLinks

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"httpNsAdobeComAdobecloudRelProgram": @"http://ns.adobe.com/adobecloud/rel/program", @"httpNsAdobeComAdobecloudRelExecution": @"http://ns.adobe.com/adobecloud/rel/execution", @"httpNsAdobeComAdobecloudRelExecutions": @"http://ns.adobe.com/adobecloud/rel/executions", @"httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution": @"http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution", @"self": @"self" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"httpNsAdobeComAdobecloudRelProgram", @"httpNsAdobeComAdobecloudRelExecution", @"httpNsAdobeComAdobecloudRelExecutions", @"httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution", @"self"];
  return [optionalProperties containsObject:propertyName];
}

@end
