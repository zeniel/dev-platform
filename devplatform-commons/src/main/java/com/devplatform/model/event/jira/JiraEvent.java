package com.devplatform.model.event.jira;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraEvent   {
  @JsonProperty("timestamp")
  private String timestamp = null;

  /**
   * Gets or Sets webhookEvent
   */
  public enum WebhookEventEnum {
    ISSUE_CREATED("jira:issue_created"),
    ISSUE_UPDATED("jira:issue_updated");

    private String value;

    WebhookEventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WebhookEventEnum fromValue(String text) {
      for (WebhookEventEnum b : WebhookEventEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("webhookEvent")
  private WebhookEventEnum webhookEvent = null;

  /**
   * Gets or Sets issueEventTypeName
   */
  public enum IssueEventTypeNameEnum {
	ISSUE_CREATED("issue_created"),
    
	ISSUE_GENERIC("issue_generic");

    private String value;

    IssueEventTypeNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IssueEventTypeNameEnum fromValue(String text) {
      for (IssueEventTypeNameEnum b : IssueEventTypeNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("issue_event_type_name")
  private IssueEventTypeNameEnum issueEventTypeName = null;

  @JsonProperty("user")
  private JiraUser user = null;

  @JsonProperty("issue")
  private JiraIssue issue = null;

  @JsonProperty("changelog")
  private JiraEventChangelog changelog = null;

  public JiraEvent timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public JiraEvent webhookEvent(WebhookEventEnum webhookEvent) {
    this.webhookEvent = webhookEvent;
    return this;
  }

  /**
   * Get webhookEvent
   * @return webhookEvent
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public WebhookEventEnum getWebhookEvent() {
    return webhookEvent;
  }

  public void setWebhookEvent(WebhookEventEnum webhookEvent) {
    this.webhookEvent = webhookEvent;
  }

  public JiraEvent issueEventTypeName(IssueEventTypeNameEnum issueEventTypeName) {
    this.issueEventTypeName = issueEventTypeName;
    return this;
  }

  /**
   * Get issueEventTypeName
   * @return issueEventTypeName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public IssueEventTypeNameEnum getIssueEventTypeName() {
    return issueEventTypeName;
  }

  public void setIssueEventTypeName(IssueEventTypeNameEnum issueEventTypeName) {
    this.issueEventTypeName = issueEventTypeName;
  }

  public JiraEvent user(JiraUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public JiraUser getUser() {
    return user;
  }

  public void setUser(JiraUser user) {
    this.user = user;
  }

  public JiraEvent issue(JiraIssue issue) {
    this.issue = issue;
    return this;
  }

  /**
   * Get issue
   * @return issue
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public JiraIssue getIssue() {
    return issue;
  }

  public void setIssue(JiraIssue issue) {
    this.issue = issue;
  }

  public JiraEvent changelog(JiraEventChangelog changelog) {
    this.changelog = changelog;
    return this;
  }

  /**
   * Get changelog
   * @return changelog
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraEventChangelog getChangelog() {
    return changelog;
  }

  public void setChangelog(JiraEventChangelog changelog) {
    this.changelog = changelog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraEvent jiraEvent = (JiraEvent) o;
    return Objects.equals(this.timestamp, jiraEvent.timestamp) &&
        Objects.equals(this.webhookEvent, jiraEvent.webhookEvent) &&
        Objects.equals(this.issueEventTypeName, jiraEvent.issueEventTypeName) &&
        Objects.equals(this.user, jiraEvent.user) &&
        Objects.equals(this.issue, jiraEvent.issue) &&
        Objects.equals(this.changelog, jiraEvent.changelog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, webhookEvent, issueEventTypeName, user, issue, changelog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraEvent {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    webhookEvent: ").append(toIndentedString(webhookEvent)).append("\n");
    sb.append("    issueEventTypeName: ").append(toIndentedString(issueEventTypeName)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
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
