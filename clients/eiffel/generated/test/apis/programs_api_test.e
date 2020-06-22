note
    description: "API tests for PROGRAMS_API"
    date: "$Date$"
    revision: "$Revision$"


class PROGRAMS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_delete_program
            -- Delete Program
            -- 
            -- Delete an program 
        local
            l_response: PROGRAM
            l_program_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.delete_program(l_program_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_program
            -- Get Program
            -- 
            -- Returns a program by its id 
        local
            l_response: PROGRAM
            l_program_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.program(l_program_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_programs
            -- Lists Programs
            -- 
            -- Returns all programs that the requesting user has access to 
        local
            l_response: PROGRAM_LIST
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.programs(l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PROGRAMS_API
            -- Create an object instance of `PROGRAMS_API'.
        once            
            create { PROGRAMS_API } Result
        end

end
