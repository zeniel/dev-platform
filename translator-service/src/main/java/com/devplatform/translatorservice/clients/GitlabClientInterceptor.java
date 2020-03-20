package com.devplatform.translatorservice.clients;

import org.springframework.context.annotation.ComponentScan;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@ComponentScan
class GitlabClientInterceptor implements RequestInterceptor {
	private static final String AUTH_TOKEN_HEADER = "PRIVATE-TOKEN";
	
	public GitlabClientInterceptor() {
	}
	
    @Override
    public void apply(RequestTemplate template) {
        template.header(AUTH_TOKEN_HEADER, "3t2XaJpYhcT3CUGYkoCK");

    }

}