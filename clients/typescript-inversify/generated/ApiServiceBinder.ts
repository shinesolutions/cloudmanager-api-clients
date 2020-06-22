import {interfaces} from "inversify";

import { BranchesService } from './api/branches.service';
import { EnvironmentsService } from './api/environments.service';
import { PipelineExecutionService } from './api/pipelineExecution.service';
import { PipelinesService } from './api/pipelines.service';
import { ProgramsService } from './api/programs.service';
import { RepositoriesService } from './api/repositories.service';
import { VariablesService } from './api/variables.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<BranchesService>("BranchesService").to(BranchesService).inSingletonScope();
        container.bind<EnvironmentsService>("EnvironmentsService").to(EnvironmentsService).inSingletonScope();
        container.bind<PipelineExecutionService>("PipelineExecutionService").to(PipelineExecutionService).inSingletonScope();
        container.bind<PipelinesService>("PipelinesService").to(PipelinesService).inSingletonScope();
        container.bind<ProgramsService>("ProgramsService").to(ProgramsService).inSingletonScope();
        container.bind<RepositoriesService>("RepositoriesService").to(RepositoriesService).inSingletonScope();
        container.bind<VariablesService>("VariablesService").to(VariablesService).inSingletonScope();
    }
}
