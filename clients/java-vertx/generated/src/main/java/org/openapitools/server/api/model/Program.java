package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ProgramLinks;

/**
 * Describes a __Program__
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Program   {
  
  private String id;
  private String name;
  private Boolean enabled = false;
  private String tenantId;
  private String imsOrgId;
  private ProgramLinks links;

  public Program () {

  }

  public Program (String id, String name, Boolean enabled, String tenantId, String imsOrgId, ProgramLinks links) {
    this.id = id;
    this.name = name;
    this.enabled = enabled;
    this.tenantId = tenantId;
    this.imsOrgId = imsOrgId;
    this.links = links;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

    
  @JsonProperty("imsOrgId")
  public String getImsOrgId() {
    return imsOrgId;
  }
  public void setImsOrgId(String imsOrgId) {
    this.imsOrgId = imsOrgId;
  }

    
  @JsonProperty("_links")
  public ProgramLinks getLinks() {
    return links;
  }
  public void setLinks(ProgramLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Program program = (Program) o;
    return Objects.equals(id, program.id) &&
        Objects.equals(name, program.name) &&
        Objects.equals(enabled, program.enabled) &&
        Objects.equals(tenantId, program.tenantId) &&
        Objects.equals(imsOrgId, program.imsOrgId) &&
        Objects.equals(links, program.links);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
