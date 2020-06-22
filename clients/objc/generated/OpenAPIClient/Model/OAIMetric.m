#import "OAIMetric.h"

@implementation OAIMetric

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.passed = @(NO);
    self.override = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"severity": @"severity", @"passed": @"passed", @"override": @"override", @"actualValue": @"actualValue", @"expectedValue": @"expectedValue", @"comparator": @"comparator", @"kpi": @"kpi" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"severity", @"passed", @"override", @"actualValue", @"expectedValue", @"comparator", @"kpi"];
  return [optionalProperties containsObject:propertyName];
}

@end
