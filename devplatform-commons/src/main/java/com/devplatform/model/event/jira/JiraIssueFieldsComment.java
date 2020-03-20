package com.devplatform.model.event.jira;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueFieldsComment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueFieldsComment   {
  @JsonProperty("comments")
  @Valid
  private List<JiraIssueComment> comments = null;

  @JsonProperty("maxResults")
  private Integer maxResults = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("startAt")
  private Integer startAt = null;

  public JiraIssueFieldsComment comments(List<JiraIssueComment> comments) {
    this.comments = comments;
    return this;
  }

  public JiraIssueFieldsComment addCommentsItem(JiraIssueComment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<JiraIssueComment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<JiraIssueComment> getComments() {
    return comments;
  }

  public void setComments(List<JiraIssueComment> comments) {
    this.comments = comments;
  }

  public JiraIssueFieldsComment maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * Get maxResults
   * @return maxResults
  **/
  @ApiModelProperty(value = "")
  
    public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public JiraIssueFieldsComment total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public JiraIssueFieldsComment startAt(Integer startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * Get startAt
   * @return startAt
  **/
  @ApiModelProperty(value = "")
  
    public Integer getStartAt() {
    return startAt;
  }

  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueFieldsComment jiraIssueFieldsComment = (JiraIssueFieldsComment) o;
    return Objects.equals(this.comments, jiraIssueFieldsComment.comments) &&
        Objects.equals(this.maxResults, jiraIssueFieldsComment.maxResults) &&
        Objects.equals(this.total, jiraIssueFieldsComment.total) &&
        Objects.equals(this.startAt, jiraIssueFieldsComment.startAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, maxResults, total, startAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueFieldsComment {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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
