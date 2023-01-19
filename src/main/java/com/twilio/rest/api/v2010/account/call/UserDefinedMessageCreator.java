/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.api.v2010.account.call;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class UserDefinedMessageCreator extends Creator<UserDefinedMessage>{
    private String pathCallSid;
    private String content;
    private String pathAccountSid;
    private String idempotencyKey;

    public UserDefinedMessageCreator(final String pathCallSid, final String content) {
        this.pathCallSid = pathCallSid;
        this.content = content;
    }
    public UserDefinedMessageCreator(final String pathAccountSid, final String pathCallSid, final String content) {
        this.pathAccountSid = pathAccountSid;
        this.pathCallSid = pathCallSid;
        this.content = content;
    }

    public UserDefinedMessageCreator setContent(final String content){
        this.content = content;
        return this;
    }
    public UserDefinedMessageCreator setIdempotencyKey(final String idempotencyKey){
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    @Override
    public UserDefinedMessage create(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/Calls/{CallSid}/UserDefinedMessages.json";

        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        path = path.replace("{"+"AccountSid"+"}", this.pathAccountSid.toString());
        path = path.replace("{"+"CallSid"+"}", this.pathCallSid.toString());
        path = path.replace("{"+"Content"+"}", this.content.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("UserDefinedMessage creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return UserDefinedMessage.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (content != null) {
            request.addPostParam("Content", content);
    
        }
        if (idempotencyKey != null) {
            request.addPostParam("IdempotencyKey", idempotencyKey);
    
        }
    }
}
