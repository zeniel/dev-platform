package com.devplatform.translatorservice.amqp.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devplatform.model.event.gitlab.GitlabEvent;
import com.devplatform.model.event.jira.JiraEvent;
import com.devplatform.model.event.slack.SlackChannelMessage;
import com.devplatform.translatorservice.controllers.GitlabUserController;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class TranslatorMessageConsumer {

	private static final Logger logger = LoggerFactory.getLogger(TranslatorMessageConsumer.class);

	public final static String EXCHANGE_NAME = "dev-platform-exchange";
	public final static String TRANSLATOR_SERVICE_ROUTING_KEY = "dev-platform.#";
	public final static String TRANSLATOR_SERVICE_QUEUE = "dev-platform.rawevents";
	public final static String AMQP_HEADER_TYPEID = "__TypeId__";
	
	public interface EVENTS_SUFFIX {
		public static final String GITLABEVENT = "event.gitlab.GitlabEvent";
		public static final String JIRAISSUEEVENT = "event.jira.JiraEvent";
		public static final String SLACKMESSAGE = "event.slack.SlackChannelMessage";
	}
	
    @Autowired
    private ObjectMapper objectMapper;
    
	@RabbitListener(
		bindings = @QueueBinding(
			value = @Queue(value = TRANSLATOR_SERVICE_QUEUE, durable = "true", autoDelete = "false", exclusive = "false"), 
			exchange = @Exchange(value = EXCHANGE_NAME, type = ExchangeTypes.TOPIC), 
			key = {TRANSLATOR_SERVICE_ROUTING_KEY})
	)
	public void receiveRawEventFromBroker(Message msg) throws Exception {
		if(msg != null && msg.getBody() != null 
				&& msg.getMessageProperties() != null && msg.getMessageProperties().getHeader(AMQP_HEADER_TYPEID) != null) {
			String messageType = msg.getMessageProperties().getHeader(AMQP_HEADER_TYPEID);
			String body = new String(msg.getBody());

			logger.info("[AMQP MESSAGE RECEIVED] " + new String(msg.toString()));
			if(messageType.endsWith(EVENTS_SUFFIX.GITLABEVENT)) {
				GitlabEvent gitlabEvent = objectMapper.readValue(body, GitlabEvent.class);
				logger.info("[GITLAB] - " + gitlabEvent.getObjectKind().name());
				// TODO - Implement gitlab translator
				GitlabUserController glUserCtrl = new GitlabUserController();
				glUserCtrl.teste();
			}else if(messageType.endsWith(EVENTS_SUFFIX.JIRAISSUEEVENT)) {
				JiraEvent jiraEvent = objectMapper.readValue(body, JiraEvent.class);
				logger.info("[JIRA] - " + jiraEvent.getIssueEventTypeName().name());
				// TODO - Implement jira issue translator
			}else if(messageType.endsWith(EVENTS_SUFFIX.SLACKMESSAGE)) {
				SlackChannelMessage slackMessage = objectMapper.readValue(body, SlackChannelMessage.class);
				logger.info("[SLACK] - " + slackMessage.getText());
				// TODO - Implement slack channel message translator
			}
		}
	}	
	
}
