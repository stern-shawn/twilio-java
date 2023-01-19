/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.preview.understand.assistant;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;


import java.util.Map;


public class AssistantInitiationActionsUpdater extends Updater<AssistantInitiationActions>{
    private String pathAssistantSid;
    private Map<String, Object> initiationActions;

    public AssistantInitiationActionsUpdater(final String pathAssistantSid){
        this.pathAssistantSid = pathAssistantSid;
    }

    public AssistantInitiationActionsUpdater setInitiationActions(final Map<String, Object> initiationActions){
        this.initiationActions = initiationActions;
        return this;
    }

    @Override
    public AssistantInitiationActions update(final TwilioRestClient client){
        String path = "/understand/Assistants/{AssistantSid}/InitiationActions";

        path = path.replace("{"+"AssistantSid"+"}", this.pathAssistantSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("AssistantInitiationActions update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return AssistantInitiationActions.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (initiationActions != null) {
            request.addPostParam("InitiationActions",  Converter.mapToJson(initiationActions));
    
        }
    }
}
