package com.devplatform.model.event.gitlab;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabProject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabProject   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("web_url")
  private String webUrl = null;

  @JsonProperty("avatar_url")
  private String avatarUrl = null;

  @JsonProperty("git_ssh_url")
  private String gitSshUrl = null;

  @JsonProperty("git_http_url")
  private String gitHttpUrl = null;

  @JsonProperty("namespace")
  private String namespace = null;

  @JsonProperty("visibility_level")
  private Integer visibilityLevel = null;

  @JsonProperty("path_with_namespace")
  private String pathWithNamespace = null;

  @JsonProperty("default_branch")
  private String defaultBranch = "master";

  @JsonProperty("homepage")
  private String homepage = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("ssh_url")
  private String sshUrl = null;

  @JsonProperty("http_url")
  private String httpUrl = null;

  public GitlabProject id(BigDecimal id) {
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

  public GitlabProject name(String name) {
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

  public GitlabProject description(String description) {
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

  public GitlabProject webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

  /**
   * Get webUrl
   * @return webUrl
  **/
  @ApiModelProperty(value = "")
  
    public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  public GitlabProject avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "")
  
    public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public GitlabProject gitSshUrl(String gitSshUrl) {
    this.gitSshUrl = gitSshUrl;
    return this;
  }

  /**
   * Get gitSshUrl
   * @return gitSshUrl
  **/
  @ApiModelProperty(value = "")
  
    public String getGitSshUrl() {
    return gitSshUrl;
  }

  public void setGitSshUrl(String gitSshUrl) {
    this.gitSshUrl = gitSshUrl;
  }

  public GitlabProject gitHttpUrl(String gitHttpUrl) {
    this.gitHttpUrl = gitHttpUrl;
    return this;
  }

  /**
   * Get gitHttpUrl
   * @return gitHttpUrl
  **/
  @ApiModelProperty(value = "")
  
    public String getGitHttpUrl() {
    return gitHttpUrl;
  }

  public void setGitHttpUrl(String gitHttpUrl) {
    this.gitHttpUrl = gitHttpUrl;
  }

  public GitlabProject namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  
    public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public GitlabProject visibilityLevel(Integer visibilityLevel) {
    this.visibilityLevel = visibilityLevel;
    return this;
  }

  /**
   * Get visibilityLevel
   * @return visibilityLevel
  **/
  @ApiModelProperty(value = "")
  
    public Integer getVisibilityLevel() {
    return visibilityLevel;
  }

  public void setVisibilityLevel(Integer visibilityLevel) {
    this.visibilityLevel = visibilityLevel;
  }

  public GitlabProject pathWithNamespace(String pathWithNamespace) {
    this.pathWithNamespace = pathWithNamespace;
    return this;
  }

  /**
   * Get pathWithNamespace
   * @return pathWithNamespace
  **/
  @ApiModelProperty(value = "")
  
    public String getPathWithNamespace() {
    return pathWithNamespace;
  }

  public void setPathWithNamespace(String pathWithNamespace) {
    this.pathWithNamespace = pathWithNamespace;
  }

  public GitlabProject defaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
    return this;
  }

  /**
   * Get defaultBranch
   * @return defaultBranch
  **/
  @ApiModelProperty(value = "")
  
    public String getDefaultBranch() {
    return defaultBranch;
  }

  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }

  public GitlabProject homepage(String homepage) {
    this.homepage = homepage;
    return this;
  }

  /**
   * Get homepage
   * @return homepage
  **/
  @ApiModelProperty(value = "")
  
    public String getHomepage() {
    return homepage;
  }

  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }

  public GitlabProject url(String url) {
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

  public GitlabProject sshUrl(String sshUrl) {
    this.sshUrl = sshUrl;
    return this;
  }

  /**
   * Get sshUrl
   * @return sshUrl
  **/
  @ApiModelProperty(value = "")
  
    public String getSshUrl() {
    return sshUrl;
  }

  public void setSshUrl(String sshUrl) {
    this.sshUrl = sshUrl;
  }

  public GitlabProject httpUrl(String httpUrl) {
    this.httpUrl = httpUrl;
    return this;
  }

  /**
   * Get httpUrl
   * @return httpUrl
  **/
  @ApiModelProperty(value = "")
  
    public String getHttpUrl() {
    return httpUrl;
  }

  public void setHttpUrl(String httpUrl) {
    this.httpUrl = httpUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitlabProject gitlabProject = (GitlabProject) o;
    return Objects.equals(this.id, gitlabProject.id) &&
        Objects.equals(this.name, gitlabProject.name) &&
        Objects.equals(this.description, gitlabProject.description) &&
        Objects.equals(this.webUrl, gitlabProject.webUrl) &&
        Objects.equals(this.avatarUrl, gitlabProject.avatarUrl) &&
        Objects.equals(this.gitSshUrl, gitlabProject.gitSshUrl) &&
        Objects.equals(this.gitHttpUrl, gitlabProject.gitHttpUrl) &&
        Objects.equals(this.namespace, gitlabProject.namespace) &&
        Objects.equals(this.visibilityLevel, gitlabProject.visibilityLevel) &&
        Objects.equals(this.pathWithNamespace, gitlabProject.pathWithNamespace) &&
        Objects.equals(this.defaultBranch, gitlabProject.defaultBranch) &&
        Objects.equals(this.homepage, gitlabProject.homepage) &&
        Objects.equals(this.url, gitlabProject.url) &&
        Objects.equals(this.sshUrl, gitlabProject.sshUrl) &&
        Objects.equals(this.httpUrl, gitlabProject.httpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, webUrl, avatarUrl, gitSshUrl, gitHttpUrl, namespace, visibilityLevel, pathWithNamespace, defaultBranch, homepage, url, sshUrl, httpUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabProject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    gitSshUrl: ").append(toIndentedString(gitSshUrl)).append("\n");
    sb.append("    gitHttpUrl: ").append(toIndentedString(gitHttpUrl)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
    sb.append("    pathWithNamespace: ").append(toIndentedString(pathWithNamespace)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
    sb.append("    httpUrl: ").append(toIndentedString(httpUrl)).append("\n");
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
