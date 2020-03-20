package com.devplatform.model.event.jira;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueFieldsVotes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueFieldsVotes   {
  @JsonProperty("votes")
  private Integer votes = null;

  @JsonProperty("hasVoted")
  private Boolean hasVoted = null;

  @JsonProperty("self")
  private String self = null;

  public JiraIssueFieldsVotes votes(Integer votes) {
    this.votes = votes;
    return this;
  }

  /**
   * Get votes
   * @return votes
  **/
  @ApiModelProperty(value = "")
  
    public Integer getVotes() {
    return votes;
  }

  public void setVotes(Integer votes) {
    this.votes = votes;
  }

  public JiraIssueFieldsVotes hasVoted(Boolean hasVoted) {
    this.hasVoted = hasVoted;
    return this;
  }

  /**
   * Get hasVoted
   * @return hasVoted
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isHasVoted() {
    return hasVoted;
  }

  public void setHasVoted(Boolean hasVoted) {
    this.hasVoted = hasVoted;
  }

  public JiraIssueFieldsVotes self(String self) {
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
    JiraIssueFieldsVotes jiraIssueFieldsVotes = (JiraIssueFieldsVotes) o;
    return Objects.equals(this.votes, jiraIssueFieldsVotes.votes) &&
        Objects.equals(this.hasVoted, jiraIssueFieldsVotes.hasVoted) &&
        Objects.equals(this.self, jiraIssueFieldsVotes.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(votes, hasVoted, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueFieldsVotes {\n");
    
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
    sb.append("    hasVoted: ").append(toIndentedString(hasVoted)).append("\n");
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
