package com.devplatform.model.event.gitlab;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabMergeRequestAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabMergeRequestAttributes   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("iid")
  private BigDecimal iid = null;

  @JsonProperty("assignee_id")
  private BigDecimal assigneeId = null;

  @JsonProperty("author_id")
  private BigDecimal authorId = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("head_pipeline_id")
  private BigDecimal headPipelineId = null;

  @JsonProperty("last_edited_at")
  private String lastEditedAt = null;

  @JsonProperty("last_edited_by_id")
  private BigDecimal lastEditedById = null;

  @JsonProperty("merge_commit_sha")
  private String mergeCommitSha = null;

  @JsonProperty("merge_error")
  private String mergeError = null;

  @JsonProperty("merge_params")
  private GitlabMergeRequestAttributesMergeParams mergeParams = null;

  /**
   * Gets or Sets mergeStatus
   */
  public enum MergeStatusEnum {
    CAN_BE_MERGED("can_be_merged"),
    
    UNCHECKED("unchecked"),
    
    CAN_NOT__BE_MERGED("can(not)_be_merged"),
    
    CHECKING("checking");

    private String value;

    MergeStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MergeStatusEnum fromValue(String text) {
      for (MergeStatusEnum b : MergeStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("merge_status")
  private MergeStatusEnum mergeStatus = null;

  @JsonProperty("merge_user_id")
  private BigDecimal mergeUserId = null;

  @JsonProperty("merge_when_pipeline_succeeds")
  private Boolean mergeWhenPipelineSucceeds = null;

  @JsonProperty("milestone_id")
  private BigDecimal milestoneId = null;

  @JsonProperty("source_branch")
  private String sourceBranch = null;

  @JsonProperty("source_project_id")
  private BigDecimal sourceProjectId = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    MERGED("merged"),
    
    OPENED("opened"),
    
    CLOSED("closed"),
    
    LOCKED("locked");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("target_branch")
  private String targetBranch = "master";

  @JsonProperty("target_project_id")
  private BigDecimal targetProjectId = null;

  @JsonProperty("time_estimate")
  private BigDecimal timeEstimate = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("updated_by_id")
  private BigDecimal updatedById = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("source")
  private GitlabProject source = null;

  @JsonProperty("target")
  private GitlabProject target = null;

  @JsonProperty("last_commit")
  private GitlabCommit lastCommit = null;

  @JsonProperty("work_in_progress")
  private Boolean workInProgress = null;

  @JsonProperty("total_time_spent")
  private Integer totalTimeSpent = null;

  @JsonProperty("human_total_time_spent")
  private Integer humanTotalTimeSpent = null;

  @JsonProperty("human_time_estimate")
  private Integer humanTimeEstimate = null;

  @JsonProperty("assignee_ids")
  @Valid
  private List<BigDecimal> assigneeIds = null;

  public GitlabMergeRequestAttributes id(BigDecimal id) {
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

  public GitlabMergeRequestAttributes iid(BigDecimal iid) {
    this.iid = iid;
    return this;
  }

  /**
   * Merge request Id
   * @return iid
  **/
  @ApiModelProperty(value = "Merge request Id")
  
    @Valid
    public BigDecimal getIid() {
    return iid;
  }

  public void setIid(BigDecimal iid) {
    this.iid = iid;
  }

  public GitlabMergeRequestAttributes assigneeId(BigDecimal assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * Get assigneeId
   * @return assigneeId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(BigDecimal assigneeId) {
    this.assigneeId = assigneeId;
  }

  public GitlabMergeRequestAttributes authorId(BigDecimal authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * Get authorId
   * @return authorId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getAuthorId() {
    return authorId;
  }

  public void setAuthorId(BigDecimal authorId) {
    this.authorId = authorId;
  }

  public GitlabMergeRequestAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GitlabMergeRequestAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GitlabMergeRequestAttributes headPipelineId(BigDecimal headPipelineId) {
    this.headPipelineId = headPipelineId;
    return this;
  }

  /**
   * Get headPipelineId
   * @return headPipelineId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getHeadPipelineId() {
    return headPipelineId;
  }

  public void setHeadPipelineId(BigDecimal headPipelineId) {
    this.headPipelineId = headPipelineId;
  }

  public GitlabMergeRequestAttributes lastEditedAt(String lastEditedAt) {
    this.lastEditedAt = lastEditedAt;
    return this;
  }

  /**
   * Get lastEditedAt
   * @return lastEditedAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public String getLastEditedAt() {
    return lastEditedAt;
  }

  public void setLastEditedAt(String lastEditedAt) {
    this.lastEditedAt = lastEditedAt;
  }

  public GitlabMergeRequestAttributes lastEditedById(BigDecimal lastEditedById) {
    this.lastEditedById = lastEditedById;
    return this;
  }

  /**
   * Get lastEditedById
   * @return lastEditedById
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getLastEditedById() {
    return lastEditedById;
  }

  public void setLastEditedById(BigDecimal lastEditedById) {
    this.lastEditedById = lastEditedById;
  }

  public GitlabMergeRequestAttributes mergeCommitSha(String mergeCommitSha) {
    this.mergeCommitSha = mergeCommitSha;
    return this;
  }

  /**
   * Get mergeCommitSha
   * @return mergeCommitSha
  **/
  @ApiModelProperty(value = "")
  
    public String getMergeCommitSha() {
    return mergeCommitSha;
  }

  public void setMergeCommitSha(String mergeCommitSha) {
    this.mergeCommitSha = mergeCommitSha;
  }

  public GitlabMergeRequestAttributes mergeError(String mergeError) {
    this.mergeError = mergeError;
    return this;
  }

  /**
   * Get mergeError
   * @return mergeError
  **/
  @ApiModelProperty(value = "")
  
    public String getMergeError() {
    return mergeError;
  }

  public void setMergeError(String mergeError) {
    this.mergeError = mergeError;
  }

  public GitlabMergeRequestAttributes mergeParams(GitlabMergeRequestAttributesMergeParams mergeParams) {
    this.mergeParams = mergeParams;
    return this;
  }

  /**
   * Get mergeParams
   * @return mergeParams
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GitlabMergeRequestAttributesMergeParams getMergeParams() {
    return mergeParams;
  }

  public void setMergeParams(GitlabMergeRequestAttributesMergeParams mergeParams) {
    this.mergeParams = mergeParams;
  }

  public GitlabMergeRequestAttributes mergeStatus(MergeStatusEnum mergeStatus) {
    this.mergeStatus = mergeStatus;
    return this;
  }

  /**
   * Get mergeStatus
   * @return mergeStatus
  **/
  @ApiModelProperty(value = "")
  
    public MergeStatusEnum getMergeStatus() {
    return mergeStatus;
  }

  public void setMergeStatus(MergeStatusEnum mergeStatus) {
    this.mergeStatus = mergeStatus;
  }

  public GitlabMergeRequestAttributes mergeUserId(BigDecimal mergeUserId) {
    this.mergeUserId = mergeUserId;
    return this;
  }

  /**
   * Get mergeUserId
   * @return mergeUserId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getMergeUserId() {
    return mergeUserId;
  }

  public void setMergeUserId(BigDecimal mergeUserId) {
    this.mergeUserId = mergeUserId;
  }

  public GitlabMergeRequestAttributes mergeWhenPipelineSucceeds(Boolean mergeWhenPipelineSucceeds) {
    this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
    return this;
  }

  /**
   * Get mergeWhenPipelineSucceeds
   * @return mergeWhenPipelineSucceeds
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isMergeWhenPipelineSucceeds() {
    return mergeWhenPipelineSucceeds;
  }

  public void setMergeWhenPipelineSucceeds(Boolean mergeWhenPipelineSucceeds) {
    this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
  }

  public GitlabMergeRequestAttributes milestoneId(BigDecimal milestoneId) {
    this.milestoneId = milestoneId;
    return this;
  }

  /**
   * Get milestoneId
   * @return milestoneId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getMilestoneId() {
    return milestoneId;
  }

  public void setMilestoneId(BigDecimal milestoneId) {
    this.milestoneId = milestoneId;
  }

  public GitlabMergeRequestAttributes sourceBranch(String sourceBranch) {
    this.sourceBranch = sourceBranch;
    return this;
  }

  /**
   * Get sourceBranch
   * @return sourceBranch
  **/
  @ApiModelProperty(value = "")
  
    public String getSourceBranch() {
    return sourceBranch;
  }

  public void setSourceBranch(String sourceBranch) {
    this.sourceBranch = sourceBranch;
  }

  public GitlabMergeRequestAttributes sourceProjectId(BigDecimal sourceProjectId) {
    this.sourceProjectId = sourceProjectId;
    return this;
  }

  /**
   * Get sourceProjectId
   * @return sourceProjectId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getSourceProjectId() {
    return sourceProjectId;
  }

  public void setSourceProjectId(BigDecimal sourceProjectId) {
    this.sourceProjectId = sourceProjectId;
  }

  public GitlabMergeRequestAttributes state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  
    public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public GitlabMergeRequestAttributes targetBranch(String targetBranch) {
    this.targetBranch = targetBranch;
    return this;
  }

  /**
   * Get targetBranch
   * @return targetBranch
  **/
  @ApiModelProperty(value = "")
  
    public String getTargetBranch() {
    return targetBranch;
  }

  public void setTargetBranch(String targetBranch) {
    this.targetBranch = targetBranch;
  }

  public GitlabMergeRequestAttributes targetProjectId(BigDecimal targetProjectId) {
    this.targetProjectId = targetProjectId;
    return this;
  }

  /**
   * Get targetProjectId
   * @return targetProjectId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getTargetProjectId() {
    return targetProjectId;
  }

  public void setTargetProjectId(BigDecimal targetProjectId) {
    this.targetProjectId = targetProjectId;
  }

  public GitlabMergeRequestAttributes timeEstimate(BigDecimal timeEstimate) {
    this.timeEstimate = timeEstimate;
    return this;
  }

  /**
   * Get timeEstimate
   * @return timeEstimate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getTimeEstimate() {
    return timeEstimate;
  }

  public void setTimeEstimate(BigDecimal timeEstimate) {
    this.timeEstimate = timeEstimate;
  }

  public GitlabMergeRequestAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GitlabMergeRequestAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public GitlabMergeRequestAttributes updatedById(BigDecimal updatedById) {
    this.updatedById = updatedById;
    return this;
  }

  /**
   * Get updatedById
   * @return updatedById
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getUpdatedById() {
    return updatedById;
  }

  public void setUpdatedById(BigDecimal updatedById) {
    this.updatedById = updatedById;
  }

  public GitlabMergeRequestAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GitlabMergeRequestAttributes source(GitlabProject source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GitlabProject getSource() {
    return source;
  }

  public void setSource(GitlabProject source) {
    this.source = source;
  }

  public GitlabMergeRequestAttributes target(GitlabProject target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GitlabProject getTarget() {
    return target;
  }

  public void setTarget(GitlabProject target) {
    this.target = target;
  }

  public GitlabMergeRequestAttributes lastCommit(GitlabCommit lastCommit) {
    this.lastCommit = lastCommit;
    return this;
  }

  /**
   * Get lastCommit
   * @return lastCommit
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GitlabCommit getLastCommit() {
    return lastCommit;
  }

  public void setLastCommit(GitlabCommit lastCommit) {
    this.lastCommit = lastCommit;
  }

  public GitlabMergeRequestAttributes workInProgress(Boolean workInProgress) {
    this.workInProgress = workInProgress;
    return this;
  }

  /**
   * Get workInProgress
   * @return workInProgress
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isWorkInProgress() {
    return workInProgress;
  }

  public void setWorkInProgress(Boolean workInProgress) {
    this.workInProgress = workInProgress;
  }

  public GitlabMergeRequestAttributes totalTimeSpent(Integer totalTimeSpent) {
    this.totalTimeSpent = totalTimeSpent;
    return this;
  }

  /**
   * Get totalTimeSpent
   * @return totalTimeSpent
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalTimeSpent() {
    return totalTimeSpent;
  }

  public void setTotalTimeSpent(Integer totalTimeSpent) {
    this.totalTimeSpent = totalTimeSpent;
  }

  public GitlabMergeRequestAttributes humanTotalTimeSpent(Integer humanTotalTimeSpent) {
    this.humanTotalTimeSpent = humanTotalTimeSpent;
    return this;
  }

  /**
   * Get humanTotalTimeSpent
   * @return humanTotalTimeSpent
  **/
  @ApiModelProperty(value = "")
  
    public Integer getHumanTotalTimeSpent() {
    return humanTotalTimeSpent;
  }

  public void setHumanTotalTimeSpent(Integer humanTotalTimeSpent) {
    this.humanTotalTimeSpent = humanTotalTimeSpent;
  }

  public GitlabMergeRequestAttributes humanTimeEstimate(Integer humanTimeEstimate) {
    this.humanTimeEstimate = humanTimeEstimate;
    return this;
  }

  /**
   * Get humanTimeEstimate
   * @return humanTimeEstimate
  **/
  @ApiModelProperty(value = "")
  
    public Integer getHumanTimeEstimate() {
    return humanTimeEstimate;
  }

  public void setHumanTimeEstimate(Integer humanTimeEstimate) {
    this.humanTimeEstimate = humanTimeEstimate;
  }

  public GitlabMergeRequestAttributes assigneeIds(List<BigDecimal> assigneeIds) {
    this.assigneeIds = assigneeIds;
    return this;
  }

  public GitlabMergeRequestAttributes addAssigneeIdsItem(BigDecimal assigneeIdsItem) {
    if (this.assigneeIds == null) {
      this.assigneeIds = new ArrayList<BigDecimal>();
    }
    this.assigneeIds.add(assigneeIdsItem);
    return this;
  }

  /**
   * Get assigneeIds
   * @return assigneeIds
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<BigDecimal> getAssigneeIds() {
    return assigneeIds;
  }

  public void setAssigneeIds(List<BigDecimal> assigneeIds) {
    this.assigneeIds = assigneeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitlabMergeRequestAttributes gitlabMergeRequestAttributes = (GitlabMergeRequestAttributes) o;
    return Objects.equals(this.id, gitlabMergeRequestAttributes.id) &&
        Objects.equals(this.iid, gitlabMergeRequestAttributes.iid) &&
        Objects.equals(this.assigneeId, gitlabMergeRequestAttributes.assigneeId) &&
        Objects.equals(this.authorId, gitlabMergeRequestAttributes.authorId) &&
        Objects.equals(this.createdAt, gitlabMergeRequestAttributes.createdAt) &&
        Objects.equals(this.description, gitlabMergeRequestAttributes.description) &&
        Objects.equals(this.headPipelineId, gitlabMergeRequestAttributes.headPipelineId) &&
        Objects.equals(this.lastEditedAt, gitlabMergeRequestAttributes.lastEditedAt) &&
        Objects.equals(this.lastEditedById, gitlabMergeRequestAttributes.lastEditedById) &&
        Objects.equals(this.mergeCommitSha, gitlabMergeRequestAttributes.mergeCommitSha) &&
        Objects.equals(this.mergeError, gitlabMergeRequestAttributes.mergeError) &&
        Objects.equals(this.mergeParams, gitlabMergeRequestAttributes.mergeParams) &&
        Objects.equals(this.mergeStatus, gitlabMergeRequestAttributes.mergeStatus) &&
        Objects.equals(this.mergeUserId, gitlabMergeRequestAttributes.mergeUserId) &&
        Objects.equals(this.mergeWhenPipelineSucceeds, gitlabMergeRequestAttributes.mergeWhenPipelineSucceeds) &&
        Objects.equals(this.milestoneId, gitlabMergeRequestAttributes.milestoneId) &&
        Objects.equals(this.sourceBranch, gitlabMergeRequestAttributes.sourceBranch) &&
        Objects.equals(this.sourceProjectId, gitlabMergeRequestAttributes.sourceProjectId) &&
        Objects.equals(this.state, gitlabMergeRequestAttributes.state) &&
        Objects.equals(this.targetBranch, gitlabMergeRequestAttributes.targetBranch) &&
        Objects.equals(this.targetProjectId, gitlabMergeRequestAttributes.targetProjectId) &&
        Objects.equals(this.timeEstimate, gitlabMergeRequestAttributes.timeEstimate) &&
        Objects.equals(this.title, gitlabMergeRequestAttributes.title) &&
        Objects.equals(this.updatedAt, gitlabMergeRequestAttributes.updatedAt) &&
        Objects.equals(this.updatedById, gitlabMergeRequestAttributes.updatedById) &&
        Objects.equals(this.url, gitlabMergeRequestAttributes.url) &&
        Objects.equals(this.source, gitlabMergeRequestAttributes.source) &&
        Objects.equals(this.target, gitlabMergeRequestAttributes.target) &&
        Objects.equals(this.lastCommit, gitlabMergeRequestAttributes.lastCommit) &&
        Objects.equals(this.workInProgress, gitlabMergeRequestAttributes.workInProgress) &&
        Objects.equals(this.totalTimeSpent, gitlabMergeRequestAttributes.totalTimeSpent) &&
        Objects.equals(this.humanTotalTimeSpent, gitlabMergeRequestAttributes.humanTotalTimeSpent) &&
        Objects.equals(this.humanTimeEstimate, gitlabMergeRequestAttributes.humanTimeEstimate) &&
        Objects.equals(this.assigneeIds, gitlabMergeRequestAttributes.assigneeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, iid, assigneeId, authorId, createdAt, description, headPipelineId, lastEditedAt, lastEditedById, mergeCommitSha, mergeError, mergeParams, mergeStatus, mergeUserId, mergeWhenPipelineSucceeds, milestoneId, sourceBranch, sourceProjectId, state, targetBranch, targetProjectId, timeEstimate, title, updatedAt, updatedById, url, source, target, lastCommit, workInProgress, totalTimeSpent, humanTotalTimeSpent, humanTimeEstimate, assigneeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabMergeRequestAttributes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    headPipelineId: ").append(toIndentedString(headPipelineId)).append("\n");
    sb.append("    lastEditedAt: ").append(toIndentedString(lastEditedAt)).append("\n");
    sb.append("    lastEditedById: ").append(toIndentedString(lastEditedById)).append("\n");
    sb.append("    mergeCommitSha: ").append(toIndentedString(mergeCommitSha)).append("\n");
    sb.append("    mergeError: ").append(toIndentedString(mergeError)).append("\n");
    sb.append("    mergeParams: ").append(toIndentedString(mergeParams)).append("\n");
    sb.append("    mergeStatus: ").append(toIndentedString(mergeStatus)).append("\n");
    sb.append("    mergeUserId: ").append(toIndentedString(mergeUserId)).append("\n");
    sb.append("    mergeWhenPipelineSucceeds: ").append(toIndentedString(mergeWhenPipelineSucceeds)).append("\n");
    sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
    sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
    sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
    sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
    sb.append("    timeEstimate: ").append(toIndentedString(timeEstimate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedById: ").append(toIndentedString(updatedById)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    lastCommit: ").append(toIndentedString(lastCommit)).append("\n");
    sb.append("    workInProgress: ").append(toIndentedString(workInProgress)).append("\n");
    sb.append("    totalTimeSpent: ").append(toIndentedString(totalTimeSpent)).append("\n");
    sb.append("    humanTotalTimeSpent: ").append(toIndentedString(humanTotalTimeSpent)).append("\n");
    sb.append("    humanTimeEstimate: ").append(toIndentedString(humanTimeEstimate)).append("\n");
    sb.append("    assigneeIds: ").append(toIndentedString(assigneeIds)).append("\n");
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
