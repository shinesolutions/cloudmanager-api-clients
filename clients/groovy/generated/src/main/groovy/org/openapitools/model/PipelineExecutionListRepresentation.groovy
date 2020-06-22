package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PipelineExecutionListRepresentationEmbedded;
import org.openapitools.model.PipelineExecutionListRepresentationLinks;
import org.openapitools.model.RequestedPageDetails;

@Canonical
class PipelineExecutionListRepresentation {
    
    Integer totalNumberOfItems
    
    RequestedPageDetails page
    
    PipelineExecutionListRepresentationEmbedded embedded
    
    PipelineExecutionListRepresentationLinks links
}
