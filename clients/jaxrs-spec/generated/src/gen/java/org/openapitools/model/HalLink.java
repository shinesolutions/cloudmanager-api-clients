package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class HalLink   {
  
  private @Valid String href;
  private @Valid Boolean templated = false;
  private @Valid String type;
  private @Valid String deprecation;
  private @Valid String profile;
  private @Valid String title;
  private @Valid String hreflang;
  private @Valid String name;

  /**
   **/
  public HalLink href(String href) {
    this.href = href;
    return this;
  }

  
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
  public HalLink templated(Boolean templated) {
    this.templated = templated;
    return this;
  }

  
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
  public HalLink type(String type) {
    this.type = type;
    return this;
  }

  
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
  public HalLink deprecation(String deprecation) {
    this.deprecation = deprecation;
    return this;
  }

  
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
  public HalLink profile(String profile) {
    this.profile = profile;
    return this;
  }

  
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
  public HalLink title(String title) {
    this.title = title;
    return this;
  }

  
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
  public HalLink hreflang(String hreflang) {
    this.hreflang = hreflang;
    return this;
  }

  
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
  public HalLink name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HalLink halLink = (HalLink) o;
    return Objects.equals(this.href, halLink.href) &&
        Objects.equals(this.templated, halLink.templated) &&
        Objects.equals(this.type, halLink.type) &&
        Objects.equals(this.deprecation, halLink.deprecation) &&
        Objects.equals(this.profile, halLink.profile) &&
        Objects.equals(this.title, halLink.title) &&
        Objects.equals(this.hreflang, halLink.hreflang) &&
        Objects.equals(this.name, halLink.name);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

