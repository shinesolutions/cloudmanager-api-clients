package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.HalLink;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepositoryLinks   {
  
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;
  private HalLink httpColonNsAdobeComAdobecloudRelBranches;
  private HalLink self;

  public RepositoryLinks () {

  }

  public RepositoryLinks (HalLink httpColonNsAdobeComAdobecloudRelProgram, HalLink httpColonNsAdobeComAdobecloudRelBranches, HalLink self) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    this.httpColonNsAdobeComAdobecloudRelBranches = httpColonNsAdobeComAdobecloudRelBranches;
    this.self = self;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }
  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/branches")
  public HalLink getHttpColonNsAdobeComAdobecloudRelBranches() {
    return httpColonNsAdobeComAdobecloudRelBranches;
  }
  public void setHttpColonNsAdobeComAdobecloudRelBranches(HalLink httpColonNsAdobeComAdobecloudRelBranches) {
    this.httpColonNsAdobeComAdobecloudRelBranches = httpColonNsAdobeComAdobecloudRelBranches;
  }

    
  @JsonProperty("self")
  public HalLink getSelf() {
    return self;
  }
  public void setSelf(HalLink self) {
    this.self = self;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryLinks repositoryLinks = (RepositoryLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelProgram, repositoryLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelBranches, repositoryLinks.httpColonNsAdobeComAdobecloudRelBranches) &&
        Objects.equals(self, repositoryLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelProgram, httpColonNsAdobeComAdobecloudRelBranches, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelBranches: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelBranches)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
