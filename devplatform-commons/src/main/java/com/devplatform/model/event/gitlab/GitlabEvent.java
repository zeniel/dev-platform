package com.devplatform.model.event.gitlab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GitlabEvent
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEvent {
	/**
	 * Gets or Sets objectKind
	 */
	public enum ObjectKindEnum {
		MERGE_REQUEST("merge_request"),

		COMMENT("comment"),

		TAG_PUSHED("tag_pushed"),

		PUSH("push"),

		JOB_CHANGES("job_changes"),

		PIPELINE_CHANGES("pipeline_changes");

		private String value;

		ObjectKindEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static ObjectKindEnum fromValue(String text) {
			for (ObjectKindEnum b : ObjectKindEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("object_kind")
	private ObjectKindEnum objectKind = null;

	/**
	 * Gets or Sets eventType
	 */
	public enum EventTypeEnum {
		MERGE_REQUEST("merge_request"),

		COMMENT("comment"),

		TAG_PUSHED("tag_pushed"),

		PUSH("push"),

		JOB_CHANGES("job_changes"),

		PIPELINE_CHANGES("pipeline_changes");

		private String value;

		EventTypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static EventTypeEnum fromValue(String text) {
			for (EventTypeEnum b : EventTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("event_type")
	private EventTypeEnum eventType = null;

	@JsonProperty("user")
	private GitlabUser user = null;

	@JsonProperty("project")
	private GitlabProject project = null;

	@JsonProperty("object_attributes")
	private GitlabMergeRequestAttributes objectAttributes = null;

	@JsonProperty("labels")
	@Valid
	private List<String> labels = null;

	@JsonProperty("changes")
	private GitlabEventChanges changes = null;

	@JsonProperty("repository")
	private GitlabEventRepository repository = null;

	public GitlabEvent objectKind(ObjectKindEnum objectKind) {
		this.objectKind = objectKind;
		return this;
	}

	@NotNull
	public ObjectKindEnum getObjectKind() {
		return objectKind;
	}

	public void setObjectKind(ObjectKindEnum objectKind) {
		this.objectKind = objectKind;
	}

	public GitlabEvent eventType(EventTypeEnum eventType) {
		this.eventType = eventType;
		return this;
	}

	@NotNull
	public EventTypeEnum getEventType() {
		return eventType;
	}

	public void setEventType(EventTypeEnum eventType) {
		this.eventType = eventType;
	}

	public GitlabEvent user(GitlabUser user) {
		this.user = user;
		return this;
	}

	@NotNull
	@Valid
	public GitlabUser getUser() {
		return user;
	}

	public void setUser(GitlabUser user) {
		this.user = user;
	}

	public GitlabEvent project(GitlabProject project) {
		this.project = project;
		return this;
	}

	@NotNull
	@Valid
	public GitlabProject getProject() {
		return project;
	}

	public void setProject(GitlabProject project) {
		this.project = project;
	}

	public GitlabEvent objectAttributes(GitlabMergeRequestAttributes objectAttributes) {
		this.objectAttributes = objectAttributes;
		return this;
	}

	@Valid
	public GitlabMergeRequestAttributes getObjectAttributes() {
		return objectAttributes;
	}

	public void setObjectAttributes(GitlabMergeRequestAttributes objectAttributes) {
		this.objectAttributes = objectAttributes;
	}

	public GitlabEvent labels(List<String> labels) {
		this.labels = labels;
		return this;
	}

	public GitlabEvent addLabelsItem(String labelsItem) {
		if (this.labels == null) {
			this.labels = new ArrayList<String>();
		}
		this.labels.add(labelsItem);
		return this;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public GitlabEvent changes(GitlabEventChanges changes) {
		this.changes = changes;
		return this;
	}

	@Valid
	public GitlabEventChanges getChanges() {
		return changes;
	}

	public void setChanges(GitlabEventChanges changes) {
		this.changes = changes;
	}

	public GitlabEvent repository(GitlabEventRepository repository) {
		this.repository = repository;
		return this;
	}

	@Valid
	public GitlabEventRepository getRepository() {
		return repository;
	}

	public void setRepository(GitlabEventRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabEvent gitlabEvent = (GitlabEvent) o;
		return Objects.equals(this.objectKind, gitlabEvent.objectKind)
				&& Objects.equals(this.eventType, gitlabEvent.eventType) && Objects.equals(this.user, gitlabEvent.user)
				&& Objects.equals(this.project, gitlabEvent.project)
				&& Objects.equals(this.objectAttributes, gitlabEvent.objectAttributes)
				&& Objects.equals(this.labels, gitlabEvent.labels) && Objects.equals(this.changes, gitlabEvent.changes)
				&& Objects.equals(this.repository, gitlabEvent.repository);
	}

	@Override
	public int hashCode() {
		return Objects.hash(objectKind, eventType, user, project, objectAttributes, labels, changes, repository);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEvent {\n");

		sb.append("    objectKind: ").append(toIndentedString(objectKind)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    objectAttributes: ").append(toIndentedString(objectAttributes)).append("\n");
		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
		sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
