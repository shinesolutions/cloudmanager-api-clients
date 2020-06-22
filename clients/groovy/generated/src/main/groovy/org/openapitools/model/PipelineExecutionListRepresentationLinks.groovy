package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;

@Canonical
class PipelineExecutionListRepresentationLinks {
    
    HalLink next
    
    HalLink page
    
    HalLink prev
    
    HalLink self
}
