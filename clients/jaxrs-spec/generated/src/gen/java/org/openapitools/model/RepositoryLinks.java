package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class RepositoryLinks   {
  
  private @Valid HalLink httpColonNsAdobeComAdobecloudRelProgram;
  private @Valid HalLink httpColonNsAdobeComAdobecloudRelBranches;
  private @Valid HalLink self;

  /**
   **/
  public RepositoryLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }
  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

  /**
   **/
  public RepositoryLinks httpColonNsAdobeComAdobecloudRelBranches(HalLink httpColonNsAdobeComAdobecloudRelBranches) {
    this.httpColonNsAdobeComAdobecloudRelBranches = httpColonNsAdobeComAdobecloudRelBranches;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/branches")
  public HalLink getHttpColonNsAdobeComAdobecloudRelBranches() {
    return httpColonNsAdobeComAdobecloudRelBranches;
  }
  public void setHttpColonNsAdobeComAdobecloudRelBranches(HalLink httpColonNsAdobeComAdobecloudRelBranches) {
    this.httpColonNsAdobeComAdobecloudRelBranches = httpColonNsAdobeComAdobecloudRelBranches;
  }

  /**
   **/
  public RepositoryLinks self(HalLink self) {
    this.self = self;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("self")
  public HalLink getSelf() {
    return self;
  }
  public void setSelf(HalLink self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryLinks repositoryLinks = (RepositoryLinks) o;
    return Objects.equals(this.httpColonNsAdobeComAdobecloudRelProgram, repositoryLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(this.httpColonNsAdobeComAdobecloudRelBranches, repositoryLinks.httpColonNsAdobeComAdobecloudRelBranches) &&
        Objects.equals(this.self, repositoryLinks.self);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

