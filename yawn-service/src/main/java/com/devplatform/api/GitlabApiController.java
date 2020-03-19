package com.devplatform.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.devplatform.amqp.config.AMQPProducer;
import com.devplatform.model.GitlabEvent;
import com.devplatform.model.ModelApiResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T19:01:01.992Z[GMT]")
@Controller
public class GitlabApiController implements GitlabApi {

    private static final Logger log = LoggerFactory.getLogger(GitlabApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private final String serviceName = "gitlab";
    
    @Autowired
    private AMQPProducer amqpProducer;

    @org.springframework.beans.factory.annotation.Autowired
    public GitlabApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ModelApiResponse> mergeRequest(@ApiParam(value = "" ,required=true )  @Valid @RequestBody GitlabEvent body
) {
    	amqpProducer.sendMessageGeneric(body, serviceName, body.getEventType().name());

    	String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json"))) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 0,\n  \"type\" : \"type\",\n  \"message\" : \"message\"\n}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
