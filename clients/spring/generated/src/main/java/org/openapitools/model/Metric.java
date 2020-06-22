package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a __Metric__
 */
@ApiModel(description = "Describes a __Metric__")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ComparatorEnum fromValue(String value) {
      for (ComparatorEnum b : ComparatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("comparator")
  private ComparatorEnum comparator;

  @JsonProperty("kpi")
  private String kpi;

  public Metric id(String id) {
    this.id = id;
    return this;
  }

  /**
   * KPI result identifier
   * @return id
  */
  @ApiModelProperty(value = "KPI result identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Metric severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Severity of the metric
   * @return severity
  */
  @ApiModelProperty(value = "Severity of the metric")


  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Metric passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  /**
   * Whether metric is considered passed
   * @return passed
  */
  @ApiModelProperty(value = "Whether metric is considered passed")


  public Boolean getPassed() {
    return passed;
  }

  public void setPassed(Boolean passed) {
    this.passed = passed;
  }

  public Metric override(Boolean override) {
    this.override = override;
    return this;
  }

  /**
   * Whether user override the failed metric
   * @return override
  */
  @ApiModelProperty(value = "Whether user override the failed metric")


  public Boolean getOverride() {
    return override;
  }

  public void setOverride(Boolean override) {
    this.override = override;
  }

  public Metric actualValue(String actualValue) {
    this.actualValue = actualValue;
    return this;
  }

  /**
   * Expected value for the metric
   * @return actualValue
  */
  @ApiModelProperty(value = "Expected value for the metric")


  public String getActualValue() {
    return actualValue;
  }

  public void setActualValue(String actualValue) {
    this.actualValue = actualValue;
  }

  public Metric expectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

  /**
   * Expected value for the metric
   * @return expectedValue
  */
  @ApiModelProperty(value = "Expected value for the metric")


  public String getExpectedValue() {
    return expectedValue;
  }

  public void setExpectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
  }

  public Metric comparator(ComparatorEnum comparator) {
    this.comparator = comparator;
    return this;
  }

  /**
   * Comparator used for the metric
   * @return comparator
  */
  @ApiModelProperty(value = "Comparator used for the metric")


  public ComparatorEnum getComparator() {
    return comparator;
  }

  public void setComparator(ComparatorEnum comparator) {
    this.comparator = comparator;
  }

  public Metric kpi(String kpi) {
    this.kpi = kpi;
    return this;
  }

  /**
   * KPI identifier
   * @return kpi
  */
  @ApiModelProperty(value = "KPI identifier")


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
    return Objects.equals(this.id, metric.id) &&
        Objects.equals(this.severity, metric.severity) &&
        Objects.equals(this.passed, metric.passed) &&
        Objects.equals(this.override, metric.override) &&
        Objects.equals(this.actualValue, metric.actualValue) &&
        Objects.equals(this.expectedValue, metric.expectedValue) &&
        Objects.equals(this.comparator, metric.comparator) &&
        Objects.equals(this.kpi, metric.kpi);
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

