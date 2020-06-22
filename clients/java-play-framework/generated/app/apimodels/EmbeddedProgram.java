package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Describes an __Embedded Program__
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EmbeddedProgram   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("enabled")
  private Boolean enabled = false;

  @JsonProperty("tenantId")
  private String tenantId;

  public EmbeddedProgram id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the program. Unique within the space.
   * @return id
  **/
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmbeddedProgram name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the program
   * @return name
  **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmbeddedProgram enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether this Program has been enabled for Cloud Manager usage
   * @return enabled
  **/
    public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public EmbeddedProgram tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Tenant Id
   * @return tenantId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

