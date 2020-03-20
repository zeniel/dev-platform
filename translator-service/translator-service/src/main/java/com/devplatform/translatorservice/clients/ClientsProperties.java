package com.devplatform.translatorservice.clients;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "service")
public class ClientsProperties {

    private String gitlabUrl;
    private String gitlabAccesstoken;
    private String jiraUrl;
    private String jiraUser;
    private String jiraPass;
    
	public String getGitlabUrl() {
		return gitlabUrl;
	}
	public void setGitlabUrl(String gitlabUrl) {
		this.gitlabUrl = gitlabUrl;
	}
	public String getGitlabAccesstoken() {
		return gitlabAccesstoken;
	}
	public void setGitlabAccesstoken(String gitlabAccesstoken) {
		this.gitlabAccesstoken = gitlabAccesstoken;
	}
	public String getJiraUrl() {
		return jiraUrl;
	}
	public void setJiraUrl(String jiraUrl) {
		this.jiraUrl = jiraUrl;
	}
	public String getJiraUser() {
		return jiraUser;
	}
	public void setJiraUser(String jiraUser) {
		this.jiraUser = jiraUser;
	}
	public String getJiraPass() {
		return jiraPass;
	}
	public void setJiraPass(String jiraPass) {
		this.jiraPass = jiraPass;
	}
}