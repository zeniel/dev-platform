/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.devplatform.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devplatform.model.GitlabEvent;
import com.devplatform.model.ModelApiResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T19:01:01.992Z[GMT]")
@Api(value = "gitlab", description = "the gitlab API")
public interface GitlabApi {

    @ApiOperation(value = "New merge request", nickname = "mergeRequest", notes = "", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "yawn_api_key")    }, tags={ "gitlab", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/gitlab/merge-request",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> mergeRequest(@ApiParam(value = "" ,required=true )  @Valid @RequestBody GitlabEvent body
);

}