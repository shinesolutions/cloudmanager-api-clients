#import "OAIRepositoriesApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIRepository.h"
#import "OAIRepositoryList.h"


@interface OAIRepositoriesApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIRepositoriesApi

NSString* kOAIRepositoriesApiErrorDomain = @"OAIRepositoriesApiErrorDomain";
NSInteger kOAIRepositoriesApiMissingParamErrorCode = 234513;

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
/// Lists Repositories
/// Lists all Repositories in an program
///  @param programId Identifier of the program 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @returns OAIRepositoryList*
///
-(NSURLSessionTask*) getRepositoriesWithProgramId: (NSString*) programId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    completionHandler: (void (^)(OAIRepositoryList* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIRepositoriesApiErrorDomain code:kOAIRepositoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIRepositoriesApiErrorDomain code:kOAIRepositoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIRepositoriesApiErrorDomain code:kOAIRepositoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIRepositoriesApiErrorDomain code:kOAIRepositoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/repositories"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
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
                              responseType: @"OAIRepositoryList*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRepositoryList*)data, error);
                                }
                            }];
}

///
/// Get Repository
/// Returns an repository by its id
///  @param programId Identifier of the program 
///
///  @param repositoryId Identifier of the repository 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @returns OAIRepository*
///
-(NSURLSessionTask*) getRepositoryWithProgramId: (NSString*) programId
    repositoryId: (NSString*) repositoryId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    completionHandler: (void (^)(OAIRepository* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIRepositoriesApiErrorDomain code:kOAIRepositoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == nil) {
        NSParameterAssert(repositoryId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"repositoryId"] };
            NSError* error = [NSError errorWithDomain:kOAIRepositoriesApiErrorDomain code:kOAIRepositoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIRepositoriesApiErrorDomain code:kOAIRepositoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIRepositoriesApiErrorDomain code:kOAIRepositoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIRepositoriesApiErrorDomain code:kOAIRepositoriesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/repository/{repositoryId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (repositoryId != nil) {
        pathParams[@"repositoryId"] = repositoryId;
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
                              responseType: @"OAIRepository*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRepository*)data, error);
                                }
                            }];
}



@end
