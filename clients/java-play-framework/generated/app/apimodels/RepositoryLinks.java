package apimodels;

import apimodels.HalLink;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * RepositoryLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RepositoryLinks   {
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/branches")
  private HalLink httpColonNsAdobeComAdobecloudRelBranches;

  @JsonProperty("self")
  private HalLink self;

  public RepositoryLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelProgram
   * @return httpColonNsAdobeComAdobecloudRelProgram
  **/
  @Valid
  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }

  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

  public RepositoryLinks httpColonNsAdobeComAdobecloudRelBranches(HalLink httpColonNsAdobeComAdobecloudRelBranches) {
    this.httpColonNsAdobeComAdobecloudRelBranches = httpColonNsAdobeComAdobecloudRelBranches;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelBranches
   * @return httpColonNsAdobeComAdobecloudRelBranches
  **/
  @Valid
  public HalLink getHttpColonNsAdobeComAdobecloudRelBranches() {
    return httpColonNsAdobeComAdobecloudRelBranches;
  }

  public void setHttpColonNsAdobeComAdobecloudRelBranches(HalLink httpColonNsAdobeComAdobecloudRelBranches) {
    this.httpColonNsAdobeComAdobecloudRelBranches = httpColonNsAdobeComAdobecloudRelBranches;
  }

  public RepositoryLinks self(HalLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Valid
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
    return Objects.equals(httpColonNsAdobeComAdobecloudRelProgram, repositoryLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelBranches, repositoryLinks.httpColonNsAdobeComAdobecloudRelBranches) &&
        Objects.equals(self, repositoryLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelProgram, httpColonNsAdobeComAdobecloudRelBranches, self);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

