package com.devplatform.translatorservice.clients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class GitlabClientConfiguration {	
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

}