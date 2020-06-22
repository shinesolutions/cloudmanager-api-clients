package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VariableListEmbedded;
import org.openapitools.model.VariableListLinks;

@Canonical
class VariableList {
    
    Integer totalNumberOfItems
    
    VariableListEmbedded embedded
    
    VariableListLinks links
}
