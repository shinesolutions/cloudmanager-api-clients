note
    description: "API tests for REPOSITORIES_API"
    date: "$Date$"
    revision: "$Revision$"


class REPOSITORIES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_repositories
            -- Lists Repositories
            -- 
            -- Lists all Repositories in an program 
        local
            l_response: REPOSITORY_LIST
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
                      
            -- l_response := api.repositories(l_program_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_repository
            -- Get Repository
            -- 
            -- Returns an repository by its id 
        local
            l_response: REPOSITORY
            l_program_id: STRING_32
            l_repository_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_repository_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
                      
            -- l_response := api.repository(l_program_id, l_repository_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: REPOSITORIES_API
            -- Create an object instance of `REPOSITORIES_API'.
        once            
            create { REPOSITORIES_API } Result
        end

end
