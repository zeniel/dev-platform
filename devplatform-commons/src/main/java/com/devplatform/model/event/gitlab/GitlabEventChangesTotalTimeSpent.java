package com.devplatform.model.event.gitlab;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabEventChangesTotalTimeSpent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventChangesTotalTimeSpent   {
  @JsonProperty("previous")
  private Integer previous = null;

  @JsonProperty("current")
  private Integer current = null;

  public GitlabEventChangesTotalTimeSpent previous(Integer previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  
    public Integer getPrevious() {
    return previous;
  }

  public void setPrevious(Integer previous) {
    this.previous = previous;
  }

  public GitlabEventChangesTotalTimeSpent current(Integer current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(value = "")
  
    public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitlabEventChangesTotalTimeSpent gitlabEventChangesTotalTimeSpent = (GitlabEventChangesTotalTimeSpent) o;
    return Objects.equals(this.previous, gitlabEventChangesTotalTimeSpent.previous) &&
        Objects.equals(this.current, gitlabEventChangesTotalTimeSpent.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previous, current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabEventChangesTotalTimeSpent {\n");
    
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
