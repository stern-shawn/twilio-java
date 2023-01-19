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

package com.twilio.rest.preview.understand.assistant.task;

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


public class TaskActionsUpdater extends Updater<TaskActions>{
    private String pathAssistantSid;
    private String pathTaskSid;
    private Map<String, Object> actions;

    public TaskActionsUpdater(final String pathAssistantSid, final String pathTaskSid){
        this.pathAssistantSid = pathAssistantSid;
        this.pathTaskSid = pathTaskSid;
    }

    public TaskActionsUpdater setActions(final Map<String, Object> actions){
        this.actions = actions;
        return this;
    }

    @Override
    public TaskActions update(final TwilioRestClient client){
        String path = "/understand/Assistants/{AssistantSid}/Tasks/{TaskSid}/Actions";

        path = path.replace("{"+"AssistantSid"+"}", this.pathAssistantSid.toString());
        path = path.replace("{"+"TaskSid"+"}", this.pathTaskSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("TaskActions update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return TaskActions.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (actions != null) {
            request.addPostParam("Actions",  Converter.mapToJson(actions));
    
        }
    }
}
