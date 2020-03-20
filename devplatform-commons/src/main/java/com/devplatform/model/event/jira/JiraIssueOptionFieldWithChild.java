package com.devplatform.model.event.jira;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueOptionFieldWithChild
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueOptionFieldWithChild   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("child")
  private JiraIssueOptionField child = null;

  public JiraIssueOptionFieldWithChild id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public JiraIssueOptionFieldWithChild value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public JiraIssueOptionFieldWithChild self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  
    public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public JiraIssueOptionFieldWithChild child(JiraIssueOptionField child) {
    this.child = child;
    return this;
  }

  /**
   * Get child
   * @return child
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueOptionField getChild() {
    return child;
  }

  public void setChild(JiraIssueOptionField child) {
    this.child = child;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueOptionFieldWithChild jiraIssueOptionFieldWithChild = (JiraIssueOptionFieldWithChild) o;
    return Objects.equals(this.id, jiraIssueOptionFieldWithChild.id) &&
        Objects.equals(this.value, jiraIssueOptionFieldWithChild.value) &&
        Objects.equals(this.self, jiraIssueOptionFieldWithChild.self) &&
        Objects.equals(this.child, jiraIssueOptionFieldWithChild.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, self, child);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueOptionFieldWithChild {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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
