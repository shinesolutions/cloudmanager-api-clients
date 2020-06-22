package apimodels;

import apimodels.HalLink;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * RepositoryBranchLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RepositoryBranchLinks   {
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/repository")
  private HalLink httpColonNsAdobeComAdobecloudRelRepository;

  public RepositoryBranchLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
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

  public RepositoryBranchLinks httpColonNsAdobeComAdobecloudRelRepository(HalLink httpColonNsAdobeComAdobecloudRelRepository) {
    this.httpColonNsAdobeComAdobecloudRelRepository = httpColonNsAdobeComAdobecloudRelRepository;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelRepository
   * @return httpColonNsAdobeComAdobecloudRelRepository
  **/
  @Valid
  public HalLink getHttpColonNsAdobeComAdobecloudRelRepository() {
    return httpColonNsAdobeComAdobecloudRelRepository;
  }

  public void setHttpColonNsAdobeComAdobecloudRelRepository(HalLink httpColonNsAdobeComAdobecloudRelRepository) {
    this.httpColonNsAdobeComAdobecloudRelRepository = httpColonNsAdobeComAdobecloudRelRepository;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

