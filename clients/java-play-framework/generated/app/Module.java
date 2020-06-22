import com.google.inject.AbstractModule;

import controllers.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(BranchesApiControllerImpInterface.class).to(BranchesApiControllerImp.class);
        bind(EnvironmentsApiControllerImpInterface.class).to(EnvironmentsApiControllerImp.class);
        bind(PipelineExecutionApiControllerImpInterface.class).to(PipelineExecutionApiControllerImp.class);
        bind(PipelinesApiControllerImpInterface.class).to(PipelinesApiControllerImp.class);
        bind(ProgramsApiControllerImpInterface.class).to(ProgramsApiControllerImp.class);
        bind(RepositoriesApiControllerImpInterface.class).to(RepositoriesApiControllerImp.class);
        bind(VariablesApiControllerImpInterface.class).to(VariablesApiControllerImp.class);
    }
}