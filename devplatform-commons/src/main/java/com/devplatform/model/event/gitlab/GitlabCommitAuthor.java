package com.devplatform.model.event.gitlab;

import java.util.Objects;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabCommitAuthor {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("email")
	private String email = null;

	public GitlabCommitAuthor name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GitlabCommitAuthor email(String email) {
		this.email = email;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabCommitAuthor gitlabCommitAuthor = (GitlabCommitAuthor) o;
		return Objects.equals(this.name, gitlabCommitAuthor.name)
				&& Objects.equals(this.email, gitlabCommitAuthor.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, email);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabCommitAuthor {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
