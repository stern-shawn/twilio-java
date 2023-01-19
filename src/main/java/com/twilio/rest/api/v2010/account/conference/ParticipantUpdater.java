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

package com.twilio.rest.api.v2010.account.conference;

import com.twilio.base.Updater;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;



public class ParticipantUpdater extends Updater<Participant>{
    private String pathConferenceSid;
    private String pathCallSid;
    private String pathAccountSid;
    private Boolean muted;
    private Boolean hold;
    private URI holdUrl;
    private HttpMethod holdMethod;
    private URI announceUrl;
    private HttpMethod announceMethod;
    private URI waitUrl;
    private HttpMethod waitMethod;
    private Boolean beepOnExit;
    private Boolean endConferenceOnExit;
    private Boolean coaching;
    private String callSidToCoach;

    public ParticipantUpdater(final String pathConferenceSid, final String pathCallSid){
        this.pathConferenceSid = pathConferenceSid;
        this.pathCallSid = pathCallSid;
    }
    public ParticipantUpdater(final String pathAccountSid, final String pathConferenceSid, final String pathCallSid){
        this.pathAccountSid = pathAccountSid;
        this.pathConferenceSid = pathConferenceSid;
        this.pathCallSid = pathCallSid;
    }

    public ParticipantUpdater setMuted(final Boolean muted){
        this.muted = muted;
        return this;
    }
    public ParticipantUpdater setHold(final Boolean hold){
        this.hold = hold;
        return this;
    }
    public ParticipantUpdater setHoldUrl(final URI holdUrl){
        this.holdUrl = holdUrl;
        return this;
    }

    public ParticipantUpdater setHoldUrl(final String holdUrl){
        return setHoldUrl(Promoter.uriFromString(holdUrl));
    }
    public ParticipantUpdater setHoldMethod(final HttpMethod holdMethod){
        this.holdMethod = holdMethod;
        return this;
    }
    public ParticipantUpdater setAnnounceUrl(final URI announceUrl){
        this.announceUrl = announceUrl;
        return this;
    }

    public ParticipantUpdater setAnnounceUrl(final String announceUrl){
        return setAnnounceUrl(Promoter.uriFromString(announceUrl));
    }
    public ParticipantUpdater setAnnounceMethod(final HttpMethod announceMethod){
        this.announceMethod = announceMethod;
        return this;
    }
    public ParticipantUpdater setWaitUrl(final URI waitUrl){
        this.waitUrl = waitUrl;
        return this;
    }

    public ParticipantUpdater setWaitUrl(final String waitUrl){
        return setWaitUrl(Promoter.uriFromString(waitUrl));
    }
    public ParticipantUpdater setWaitMethod(final HttpMethod waitMethod){
        this.waitMethod = waitMethod;
        return this;
    }
    public ParticipantUpdater setBeepOnExit(final Boolean beepOnExit){
        this.beepOnExit = beepOnExit;
        return this;
    }
    public ParticipantUpdater setEndConferenceOnExit(final Boolean endConferenceOnExit){
        this.endConferenceOnExit = endConferenceOnExit;
        return this;
    }
    public ParticipantUpdater setCoaching(final Boolean coaching){
        this.coaching = coaching;
        return this;
    }
    public ParticipantUpdater setCallSidToCoach(final String callSidToCoach){
        this.callSidToCoach = callSidToCoach;
        return this;
    }

    @Override
    public Participant update(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/Conferences/{ConferenceSid}/Participants/{CallSid}.json";

        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        path = path.replace("{"+"AccountSid"+"}", this.pathAccountSid.toString());
        path = path.replace("{"+"ConferenceSid"+"}", this.pathConferenceSid.toString());
        path = path.replace("{"+"CallSid"+"}", this.pathCallSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Participant update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Participant.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (muted != null) {
            request.addPostParam("Muted", muted.toString());
    
        }
        if (hold != null) {
            request.addPostParam("Hold", hold.toString());
    
        }
        if (holdUrl != null) {
            request.addPostParam("HoldUrl", holdUrl.toString());
    
        }
        if (holdMethod != null) {
            request.addPostParam("HoldMethod", holdMethod.toString());
    
        }
        if (announceUrl != null) {
            request.addPostParam("AnnounceUrl", announceUrl.toString());
    
        }
        if (announceMethod != null) {
            request.addPostParam("AnnounceMethod", announceMethod.toString());
    
        }
        if (waitUrl != null) {
            request.addPostParam("WaitUrl", waitUrl.toString());
    
        }
        if (waitMethod != null) {
            request.addPostParam("WaitMethod", waitMethod.toString());
    
        }
        if (beepOnExit != null) {
            request.addPostParam("BeepOnExit", beepOnExit.toString());
    
        }
        if (endConferenceOnExit != null) {
            request.addPostParam("EndConferenceOnExit", endConferenceOnExit.toString());
    
        }
        if (coaching != null) {
            request.addPostParam("Coaching", coaching.toString());
    
        }
        if (callSidToCoach != null) {
            request.addPostParam("CallSidToCoach", callSidToCoach);
    
        }
    }
}
