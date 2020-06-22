note
    description: "API tests for ENVIRONMENTS_API"
    date: "$Date$"
    revision: "$Revision$"


class ENVIRONMENTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_delete_environment
            -- DeleteEnvironment
            -- 
            -- Delete environment 
        local
            l_response: ENVIRONMENT
            l_program_id: STRING_32
            l_environment_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_environment_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.delete_environment(l_program_id, l_environment_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_download_logs
            -- Download Logs
            -- 
            -- Download environment logs 
        local
            l_program_id: STRING_32
            l_environment_id: STRING_32
            l_service: STRING_32
            l_name: STRING_32
            l_date: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_accept: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_environment_id
            -- l_service
            -- l_name
            -- l_date
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- api.download_logs(l_program_id, l_environment_id, l_service, l_name, l_date, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_accept)
            assert ("not_implemented", False)
        end
    
    test_environment
            -- Get Environment
            -- 
            -- Returns an environment by its id 
        local
            l_response: ENVIRONMENT
            l_program_id: STRING_32
            l_environment_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_environment_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.environment(l_program_id, l_environment_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_environment_logs
            -- Get Environment Logs
            -- 
            -- List all logs available in environment 
        local
            l_response: ENVIRONMENT_LOGS
            l_program_id: STRING_32
            l_environment_id: STRING_32
            l_days: INTEGER_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_service: LIST [STRING_32]
            l_name: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_environment_id
            -- l_days
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.environment_logs(l_program_id, l_environment_id, l_days, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_service, l_name)
            assert ("not_implemented", False)
        end
    
    test_environments
            -- List Environments
            -- 
            -- Lists all environments in an program 
        local
            l_response: ENVIRONMENT_LIST
            l_program_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_type: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.environments(l_program_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_type)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ENVIRONMENTS_API
            -- Create an object instance of `ENVIRONMENTS_API'.
        once            
            create { ENVIRONMENTS_API } Result
        end

end
