package com.devplatform.model.event.jira;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssue
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssue   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("fields")
  private JiraIssueFields fields = null;

  public JiraIssue id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public JiraIssue self(String self) {
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

  public JiraIssue key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public JiraIssue fields(JiraIssueFields fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueFields getFields() {
    return fields;
  }

  public void setFields(JiraIssueFields fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssue jiraIssue = (JiraIssue) o;
    return Objects.equals(this.id, jiraIssue.id) &&
        Objects.equals(this.self, jiraIssue.self) &&
        Objects.equals(this.key, jiraIssue.key) &&
        Objects.equals(this.fields, jiraIssue.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, key, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
