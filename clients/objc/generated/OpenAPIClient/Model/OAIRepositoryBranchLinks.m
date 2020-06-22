#import "OAIRepositoryBranchLinks.h"

@implementation OAIRepositoryBranchLinks

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"httpNsAdobeComAdobecloudRelProgram": @"http://ns.adobe.com/adobecloud/rel/program", @"httpNsAdobeComAdobecloudRelRepository": @"http://ns.adobe.com/adobecloud/rel/repository" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"httpNsAdobeComAdobecloudRelProgram", @"httpNsAdobeComAdobecloudRelRepository"];
  return [optionalProperties containsObject:propertyName];
}

@end
