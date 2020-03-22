package com.devplatform.model.event.gitlab;

import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabCommit {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("timestamp")
	private String timestamp = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("author")
	private GitlabCommitAuthor author = null;

	public GitlabCommit id(String id) {
		this.id = id;
		return this;
	}

	@Valid
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GitlabCommit message(String message) {
		this.message = message;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GitlabCommit timestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	@Valid
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public GitlabCommit url(String url) {
		this.url = url;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public GitlabCommit author(GitlabCommitAuthor author) {
		this.author = author;
		return this;
	}

	@Valid
	public GitlabCommitAuthor getAuthor() {
		return author;
	}

	public void setAuthor(GitlabCommitAuthor author) {
		this.author = author;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabCommit gitlabCommit = (GitlabCommit) o;
		return Objects.equals(this.id, gitlabCommit.id) && Objects.equals(this.message, gitlabCommit.message)
				&& Objects.equals(this.timestamp, gitlabCommit.timestamp) && Objects.equals(this.url, gitlabCommit.url)
				&& Objects.equals(this.author, gitlabCommit.author);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, message, timestamp, url, author);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabCommit {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
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
