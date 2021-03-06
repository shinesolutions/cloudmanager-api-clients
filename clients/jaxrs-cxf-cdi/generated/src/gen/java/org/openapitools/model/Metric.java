package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Describes a __Metric__
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Describes a __Metric__")
public class Metric   {
  
  private String id;


@XmlType(name="SeverityEnum")
@XmlEnum(String.class)
public enum SeverityEnum {

    @XmlEnumValue("critical") CRITICAL(String.valueOf("critical")), @XmlEnumValue("important") IMPORTANT(String.valueOf("important")), @XmlEnumValue("informational") INFORMATIONAL(String.valueOf("informational"));


    private String value;

    SeverityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
        for (SeverityEnum b : SeverityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private SeverityEnum severity;

  private Boolean passed = false;

  private Boolean override = false;

  private String actualValue;

  private String expectedValue;


@XmlType(name="ComparatorEnum")
@XmlEnum(String.class)
public enum ComparatorEnum {

    @XmlEnumValue("GT") GT(String.valueOf("GT")), @XmlEnumValue("GTE") GTE(String.valueOf("GTE")), @XmlEnumValue("LT") LT(String.valueOf("LT")), @XmlEnumValue("LTE") LTE(String.valueOf("LTE")), @XmlEnumValue("EQ") EQ(String.valueOf("EQ")), @XmlEnumValue("NEQ") NEQ(String.valueOf("NEQ"));


    private String value;

    ComparatorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ComparatorEnum fromValue(String value) {
        for (ComparatorEnum b : ComparatorEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ComparatorEnum comparator;

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

