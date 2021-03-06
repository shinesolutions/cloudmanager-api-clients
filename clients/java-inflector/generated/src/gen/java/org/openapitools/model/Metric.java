package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Describes a __Metric__
 **/

@ApiModel(description = "Describes a __Metric__")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-22T02:53:13.843Z[GMT]")
public class Metric   {
  @JsonProperty("id")
  private String id;

  /**
   * Severity of the metric
   */
  public enum SeverityEnum {
    CRITICAL("critical"),
    
    IMPORTANT("important"),
    
    INFORMATIONAL("informational");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("severity")
  private SeverityEnum severity;

  @JsonProperty("passed")
  private Boolean passed = false;

  @JsonProperty("override")
  private Boolean override = false;

  @JsonProperty("actualValue")
  private String actualValue;

  @JsonProperty("expectedValue")
  private String expectedValue;

  /**
   * Comparator used for the metric
   */
  public enum ComparatorEnum {
    GT("GT"),
    
    GTE("GTE"),
    
    LT("LT"),
    
    LTE("LTE"),
    
    EQ("EQ"),
    
    NEQ("NEQ");

    private String value;

    ComparatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ComparatorEnum fromValue(String text) {
      for (ComparatorEnum b : ComparatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("comparator")
  private ComparatorEnum comparator;

  @JsonProperty("kpi")
  private String kpi;

  /**
   * KPI result identifier
   **/
  public Metric id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "KPI result identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Severity of the metric
   **/
  public Metric severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(value = "Severity of the metric")
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  /**
   * Whether metric is considered passed
   **/
  public Metric passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  
  @ApiModelProperty(value = "Whether metric is considered passed")
  @JsonProperty("passed")
  public Boolean getPassed() {
    return passed;
  }
  public void setPassed(Boolean passed) {
    this.passed = passed;
  }

  /**
   * Whether user override the failed metric
   **/
  public Metric override(Boolean override) {
    this.override = override;
    return this;
  }

  
  @ApiModelProperty(value = "Whether user override the failed metric")
  @JsonProperty("override")
  public Boolean getOverride() {
    return override;
  }
  public void setOverride(Boolean override) {
    this.override = override;
  }

  /**
   * Expected value for the metric
   **/
  public Metric actualValue(String actualValue) {
    this.actualValue = actualValue;
    return this;
  }

  
  @ApiModelProperty(value = "Expected value for the metric")
  @JsonProperty("actualValue")
  public String getActualValue() {
    return actualValue;
  }
  public void setActualValue(String actualValue) {
    this.actualValue = actualValue;
  }

  /**
   * Expected value for the metric
   **/
  public Metric expectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

  
  @ApiModelProperty(value = "Expected value for the metric")
  @JsonProperty("expectedValue")
  public String getExpectedValue() {
    return expectedValue;
  }
  public void setExpectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
  }

  /**
   * Comparator used for the metric
   **/
  public Metric comparator(ComparatorEnum comparator) {
    this.comparator = comparator;
    return this;
  }

  
  @ApiModelProperty(value = "Comparator used for the metric")
  @JsonProperty("comparator")
  public ComparatorEnum getComparator() {
    return comparator;
  }
  public void setComparator(ComparatorEnum comparator) {
    this.comparator = comparator;
  }

  /**
   * KPI identifier
   **/
  public Metric kpi(String kpi) {
    this.kpi = kpi;
    return this;
  }

  
  @ApiModelProperty(value = "KPI identifier")
  @JsonProperty("kpi")
  public String getKpi() {
    return kpi;
  }
  public void setKpi(String kpi) {
    this.kpi = kpi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metric metric = (Metric) o;
    return Objects.equals(id, metric.id) &&
        Objects.equals(severity, metric.severity) &&
        Objects.equals(passed, metric.passed) &&
        Objects.equals(override, metric.override) &&
        Objects.equals(actualValue, metric.actualValue) &&
        Objects.equals(expectedValue, metric.expectedValue) &&
        Objects.equals(comparator, metric.comparator) &&
        Objects.equals(kpi, metric.kpi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, severity, passed, override, actualValue, expectedValue, comparator, kpi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metric {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    actualValue: ").append(toIndentedString(actualValue)).append("\n");
    sb.append("    expectedValue: ").append(toIndentedString(expectedValue)).append("\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
    sb.append("    kpi: ").append(toIndentedString(kpi)).append("\n");
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

