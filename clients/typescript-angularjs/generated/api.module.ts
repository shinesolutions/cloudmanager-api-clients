import * as api from './api/api';
import * as angular from 'angular';

const apiModule = angular.module('api', [])
.service('BranchesApi', api.BranchesApi)
.service('EnvironmentsApi', api.EnvironmentsApi)
.service('PipelineExecutionApi', api.PipelineExecutionApi)
.service('PipelinesApi', api.PipelinesApi)
.service('ProgramsApi', api.ProgramsApi)
.service('RepositoriesApi', api.RepositoriesApi)
.service('VariablesApi', api.VariablesApi)

export default apiModule;
