package com.devplatform.model.event.jira;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueFields
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueFields   {
  @JsonProperty("project")
  private JiraProject project = null;

  @JsonProperty("issuetype")
  private JiraIssuetype issuetype = null;

  @JsonProperty("environment")
  private String environment = null;

  @JsonProperty("customfield_11205")
  private JiraIssueOptionFieldWithChild customfield11205 = null;

  @JsonProperty("customfield_11302")
  @Valid
  private List<String> customfield11302 = null;

  @JsonProperty("creator")
  private JiraUser creator = null;

  @JsonProperty("reporter")
  private JiraUser reporter = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("attachment")
  @Valid
  private List<Object> attachment = null;

  @JsonProperty("versions")
  @Valid
  private List<JiraVersion> versions = null;

  @JsonProperty("labels")
  @Valid
  private List<String> labels = null;

  @JsonProperty("customfield_11200")
  private String customfield11200 = null;

  @JsonProperty("customfield_13004")
  private JiraIssueOptionField customfield13004 = null;

  @JsonProperty("customfield_13601")
  private String customfield13601 = null;

  @JsonProperty("subtasks")
  @Valid
  private List<JiraIssue> subtasks = null;

  @JsonProperty("customfield_13700")
  @Valid
  private List<String> customfield13700 = null;

  @JsonProperty("priority")
  private JiraIssueFieldsPriority priority = null;

  @JsonProperty("customfield_10204")
  private Integer customfield10204 = null;

  @JsonProperty("customfield_10201")
  @Valid
  private List<String> customfield10201 = null;

  @JsonProperty("customfield_11503")
  private JiraIssueOptionField customfield11503 = null;

  @JsonProperty("customfield_11502")
  private JiraIssueOptionField customfield11502 = null;

  @JsonProperty("issuelinks")
  @Valid
  private List<Object> issuelinks = null;

  @JsonProperty("customfield_11700")
  @Valid
  private List<String> customfield11700 = null;

  @JsonProperty("votes")
  private JiraIssueFieldsVotes votes = null;

  @JsonProperty("watches")
  private JiraIssueFieldsWatches watches = null;

  @JsonProperty("assignee")
  private JiraUser assignee = null;

  @JsonProperty("status")
  private JiraStatus status = null;

  @JsonProperty("updated")
  private String updated = null;

  @JsonProperty("customfield_11900")
  private JiraIssueOptionField customfield11900 = null;

  @JsonProperty("customfield_11401")
  private JiraIssueOptionField customfield11401 = null;

  @JsonProperty("customfield_12303")
  private JiraUser customfield12303 = null;

  @JsonProperty("customfield_13500")
  private Object customfield13500 = null;

  @JsonProperty("customfield_13605")
  private Object customfield13605 = null;

  @JsonProperty("customfield_13606")
  private Object customfield13606 = null;

  @JsonProperty("timeestimate")
  private BigDecimal timeestimate = null;

  @JsonProperty("timespent")
  private BigDecimal timespent = null;

  @JsonProperty("duedate")
  private String duedate = null;

  @JsonProperty("customfield_11901")
  private JiraIssueOptionField customfield11901 = null;

  @JsonProperty("customfield_12000")
  private JiraUser customfield12000 = null;

  @JsonProperty("customfield_13834")
  private Integer customfield13834 = null;

  @JsonProperty("customfield_13835")
  private Integer customfield13835 = null;

  @JsonProperty("customfield_13836")
  private String customfield13836 = null;

  @JsonProperty("resolution")
  private JiraIssueFieldsResolution resolution = null;

  @JsonProperty("resolutiondate")
  private String resolutiondate = null;

  @JsonProperty("customfield_13837")
  private String customfield13837 = null;

  @JsonProperty("fixVersions")
  @Valid
  private List<JiraVersion> fixVersions = null;

  @JsonProperty("customfield_13909")
  private String customfield13909 = null;

  @JsonProperty("comment")
  private JiraIssueFieldsComment comment = null;

  public JiraIssueFields project(JiraProject project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public JiraProject getProject() {
    return project;
  }

  public void setProject(JiraProject project) {
    this.project = project;
  }

  public JiraIssueFields issuetype(JiraIssuetype issuetype) {
    this.issuetype = issuetype;
    return this;
  }

  /**
   * Get issuetype
   * @return issuetype
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public JiraIssuetype getIssuetype() {
    return issuetype;
  }

  public void setIssuetype(JiraIssuetype issuetype) {
    this.issuetype = issuetype;
  }

  public JiraIssueFields environment(String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Ambiente
   * @return environment
  **/
  @ApiModelProperty(value = "Ambiente")
  
    public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public JiraIssueFields customfield11205(JiraIssueOptionFieldWithChild customfield11205) {
    this.customfield11205 = customfield11205;
    return this;
  }

  /**
   * Get customfield11205
   * @return customfield11205
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueOptionFieldWithChild getCustomfield11205() {
    return customfield11205;
  }

  public void setCustomfield11205(JiraIssueOptionFieldWithChild customfield11205) {
    this.customfield11205 = customfield11205;
  }

  public JiraIssueFields customfield11302(List<String> customfield11302) {
    this.customfield11302 = customfield11302;
    return this;
  }

  public JiraIssueFields addCustomfield11302Item(String customfield11302Item) {
    if (this.customfield11302 == null) {
      this.customfield11302 = new ArrayList<String>();
    }
    this.customfield11302.add(customfield11302Item);
    return this;
  }

  /**
   * Perfil
   * @return customfield11302
  **/
  @ApiModelProperty(value = "Perfil")
  
    public List<String> getCustomfield11302() {
    return customfield11302;
  }

  public void setCustomfield11302(List<String> customfield11302) {
    this.customfield11302 = customfield11302;
  }

  public JiraIssueFields creator(JiraUser creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraUser getCreator() {
    return creator;
  }

  public void setCreator(JiraUser creator) {
    this.creator = creator;
  }

  public JiraIssueFields reporter(JiraUser reporter) {
    this.reporter = reporter;
    return this;
  }

  /**
   * Get reporter
   * @return reporter
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public JiraUser getReporter() {
    return reporter;
  }

  public void setReporter(JiraUser reporter) {
    this.reporter = reporter;
  }

  public JiraIssueFields created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Criado em
   * @return created
  **/
  @ApiModelProperty(value = "Criado em")
  
    @Valid
    public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public JiraIssueFields summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Resumo
   * @return summary
  **/
  @ApiModelProperty(required = true, value = "Resumo")
      @NotNull

    public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public JiraIssueFields description(String description) {
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

  public JiraIssueFields attachment(List<Object> attachment) {
    this.attachment = attachment;
    return this;
  }

  public JiraIssueFields addAttachmentItem(Object attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<Object>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Anexos
   * @return attachment
  **/
  @ApiModelProperty(value = "Anexos")
  
    public List<Object> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<Object> attachment) {
    this.attachment = attachment;
  }

  public JiraIssueFields versions(List<JiraVersion> versions) {
    this.versions = versions;
    return this;
  }

  public JiraIssueFields addVersionsItem(JiraVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<JiraVersion>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * Versões Afetadas
   * @return versions
  **/
  @ApiModelProperty(value = "Versões Afetadas")
      @Valid
    public List<JiraVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<JiraVersion> versions) {
    this.versions = versions;
  }

  public JiraIssueFields labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public JiraIssueFields addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public JiraIssueFields customfield11200(String customfield11200) {
    this.customfield11200 = customfield11200;
    return this;
  }

  /**
   * sistema
   * @return customfield11200
  **/
  @ApiModelProperty(value = "sistema")
  
    public String getCustomfield11200() {
    return customfield11200;
  }

  public void setCustomfield11200(String customfield11200) {
    this.customfield11200 = customfield11200;
  }

  public JiraIssueFields customfield13004(JiraIssueOptionField customfield13004) {
    this.customfield13004 = customfield13004;
    return this;
  }

  /**
   * Get customfield13004
   * @return customfield13004
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueOptionField getCustomfield13004() {
    return customfield13004;
  }

  public void setCustomfield13004(JiraIssueOptionField customfield13004) {
    this.customfield13004 = customfield13004;
  }

  public JiraIssueFields customfield13601(String customfield13601) {
    this.customfield13601 = customfield13601;
    return this;
  }

  /**
   * Parent link
   * @return customfield13601
  **/
  @ApiModelProperty(value = "Parent link")
  
    public String getCustomfield13601() {
    return customfield13601;
  }

  public void setCustomfield13601(String customfield13601) {
    this.customfield13601 = customfield13601;
  }

  public JiraIssueFields subtasks(List<JiraIssue> subtasks) {
    this.subtasks = subtasks;
    return this;
  }

  public JiraIssueFields addSubtasksItem(JiraIssue subtasksItem) {
    if (this.subtasks == null) {
      this.subtasks = new ArrayList<JiraIssue>();
    }
    this.subtasks.add(subtasksItem);
    return this;
  }

  /**
   * Get subtasks
   * @return subtasks
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<JiraIssue> getSubtasks() {
    return subtasks;
  }

  public void setSubtasks(List<JiraIssue> subtasks) {
    this.subtasks = subtasks;
  }

  public JiraIssueFields customfield13700(List<String> customfield13700) {
    this.customfield13700 = customfield13700;
    return this;
  }

  public JiraIssueFields addCustomfield13700Item(String customfield13700Item) {
    if (this.customfield13700 == null) {
      this.customfield13700 = new ArrayList<String>();
    }
    this.customfield13700.add(customfield13700Item);
    return this;
  }

  /**
   * Informações da demanda pendentes
   * @return customfield13700
  **/
  @ApiModelProperty(value = "Informações da demanda pendentes")
  
    public List<String> getCustomfield13700() {
    return customfield13700;
  }

  public void setCustomfield13700(List<String> customfield13700) {
    this.customfield13700 = customfield13700;
  }

  public JiraIssueFields priority(JiraIssueFieldsPriority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueFieldsPriority getPriority() {
    return priority;
  }

  public void setPriority(JiraIssueFieldsPriority priority) {
    this.priority = priority;
  }

  public JiraIssueFields customfield10204(Integer customfield10204) {
    this.customfield10204 = customfield10204;
    return this;
  }

  /**
   * Business value
   * @return customfield10204
  **/
  @ApiModelProperty(value = "Business value")
  
    public Integer getCustomfield10204() {
    return customfield10204;
  }

  public void setCustomfield10204(Integer customfield10204) {
    this.customfield10204 = customfield10204;
  }

  public JiraIssueFields customfield10201(List<String> customfield10201) {
    this.customfield10201 = customfield10201;
    return this;
  }

  public JiraIssueFields addCustomfield10201Item(String customfield10201Item) {
    if (this.customfield10201 == null) {
      this.customfield10201 = new ArrayList<String>();
    }
    this.customfield10201.add(customfield10201Item);
    return this;
  }

  /**
   * Epic/Theme
   * @return customfield10201
  **/
  @ApiModelProperty(value = "Epic/Theme")
  
    public List<String> getCustomfield10201() {
    return customfield10201;
  }

  public void setCustomfield10201(List<String> customfield10201) {
    this.customfield10201 = customfield10201;
  }

  public JiraIssueFields customfield11503(JiraIssueOptionField customfield11503) {
    this.customfield11503 = customfield11503;
    return this;
  }

  /**
   * Get customfield11503
   * @return customfield11503
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueOptionField getCustomfield11503() {
    return customfield11503;
  }

  public void setCustomfield11503(JiraIssueOptionField customfield11503) {
    this.customfield11503 = customfield11503;
  }

  public JiraIssueFields customfield11502(JiraIssueOptionField customfield11502) {
    this.customfield11502 = customfield11502;
    return this;
  }

  /**
   * Get customfield11502
   * @return customfield11502
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueOptionField getCustomfield11502() {
    return customfield11502;
  }

  public void setCustomfield11502(JiraIssueOptionField customfield11502) {
    this.customfield11502 = customfield11502;
  }

  public JiraIssueFields issuelinks(List<Object> issuelinks) {
    this.issuelinks = issuelinks;
    return this;
  }

  public JiraIssueFields addIssuelinksItem(Object issuelinksItem) {
    if (this.issuelinks == null) {
      this.issuelinks = new ArrayList<Object>();
    }
    this.issuelinks.add(issuelinksItem);
    return this;
  }

  /**
   * Pendências Linkadas
   * @return issuelinks
  **/
  @ApiModelProperty(value = "Pendências Linkadas")
  
    public List<Object> getIssuelinks() {
    return issuelinks;
  }

  public void setIssuelinks(List<Object> issuelinks) {
    this.issuelinks = issuelinks;
  }

  public JiraIssueFields customfield11700(List<String> customfield11700) {
    this.customfield11700 = customfield11700;
    return this;
  }

  public JiraIssueFields addCustomfield11700Item(String customfield11700Item) {
    if (this.customfield11700 == null) {
      this.customfield11700 = new ArrayList<String>();
    }
    this.customfield11700.add(customfield11700Item);
    return this;
  }

  /**
   * Tribunal requisitante
   * @return customfield11700
  **/
  @ApiModelProperty(value = "Tribunal requisitante")
  
    public List<String> getCustomfield11700() {
    return customfield11700;
  }

  public void setCustomfield11700(List<String> customfield11700) {
    this.customfield11700 = customfield11700;
  }

  public JiraIssueFields votes(JiraIssueFieldsVotes votes) {
    this.votes = votes;
    return this;
  }

  /**
   * Get votes
   * @return votes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueFieldsVotes getVotes() {
    return votes;
  }

  public void setVotes(JiraIssueFieldsVotes votes) {
    this.votes = votes;
  }

  public JiraIssueFields watches(JiraIssueFieldsWatches watches) {
    this.watches = watches;
    return this;
  }

  /**
   * Get watches
   * @return watches
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueFieldsWatches getWatches() {
    return watches;
  }

  public void setWatches(JiraIssueFieldsWatches watches) {
    this.watches = watches;
  }

  public JiraIssueFields assignee(JiraUser assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraUser getAssignee() {
    return assignee;
  }

  public void setAssignee(JiraUser assignee) {
    this.assignee = assignee;
  }

  public JiraIssueFields status(JiraStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraStatus getStatus() {
    return status;
  }

  public void setStatus(JiraStatus status) {
    this.status = status;
  }

  public JiraIssueFields updated(String updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Atualizado em
   * @return updated
  **/
  @ApiModelProperty(value = "Atualizado em")
  
    @Valid
    public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public JiraIssueFields customfield11900(JiraIssueOptionField customfield11900) {
    this.customfield11900 = customfield11900;
    return this;
  }

  /**
   * Get customfield11900
   * @return customfield11900
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueOptionField getCustomfield11900() {
    return customfield11900;
  }

  public void setCustomfield11900(JiraIssueOptionField customfield11900) {
    this.customfield11900 = customfield11900;
  }

  public JiraIssueFields customfield11401(JiraIssueOptionField customfield11401) {
    this.customfield11401 = customfield11401;
    return this;
  }

  /**
   * Get customfield11401
   * @return customfield11401
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueOptionField getCustomfield11401() {
    return customfield11401;
  }

  public void setCustomfield11401(JiraIssueOptionField customfield11401) {
    this.customfield11401 = customfield11401;
  }

  public JiraIssueFields customfield12303(JiraUser customfield12303) {
    this.customfield12303 = customfield12303;
    return this;
  }

  /**
   * Get customfield12303
   * @return customfield12303
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraUser getCustomfield12303() {
    return customfield12303;
  }

  public void setCustomfield12303(JiraUser customfield12303) {
    this.customfield12303 = customfield12303;
  }

  public JiraIssueFields customfield13500(Object customfield13500) {
    this.customfield13500 = customfield13500;
    return this;
  }

  /**
   * Desenvolvimento
   * @return customfield13500
  **/
  @ApiModelProperty(value = "Desenvolvimento")
  
    public Object getCustomfield13500() {
    return customfield13500;
  }

  public void setCustomfield13500(Object customfield13500) {
    this.customfield13500 = customfield13500;
  }

  public JiraIssueFields customfield13605(Object customfield13605) {
    this.customfield13605 = customfield13605;
    return this;
  }

  /**
   * gitBranch
   * @return customfield13605
  **/
  @ApiModelProperty(value = "gitBranch")
  
    public Object getCustomfield13605() {
    return customfield13605;
  }

  public void setCustomfield13605(Object customfield13605) {
    this.customfield13605 = customfield13605;
  }

  public JiraIssueFields customfield13606(Object customfield13606) {
    this.customfield13606 = customfield13606;
    return this;
  }

  /**
   * gitCommitsReferenced
   * @return customfield13606
  **/
  @ApiModelProperty(value = "gitCommitsReferenced")
  
    public Object getCustomfield13606() {
    return customfield13606;
  }

  public void setCustomfield13606(Object customfield13606) {
    this.customfield13606 = customfield13606;
  }

  public JiraIssueFields timeestimate(BigDecimal timeestimate) {
    this.timeestimate = timeestimate;
    return this;
  }

  /**
   * Tempo Restante
   * @return timeestimate
  **/
  @ApiModelProperty(value = "Tempo Restante")
  
    @Valid
    public BigDecimal getTimeestimate() {
    return timeestimate;
  }

  public void setTimeestimate(BigDecimal timeestimate) {
    this.timeestimate = timeestimate;
  }

  public JiraIssueFields timespent(BigDecimal timespent) {
    this.timespent = timespent;
    return this;
  }

  /**
   * Tempo Gasto
   * @return timespent
  **/
  @ApiModelProperty(value = "Tempo Gasto")
  
    @Valid
    public BigDecimal getTimespent() {
    return timespent;
  }

  public void setTimespent(BigDecimal timespent) {
    this.timespent = timespent;
  }

  public JiraIssueFields duedate(String duedate) {
    this.duedate = duedate;
    return this;
  }

  /**
   * Data para Ficar Pronto
   * @return duedate
  **/
  @ApiModelProperty(value = "Data para Ficar Pronto")
  
    @Valid
    public String getDuedate() {
    return duedate;
  }

  public void setDuedate(String duedate) {
    this.duedate = duedate;
  }

  public JiraIssueFields customfield11901(JiraIssueOptionField customfield11901) {
    this.customfield11901 = customfield11901;
    return this;
  }

  /**
   * Get customfield11901
   * @return customfield11901
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueOptionField getCustomfield11901() {
    return customfield11901;
  }

  public void setCustomfield11901(JiraIssueOptionField customfield11901) {
    this.customfield11901 = customfield11901;
  }

  public JiraIssueFields customfield12000(JiraUser customfield12000) {
    this.customfield12000 = customfield12000;
    return this;
  }

  /**
   * Get customfield12000
   * @return customfield12000
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraUser getCustomfield12000() {
    return customfield12000;
  }

  public void setCustomfield12000(JiraUser customfield12000) {
    this.customfield12000 = customfield12000;
  }

  public JiraIssueFields customfield13834(Integer customfield13834) {
    this.customfield13834 = customfield13834;
    return this;
  }

  /**
   * Aprovações necessárias
   * @return customfield13834
  **/
  @ApiModelProperty(value = "Aprovações necessárias")
  
    public Integer getCustomfield13834() {
    return customfield13834;
  }

  public void setCustomfield13834(Integer customfield13834) {
    this.customfield13834 = customfield13834;
  }

  public JiraIssueFields customfield13835(Integer customfield13835) {
    this.customfield13835 = customfield13835;
    return this;
  }

  /**
   * Aprovações realizadas
   * @return customfield13835
  **/
  @ApiModelProperty(value = "Aprovações realizadas")
  
    public Integer getCustomfield13835() {
    return customfield13835;
  }

  public void setCustomfield13835(Integer customfield13835) {
    this.customfield13835 = customfield13835;
  }

  public JiraIssueFields customfield13836(String customfield13836) {
    this.customfield13836 = customfield13836;
    return this;
  }

  /**
   * Aprovado por
   * @return customfield13836
  **/
  @ApiModelProperty(value = "Aprovado por")
  
    public String getCustomfield13836() {
    return customfield13836;
  }

  public void setCustomfield13836(String customfield13836) {
    this.customfield13836 = customfield13836;
  }

  public JiraIssueFields resolution(JiraIssueFieldsResolution resolution) {
    this.resolution = resolution;
    return this;
  }

  /**
   * Get resolution
   * @return resolution
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueFieldsResolution getResolution() {
    return resolution;
  }

  public void setResolution(JiraIssueFieldsResolution resolution) {
    this.resolution = resolution;
  }

  public JiraIssueFields resolutiondate(String resolutiondate) {
    this.resolutiondate = resolutiondate;
    return this;
  }

  /**
   * Get resolutiondate
   * @return resolutiondate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public String getResolutiondate() {
    return resolutiondate;
  }

  public void setResolutiondate(String resolutiondate) {
    this.resolutiondate = resolutiondate;
  }

  public JiraIssueFields customfield13837(String customfield13837) {
    this.customfield13837 = customfield13837;
    return this;
  }

  /**
   * Notas de release
   * @return customfield13837
  **/
  @ApiModelProperty(value = "Notas de release")
  
    public String getCustomfield13837() {
    return customfield13837;
  }

  public void setCustomfield13837(String customfield13837) {
    this.customfield13837 = customfield13837;
  }

  public JiraIssueFields fixVersions(List<JiraVersion> fixVersions) {
    this.fixVersions = fixVersions;
    return this;
  }

  public JiraIssueFields addFixVersionsItem(JiraVersion fixVersionsItem) {
    if (this.fixVersions == null) {
      this.fixVersions = new ArrayList<JiraVersion>();
    }
    this.fixVersions.add(fixVersionsItem);
    return this;
  }

  /**
   * Get fixVersions
   * @return fixVersions
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<JiraVersion> getFixVersions() {
    return fixVersions;
  }

  public void setFixVersions(List<JiraVersion> fixVersions) {
    this.fixVersions = fixVersions;
  }

  public JiraIssueFields customfield13909(String customfield13909) {
    this.customfield13909 = customfield13909;
    return this;
  }

  /**
   * Destaques notas de release
   * @return customfield13909
  **/
  @ApiModelProperty(value = "Destaques notas de release")
  
    public String getCustomfield13909() {
    return customfield13909;
  }

  public void setCustomfield13909(String customfield13909) {
    this.customfield13909 = customfield13909;
  }

  public JiraIssueFields comment(JiraIssueFieldsComment comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueFieldsComment getComment() {
    return comment;
  }

  public void setComment(JiraIssueFieldsComment comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueFields jiraIssueFields = (JiraIssueFields) o;
    return Objects.equals(this.project, jiraIssueFields.project) &&
        Objects.equals(this.issuetype, jiraIssueFields.issuetype) &&
        Objects.equals(this.environment, jiraIssueFields.environment) &&
        Objects.equals(this.customfield11205, jiraIssueFields.customfield11205) &&
        Objects.equals(this.customfield11302, jiraIssueFields.customfield11302) &&
        Objects.equals(this.creator, jiraIssueFields.creator) &&
        Objects.equals(this.reporter, jiraIssueFields.reporter) &&
        Objects.equals(this.created, jiraIssueFields.created) &&
        Objects.equals(this.summary, jiraIssueFields.summary) &&
        Objects.equals(this.description, jiraIssueFields.description) &&
        Objects.equals(this.attachment, jiraIssueFields.attachment) &&
        Objects.equals(this.versions, jiraIssueFields.versions) &&
        Objects.equals(this.labels, jiraIssueFields.labels) &&
        Objects.equals(this.customfield11200, jiraIssueFields.customfield11200) &&
        Objects.equals(this.customfield13004, jiraIssueFields.customfield13004) &&
        Objects.equals(this.customfield13601, jiraIssueFields.customfield13601) &&
        Objects.equals(this.subtasks, jiraIssueFields.subtasks) &&
        Objects.equals(this.customfield13700, jiraIssueFields.customfield13700) &&
        Objects.equals(this.priority, jiraIssueFields.priority) &&
        Objects.equals(this.customfield10204, jiraIssueFields.customfield10204) &&
        Objects.equals(this.customfield10201, jiraIssueFields.customfield10201) &&
        Objects.equals(this.customfield11503, jiraIssueFields.customfield11503) &&
        Objects.equals(this.customfield11502, jiraIssueFields.customfield11502) &&
        Objects.equals(this.issuelinks, jiraIssueFields.issuelinks) &&
        Objects.equals(this.customfield11700, jiraIssueFields.customfield11700) &&
        Objects.equals(this.votes, jiraIssueFields.votes) &&
        Objects.equals(this.watches, jiraIssueFields.watches) &&
        Objects.equals(this.assignee, jiraIssueFields.assignee) &&
        Objects.equals(this.status, jiraIssueFields.status) &&
        Objects.equals(this.updated, jiraIssueFields.updated) &&
        Objects.equals(this.customfield11900, jiraIssueFields.customfield11900) &&
        Objects.equals(this.customfield11401, jiraIssueFields.customfield11401) &&
        Objects.equals(this.customfield12303, jiraIssueFields.customfield12303) &&
        Objects.equals(this.customfield13500, jiraIssueFields.customfield13500) &&
        Objects.equals(this.customfield13605, jiraIssueFields.customfield13605) &&
        Objects.equals(this.customfield13606, jiraIssueFields.customfield13606) &&
        Objects.equals(this.timeestimate, jiraIssueFields.timeestimate) &&
        Objects.equals(this.timespent, jiraIssueFields.timespent) &&
        Objects.equals(this.duedate, jiraIssueFields.duedate) &&
        Objects.equals(this.customfield11901, jiraIssueFields.customfield11901) &&
        Objects.equals(this.customfield12000, jiraIssueFields.customfield12000) &&
        Objects.equals(this.customfield13834, jiraIssueFields.customfield13834) &&
        Objects.equals(this.customfield13835, jiraIssueFields.customfield13835) &&
        Objects.equals(this.customfield13836, jiraIssueFields.customfield13836) &&
        Objects.equals(this.resolution, jiraIssueFields.resolution) &&
        Objects.equals(this.resolutiondate, jiraIssueFields.resolutiondate) &&
        Objects.equals(this.customfield13837, jiraIssueFields.customfield13837) &&
        Objects.equals(this.fixVersions, jiraIssueFields.fixVersions) &&
        Objects.equals(this.customfield13909, jiraIssueFields.customfield13909) &&
        Objects.equals(this.comment, jiraIssueFields.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, issuetype, environment, customfield11205, customfield11302, creator, reporter, created, summary, description, attachment, versions, labels, customfield11200, customfield13004, customfield13601, subtasks, customfield13700, priority, customfield10204, customfield10201, customfield11503, customfield11502, issuelinks, customfield11700, votes, watches, assignee, status, updated, customfield11900, customfield11401, customfield12303, customfield13500, customfield13605, customfield13606, timeestimate, timespent, duedate, customfield11901, customfield12000, customfield13834, customfield13835, customfield13836, resolution, resolutiondate, customfield13837, fixVersions, customfield13909, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueFields {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    issuetype: ").append(toIndentedString(issuetype)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    customfield11205: ").append(toIndentedString(customfield11205)).append("\n");
    sb.append("    customfield11302: ").append(toIndentedString(customfield11302)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    customfield11200: ").append(toIndentedString(customfield11200)).append("\n");
    sb.append("    customfield13004: ").append(toIndentedString(customfield13004)).append("\n");
    sb.append("    customfield13601: ").append(toIndentedString(customfield13601)).append("\n");
    sb.append("    subtasks: ").append(toIndentedString(subtasks)).append("\n");
    sb.append("    customfield13700: ").append(toIndentedString(customfield13700)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    customfield10204: ").append(toIndentedString(customfield10204)).append("\n");
    sb.append("    customfield10201: ").append(toIndentedString(customfield10201)).append("\n");
    sb.append("    customfield11503: ").append(toIndentedString(customfield11503)).append("\n");
    sb.append("    customfield11502: ").append(toIndentedString(customfield11502)).append("\n");
    sb.append("    issuelinks: ").append(toIndentedString(issuelinks)).append("\n");
    sb.append("    customfield11700: ").append(toIndentedString(customfield11700)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
    sb.append("    watches: ").append(toIndentedString(watches)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    customfield11900: ").append(toIndentedString(customfield11900)).append("\n");
    sb.append("    customfield11401: ").append(toIndentedString(customfield11401)).append("\n");
    sb.append("    customfield12303: ").append(toIndentedString(customfield12303)).append("\n");
    sb.append("    customfield13500: ").append(toIndentedString(customfield13500)).append("\n");
    sb.append("    customfield13605: ").append(toIndentedString(customfield13605)).append("\n");
    sb.append("    customfield13606: ").append(toIndentedString(customfield13606)).append("\n");
    sb.append("    timeestimate: ").append(toIndentedString(timeestimate)).append("\n");
    sb.append("    timespent: ").append(toIndentedString(timespent)).append("\n");
    sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
    sb.append("    customfield11901: ").append(toIndentedString(customfield11901)).append("\n");
    sb.append("    customfield12000: ").append(toIndentedString(customfield12000)).append("\n");
    sb.append("    customfield13834: ").append(toIndentedString(customfield13834)).append("\n");
    sb.append("    customfield13835: ").append(toIndentedString(customfield13835)).append("\n");
    sb.append("    customfield13836: ").append(toIndentedString(customfield13836)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    resolutiondate: ").append(toIndentedString(resolutiondate)).append("\n");
    sb.append("    customfield13837: ").append(toIndentedString(customfield13837)).append("\n");
    sb.append("    fixVersions: ").append(toIndentedString(fixVersions)).append("\n");
    sb.append("    customfield13909: ").append(toIndentedString(customfield13909)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
