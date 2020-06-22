#import "OAIPipelineExecutionApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIPipelineExecution.h"
#import "OAIPipelineExecutionListRepresentation.h"
#import "OAIPipelineExecutionStepState.h"
#import "OAIPipelineStepMetrics.h"


@interface OAIPipelineExecutionApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIPipelineExecutionApi

NSString* kOAIPipelineExecutionApiErrorDomain = @"OAIPipelineExecutionApiErrorDomain";
NSInteger kOAIPipelineExecutionApiMissingParamErrorCode = 234513;

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
/// Advance
/// Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
///  @param programId Identifier of the program. 
///
///  @param pipelineId Identifier of the pipeline 
///
///  @param executionId Identifier of the execution 
///
///  @param phaseId Identifier of the phase 
///
///  @param stepId Identifier of the step 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @param contentType Must always be application/json 
///
///  @param body Input for advance. See documentation for details. 
///
///  @returns void
///
-(NSURLSessionTask*) advancePipelineExecutionWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    contentType: (NSString*) contentType
    body: (NSObject*) body
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == nil) {
        NSParameterAssert(pipelineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pipelineId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'executionId' is set
    if (executionId == nil) {
        NSParameterAssert(executionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"executionId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'phaseId' is set
    if (phaseId == nil) {
        NSParameterAssert(phaseId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phaseId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'stepId' is set
    if (stepId == nil) {
        NSParameterAssert(stepId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"stepId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'contentType' is set
    if (contentType == nil) {
        NSParameterAssert(contentType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"contentType"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (pipelineId != nil) {
        pathParams[@"pipelineId"] = pipelineId;
    }
    if (executionId != nil) {
        pathParams[@"executionId"] = executionId;
    }
    if (phaseId != nil) {
        pathParams[@"phaseId"] = phaseId;
    }
    if (stepId != nil) {
        pathParams[@"stepId"] = stepId;
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
    if (contentType != nil) {
        headerParams[@"Content-Type"] = contentType;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
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
/// Cancel
/// Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
///  @param programId Identifier of the program. 
///
///  @param pipelineId Identifier of the pipeline 
///
///  @param executionId Identifier of the execution 
///
///  @param phaseId Identifier of the phase 
///
///  @param stepId Identifier of the step 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @param contentType Must always be application/json 
///
///  @param body Input for advance. See documentation for details. 
///
///  @returns void
///
-(NSURLSessionTask*) cancelPipelineExecutionStepWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    contentType: (NSString*) contentType
    body: (NSObject*) body
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == nil) {
        NSParameterAssert(pipelineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pipelineId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'executionId' is set
    if (executionId == nil) {
        NSParameterAssert(executionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"executionId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'phaseId' is set
    if (phaseId == nil) {
        NSParameterAssert(phaseId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phaseId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'stepId' is set
    if (stepId == nil) {
        NSParameterAssert(stepId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"stepId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'contentType' is set
    if (contentType == nil) {
        NSParameterAssert(contentType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"contentType"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'body' is set
    if (body == nil) {
        NSParameterAssert(body);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"body"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (pipelineId != nil) {
        pathParams[@"pipelineId"] = pipelineId;
    }
    if (executionId != nil) {
        pathParams[@"executionId"] = executionId;
    }
    if (phaseId != nil) {
        pathParams[@"phaseId"] = phaseId;
    }
    if (stepId != nil) {
        pathParams[@"stepId"] = stepId;
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
    if (contentType != nil) {
        headerParams[@"Content-Type"] = contentType;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = body;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
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
/// Get current pipeline execution
/// Returns current pipeline execution if any.
///  @param programId Identifier of the program. 
///
///  @param pipelineId Identifier of the pipeline 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @returns OAIPipelineExecution*
///
-(NSURLSessionTask*) getCurrentExecutionWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    completionHandler: (void (^)(OAIPipelineExecution* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == nil) {
        NSParameterAssert(pipelineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pipelineId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/pipeline/{pipelineId}/execution"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (pipelineId != nil) {
        pathParams[@"pipelineId"] = pipelineId;
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
                              responseType: @"OAIPipelineExecution*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPipelineExecution*)data, error);
                                }
                            }];
}

///
/// Get pipeline execution
/// Returns a pipeline execution by id
///  @param programId Identifier of the program. 
///
///  @param pipelineId Identifier of the pipeline 
///
///  @param executionId Identifier of the execution 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @returns OAIPipelineExecution*
///
-(NSURLSessionTask*) getExecutionWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    completionHandler: (void (^)(OAIPipelineExecution* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == nil) {
        NSParameterAssert(pipelineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pipelineId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'executionId' is set
    if (executionId == nil) {
        NSParameterAssert(executionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"executionId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (pipelineId != nil) {
        pathParams[@"pipelineId"] = pipelineId;
    }
    if (executionId != nil) {
        pathParams[@"executionId"] = executionId;
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
                              responseType: @"OAIPipelineExecution*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPipelineExecution*)data, error);
                                }
                            }];
}

///
/// List Executions
/// Returns the history of pipeline executions in a newest to oldest order
///  @param programId Identifier of the program. 
///
///  @param pipelineId Identifier of the pipeline 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @param start Pagination start parameter (optional)
///
///  @param limit Pagination limit parameter (optional)
///
///  @returns OAIPipelineExecutionListRepresentation*
///
-(NSURLSessionTask*) getExecutionsWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    start: (NSString*) start
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAIPipelineExecutionListRepresentation* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == nil) {
        NSParameterAssert(pipelineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pipelineId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/pipeline/{pipelineId}/executions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (pipelineId != nil) {
        pathParams[@"pipelineId"] = pipelineId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (start != nil) {
        queryParams[@"start"] = start;
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAIPipelineExecutionListRepresentation*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPipelineExecutionListRepresentation*)data, error);
                                }
                            }];
}

///
/// Get logs
/// Get the logs associated with a step.
///  @param programId Identifier of the program. 
///
///  @param pipelineId Identifier of the pipeline 
///
///  @param executionId Identifier of the execution 
///
///  @param phaseId Identifier of the phase 
///
///  @param stepId Identifier of the step 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @param file Identifier of the log file (optional)
///
///  @param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)
///
///  @returns void
///
-(NSURLSessionTask*) getStepLogsWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    file: (NSString*) file
    accept: (NSString*) accept
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == nil) {
        NSParameterAssert(pipelineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pipelineId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'executionId' is set
    if (executionId == nil) {
        NSParameterAssert(executionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"executionId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'phaseId' is set
    if (phaseId == nil) {
        NSParameterAssert(phaseId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phaseId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'stepId' is set
    if (stepId == nil) {
        NSParameterAssert(stepId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"stepId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (pipelineId != nil) {
        pathParams[@"pipelineId"] = pipelineId;
    }
    if (executionId != nil) {
        pathParams[@"executionId"] = executionId;
    }
    if (phaseId != nil) {
        pathParams[@"phaseId"] = phaseId;
    }
    if (stepId != nil) {
        pathParams[@"stepId"] = stepId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (file != nil) {
        queryParams[@"file"] = file;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (accept != nil) {
        headerParams[@"Accept"] = accept;
    }
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
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[]];
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
/// Start the pipeline
/// Starts the Pipeline. This works only if the pipeline is not already started.
///  @param programId Identifier of the program. 
///
///  @param pipelineId Identifier of the pipeline 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @param contentType Must always be application/json 
///
///  @returns void
///
-(NSURLSessionTask*) startPipelineWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    contentType: (NSString*) contentType
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == nil) {
        NSParameterAssert(pipelineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pipelineId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'contentType' is set
    if (contentType == nil) {
        NSParameterAssert(contentType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"contentType"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/pipeline/{pipelineId}/execution"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (pipelineId != nil) {
        pathParams[@"pipelineId"] = pipelineId;
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
    if (contentType != nil) {
        headerParams[@"Content-Type"] = contentType;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[]];
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
                                    method: @"PUT"
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
/// Get step metrics
/// 
///  @param programId Identifier of the program. 
///
///  @param pipelineId Identifier of the pipeline 
///
///  @param executionId Identifier of the execution 
///
///  @param phaseId Identifier of the phase 
///
///  @param stepId Identifier of the step 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @returns OAIPipelineStepMetrics*
///
-(NSURLSessionTask*) stepMetricWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    completionHandler: (void (^)(OAIPipelineStepMetrics* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == nil) {
        NSParameterAssert(pipelineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pipelineId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'executionId' is set
    if (executionId == nil) {
        NSParameterAssert(executionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"executionId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'phaseId' is set
    if (phaseId == nil) {
        NSParameterAssert(phaseId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phaseId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'stepId' is set
    if (stepId == nil) {
        NSParameterAssert(stepId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"stepId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (pipelineId != nil) {
        pathParams[@"pipelineId"] = pipelineId;
    }
    if (executionId != nil) {
        pathParams[@"executionId"] = executionId;
    }
    if (phaseId != nil) {
        pathParams[@"phaseId"] = phaseId;
    }
    if (stepId != nil) {
        pathParams[@"stepId"] = stepId;
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
                              responseType: @"OAIPipelineStepMetrics*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPipelineStepMetrics*)data, error);
                                }
                            }];
}

///
/// Get step state
/// 
///  @param programId Identifier of the program. 
///
///  @param pipelineId Identifier of the pipeline 
///
///  @param executionId Identifier of the execution 
///
///  @param phaseId Identifier of the phase 
///
///  @param stepId Identifier of the step 
///
///  @param xGwImsOrgId IMS organization ID that the request is being made under. 
///
///  @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
///
///  @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
///
///  @returns OAIPipelineExecutionStepState*
///
-(NSURLSessionTask*) stepStateWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    completionHandler: (void (^)(OAIPipelineExecutionStepState* output, NSError* error)) handler {
    // verify the required parameter 'programId' is set
    if (programId == nil) {
        NSParameterAssert(programId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"programId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pipelineId' is set
    if (pipelineId == nil) {
        NSParameterAssert(pipelineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pipelineId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'executionId' is set
    if (executionId == nil) {
        NSParameterAssert(executionId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"executionId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'phaseId' is set
    if (phaseId == nil) {
        NSParameterAssert(phaseId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"phaseId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'stepId' is set
    if (stepId == nil) {
        NSParameterAssert(stepId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"stepId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == nil) {
        NSParameterAssert(xGwImsOrgId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xGwImsOrgId"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorization' is set
    if (authorization == nil) {
        NSParameterAssert(authorization);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorization"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'xApiKey' is set
    if (xApiKey == nil) {
        NSParameterAssert(xApiKey);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"xApiKey"] };
            NSError* error = [NSError errorWithDomain:kOAIPipelineExecutionApiErrorDomain code:kOAIPipelineExecutionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (programId != nil) {
        pathParams[@"programId"] = programId;
    }
    if (pipelineId != nil) {
        pathParams[@"pipelineId"] = pipelineId;
    }
    if (executionId != nil) {
        pathParams[@"executionId"] = executionId;
    }
    if (phaseId != nil) {
        pathParams[@"phaseId"] = phaseId;
    }
    if (stepId != nil) {
        pathParams[@"stepId"] = stepId;
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
                              responseType: @"OAIPipelineExecutionStepState*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPipelineExecutionStepState*)data, error);
                                }
                            }];
}



@end
