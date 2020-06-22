export * from './branchesApi';
import { BranchesApi } from './branchesApi';
export * from './environmentsApi';
import { EnvironmentsApi } from './environmentsApi';
export * from './pipelineExecutionApi';
import { PipelineExecutionApi } from './pipelineExecutionApi';
export * from './pipelinesApi';
import { PipelinesApi } from './pipelinesApi';
export * from './programsApi';
import { ProgramsApi } from './programsApi';
export * from './repositoriesApi';
import { RepositoriesApi } from './repositoriesApi';
export * from './variablesApi';
import { VariablesApi } from './variablesApi';
import * as fs from 'fs';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.ClientResponse, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;

export const APIS = [BranchesApi, EnvironmentsApi, PipelineExecutionApi, PipelinesApi, ProgramsApi, RepositoriesApi, VariablesApi];
