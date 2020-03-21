package com.devplatform.translatorservice.clients;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignContext;

import feign.Client;
import feign.Feign;
import feign.Logger;
import feign.slf4j.Slf4jLogger;

public class ClientsUtil {
	@Autowired(required = false)
	private FeignContext feignContext;
	
	@Autowired
	private ClientsProperties clientsProperties;

	
	public GitlabClient createGitlabClient(HttpServletRequest request) {
		FeignClientsConfiguration config = 
					this.feignContext.getInstance(FeignClientsConfiguration.class.getName(), FeignClientsConfiguration.class);		
				
		return Feign.builder()
				.logger(new Slf4jLogger(GitlabClient.class))
				.logLevel(Logger.Level.FULL)
//				.requestInterceptor(new PjeLegacyClientInterceptor())
				.client(new Client.Default(null,null))
				.decoder(config.feignDecoder())
				.target(GitlabClient.class, clientsProperties.getGitlabUrl());
	}

}
