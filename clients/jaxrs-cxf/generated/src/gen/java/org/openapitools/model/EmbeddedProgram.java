package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Describes an __Embedded Program__
 **/
@ApiModel(description="Describes an __Embedded Program__")
public class EmbeddedProgram  {
  
  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space.")
 /**
   * Identifier of the program. Unique within the space.
  **/
  private String id;

  @ApiModelProperty(example = "AcmeCorp Main Site", value = "Name of the program")
 /**
   * Name of the program
  **/
  private String name;

  @ApiModelProperty(value = "Whether this Program has been enabled for Cloud Manager usage")
 /**
   * Whether this Program has been enabled for Cloud Manager usage
  **/
  private Boolean enabled = false;

  @ApiModelProperty(example = "acmeCorp", value = "Tenant Id")
 /**
   * Tenant Id
  **/
  private String tenantId;
 /**
   * Identifier of the program. Unique within the space.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Name of the program
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }


 /**
   * Whether this Program has been enabled for Cloud Manager usage
   * @return enabled
  **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }


 /**
   * Tenant Id
   * @return tenantId
  **/
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedProgram {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

