package com.devplatform.translatorservice.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devplatform.model.event.gitlab.GitlabUser;
import com.devplatform.translatorservice.clients.GitlabClient;

@Component
public class UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private GitlabClient gitlabClient;
	
    public void teste() {
		logger.info("Trying to get user information from service GITLAB: ");
		if(gitlabClient != null) {
			GitlabUser usuarioLogado = gitlabClient.obterUsuarioLogado();
			logger.info(usuarioLogado.toString());
		}else {
			logger.error("client feign not initialized");
		}
    }

}
