#import "OAIRequestedPageDetails.h"

@implementation OAIRequestedPageDetails

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"start": @"start", @"limit": @"limit", @"orderBy": @"orderBy", @"_property": @"property", @"type": @"type", @"next": @"next", @"prev": @"prev" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"start", @"limit", @"orderBy", @"_property", @"type", @"next", @"prev"];
  return [optionalProperties containsObject:propertyName];
}

@end
