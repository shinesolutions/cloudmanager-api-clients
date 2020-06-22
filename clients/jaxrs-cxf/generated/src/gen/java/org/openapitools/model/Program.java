package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.ProgramLinks;
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
  * Describes a __Program__
 **/
@ApiModel(description="Describes a __Program__")
public class Program  {
  
  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space.")
 /**
   * Identifier of the program. Unique within the space.
  **/
  private String id;

  @ApiModelProperty(example = "AcmeCorp Main Site", required = true, value = "Name of the program")
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

  @ApiModelProperty(example = "6522A55453334E247F120101@AdobeOrg", value = "Organisation Id")
 /**
   * Organisation Id
  **/
  private String imsOrgId;

  @ApiModelProperty(value = "")
  @Valid
  private ProgramLinks links;
 /**
   * Identifier of the program. Unique within the space.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Program id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Name of the program
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(min=0,max=64)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Program name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Whether this Program has been enabled for Cloud Manager usage
   * @return enabled
  **/
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Program enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Tenant Id
   * @return tenantId
  **/
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Program tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

 /**
   * Organisation Id
   * @return imsOrgId
  **/
  @JsonProperty("imsOrgId")
  public String getImsOrgId() {
    return imsOrgId;
  }

  public void setImsOrgId(String imsOrgId) {
    this.imsOrgId = imsOrgId;
  }

  public Program imsOrgId(String imsOrgId) {
    this.imsOrgId = imsOrgId;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public ProgramLinks getLinks() {
    return links;
  }

  public void setLinks(ProgramLinks links) {
    this.links = links;
  }

  public Program links(ProgramLinks links) {
    this.links = links;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Program {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    imsOrgId: ").append(toIndentedString(imsOrgId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

