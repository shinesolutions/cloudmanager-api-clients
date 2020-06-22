note
    description: "API tests for PIPELINEEXECUTION_API"
    date: "$Date$"
    revision: "$Revision$"


class PIPELINEEXECUTION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_advance_pipeline_execution
            -- Advance
            -- 
            -- Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped. 
        local
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_execution_id: STRING_32
            l_phase_id: STRING_32
            l_step_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_content__type: STRING_32
            l_body: ANY
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_execution_id
            -- l_phase_id
            -- l_step_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
            -- l_content__type
            -- l_body
                      
            -- api.advance_pipeline_execution(l_program_id, l_pipeline_id, l_execution_id, l_phase_id, l_step_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_content__type, l_body)
            assert ("not_implemented", False)
        end
    
    test_cancel_pipeline_execution_step
            -- Cancel
            -- 
            -- Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case. 
        local
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_execution_id: STRING_32
            l_phase_id: STRING_32
            l_step_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_content__type: STRING_32
            l_body: ANY
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_execution_id
            -- l_phase_id
            -- l_step_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
            -- l_content__type
            -- l_body
                      
            -- api.cancel_pipeline_execution_step(l_program_id, l_pipeline_id, l_execution_id, l_phase_id, l_step_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_content__type, l_body)
            assert ("not_implemented", False)
        end
    
    test_current_execution
            -- Get current pipeline execution
            -- 
            -- Returns current pipeline execution if any. 
        local
            l_response: PIPELINE_EXECUTION
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.current_execution(l_program_id, l_pipeline_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_execution
            -- Get pipeline execution
            -- 
            -- Returns a pipeline execution by id 
        local
            l_response: PIPELINE_EXECUTION
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_execution_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_execution_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.execution(l_program_id, l_pipeline_id, l_execution_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_executions
            -- List Executions
            -- 
            -- Returns the history of pipeline executions in a newest to oldest order 
        local
            l_response: PIPELINE_EXECUTION_LIST_REPRESENTATION
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_start: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.executions(l_program_id, l_pipeline_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_start, l_limit)
            assert ("not_implemented", False)
        end
    
    test_start_pipeline
            -- Start the pipeline
            -- 
            -- Starts the Pipeline. This works only if the pipeline is not already started. 
        local
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_content__type: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
            -- l_content__type
                      
            -- api.start_pipeline(l_program_id, l_pipeline_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_content__type)
            assert ("not_implemented", False)
        end
    
    test_step_logs
            -- Get logs
            -- 
            -- Get the logs associated with a step. 
        local
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_execution_id: STRING_32
            l_phase_id: STRING_32
            l_step_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_file: STRING_32
            l_accept: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_execution_id
            -- l_phase_id
            -- l_step_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- api.step_logs(l_program_id, l_pipeline_id, l_execution_id, l_phase_id, l_step_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_file, l_accept)
            assert ("not_implemented", False)
        end
    
    test_step_metric
            -- Get step metrics
            -- 
            --  
        local
            l_response: PIPELINE_STEP_METRICS
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_execution_id: STRING_32
            l_phase_id: STRING_32
            l_step_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_execution_id
            -- l_phase_id
            -- l_step_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.step_metric(l_program_id, l_pipeline_id, l_execution_id, l_phase_id, l_step_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_step_state
            -- Get step state
            -- 
            --  
        local
            l_response: PIPELINE_EXECUTION_STEP_STATE
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_execution_id: STRING_32
            l_phase_id: STRING_32
            l_step_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_execution_id
            -- l_phase_id
            -- l_step_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.step_state(l_program_id, l_pipeline_id, l_execution_id, l_phase_id, l_step_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PIPELINEEXECUTION_API
            -- Create an object instance of `PIPELINEEXECUTION_API'.
        once            
            create { PIPELINEEXECUTION_API } Result
        end

end
