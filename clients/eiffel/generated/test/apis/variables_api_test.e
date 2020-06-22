note
    description: "API tests for VARIABLES_API"
    date: "$Date$"
    revision: "$Revision$"


class VARIABLES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_environment_variables
            -- List User Environment Variables
            -- 
            -- List the user defined variables for an environment (Cloud Service only). 
        local
            l_response: VARIABLE_LIST
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
                      
            -- l_response := api.environment_variables(l_program_id, l_environment_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_patch_environment_variables
            -- Patch User Environment Variables
            -- 
            -- Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value. 
        local
            l_response: VARIABLE_LIST
            l_program_id: STRING_32
            l_environment_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_content__type: STRING_32
            l_body: LIST [VARIABLE]
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_environment_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
            -- l_content__type
            -- create {ARRAYED_LIST [VARIABLE]} l_body.make (2)
                      
            -- l_response := api.patch_environment_variables(l_program_id, l_environment_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_content__type, l_body)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: VARIABLES_API
            -- Create an object instance of `VARIABLES_API'.
        once            
            create { VARIABLES_API } Result
        end

end
