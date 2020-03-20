package com.devplatform.model.event.jira;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssuetype
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssuetype   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("iconUrl")
  private String iconUrl = null;

  @JsonProperty("subtask")
  private Boolean subtask = null;

  @JsonProperty("avatarId")
  private BigDecimal avatarId = null;

  @JsonProperty("self")
  private String self = null;

  public JiraIssuetype id(BigDecimal id) {
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

  public JiraIssuetype name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JiraIssuetype description(String description) {
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

  public JiraIssuetype iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * Get iconUrl
   * @return iconUrl
  **/
  @ApiModelProperty(value = "")
  
    public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public JiraIssuetype subtask(Boolean subtask) {
    this.subtask = subtask;
    return this;
  }

  /**
   * Get subtask
   * @return subtask
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isSubtask() {
    return subtask;
  }

  public void setSubtask(Boolean subtask) {
    this.subtask = subtask;
  }

  public JiraIssuetype avatarId(BigDecimal avatarId) {
    this.avatarId = avatarId;
    return this;
  }

  /**
   * Get avatarId
   * @return avatarId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(BigDecimal avatarId) {
    this.avatarId = avatarId;
  }

  public JiraIssuetype self(String self) {
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
    JiraIssuetype jiraIssuetype = (JiraIssuetype) o;
    return Objects.equals(this.id, jiraIssuetype.id) &&
        Objects.equals(this.name, jiraIssuetype.name) &&
        Objects.equals(this.description, jiraIssuetype.description) &&
        Objects.equals(this.iconUrl, jiraIssuetype.iconUrl) &&
        Objects.equals(this.subtask, jiraIssuetype.subtask) &&
        Objects.equals(this.avatarId, jiraIssuetype.avatarId) &&
        Objects.equals(this.self, jiraIssuetype.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, iconUrl, subtask, avatarId, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssuetype {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    subtask: ").append(toIndentedString(subtask)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
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
