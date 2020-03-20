package com.devplatform.model.event.gitlab;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabEventChanges
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventChanges   {
  @JsonProperty("total_time_spent")
  private GitlabEventChangesTotalTimeSpent totalTimeSpent = null;

  public GitlabEventChanges totalTimeSpent(GitlabEventChangesTotalTimeSpent totalTimeSpent) {
    this.totalTimeSpent = totalTimeSpent;
    return this;
  }

  /**
   * Get totalTimeSpent
   * @return totalTimeSpent
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GitlabEventChangesTotalTimeSpent getTotalTimeSpent() {
    return totalTimeSpent;
  }

  public void setTotalTimeSpent(GitlabEventChangesTotalTimeSpent totalTimeSpent) {
    this.totalTimeSpent = totalTimeSpent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitlabEventChanges gitlabEventChanges = (GitlabEventChanges) o;
    return Objects.equals(this.totalTimeSpent, gitlabEventChanges.totalTimeSpent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTimeSpent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabEventChanges {\n");
    
    sb.append("    totalTimeSpent: ").append(toIndentedString(totalTimeSpent)).append("\n");
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
