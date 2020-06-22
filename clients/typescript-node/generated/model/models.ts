export * from './badRequestError';
export * from './branchList';
export * from './branchListEmbedded';
export * from './embeddedProgram';
export * from './environment';
export * from './environmentLinks';
export * from './environmentList';
export * from './environmentListEmbedded';
export * from './environmentLog';
export * from './environmentLogLinks';
export * from './environmentLogs';
export * from './environmentLogsEmbedded';
export * from './environmentLogsLinks';
export * from './halLink';
export * from './invalidParameter';
export * from './metric';
export * from './missingParameter';
export * from './pipeline';
export * from './pipelineExecution';
export * from './pipelineExecutionEmbedded';
export * from './pipelineExecutionLinks';
export * from './pipelineExecutionListRepresentation';
export * from './pipelineExecutionListRepresentationEmbedded';
export * from './pipelineExecutionListRepresentationLinks';
export * from './pipelineExecutionStepState';
export * from './pipelineExecutionStepStateLinks';
export * from './pipelineLinks';
export * from './pipelineList';
export * from './pipelineListEmbedded';
export * from './pipelinePhase';
export * from './pipelineStepMetrics';
export * from './program';
export * from './programLinks';
export * from './programList';
export * from './programListEmbedded';
export * from './programListLinks';
export * from './repository';
export * from './repositoryBranch';
export * from './repositoryBranchLinks';
export * from './repositoryLinks';
export * from './repositoryList';
export * from './repositoryListEmbedded';
export * from './requestedPageDetails';
export * from './variable';
export * from './variableList';
export * from './variableListEmbedded';
export * from './variableListLinks';

import localVarRequest = require('request');

import { BadRequestError } from './badRequestError';
import { BranchList } from './branchList';
import { BranchListEmbedded } from './branchListEmbedded';
import { EmbeddedProgram } from './embeddedProgram';
import { Environment } from './environment';
import { EnvironmentLinks } from './environmentLinks';
import { EnvironmentList } from './environmentList';
import { EnvironmentListEmbedded } from './environmentListEmbedded';
import { EnvironmentLog } from './environmentLog';
import { EnvironmentLogLinks } from './environmentLogLinks';
import { EnvironmentLogs } from './environmentLogs';
import { EnvironmentLogsEmbedded } from './environmentLogsEmbedded';
import { EnvironmentLogsLinks } from './environmentLogsLinks';
import { HalLink } from './halLink';
import { InvalidParameter } from './invalidParameter';
import { Metric } from './metric';
import { MissingParameter } from './missingParameter';
import { Pipeline } from './pipeline';
import { PipelineExecution } from './pipelineExecution';
import { PipelineExecutionEmbedded } from './pipelineExecutionEmbedded';
import { PipelineExecutionLinks } from './pipelineExecutionLinks';
import { PipelineExecutionListRepresentation } from './pipelineExecutionListRepresentation';
import { PipelineExecutionListRepresentationEmbedded } from './pipelineExecutionListRepresentationEmbedded';
import { PipelineExecutionListRepresentationLinks } from './pipelineExecutionListRepresentationLinks';
import { PipelineExecutionStepState } from './pipelineExecutionStepState';
import { PipelineExecutionStepStateLinks } from './pipelineExecutionStepStateLinks';
import { PipelineLinks } from './pipelineLinks';
import { PipelineList } from './pipelineList';
import { PipelineListEmbedded } from './pipelineListEmbedded';
import { PipelinePhase } from './pipelinePhase';
import { PipelineStepMetrics } from './pipelineStepMetrics';
import { Program } from './program';
import { ProgramLinks } from './programLinks';
import { ProgramList } from './programList';
import { ProgramListEmbedded } from './programListEmbedded';
import { ProgramListLinks } from './programListLinks';
import { Repository } from './repository';
import { RepositoryBranch } from './repositoryBranch';
import { RepositoryBranchLinks } from './repositoryBranchLinks';
import { RepositoryLinks } from './repositoryLinks';
import { RepositoryList } from './repositoryList';
import { RepositoryListEmbedded } from './repositoryListEmbedded';
import { RequestedPageDetails } from './requestedPageDetails';
import { Variable } from './variable';
import { VariableList } from './variableList';
import { VariableListEmbedded } from './variableListEmbedded';
import { VariableListLinks } from './variableListLinks';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "Environment.TypeEnum": Environment.TypeEnum,
        "Metric.SeverityEnum": Metric.SeverityEnum,
        "Metric.ComparatorEnum": Metric.ComparatorEnum,
        "Pipeline.TriggerEnum": Pipeline.TriggerEnum,
        "Pipeline.StatusEnum": Pipeline.StatusEnum,
        "PipelineExecution.StatusEnum": PipelineExecution.StatusEnum,
        "PipelineExecution.TriggerEnum": PipelineExecution.TriggerEnum,
        "PipelineExecutionStepState.StatusEnum": PipelineExecutionStepState.StatusEnum,
        "PipelinePhase.TypeEnum": PipelinePhase.TypeEnum,
        "Variable.TypeEnum": Variable.TypeEnum,
}

let typeMap: {[index: string]: any} = {
    "BadRequestError": BadRequestError,
    "BranchList": BranchList,
    "BranchListEmbedded": BranchListEmbedded,
    "EmbeddedProgram": EmbeddedProgram,
    "Environment": Environment,
    "EnvironmentLinks": EnvironmentLinks,
    "EnvironmentList": EnvironmentList,
    "EnvironmentListEmbedded": EnvironmentListEmbedded,
    "EnvironmentLog": EnvironmentLog,
    "EnvironmentLogLinks": EnvironmentLogLinks,
    "EnvironmentLogs": EnvironmentLogs,
    "EnvironmentLogsEmbedded": EnvironmentLogsEmbedded,
    "EnvironmentLogsLinks": EnvironmentLogsLinks,
    "HalLink": HalLink,
    "InvalidParameter": InvalidParameter,
    "Metric": Metric,
    "MissingParameter": MissingParameter,
    "Pipeline": Pipeline,
    "PipelineExecution": PipelineExecution,
    "PipelineExecutionEmbedded": PipelineExecutionEmbedded,
    "PipelineExecutionLinks": PipelineExecutionLinks,
    "PipelineExecutionListRepresentation": PipelineExecutionListRepresentation,
    "PipelineExecutionListRepresentationEmbedded": PipelineExecutionListRepresentationEmbedded,
    "PipelineExecutionListRepresentationLinks": PipelineExecutionListRepresentationLinks,
    "PipelineExecutionStepState": PipelineExecutionStepState,
    "PipelineExecutionStepStateLinks": PipelineExecutionStepStateLinks,
    "PipelineLinks": PipelineLinks,
    "PipelineList": PipelineList,
    "PipelineListEmbedded": PipelineListEmbedded,
    "PipelinePhase": PipelinePhase,
    "PipelineStepMetrics": PipelineStepMetrics,
    "Program": Program,
    "ProgramLinks": ProgramLinks,
    "ProgramList": ProgramList,
    "ProgramListEmbedded": ProgramListEmbedded,
    "ProgramListLinks": ProgramListLinks,
    "Repository": Repository,
    "RepositoryBranch": RepositoryBranch,
    "RepositoryBranchLinks": RepositoryBranchLinks,
    "RepositoryLinks": RepositoryLinks,
    "RepositoryList": RepositoryList,
    "RepositoryListEmbedded": RepositoryListEmbedded,
    "RequestedPageDetails": RequestedPageDetails,
    "Variable": Variable,
    "VariableList": VariableList,
    "VariableListEmbedded": VariableListEmbedded,
    "VariableListLinks": VariableListLinks,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.serialize(date, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.deserialize(date, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
