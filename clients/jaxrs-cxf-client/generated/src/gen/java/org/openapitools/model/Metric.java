package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Describes a __Metric__
 **/
@ApiModel(description="Describes a __Metric__")
public class Metric  {
  
  @ApiModelProperty(value = "KPI result identifier")
 /**
   * KPI result identifier
  **/
  private String id;

@XmlType(name="SeverityEnum")
@XmlEnum(String.class)
public enum SeverityEnum {

@XmlEnumValue("critical") CRITICAL(String.valueOf("critical")), @XmlEnumValue("important") IMPORTANT(String.valueOf("important")), @XmlEnumValue("informational") INFORMATIONAL(String.valueOf("informational"));


    private String value;

    SeverityEnum (String v) {
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

  @ApiModelProperty(value = "Severity of the metric")
 /**
   * Severity of the metric
  **/
  private SeverityEnum severity;

  @ApiModelProperty(value = "Whether metric is considered passed")
 /**
   * Whether metric is considered passed
  **/
  private Boolean passed = false;

  @ApiModelProperty(value = "Whether user override the failed metric")
 /**
   * Whether user override the failed metric
  **/
  private Boolean override = false;

  @ApiModelProperty(value = "Expected value for the metric")
 /**
   * Expected value for the metric
  **/
  private String actualValue;

  @ApiModelProperty(value = "Expected value for the metric")
 /**
   * Expected value for the metric
  **/
  private String expectedValue;

@XmlType(name="ComparatorEnum")
@XmlEnum(String.class)
public enum ComparatorEnum {

@XmlEnumValue("GT") GT(String.valueOf("GT")), @XmlEnumValue("GTE") GTE(String.valueOf("GTE")), @XmlEnumValue("LT") LT(String.valueOf("LT")), @XmlEnumValue("LTE") LTE(String.valueOf("LTE")), @XmlEnumValue("EQ") EQ(String.valueOf("EQ")), @XmlEnumValue("NEQ") NEQ(String.valueOf("NEQ"));


    private String value;

    ComparatorEnum (String v) {
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

  @ApiModelProperty(value = "Comparator used for the metric")
 /**
   * Comparator used for the metric
  **/
  private ComparatorEnum comparator;

  @ApiModelProperty(value = "KPI identifier")
 /**
   * KPI identifier
  **/
  private String kpi;
 /**
   * KPI result identifier
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Metric id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Severity of the metric
   * @return severity
  **/
  @JsonProperty("severity")
  public String getSeverity() {
    if (severity == null) {
      return null;
    }
    return severity.value();
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Metric severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

 /**
   * Whether metric is considered passed
   * @return passed
  **/
  @JsonProperty("passed")
  public Boolean getPassed() {
    return passed;
  }

  public void setPassed(Boolean passed) {
    this.passed = passed;
  }

  public Metric passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

 /**
   * Whether user override the failed metric
   * @return override
  **/
  @JsonProperty("override")
  public Boolean getOverride() {
    return override;
  }

  public void setOverride(Boolean override) {
    this.override = override;
  }

  public Metric override(Boolean override) {
    this.override = override;
    return this;
  }

 /**
   * Expected value for the metric
   * @return actualValue
  **/
  @JsonProperty("actualValue")
  public String getActualValue() {
    return actualValue;
  }

  public void setActualValue(String actualValue) {
    this.actualValue = actualValue;
  }

  public Metric actualValue(String actualValue) {
    this.actualValue = actualValue;
    return this;
  }

 /**
   * Expected value for the metric
   * @return expectedValue
  **/
  @JsonProperty("expectedValue")
  public String getExpectedValue() {
    return expectedValue;
  }

  public void setExpectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
  }

  public Metric expectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
    return this;
  }

 /**
   * Comparator used for the metric
   * @return comparator
  **/
  @JsonProperty("comparator")
  public String getComparator() {
    if (comparator == null) {
      return null;
    }
    return comparator.value();
  }

  public void setComparator(ComparatorEnum comparator) {
    this.comparator = comparator;
  }

  public Metric comparator(ComparatorEnum comparator) {
    this.comparator = comparator;
    return this;
  }

 /**
   * KPI identifier
   * @return kpi
  **/
  @JsonProperty("kpi")
  public String getKpi() {
    return kpi;
  }

  public void setKpi(String kpi) {
    this.kpi = kpi;
  }

  public Metric kpi(String kpi) {
    this.kpi = kpi;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

