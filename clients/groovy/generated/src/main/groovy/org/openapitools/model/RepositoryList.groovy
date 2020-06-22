package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProgramListLinks;
import org.openapitools.model.RepositoryListEmbedded;

@Canonical
class RepositoryList {
    
    Integer totalNumberOfItems
    
    RepositoryListEmbedded embedded
    
    ProgramListLinks links
}
