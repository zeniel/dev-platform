package com.devplatform.translatorservice.clients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

@Configuration
public class GitlabClientConfiguration {	
	private static final String AUTH_TOKEN_HEADER = "PRIVATE-TOKEN";
	@Bean
	public RequestInterceptor requestInterceptor() {
	  return requestTemplate -> {
	      requestTemplate.header(AUTH_TOKEN_HEADER, "3t2XaJpYhcT3CUGYkoCK");
	  };
	}
}