package com.devplatform.model.event.jira;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraStatus   {
  @JsonProperty("id")
  private BigDecimal id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("iconUrl")
  private String iconUrl = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("statusCategory")
  private JiraStatusStatusCategory statusCategory = null;

  public JiraStatus id(BigDecimal id) {
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

  public JiraStatus name(String name) {
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

  public JiraStatus description(String description) {
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

  public JiraStatus iconUrl(String iconUrl) {
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

  public JiraStatus self(String self) {
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

  public JiraStatus statusCategory(JiraStatusStatusCategory statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }

  /**
   * Get statusCategory
   * @return statusCategory
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraStatusStatusCategory getStatusCategory() {
    return statusCategory;
  }

  public void setStatusCategory(JiraStatusStatusCategory statusCategory) {
    this.statusCategory = statusCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraStatus jiraStatus = (JiraStatus) o;
    return Objects.equals(this.id, jiraStatus.id) &&
        Objects.equals(this.name, jiraStatus.name) &&
        Objects.equals(this.description, jiraStatus.description) &&
        Objects.equals(this.iconUrl, jiraStatus.iconUrl) &&
        Objects.equals(this.self, jiraStatus.self) &&
        Objects.equals(this.statusCategory, jiraStatus.statusCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, iconUrl, self, statusCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
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
