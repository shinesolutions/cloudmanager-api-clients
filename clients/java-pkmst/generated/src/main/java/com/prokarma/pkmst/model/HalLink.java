package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * HalLink
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-22T02:53:26.039Z[GMT]")

public class HalLink   {
  @JsonProperty("href")
  private String href;

  @JsonProperty("templated")
  private Boolean templated = false;

  @JsonProperty("type")
  private String type;

  @JsonProperty("deprecation")
  private String deprecation;

  @JsonProperty("profile")
  private String profile;

  @JsonProperty("title")
  private String title;

  @JsonProperty("hreflang")
  private String hreflang;

  @JsonProperty("name")
  private String name;

  public HalLink href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public HalLink templated(Boolean templated) {
    this.templated = templated;
    return this;
  }

   /**
   * Get templated
   * @return templated
  **/
  @ApiModelProperty(value = "")
  public Boolean getTemplated() {
    return templated;
  }

  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }

  public HalLink type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HalLink deprecation(String deprecation) {
    this.deprecation = deprecation;
    return this;
  }

   /**
   * Get deprecation
   * @return deprecation
  **/
  @ApiModelProperty(value = "")
  public String getDeprecation() {
    return deprecation;
  }

  public void setDeprecation(String deprecation) {
    this.deprecation = deprecation;
  }

  public HalLink profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public HalLink title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public HalLink hreflang(String hreflang) {
    this.hreflang = hreflang;
    return this;
  }

   /**
   * Get hreflang
   * @return hreflang
  **/
  @ApiModelProperty(value = "")
  public String getHreflang() {
    return hreflang;
  }

  public void setHreflang(String hreflang) {
    this.hreflang = hreflang;
  }

  public HalLink name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
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

