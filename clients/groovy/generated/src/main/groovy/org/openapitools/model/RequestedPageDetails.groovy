package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class RequestedPageDetails {
    
    Integer start
    
    Integer limit
    
    String orderBy
    
    List<String> property = new ArrayList<String>()
    
    String type
    
    Integer next
    
    Integer prev
}
