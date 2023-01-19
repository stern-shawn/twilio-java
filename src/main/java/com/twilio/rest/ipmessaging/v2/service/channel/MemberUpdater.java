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

package com.twilio.rest.ipmessaging.v2.service.channel;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.time.ZonedDateTime;



public class MemberUpdater extends Updater<Member>{
    private String pathServiceSid;
    private String pathChannelSid;
    private String pathSid;
    private Member.WebhookEnabledType xTwilioWebhookEnabled;
    private String roleSid;
    private Integer lastConsumedMessageIndex;
    private ZonedDateTime lastConsumptionTimestamp;
    private ZonedDateTime dateCreated;
    private ZonedDateTime dateUpdated;
    private String attributes;

    public MemberUpdater(final String pathServiceSid, final String pathChannelSid, final String pathSid){
        this.pathServiceSid = pathServiceSid;
        this.pathChannelSid = pathChannelSid;
        this.pathSid = pathSid;
    }

    public MemberUpdater setXTwilioWebhookEnabled(final Member.WebhookEnabledType xTwilioWebhookEnabled){
        this.xTwilioWebhookEnabled = xTwilioWebhookEnabled;
        return this;
    }
    public MemberUpdater setRoleSid(final String roleSid){
        this.roleSid = roleSid;
        return this;
    }
    public MemberUpdater setLastConsumedMessageIndex(final Integer lastConsumedMessageIndex){
        this.lastConsumedMessageIndex = lastConsumedMessageIndex;
        return this;
    }
    public MemberUpdater setLastConsumptionTimestamp(final ZonedDateTime lastConsumptionTimestamp){
        this.lastConsumptionTimestamp = lastConsumptionTimestamp;
        return this;
    }
    public MemberUpdater setDateCreated(final ZonedDateTime dateCreated){
        this.dateCreated = dateCreated;
        return this;
    }
    public MemberUpdater setDateUpdated(final ZonedDateTime dateUpdated){
        this.dateUpdated = dateUpdated;
        return this;
    }
    public MemberUpdater setAttributes(final String attributes){
        this.attributes = attributes;
        return this;
    }

    @Override
    public Member update(final TwilioRestClient client){
        String path = "/v2/Services/{ServiceSid}/Channels/{ChannelSid}/Members/{Sid}";

        path = path.replace("{"+"ServiceSid"+"}", this.pathServiceSid.toString());
        path = path.replace("{"+"ChannelSid"+"}", this.pathChannelSid.toString());
        path = path.replace("{"+"Sid"+"}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.IPMESSAGING.toString(),
            path
        );
        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Member update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Member.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (roleSid != null) {
            request.addPostParam("RoleSid", roleSid);
    
        }
        if (lastConsumedMessageIndex != null) {
            request.addPostParam("LastConsumedMessageIndex", lastConsumedMessageIndex.toString());
    
        }
        if (lastConsumptionTimestamp != null) {
            request.addPostParam("LastConsumptionTimestamp", lastConsumptionTimestamp.toInstant().toString());

        }
        if (dateCreated != null) {
            request.addPostParam("DateCreated", dateCreated.toInstant().toString());

        }
        if (dateUpdated != null) {
            request.addPostParam("DateUpdated", dateUpdated.toInstant().toString());

        }
        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
    
        }
    }
    private void addHeaderParams(final Request request) {
        if (xTwilioWebhookEnabled != null) {
            request.addHeaderParam("X-Twilio-Webhook-Enabled", xTwilioWebhookEnabled.toString());

        }
    }
}
