note
    description: "API tests for BRANCHES_API"
    date: "$Date$"
    revision: "$Revision$"


class BRANCHES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_branches
            -- List Branches
            -- 
            -- Returns the list of branches from a repository 
        local
            l_response: BRANCH_LIST
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
                      
            -- l_response := api.branches(l_program_id, l_repository_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BRANCHES_API
            -- Create an object instance of `BRANCHES_API'.
        once            
            create { BRANCHES_API } Result
        end

end
