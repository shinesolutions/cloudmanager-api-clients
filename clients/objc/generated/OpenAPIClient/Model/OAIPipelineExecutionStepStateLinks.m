#import "OAIPipelineExecutionStepStateLinks.h"

@implementation OAIPipelineExecutionStepStateLinks

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"httpNsAdobeComAdobecloudRelExecution": @"http://ns.adobe.com/adobecloud/rel/execution", @"httpNsAdobeComAdobecloudRelPipeline": @"http://ns.adobe.com/adobecloud/rel/pipeline", @"httpNsAdobeComAdobecloudRelPipelineLogs": @"http://ns.adobe.com/adobecloud/rel/pipeline/logs", @"httpNsAdobeComAdobecloudRelPipelineMetrics": @"http://ns.adobe.com/adobecloud/rel/pipeline/metrics", @"httpNsAdobeComAdobecloudRelPipelineAdvance": @"http://ns.adobe.com/adobecloud/rel/pipeline/advance", @"httpNsAdobeComAdobecloudRelPipelineCancel": @"http://ns.adobe.com/adobecloud/rel/pipeline/cancel", @"httpNsAdobeComAdobecloudRelProgram": @"http://ns.adobe.com/adobecloud/rel/program", @"self": @"self" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"httpNsAdobeComAdobecloudRelExecution", @"httpNsAdobeComAdobecloudRelPipeline", @"httpNsAdobeComAdobecloudRelPipelineLogs", @"httpNsAdobeComAdobecloudRelPipelineMetrics", @"httpNsAdobeComAdobecloudRelPipelineAdvance", @"httpNsAdobeComAdobecloudRelPipelineCancel", @"httpNsAdobeComAdobecloudRelProgram", @"self"];
  return [optionalProperties containsObject:propertyName];
}

@end
