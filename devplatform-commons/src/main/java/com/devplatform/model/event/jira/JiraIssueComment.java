package com.devplatform.model.event.jira;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueComment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueComment   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("author")
  private JiraUser author = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("updateAuthor")
  private JiraUser updateAuthor = null;

  @JsonProperty("updated")
  private String updated = null;

  @JsonProperty("self")
  private String self = null;

  public JiraIssueComment id(BigDecimal id) {
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

  public JiraIssueComment body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  
    public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public JiraIssueComment author(JiraUser author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraUser getAuthor() {
    return author;
  }

  public void setAuthor(JiraUser author) {
    this.author = author;
  }

  public JiraIssueComment created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public JiraIssueComment updateAuthor(JiraUser updateAuthor) {
    this.updateAuthor = updateAuthor;
    return this;
  }

  /**
   * Get updateAuthor
   * @return updateAuthor
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraUser getUpdateAuthor() {
    return updateAuthor;
  }

  public void setUpdateAuthor(JiraUser updateAuthor) {
    this.updateAuthor = updateAuthor;
  }

  public JiraIssueComment updated(String updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public JiraIssueComment self(String self) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueComment jiraIssueComment = (JiraIssueComment) o;
    return Objects.equals(this.id, jiraIssueComment.id) &&
        Objects.equals(this.body, jiraIssueComment.body) &&
        Objects.equals(this.author, jiraIssueComment.author) &&
        Objects.equals(this.created, jiraIssueComment.created) &&
        Objects.equals(this.updateAuthor, jiraIssueComment.updateAuthor) &&
        Objects.equals(this.updated, jiraIssueComment.updated) &&
        Objects.equals(this.self, jiraIssueComment.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, body, author, created, updateAuthor, updated, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueComment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updateAuthor: ").append(toIndentedString(updateAuthor)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
