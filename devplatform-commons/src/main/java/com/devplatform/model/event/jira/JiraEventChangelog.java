package com.devplatform.model.event.jira;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraEventChangelog
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraEventChangelog   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("items")
  @Valid
  private List<JiraEventChangelogItems> items = null;

  public JiraEventChangelog id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public JiraEventChangelog items(List<JiraEventChangelogItems> items) {
    this.items = items;
    return this;
  }

  public JiraEventChangelog addItemsItem(JiraEventChangelogItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<JiraEventChangelogItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<JiraEventChangelogItems> getItems() {
    return items;
  }

  public void setItems(List<JiraEventChangelogItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraEventChangelog jiraEventChangelog = (JiraEventChangelog) o;
    return Objects.equals(this.id, jiraEventChangelog.id) &&
        Objects.equals(this.items, jiraEventChangelog.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraEventChangelog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
