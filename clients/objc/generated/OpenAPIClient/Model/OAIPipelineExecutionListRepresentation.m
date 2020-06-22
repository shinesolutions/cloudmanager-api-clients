#import "OAIPipelineExecutionListRepresentation.h"

@implementation OAIPipelineExecutionListRepresentation

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"totalNumberOfItems": @"_totalNumberOfItems", @"page": @"_page", @"embedded": @"_embedded", @"links": @"_links" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"totalNumberOfItems", @"page", @"embedded", @"links"];
  return [optionalProperties containsObject:propertyName];
}

@end
