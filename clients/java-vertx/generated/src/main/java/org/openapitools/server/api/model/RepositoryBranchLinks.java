package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.HalLink;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepositoryBranchLinks   {
  
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;
  private HalLink httpColonNsAdobeComAdobecloudRelRepository;

  public RepositoryBranchLinks () {

  }

  public RepositoryBranchLinks (HalLink httpColonNsAdobeComAdobecloudRelProgram, HalLink httpColonNsAdobeComAdobecloudRelRepository) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    this.httpColonNsAdobeComAdobecloudRelRepository = httpColonNsAdobeComAdobecloudRelRepository;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }
  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/repository")
  public HalLink getHttpColonNsAdobeComAdobecloudRelRepository() {
    return httpColonNsAdobeComAdobecloudRelRepository;
  }
  public void setHttpColonNsAdobeComAdobecloudRelRepository(HalLink httpColonNsAdobeComAdobecloudRelRepository) {
    this.httpColonNsAdobeComAdobecloudRelRepository = httpColonNsAdobeComAdobecloudRelRepository;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryBranchLinks repositoryBranchLinks = (RepositoryBranchLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelProgram, repositoryBranchLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelRepository, repositoryBranchLinks.httpColonNsAdobeComAdobecloudRelRepository);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelProgram, httpColonNsAdobeComAdobecloudRelRepository);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryBranchLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelRepository: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelRepository)).append("\n");
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
