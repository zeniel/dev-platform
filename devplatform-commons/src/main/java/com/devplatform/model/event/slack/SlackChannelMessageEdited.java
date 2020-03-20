package com.devplatform.model.event.slack;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessageEdited
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class SlackChannelMessageEdited   {
  @JsonProperty("user")
  private String user = null;

  @JsonProperty("ts")
  private String ts = null;

  public SlackChannelMessageEdited user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "U023BECGF", value = "")
  
    public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public SlackChannelMessageEdited ts(String ts) {
    this.ts = ts;
    return this;
  }

  /**
   * Get ts
   * @return ts
  **/
  @ApiModelProperty(example = "1403051575.000407", value = "")
  
    public String getTs() {
    return ts;
  }

  public void setTs(String ts) {
    this.ts = ts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackChannelMessageEdited slackChannelMessageEdited = (SlackChannelMessageEdited) o;
    return Objects.equals(this.user, slackChannelMessageEdited.user) &&
        Objects.equals(this.ts, slackChannelMessageEdited.ts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, ts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackChannelMessageEdited {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
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
