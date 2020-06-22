package apimodels;

import apimodels.HalLink;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * PipelineLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PipelineLinks   {
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/execution")
  private HalLink httpColonNsAdobeComAdobecloudRelExecution;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/executions")
  private HalLink httpColonNsAdobeComAdobecloudRelExecutions;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")
  private HalLink httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;

  @JsonProperty("self")
  private HalLink self;

  public PipelineLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
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

  public PipelineLinks httpColonNsAdobeComAdobecloudRelExecution(HalLink httpColonNsAdobeComAdobecloudRelExecution) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelExecution
   * @return httpColonNsAdobeComAdobecloudRelExecution
  **/
  @Valid
  public HalLink getHttpColonNsAdobeComAdobecloudRelExecution() {
    return httpColonNsAdobeComAdobecloudRelExecution;
  }

  public void setHttpColonNsAdobeComAdobecloudRelExecution(HalLink httpColonNsAdobeComAdobecloudRelExecution) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
  }

  public PipelineLinks httpColonNsAdobeComAdobecloudRelExecutions(HalLink httpColonNsAdobeComAdobecloudRelExecutions) {
    this.httpColonNsAdobeComAdobecloudRelExecutions = httpColonNsAdobeComAdobecloudRelExecutions;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelExecutions
   * @return httpColonNsAdobeComAdobecloudRelExecutions
  **/
  @Valid
  public HalLink getHttpColonNsAdobeComAdobecloudRelExecutions() {
    return httpColonNsAdobeComAdobecloudRelExecutions;
  }

  public void setHttpColonNsAdobeComAdobecloudRelExecutions(HalLink httpColonNsAdobeComAdobecloudRelExecutions) {
    this.httpColonNsAdobeComAdobecloudRelExecutions = httpColonNsAdobeComAdobecloudRelExecutions;
  }

  public PipelineLinks httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(HalLink httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution) {
    this.httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution
   * @return httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution
  **/
  @Valid
  public HalLink getHttpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution() {
    return httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
  }

  public void setHttpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(HalLink httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution) {
    this.httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
  }

  public PipelineLinks self(HalLink self) {
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
    PipelineLinks pipelineLinks = (PipelineLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelProgram, pipelineLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelExecution, pipelineLinks.httpColonNsAdobeComAdobecloudRelExecution) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelExecutions, pipelineLinks.httpColonNsAdobeComAdobecloudRelExecutions) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution, pipelineLinks.httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution) &&
        Objects.equals(self, pipelineLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelProgram, httpColonNsAdobeComAdobecloudRelExecution, httpColonNsAdobeComAdobecloudRelExecutions, httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution, self);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelExecution: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelExecution)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelExecutions: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelExecutions)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution)).append("\n");
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

