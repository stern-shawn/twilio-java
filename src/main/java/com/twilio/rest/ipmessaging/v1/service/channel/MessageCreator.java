/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.ipmessaging.v1.service.channel;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class MessageCreator extends Creator<Message>{
    private String pathServiceSid;
    private String pathChannelSid;
    private String body;
    private String from;
    private String attributes;

    public MessageCreator(final String pathServiceSid, final String pathChannelSid, final String body) {
        this.pathServiceSid = pathServiceSid;
        this.pathChannelSid = pathChannelSid;
        this.body = body;
    }

    public MessageCreator setBody(final String body){
        this.body = body;
        return this;
    }
    public MessageCreator setFrom(final String from){
        this.from = from;
        return this;
    }
    public MessageCreator setAttributes(final String attributes){
        this.attributes = attributes;
        return this;
    }

    @Override
    public Message create(final TwilioRestClient client){
        String path = "/v1/Services/{ServiceSid}/Channels/{ChannelSid}/Messages";

        path = path.replace("{"+"ServiceSid"+"}", this.pathServiceSid.toString());
        path = path.replace("{"+"ChannelSid"+"}", this.pathChannelSid.toString());
        path = path.replace("{"+"Body"+"}", this.body.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.IPMESSAGING.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Message creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Message.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (body != null) {
            request.addPostParam("Body", body);
    
        }
        if (from != null) {
            request.addPostParam("From", from);
    
        }
        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
    
        }
    }
}
