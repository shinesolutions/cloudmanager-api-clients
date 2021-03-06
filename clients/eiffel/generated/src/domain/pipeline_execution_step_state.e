note
 description:"[
		Cloud Manager API
 		This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
  		The version of the OpenAPI document: 1.0.0
 	    Contact: opensource@shinesolutions.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class PIPELINE_EXECUTION_STEP_STATE 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    id: detachable STRING_32 
      
    step_id: detachable STRING_32 
      
    phase_id: detachable STRING_32 
      
    action: detachable STRING_32 
      -- Name of the action
    repository: detachable STRING_32 
      -- Target repository
    branch: detachable STRING_32 
      -- Target branch
    environment: detachable STRING_32 
      -- Target environment
    environment_type: detachable STRING_32 
      -- Target environment type
    started_at: detachable DATE_TIME 
      -- Start time
    finished_at: detachable DATE_TIME 
      -- Date the execution reached a final state
    details: detachable STRING_TABLE[ANY] 
      -- Information about step result
    status: detachable STRING_32 
      -- Action status
    var_links: detachable PIPELINE_EXECUTION_STEP_STATE__LINKS 
      

feature -- Change Element  
 
    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_step_id (a_name: like step_id)
        -- Set 'step_id' with 'a_name'.
      do
        step_id := a_name
      ensure
        step_id_set: step_id = a_name		
      end

    set_phase_id (a_name: like phase_id)
        -- Set 'phase_id' with 'a_name'.
      do
        phase_id := a_name
      ensure
        phase_id_set: phase_id = a_name		
      end

    set_action (a_name: like action)
        -- Set 'action' with 'a_name'.
      do
        action := a_name
      ensure
        action_set: action = a_name		
      end

    set_repository (a_name: like repository)
        -- Set 'repository' with 'a_name'.
      do
        repository := a_name
      ensure
        repository_set: repository = a_name		
      end

    set_branch (a_name: like branch)
        -- Set 'branch' with 'a_name'.
      do
        branch := a_name
      ensure
        branch_set: branch = a_name		
      end

    set_environment (a_name: like environment)
        -- Set 'environment' with 'a_name'.
      do
        environment := a_name
      ensure
        environment_set: environment = a_name		
      end

    set_environment_type (a_name: like environment_type)
        -- Set 'environment_type' with 'a_name'.
      do
        environment_type := a_name
      ensure
        environment_type_set: environment_type = a_name		
      end

    set_started_at (a_name: like started_at)
        -- Set 'started_at' with 'a_name'.
      do
        started_at := a_name
      ensure
        started_at_set: started_at = a_name		
      end

    set_finished_at (a_name: like finished_at)
        -- Set 'finished_at' with 'a_name'.
      do
        finished_at := a_name
      ensure
        finished_at_set: finished_at = a_name		
      end

    set_details (a_name: like details)
        -- Set 'details' with 'a_name'.
      do
        details := a_name
      ensure
        details_set: details = a_name		
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name		
      end

    set_var_links (a_name: like var_links)
        -- Set 'var_links' with 'a_name'.
      do
        var_links := a_name
      ensure
        var_links_set: var_links = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass PIPELINE_EXECUTION_STEP_STATE%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached step_id as l_step_id then
          Result.append ("%Nstep_id:")
          Result.append (l_step_id.out)
          Result.append ("%N")    
        end  
        if attached phase_id as l_phase_id then
          Result.append ("%Nphase_id:")
          Result.append (l_phase_id.out)
          Result.append ("%N")    
        end  
        if attached action as l_action then
          Result.append ("%Naction:")
          Result.append (l_action.out)
          Result.append ("%N")    
        end  
        if attached repository as l_repository then
          Result.append ("%Nrepository:")
          Result.append (l_repository.out)
          Result.append ("%N")    
        end  
        if attached branch as l_branch then
          Result.append ("%Nbranch:")
          Result.append (l_branch.out)
          Result.append ("%N")    
        end  
        if attached environment as l_environment then
          Result.append ("%Nenvironment:")
          Result.append (l_environment.out)
          Result.append ("%N")    
        end  
        if attached environment_type as l_environment_type then
          Result.append ("%Nenvironment_type:")
          Result.append (l_environment_type.out)
          Result.append ("%N")    
        end  
        if attached started_at as l_started_at then
          Result.append ("%Nstarted_at:")
          Result.append (l_started_at.out)
          Result.append ("%N")    
        end  
        if attached finished_at as l_finished_at then
          Result.append ("%Nfinished_at:")
          Result.append (l_finished_at.out)
          Result.append ("%N")    
        end  
        if attached details as l_details then
          Result.append ("%Ndetails:")
          across l_details as ic loop
            Result.append ("%N")
            Result.append ("key:")
            Result.append (ic.key.out)
            Result.append (" - ")
            Result.append ("val:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end        
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")    
        end  
        if attached var_links as l_var_links then
          Result.append ("%Nvar_links:")
          Result.append (l_var_links.out)
          Result.append ("%N")    
        end  
      end
end


