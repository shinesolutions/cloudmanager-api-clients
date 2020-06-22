package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EnvironmentLogsEmbedded;
import org.openapitools.model.EnvironmentLogsLinks;

@Canonical
class EnvironmentLogs {
    /* Name of the service */
    List<String> service = new ArrayList<String>()
    /* Name of the Log */
    List<String> name = new ArrayList<String>()
    /* Number of days */
    Integer days
    
    EnvironmentLogsLinks links
    
    EnvironmentLogsEmbedded embedded
}
