note
    description: "API tests for PIPELINES_API"
    date: "$Date$"
    revision: "$Revision$"


class PIPELINES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_delete_pipeline
            -- Delete a Pipeline
            -- 
            -- Delete a pipeline. All the data is wiped. 
        local
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
                      
            -- api.delete_pipeline(l_program_id, l_pipeline_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_patch_pipeline
            -- Patches Pipeline
            -- 
            -- Patches a pipeline within an program. 
        local
            l_response: PIPELINE
            l_program_id: STRING_32
            l_pipeline_id: STRING_32
            l_x_gw_ims_org_id: STRING_32
            l_authorization: STRING_32
            l_x_api_key: STRING_32
            l_content__type: STRING_32
            l_body: PIPELINE
        do
            -- TODO: Initialize required params.
            -- l_program_id
            -- l_pipeline_id
            -- l_x_gw_ims_org_id
            -- l_authorization
            -- l_x_api_key
            -- l_content__type
            -- l_body
                      
            -- l_response := api.patch_pipeline(l_program_id, l_pipeline_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key, l_content__type, l_body)
            assert ("not_implemented", False)
        end
    
    test_pipeline
            -- Get Pipeline
            -- 
            -- Returns a pipeline by its id 
        local
            l_response: PIPELINE
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
                      
            -- l_response := api.pipeline(l_program_id, l_pipeline_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end
    
    test_pipelines
            -- List Pipelines
            -- 
            -- Returns all the pipelines that the requesting user has access to in an program 
        local
            l_response: PIPELINE_LIST
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
                      
            -- l_response := api.pipelines(l_program_id, l_x_gw_ims_org_id, l_authorization, l_x_api_key)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PIPELINES_API
            -- Create an object instance of `PIPELINES_API'.
        once            
            create { PIPELINES_API } Result
        end

end
