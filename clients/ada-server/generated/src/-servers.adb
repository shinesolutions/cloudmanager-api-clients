--  Cloud Manager API
--  This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager_api_docs/master/swagger_specs/api.yaml.
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body .Servers is


   --  List Branches
   --  Returns the list of branches from a repository
   overriding
   procedure Get_Branches
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Repository_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.BranchList_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Branches;

   --  DeleteEnvironment
   --  Delete environment
   overriding
   procedure Delete_Environment
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Environment_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.Environment_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Environment;

   --  Download Logs
   --  Download environment logs
   overriding
   procedure Download_Logs
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Environment_Id : in Swagger.UString;
       Service : in Swagger.UString;
       Name : in Swagger.UString;
       Date : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       P_Accept : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Download_Logs;

   --  Get Environment
   --  Returns an environment by its id
   overriding
   procedure Get_Environment
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Environment_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.Environment_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Environment;

   --  Get Environment Logs
   --  List all logs available in environment
   overriding
   procedure Get_Environment_Logs
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Environment_Id : in Swagger.UString;
       Days : in Integer;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Service : in Swagger.UString_Vectors.Vector;
       Name : in Swagger.UString_Vectors.Vector;
       Result  : out .Models.EnvironmentLogs_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Environment_Logs;

   --  List Environments
   --  Lists all environments in an program
   overriding
   procedure Get_Environments
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       P_Type : in Swagger.Nullable_UString;
       Result  : out .Models.EnvironmentList_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Environments;

   --  Advance
   --  Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
   overriding
   procedure Advance_Pipeline_Execution
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       Execution_Id : in Swagger.UString;
       Phase_Id : in Swagger.UString;
       Step_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Content_Type : in Swagger.UString;
       P_Body : in Swagger.Object;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Advance_Pipeline_Execution;

   --  Cancel
   --  Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
   overriding
   procedure Cancel_Pipeline_Execution_Step
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       Execution_Id : in Swagger.UString;
       Phase_Id : in Swagger.UString;
       Step_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Content_Type : in Swagger.UString;
       P_Body : in Swagger.Object;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Cancel_Pipeline_Execution_Step;

   --  Get current pipeline execution
   --  Returns current pipeline execution if any.
   overriding
   procedure Get_Current_Execution
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.PipelineExecution_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Current_Execution;

   --  Get pipeline execution
   --  Returns a pipeline execution by id
   overriding
   procedure Get_Execution
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       Execution_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.PipelineExecution_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Execution;

   --  List Executions
   --  Returns the history of pipeline executions in a newest to oldest order
   overriding
   procedure Get_Executions
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Start : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Integer;
       Result  : out .Models.PipelineExecutionListRepresentation_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Executions;

   --  Get logs
   --  Get the logs associated with a step.
   overriding
   procedure Get_Step_Logs
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       Execution_Id : in Swagger.UString;
       Phase_Id : in Swagger.UString;
       Step_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       File : in Swagger.Nullable_UString;
       P_Accept : in Swagger.Nullable_UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Step_Logs;

   --  Start the pipeline
   --  Starts the Pipeline. This works only if the pipeline is not already started.
   overriding
   procedure Start_Pipeline
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Content_Type : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Start_Pipeline;

   --  Get step metrics
   overriding
   procedure Step_Metric
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       Execution_Id : in Swagger.UString;
       Phase_Id : in Swagger.UString;
       Step_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.PipelineStepMetrics_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Step_Metric;

   --  Get step state
   overriding
   procedure Step_State
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       Execution_Id : in Swagger.UString;
       Phase_Id : in Swagger.UString;
       Step_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.PipelineExecutionStepState_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Step_State;

   --  Delete a Pipeline
   --  Delete a pipeline. All the data is wiped.
   overriding
   procedure Delete_Pipeline
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Pipeline;

   --  Get Pipeline
   --  Returns a pipeline by its id
   overriding
   procedure Get_Pipeline
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.Pipeline_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Pipeline;

   --  List Pipelines
   --  Returns all the pipelines that the requesting user has access to in an program
   overriding
   procedure Get_Pipelines
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.PipelineList_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Pipelines;

   --  Patches Pipeline
   --  Patches a pipeline within an program.
   overriding
   procedure Patch_Pipeline
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Pipeline_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Content_Type : in Swagger.UString;
       P_Body : in Pipeline_Type;
       Result  : out .Models.Pipeline_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Patch_Pipeline;

   --  Delete Program
   --  Delete an program
   overriding
   procedure Delete_Program
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.Program_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Program;

   --  Get Program
   --  Returns a program by its id
   overriding
   procedure Get_Program
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.Program_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Program;

   --  Lists Programs
   --  Returns all programs that the requesting user has access to
   overriding
   procedure Get_Programs
      (Server : in out Server_Type;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.ProgramList_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Programs;

   --  Lists Repositories
   --  Lists all Repositories in an program
   overriding
   procedure Get_Repositories
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.RepositoryList_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Repositories;

   --  Get Repository
   --  Returns an repository by its id
   overriding
   procedure Get_Repository
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Repository_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.Repository_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Repository;

   --  List User Environment Variables
   --  List the user defined variables for an environment (Cloud Service only).
   overriding
   procedure Get_Environment_Variables
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Environment_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Result  : out .Models.VariableList_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Environment_Variables;

   --  Patch User Environment Variables
   --  Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
   overriding
   procedure Patch_Environment_Variables
      (Server : in out Server_Type;
       Program_Id : in Swagger.UString;
       Environment_Id : in Swagger.UString;
       X_Gw_Ims_Org_Id : in Swagger.UString;
       Authorization : in Swagger.UString;
       X_Api_Key : in Swagger.UString;
       Content_Type : in Swagger.UString;
       P_Body : in .Models.Variable_Type_Vectors.Vector;
       Result  : out .Models.VariableList_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Patch_Environment_Variables;

end .Servers;
