#import "OAIEnvironmentsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIBadRequestError.h"
#import "OAIEnvironment.h"
#import "OAIEnvironmentList.h"
#import "OAIEnvironmentLogs.h"


@interface OAIEnvironmentsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIEnvironmentsApi

NSString* kOAIEnvironmentsApiErrorDomain = @"OAIEnvironmentsApiErrorDomain";
NSInteger kOAIEnvironmentsApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// DeleteEnvironment
/// Delete environment
///  @param programId Identifier of the application 
///
///  @param environmentId Identifier of the environment 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @returns OAIEnvironment*
///
-(NSURLSessionTask*) deleteEnvironmentWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    completionHandler: (void (^)(OAIEnvironment* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == nil) {
        NSParameterAssert(environmentId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"environmentId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/environment/{environmentId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (environmentId != nil) {
        pathParams[@"environmentId"] = environmentId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (xGwImsOrgId != nil) {
        headerParams[@"x-gw-ims-org-id"] = xGwImsOrgId;
    }
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (xApiKey != nil) {
        headerParams[@"x-api-key"] = xApiKey;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIEnvironment*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIEnvironment*)data, error);
                                }
                            }];
}

///
/// Download Logs
/// Download environment logs
///  @param programId Identifier of the program 
///
///  @param environmentId Identifier of the environment 
///
///  @param service Name of service 
///
///  @param name Name of log 
///
///  @param date date for which log is required 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)
///
///  @returns void
///
-(NSURLSessionTask*) downloadLogsWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    service: (NSString*) service
    name: (NSString*) name
    date: (NSString*) date
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    accept: (NSString*) accept
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == nil) {
        NSParameterAssert(environmentId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"environmentId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'service' is set
    if (service == nil) {
        NSParameterAssert(service);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"service"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'date' is set
    if (date == nil) {
        NSParameterAssert(date);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"date"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/environment/{environmentId}/logs/download"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (environmentId != nil) {
        pathParams[@"environmentId"] = environmentId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (service != nil) {
        queryParams[@"service"] = service;
    }
    if (name != nil) {
        queryParams[@"name"] = name;
    }
    if (date != nil) {
        queryParams[@"date"] = date;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (xGwImsOrgId != nil) {
        headerParams[@"x-gw-ims-org-id"] = xGwImsOrgId;
    }
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (xApiKey != nil) {
        headerParams[@"x-api-key"] = xApiKey;
    }
    if (accept != nil) {
        headerParams[@"Accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// Get Environment
/// Returns an environment by its id
///  @param programId Identifier of the program 
///
///  @param environmentId Identifier of the environment 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @returns OAIEnvironment*
///
-(NSURLSessionTask*) getEnvironmentWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    completionHandler: (void (^)(OAIEnvironment* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == nil) {
        NSParameterAssert(environmentId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"environmentId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/environment/{environmentId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (environmentId != nil) {
        pathParams[@"environmentId"] = environmentId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (xGwImsOrgId != nil) {
        headerParams[@"x-gw-ims-org-id"] = xGwImsOrgId;
    }
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (xApiKey != nil) {
        headerParams[@"x-api-key"] = xApiKey;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIEnvironment*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIEnvironment*)data, error);
                                }
                            }];
}

///
/// Get Environment Logs
/// List all logs available in environment
///  @param programId Identifier of the program 
///
///  @param environmentId Identifier of the environment 
///
///  @param days number of days for which logs are required 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @param service Names of services (optional)
///
///  @param name Names of log (optional)
///
///  @returns OAIEnvironmentLogs*
///
-(NSURLSessionTask*) getEnvironmentLogsWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    days: (NSNumber*) days
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    service: (NSArray<NSString*>*) service
    name: (NSArray<NSString*>*) name
    completionHandler: (void (^)(OAIEnvironmentLogs* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'environmentId' is set
    if (environmentId == nil) {
        NSParameterAssert(environmentId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"environmentId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'days' is set
    if (days == nil) {
        NSParameterAssert(days);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"days"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/environment/{environmentId}/logs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (environmentId != nil) {
        pathParams[@"environmentId"] = environmentId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (service != nil) {
        queryParams[@"service"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: service format: @"multi"];
    }
    if (name != nil) {
        queryParams[@"name"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: name format: @"multi"];
    }
    if (days != nil) {
        queryParams[@"days"] = days;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (xGwImsOrgId != nil) {
        headerParams[@"x-gw-ims-org-id"] = xGwImsOrgId;
    }
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (xApiKey != nil) {
        headerParams[@"x-api-key"] = xApiKey;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIEnvironmentLogs*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIEnvironmentLogs*)data, error);
                                }
                            }];
}

///
/// List Environments
/// Lists all environments in an program
///  @param programId Identifier of the program 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @param type Type of the environment (optional)
///
///  @returns OAIEnvironmentList*
///
-(NSURLSessionTask*) getEnvironmentsWithProgramId: (NSString*) programId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    type: (NSString*) type
    completionHandler: (void (^)(OAIEnvironmentList* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIEnvironmentsApiErrorDomain code:kOAIEnvironmentsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/environments"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (type != nil) {
        queryParams[@"type"] = type;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (xGwImsOrgId != nil) {
        headerParams[@"x-gw-ims-org-id"] = xGwImsOrgId;
    }
    if (authorization != nil) {
        headerParams[@"Authorization"] = authorization;
    }
    if (xApiKey != nil) {
        headerParams[@"x-api-key"] = xApiKey;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIEnvironmentList*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIEnvironmentList*)data, error);
                                }
                            }];
}



@end
