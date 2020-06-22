package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class HalLink   {
  

  private String href;

  private Boolean templated = false;

  private String type;

  private String deprecation;

  private String profile;

  private String title;

  private String hreflang;

  private String name;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("templated")
  public Boolean getTemplated() {
    return templated;
  }
  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deprecation")
  public String getDeprecation() {
    return deprecation;
  }
  public void setDeprecation(String deprecation) {
    this.deprecation = deprecation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profile")
  public String getProfile() {
    return profile;
  }
  public void setProfile(String profile) {
    this.profile = profile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hreflang")
  public String getHreflang() {
    return hreflang;
  }
  public void setHreflang(String hreflang) {
    this.hreflang = hreflang;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HalLink halLink = (HalLink) o;
    return Objects.equals(href, halLink.href) &&
        Objects.equals(templated, halLink.templated) &&
        Objects.equals(type, halLink.type) &&
        Objects.equals(deprecation, halLink.deprecation) &&
        Objects.equals(profile, halLink.profile) &&
        Objects.equals(title, halLink.title) &&
        Objects.equals(hreflang, halLink.hreflang) &&
        Objects.equals(name, halLink.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, templated, type, deprecation, profile, title, hreflang, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalLink {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

