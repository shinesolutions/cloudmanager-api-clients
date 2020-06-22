package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProgramListEmbedded;
import org.openapitools.model.ProgramListLinks;

@Canonical
class ProgramList {
    
    Integer totalNumberOfItems
    
    ProgramListEmbedded embedded
    
    ProgramListLinks links
}
