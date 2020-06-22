package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Describes an __Embedded Program__
 **/

@ApiModel(description = "Describes an __Embedded Program__")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-22T02:53:13.843Z[GMT]")
public class EmbeddedProgram   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("enabled")
  private Boolean enabled = false;

  @JsonProperty("tenantId")
  private String tenantId;

  /**
   * Identifier of the program. Unique within the space.
   **/
  public EmbeddedProgram id(String id) {
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
  public EmbeddedProgram name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "AcmeCorp Main Site", value = "Name of the program")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether this Program has been enabled for Cloud Manager usage
   **/
  public EmbeddedProgram enabled(Boolean enabled) {
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
  public EmbeddedProgram tenantId(String tenantId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedProgram embeddedProgram = (EmbeddedProgram) o;
    return Objects.equals(id, embeddedProgram.id) &&
        Objects.equals(name, embeddedProgram.name) &&
        Objects.equals(enabled, embeddedProgram.enabled) &&
        Objects.equals(tenantId, embeddedProgram.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, tenantId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

