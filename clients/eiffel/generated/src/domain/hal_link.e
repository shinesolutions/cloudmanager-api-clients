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
class HAL_LINK 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    href: detachable STRING_32 
      
    templated: BOOLEAN 
      
    type: detachable STRING_32 
      
    deprecation: detachable STRING_32 
      
    profile: detachable STRING_32 
      
    title: detachable STRING_32 
      
    hreflang: detachable STRING_32 
      
    name: detachable STRING_32 
      

feature -- Change Element  
 
    set_href (a_name: like href)
        -- Set 'href' with 'a_name'.
      do
        href := a_name
      ensure
        href_set: href = a_name		
      end

    set_templated (a_name: like templated)
        -- Set 'templated' with 'a_name'.
      do
        templated := a_name
      ensure
        templated_set: templated = a_name		
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name		
      end

    set_deprecation (a_name: like deprecation)
        -- Set 'deprecation' with 'a_name'.
      do
        deprecation := a_name
      ensure
        deprecation_set: deprecation = a_name		
      end

    set_profile (a_name: like profile)
        -- Set 'profile' with 'a_name'.
      do
        profile := a_name
      ensure
        profile_set: profile = a_name		
      end

    set_title (a_name: like title)
        -- Set 'title' with 'a_name'.
      do
        title := a_name
      ensure
        title_set: title = a_name		
      end

    set_hreflang (a_name: like hreflang)
        -- Set 'hreflang' with 'a_name'.
      do
        hreflang := a_name
      ensure
        hreflang_set: hreflang = a_name		
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass HAL_LINK%N")
        if attached href as l_href then
          Result.append ("%Nhref:")
          Result.append (l_href.out)
          Result.append ("%N")    
        end  
        if attached templated as l_templated then
          Result.append ("%Ntemplated:")
          Result.append (l_templated.out)
          Result.append ("%N")    
        end  
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")    
        end  
        if attached deprecation as l_deprecation then
          Result.append ("%Ndeprecation:")
          Result.append (l_deprecation.out)
          Result.append ("%N")    
        end  
        if attached profile as l_profile then
          Result.append ("%Nprofile:")
          Result.append (l_profile.out)
          Result.append ("%N")    
        end  
        if attached title as l_title then
          Result.append ("%Ntitle:")
          Result.append (l_title.out)
          Result.append ("%N")    
        end  
        if attached hreflang as l_hreflang then
          Result.append ("%Nhreflang:")
          Result.append (l_hreflang.out)
          Result.append ("%N")    
        end  
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")    
        end  
      end
end


