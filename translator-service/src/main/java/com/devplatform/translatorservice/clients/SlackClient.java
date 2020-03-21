package com.devplatform.translatorservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devplatform.model.event.jira.JiraUser;

@FeignClient(name = "slack", url = "https://hooks.slack.com/services/", configuration = JiraClientConfiguration.class)
public interface SlackClient {
	@RequestMapping(method = RequestMethod.GET, value = "{}/rest/auth/1/session", consumes = "application/json")
	public JiraUser obterUsuarioLogado();
}

//https://hooks.slack.com/services/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