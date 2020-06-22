package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Describes a __Metric__")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-22T02:54:09.173Z[GMT]")
public class Metric   {
  
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
  }

  private SeverityEnum severity;
  private Boolean passed = false;
  private Boolean override = false;
  private String actualValue;
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
  }

  private ComparatorEnum comparator;
  private String kpi;

  /**
   * KPI result identifier
   **/
  
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

