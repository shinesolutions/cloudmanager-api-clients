package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EnvironmentLog;

@Canonical
class EnvironmentLogsEmbedded {
    /* Links to logs */
    List<EnvironmentLog> downloads = new ArrayList<EnvironmentLog>()
}
