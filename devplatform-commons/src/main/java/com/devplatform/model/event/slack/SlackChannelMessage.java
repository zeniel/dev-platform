package com.devplatform.model.event.slack;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class SlackChannelMessage   {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    MESSAGE("message");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("subtype")
  private String subtype = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("ts")
  private String ts = null;

  @JsonProperty("user")
  private String user = null;

  @JsonProperty("edited")
  private SlackChannelMessageEdited edited = null;

  public SlackChannelMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SlackChannelMessage subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * Get subtype
   * @return subtype
  **/
  @ApiModelProperty(example = "channel_join", value = "")
  
    public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }

  public SlackChannelMessage text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "<@U023BECGF|bobby> has joined the channel", value = "")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SlackChannelMessage ts(String ts) {
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

  public SlackChannelMessage user(String user) {
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

  public SlackChannelMessage edited(SlackChannelMessageEdited edited) {
    this.edited = edited;
    return this;
  }

  /**
   * Get edited
   * @return edited
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SlackChannelMessageEdited getEdited() {
    return edited;
  }

  public void setEdited(SlackChannelMessageEdited edited) {
    this.edited = edited;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackChannelMessage slackChannelMessage = (SlackChannelMessage) o;
    return Objects.equals(this.type, slackChannelMessage.type) &&
        Objects.equals(this.subtype, slackChannelMessage.subtype) &&
        Objects.equals(this.text, slackChannelMessage.text) &&
        Objects.equals(this.ts, slackChannelMessage.ts) &&
        Objects.equals(this.user, slackChannelMessage.user) &&
        Objects.equals(this.edited, slackChannelMessage.edited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtype, text, ts, user, edited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackChannelMessage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
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
