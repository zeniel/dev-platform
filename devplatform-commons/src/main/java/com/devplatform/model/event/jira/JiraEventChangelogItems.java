package com.devplatform.model.event.jira;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraEventChangelogItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraEventChangelogItems   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("fieldtype")
  private String fieldtype = null;

  @JsonProperty("from")
  private BigDecimal from = null;

  @JsonProperty("fromString")
  private String fromString = null;

  @JsonProperty("to")
  private BigDecimal to = null;

  @JsonProperty("toString")
  private String toString = null;

  public JiraEventChangelogItems field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(value = "")
  
    public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public JiraEventChangelogItems fieldtype(String fieldtype) {
    this.fieldtype = fieldtype;
    return this;
  }

  /**
   * Get fieldtype
   * @return fieldtype
  **/
  @ApiModelProperty(value = "")
  
    public String getFieldtype() {
    return fieldtype;
  }

  public void setFieldtype(String fieldtype) {
    this.fieldtype = fieldtype;
  }

  public JiraEventChangelogItems from(BigDecimal from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getFrom() {
    return from;
  }

  public void setFrom(BigDecimal from) {
    this.from = from;
  }

  public JiraEventChangelogItems fromString(String fromString) {
    this.fromString = fromString;
    return this;
  }

  /**
   * Get fromString
   * @return fromString
  **/
  @ApiModelProperty(value = "")
  
    public String getFromString() {
    return fromString;
  }

  public void setFromString(String fromString) {
    this.fromString = fromString;
  }

  public JiraEventChangelogItems to(BigDecimal to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getTo() {
    return to;
  }

  public void setTo(BigDecimal to) {
    this.to = to;
  }

  public JiraEventChangelogItems toString(String toString) {
    this.toString = toString;
    return this;
  }

  /**
   * Get toString
   * @return toString
  **/
  @ApiModelProperty(value = "")
  
    public String getToString() {
    return toString;
  }

  public void setToString(String toString) {
    this.toString = toString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraEventChangelogItems jiraEventChangelogItems = (JiraEventChangelogItems) o;
    return Objects.equals(this.field, jiraEventChangelogItems.field) &&
        Objects.equals(this.fieldtype, jiraEventChangelogItems.fieldtype) &&
        Objects.equals(this.from, jiraEventChangelogItems.from) &&
        Objects.equals(this.fromString, jiraEventChangelogItems.fromString) &&
        Objects.equals(this.to, jiraEventChangelogItems.to) &&
        Objects.equals(this.toString, jiraEventChangelogItems.toString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, fieldtype, from, fromString, to, toString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraEventChangelogItems {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fieldtype: ").append(toIndentedString(fieldtype)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromString: ").append(toIndentedString(fromString)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    toString: ").append(toIndentedString(toString)).append("\n");
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
