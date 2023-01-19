/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Verify
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.verify.v2;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class ServiceCreator extends Creator<Service>{
    private String friendlyName;
    private Integer codeLength;
    private Boolean lookupEnabled;
    private Boolean skipSmsToLandlines;
    private Boolean dtmfInputRequired;
    private String ttsName;
    private Boolean psd2Enabled;
    private Boolean doNotShareWarningEnabled;
    private Boolean customCodeEnabled;
    private Boolean pushIncludeDate;
    private String pushApnCredentialSid;
    private String pushFcmCredentialSid;
    private String totpIssuer;
    private Integer totpTimeStep;
    private Integer totpCodeLength;
    private Integer totpSkew;
    private String defaultTemplateSid;

    public ServiceCreator(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public ServiceCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public ServiceCreator setCodeLength(final Integer codeLength){
        this.codeLength = codeLength;
        return this;
    }
    public ServiceCreator setLookupEnabled(final Boolean lookupEnabled){
        this.lookupEnabled = lookupEnabled;
        return this;
    }
    public ServiceCreator setSkipSmsToLandlines(final Boolean skipSmsToLandlines){
        this.skipSmsToLandlines = skipSmsToLandlines;
        return this;
    }
    public ServiceCreator setDtmfInputRequired(final Boolean dtmfInputRequired){
        this.dtmfInputRequired = dtmfInputRequired;
        return this;
    }
    public ServiceCreator setTtsName(final String ttsName){
        this.ttsName = ttsName;
        return this;
    }
    public ServiceCreator setPsd2Enabled(final Boolean psd2Enabled){
        this.psd2Enabled = psd2Enabled;
        return this;
    }
    public ServiceCreator setDoNotShareWarningEnabled(final Boolean doNotShareWarningEnabled){
        this.doNotShareWarningEnabled = doNotShareWarningEnabled;
        return this;
    }
    public ServiceCreator setCustomCodeEnabled(final Boolean customCodeEnabled){
        this.customCodeEnabled = customCodeEnabled;
        return this;
    }
    public ServiceCreator setPushIncludeDate(final Boolean pushIncludeDate){
        this.pushIncludeDate = pushIncludeDate;
        return this;
    }
    public ServiceCreator setPushApnCredentialSid(final String pushApnCredentialSid){
        this.pushApnCredentialSid = pushApnCredentialSid;
        return this;
    }
    public ServiceCreator setPushFcmCredentialSid(final String pushFcmCredentialSid){
        this.pushFcmCredentialSid = pushFcmCredentialSid;
        return this;
    }
    public ServiceCreator setTotpIssuer(final String totpIssuer){
        this.totpIssuer = totpIssuer;
        return this;
    }
    public ServiceCreator setTotpTimeStep(final Integer totpTimeStep){
        this.totpTimeStep = totpTimeStep;
        return this;
    }
    public ServiceCreator setTotpCodeLength(final Integer totpCodeLength){
        this.totpCodeLength = totpCodeLength;
        return this;
    }
    public ServiceCreator setTotpSkew(final Integer totpSkew){
        this.totpSkew = totpSkew;
        return this;
    }
    public ServiceCreator setDefaultTemplateSid(final String defaultTemplateSid){
        this.defaultTemplateSid = defaultTemplateSid;
        return this;
    }

    @Override
    public Service create(final TwilioRestClient client){
        String path = "/v2/Services";

        path = path.replace("{"+"FriendlyName"+"}", this.friendlyName.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.VERIFY.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Service creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Service.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (codeLength != null) {
            request.addPostParam("CodeLength", codeLength.toString());
    
        }
        if (lookupEnabled != null) {
            request.addPostParam("LookupEnabled", lookupEnabled.toString());
    
        }
        if (skipSmsToLandlines != null) {
            request.addPostParam("SkipSmsToLandlines", skipSmsToLandlines.toString());
    
        }
        if (dtmfInputRequired != null) {
            request.addPostParam("DtmfInputRequired", dtmfInputRequired.toString());
    
        }
        if (ttsName != null) {
            request.addPostParam("TtsName", ttsName);
    
        }
        if (psd2Enabled != null) {
            request.addPostParam("Psd2Enabled", psd2Enabled.toString());
    
        }
        if (doNotShareWarningEnabled != null) {
            request.addPostParam("DoNotShareWarningEnabled", doNotShareWarningEnabled.toString());
    
        }
        if (customCodeEnabled != null) {
            request.addPostParam("CustomCodeEnabled", customCodeEnabled.toString());
    
        }
        if (pushIncludeDate != null) {
            request.addPostParam("PushIncludeDate", pushIncludeDate.toString());
    
        }
        if (pushApnCredentialSid != null) {
            request.addPostParam("Push.ApnCredentialSid", pushApnCredentialSid);
    
        }
        if (pushFcmCredentialSid != null) {
            request.addPostParam("Push.FcmCredentialSid", pushFcmCredentialSid);
    
        }
        if (totpIssuer != null) {
            request.addPostParam("Totp.Issuer", totpIssuer);
    
        }
        if (totpTimeStep != null) {
            request.addPostParam("TotpTimeStep", totpTimeStep.toString());
    
        }
        if (totpCodeLength != null) {
            request.addPostParam("TotpCodeLength", totpCodeLength.toString());
    
        }
        if (totpSkew != null) {
            request.addPostParam("TotpSkew", totpSkew.toString());
    
        }
        if (defaultTemplateSid != null) {
            request.addPostParam("DefaultTemplateSid", defaultTemplateSid);
    
        }
    }
}
