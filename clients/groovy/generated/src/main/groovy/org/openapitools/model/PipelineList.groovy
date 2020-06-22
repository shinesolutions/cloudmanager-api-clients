package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PipelineListEmbedded;
import org.openapitools.model.ProgramListLinks;

@Canonical
class PipelineList {
    
    Integer totalNumberOfItems
    
    PipelineListEmbedded embedded
    
    ProgramListLinks links
}
