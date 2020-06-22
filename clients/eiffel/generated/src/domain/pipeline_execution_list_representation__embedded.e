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
class PIPELINE_EXECUTION_LIST_REPRESENTATION__EMBEDDED 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    executions: detachable LIST [PIPELINE_EXECUTION] 
      

feature -- Change Element  
 
    set_executions (a_name: like executions)
        -- Set 'executions' with 'a_name'.
      do
        executions := a_name
      ensure
        executions_set: executions = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass PIPELINE_EXECUTION_LIST_REPRESENTATION__EMBEDDED%N")
        if attached executions as l_executions then
          across l_executions as ic loop
            Result.append ("%N executions:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
      end
end


