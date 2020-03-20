package com.devplatform.model.event.jira;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraProject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraProject   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("projectTypeKey")
  private String projectTypeKey = null;

  @JsonProperty("avatarUrls")
  private JiraAvatarurls avatarurls = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("projectCategory")
  private JiraProjectProjectCategory projectCategory = null;

  public JiraProject id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public JiraProject key(String key) {
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

  public JiraProject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JiraProject projectTypeKey(String projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
    return this;
  }

  /**
   * Get projectTypeKey
   * @return projectTypeKey
  **/
  @ApiModelProperty(value = "")
  
    public String getProjectTypeKey() {
    return projectTypeKey;
  }

  public void setProjectTypeKey(String projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
  }

  public JiraProject avatarurls(JiraAvatarurls avatarurls) {
    this.avatarurls = avatarurls;
    return this;
  }

  /**
   * Get avatarurls
   * @return avatarurls
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraAvatarurls getAvatarurls() {
    return avatarurls;
  }

  public void setAvatarurls(JiraAvatarurls avatarurls) {
    this.avatarurls = avatarurls;
  }

  public JiraProject self(String self) {
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

  public JiraProject projectCategory(JiraProjectProjectCategory projectCategory) {
    this.projectCategory = projectCategory;
    return this;
  }

  /**
   * Get projectCategory
   * @return projectCategory
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraProjectProjectCategory getProjectCategory() {
    return projectCategory;
  }

  public void setProjectCategory(JiraProjectProjectCategory projectCategory) {
    this.projectCategory = projectCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraProject jiraProject = (JiraProject) o;
    return Objects.equals(this.id, jiraProject.id) &&
        Objects.equals(this.key, jiraProject.key) &&
        Objects.equals(this.name, jiraProject.name) &&
        Objects.equals(this.projectTypeKey, jiraProject.projectTypeKey) &&
        Objects.equals(this.avatarurls, jiraProject.avatarurls) &&
        Objects.equals(this.self, jiraProject.self) &&
        Objects.equals(this.projectCategory, jiraProject.projectCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, projectTypeKey, avatarurls, self, projectCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraProject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    avatarurls: ").append(toIndentedString(avatarurls)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
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
