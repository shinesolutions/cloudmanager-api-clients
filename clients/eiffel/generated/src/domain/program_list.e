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
class PROGRAM_LIST 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    var_total_number_of_items: INTEGER_32 
      
    var_embedded: detachable PROGRAM_LIST__EMBEDDED 
      
    var_links: detachable PROGRAM_LIST__LINKS 
      

feature -- Change Element  
 
    set_var_total_number_of_items (a_name: like var_total_number_of_items)
        -- Set 'var_total_number_of_items' with 'a_name'.
      do
        var_total_number_of_items := a_name
      ensure
        var_total_number_of_items_set: var_total_number_of_items = a_name		
      end

    set_var_embedded (a_name: like var_embedded)
        -- Set 'var_embedded' with 'a_name'.
      do
        var_embedded := a_name
      ensure
        var_embedded_set: var_embedded = a_name		
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
        Result.append("%Nclass PROGRAM_LIST%N")
        if attached var_total_number_of_items as l_var_total_number_of_items then
          Result.append ("%Nvar_total_number_of_items:")
          Result.append (l_var_total_number_of_items.out)
          Result.append ("%N")    
        end  
        if attached var_embedded as l_var_embedded then
          Result.append ("%Nvar_embedded:")
          Result.append (l_var_embedded.out)
          Result.append ("%N")    
        end  
        if attached var_links as l_var_links then
          Result.append ("%Nvar_links:")
          Result.append (l_var_links.out)
          Result.append ("%N")    
        end  
      end
end


