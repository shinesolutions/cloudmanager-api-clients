package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class HalLink {
    
    String href
    
    Boolean templated = false
    
    String type
    
    String deprecation
    
    String profile
    
    String title
    
    String hreflang
    
    String name
}
