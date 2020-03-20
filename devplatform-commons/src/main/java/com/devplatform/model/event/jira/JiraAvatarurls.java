package com.devplatform.model.event.jira;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraProjectAvatarurls
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraAvatarurls   {
  @JsonProperty("48x48")
  private String _48x48 = null;

  @JsonProperty("32x32")
  private String _32x32 = null;

  @JsonProperty("24x24")
  private String _24x24 = null;

  @JsonProperty("16x16")
  private String _16x16 = null;

  public JiraAvatarurls _48x48(String _48x48) {
    this._48x48 = _48x48;
    return this;
  }

  /**
   * Get _48x48
   * @return _48x48
  **/
  @ApiModelProperty(value = "")
  
    public String get48x48() {
    return _48x48;
  }

  public void set48x48(String _48x48) {
    this._48x48 = _48x48;
  }

  public JiraAvatarurls _32x32(String _32x32) {
    this._32x32 = _32x32;
    return this;
  }

  /**
   * Get _32x32
   * @return _32x32
  **/
  @ApiModelProperty(value = "")
  
    public String get32x32() {
    return _32x32;
  }

  public void set32x32(String _32x32) {
    this._32x32 = _32x32;
  }

  public JiraAvatarurls _24x24(String _24x24) {
    this._24x24 = _24x24;
    return this;
  }

  /**
   * Get _24x24
   * @return _24x24
  **/
  @ApiModelProperty(value = "")
  
    public String get24x24() {
    return _24x24;
  }

  public void set24x24(String _24x24) {
    this._24x24 = _24x24;
  }

  public JiraAvatarurls _16x16(String _16x16) {
    this._16x16 = _16x16;
    return this;
  }

  /**
   * Get _16x16
   * @return _16x16
  **/
  @ApiModelProperty(value = "")
  
    public String get16x16() {
    return _16x16;
  }

  public void set16x16(String _16x16) {
    this._16x16 = _16x16;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraAvatarurls jiraProjectAvatarurls = (JiraAvatarurls) o;
    return Objects.equals(this._48x48, jiraProjectAvatarurls._48x48) &&
        Objects.equals(this._32x32, jiraProjectAvatarurls._32x32) &&
        Objects.equals(this._24x24, jiraProjectAvatarurls._24x24) &&
        Objects.equals(this._16x16, jiraProjectAvatarurls._16x16);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_48x48, _32x32, _24x24, _16x16);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraAvatarurls {\n");
    
    sb.append("    _48x48: ").append(toIndentedString(_48x48)).append("\n");
    sb.append("    _32x32: ").append(toIndentedString(_32x32)).append("\n");
    sb.append("    _24x24: ").append(toIndentedString(_24x24)).append("\n");
    sb.append("    _16x16: ").append(toIndentedString(_16x16)).append("\n");
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
