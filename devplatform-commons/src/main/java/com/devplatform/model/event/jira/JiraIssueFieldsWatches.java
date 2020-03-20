package com.devplatform.model.event.jira;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Acompanhantes
 */
@ApiModel(description = "Acompanhantes")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueFieldsWatches   {
  @JsonProperty("watchCount")
  private Integer watchCount = null;

  @JsonProperty("isWatching")
  private Boolean isWatching = null;

  @JsonProperty("self")
  private String self = null;

  public JiraIssueFieldsWatches watchCount(Integer watchCount) {
    this.watchCount = watchCount;
    return this;
  }

  /**
   * Get watchCount
   * @return watchCount
  **/
  @ApiModelProperty(value = "")
  
    public Integer getWatchCount() {
    return watchCount;
  }

  public void setWatchCount(Integer watchCount) {
    this.watchCount = watchCount;
  }

  public JiraIssueFieldsWatches isWatching(Boolean isWatching) {
    this.isWatching = isWatching;
    return this;
  }

  /**
   * Get isWatching
   * @return isWatching
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsWatching() {
    return isWatching;
  }

  public void setIsWatching(Boolean isWatching) {
    this.isWatching = isWatching;
  }

  public JiraIssueFieldsWatches self(String self) {
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
    JiraIssueFieldsWatches jiraIssueFieldsWatches = (JiraIssueFieldsWatches) o;
    return Objects.equals(this.watchCount, jiraIssueFieldsWatches.watchCount) &&
        Objects.equals(this.isWatching, jiraIssueFieldsWatches.isWatching) &&
        Objects.equals(this.self, jiraIssueFieldsWatches.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchCount, isWatching, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueFieldsWatches {\n");
    
    sb.append("    watchCount: ").append(toIndentedString(watchCount)).append("\n");
    sb.append("    isWatching: ").append(toIndentedString(isWatching)).append("\n");
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
