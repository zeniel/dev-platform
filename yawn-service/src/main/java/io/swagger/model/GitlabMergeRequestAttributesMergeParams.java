package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GitlabMergeRequestAttributesMergeParams
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabMergeRequestAttributesMergeParams   {
  @JsonProperty("force_remove_source_branch")
  private Integer forceRemoveSourceBranch = null;

  public GitlabMergeRequestAttributesMergeParams forceRemoveSourceBranch(Integer forceRemoveSourceBranch) {
    this.forceRemoveSourceBranch = forceRemoveSourceBranch;
    return this;
  }

  /**
   * Get forceRemoveSourceBranch
   * @return forceRemoveSourceBranch
  **/
  @ApiModelProperty(value = "")
  
    public Integer getForceRemoveSourceBranch() {
    return forceRemoveSourceBranch;
  }

  public void setForceRemoveSourceBranch(Integer forceRemoveSourceBranch) {
    this.forceRemoveSourceBranch = forceRemoveSourceBranch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitlabMergeRequestAttributesMergeParams gitlabMergeRequestAttributesMergeParams = (GitlabMergeRequestAttributesMergeParams) o;
    return Objects.equals(this.forceRemoveSourceBranch, gitlabMergeRequestAttributesMergeParams.forceRemoveSourceBranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forceRemoveSourceBranch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabMergeRequestAttributesMergeParams {\n");
    
    sb.append("    forceRemoveSourceBranch: ").append(toIndentedString(forceRemoveSourceBranch)).append("\n");
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
