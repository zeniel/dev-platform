package com.devplatform.model.event.jira;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraUser   {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("timeZone")
  private String timeZone = null;
  
  @JsonProperty("avatarUrls")
  private JiraAvatarurls avatarurls = null;

  public JiraUser self(String self) {
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

  public JiraUser name(String name) {
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

  public JiraUser key(String key) {
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

  public JiraUser emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  
    public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public JiraUser displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public JiraUser active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public JiraUser timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  
    public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public JiraUser avatarurls(JiraAvatarurls avatarurls) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraUser jiraUser = (JiraUser) o;
    return Objects.equals(this.self, jiraUser.self) &&
        Objects.equals(this.name, jiraUser.name) &&
        Objects.equals(this.key, jiraUser.key) &&
        Objects.equals(this.emailAddress, jiraUser.emailAddress) &&
        Objects.equals(this.displayName, jiraUser.displayName) &&
        Objects.equals(this.active, jiraUser.active) &&
        Objects.equals(this.timeZone, jiraUser.timeZone) &&
    	Objects.equals(this.avatarurls, jiraUser.avatarurls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, name, key, emailAddress, displayName, active, timeZone, avatarurls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraUser {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarurls)).append("\n");
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
