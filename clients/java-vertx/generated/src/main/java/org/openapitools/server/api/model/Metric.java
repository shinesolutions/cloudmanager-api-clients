package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Describes a __Metric__
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Metric   {
  
  private String id;


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
      return value;
    }
  }

  private SeverityEnum severity;
  private Boolean passed = false;
  private Boolean override = false;
  private String actualValue;
  private String expectedValue;


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
      return value;
    }
  }

  private ComparatorEnum comparator;
  private String kpi;

  public Metric () {

  }

  public Metric (String id, SeverityEnum severity, Boolean passed, Boolean override, String actualValue, String expectedValue, ComparatorEnum comparator, String kpi) {
    this.id = id;
    this.severity = severity;
    this.passed = passed;
    this.override = override;
    this.actualValue = actualValue;
    this.expectedValue = expectedValue;
    this.comparator = comparator;
    this.kpi = kpi;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

    
  @JsonProperty("passed")
  public Boolean getPassed() {
    return passed;
  }
  public void setPassed(Boolean passed) {
    this.passed = passed;
  }

    
  @JsonProperty("override")
  public Boolean getOverride() {
    return override;
  }
  public void setOverride(Boolean override) {
    this.override = override;
  }

    
  @JsonProperty("actualValue")
  public String getActualValue() {
    return actualValue;
  }
  public void setActualValue(String actualValue) {
    this.actualValue = actualValue;
  }

    
  @JsonProperty("expectedValue")
  public String getExpectedValue() {
    return expectedValue;
  }
  public void setExpectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
  }

    
  @JsonProperty("comparator")
  public ComparatorEnum getComparator() {
    return comparator;
  }
  public void setComparator(ComparatorEnum comparator) {
    this.comparator = comparator;
  }

    
  @JsonProperty("kpi")
  public String getKpi() {
    return kpi;
  }
  public void setKpi(String kpi) {
    this.kpi = kpi;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
