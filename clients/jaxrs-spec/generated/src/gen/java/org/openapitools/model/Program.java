package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProgramLinks;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Describes a __Program__
 **/
@ApiModel(description = "Describes a __Program__")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class Program   {
  
  private @Valid String id;
  private @Valid String name;
  private @Valid Boolean enabled = false;
  private @Valid String tenantId;
  private @Valid String imsOrgId;
  private @Valid ProgramLinks links;

  /**
   * Identifier of the program. Unique within the space.
   **/
  public Program id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Name of the program
   **/
  public Program name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "AcmeCorp Main Site", required = true, value = "Name of the program")
  @JsonProperty("name")
  @NotNull
 @Size(min=0,max=64)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether this Program has been enabled for Cloud Manager usage
   **/
  public Program enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this Program has been enabled for Cloud Manager usage")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Tenant Id
   **/
  public Program tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  
  @ApiModelProperty(example = "acmeCorp", value = "Tenant Id")
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  /**
   * Organisation Id
   **/
  public Program imsOrgId(String imsOrgId) {
    this.imsOrgId = imsOrgId;
    return this;
  }

  
  @ApiModelProperty(example = "6522A55453334E247F120101@AdobeOrg", value = "Organisation Id")
  @JsonProperty("imsOrgId")
  public String getImsOrgId() {
    return imsOrgId;
  }
  public void setImsOrgId(String imsOrgId) {
    this.imsOrgId = imsOrgId;
  }

  /**
   **/
  public Program links(ProgramLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public ProgramLinks getLinks() {
    return links;
  }
  public void setLinks(ProgramLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Program program = (Program) o;
    return Objects.equals(this.id, program.id) &&
        Objects.equals(this.name, program.name) &&
        Objects.equals(this.enabled, program.enabled) &&
        Objects.equals(this.tenantId, program.tenantId) &&
        Objects.equals(this.imsOrgId, program.imsOrgId) &&
        Objects.equals(this.links, program.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, tenantId, imsOrgId, links);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

