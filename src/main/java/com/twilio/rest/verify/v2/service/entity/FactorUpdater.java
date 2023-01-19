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

package com.twilio.rest.verify.v2.service.entity;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class FactorUpdater extends Updater<Factor>{
    private String pathServiceSid;
    private String pathIdentity;
    private String pathSid;
    private String authPayload;
    private String friendlyName;
    private String configNotificationToken;
    private String configSdkVersion;
    private Integer configTimeStep;
    private Integer configSkew;
    private Integer configCodeLength;
    private Factor.TotpAlgorithms configAlg;
    private String configNotificationPlatform;

    public FactorUpdater(final String pathServiceSid, final String pathIdentity, final String pathSid){
        this.pathServiceSid = pathServiceSid;
        this.pathIdentity = pathIdentity;
        this.pathSid = pathSid;
    }

    public FactorUpdater setAuthPayload(final String authPayload){
        this.authPayload = authPayload;
        return this;
    }
    public FactorUpdater setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public FactorUpdater setConfigNotificationToken(final String configNotificationToken){
        this.configNotificationToken = configNotificationToken;
        return this;
    }
    public FactorUpdater setConfigSdkVersion(final String configSdkVersion){
        this.configSdkVersion = configSdkVersion;
        return this;
    }
    public FactorUpdater setConfigTimeStep(final Integer configTimeStep){
        this.configTimeStep = configTimeStep;
        return this;
    }
    public FactorUpdater setConfigSkew(final Integer configSkew){
        this.configSkew = configSkew;
        return this;
    }
    public FactorUpdater setConfigCodeLength(final Integer configCodeLength){
        this.configCodeLength = configCodeLength;
        return this;
    }
    public FactorUpdater setConfigAlg(final Factor.TotpAlgorithms configAlg){
        this.configAlg = configAlg;
        return this;
    }
    public FactorUpdater setConfigNotificationPlatform(final String configNotificationPlatform){
        this.configNotificationPlatform = configNotificationPlatform;
        return this;
    }

    @Override
    public Factor update(final TwilioRestClient client){
        String path = "/v2/Services/{ServiceSid}/Entities/{Identity}/Factors/{Sid}";

        path = path.replace("{"+"ServiceSid"+"}", this.pathServiceSid.toString());
        path = path.replace("{"+"Identity"+"}", this.pathIdentity.toString());
        path = path.replace("{"+"Sid"+"}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.VERIFY.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Factor update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Factor.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (authPayload != null) {
            request.addPostParam("AuthPayload", authPayload);
    
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (configNotificationToken != null) {
            request.addPostParam("Config.NotificationToken", configNotificationToken);
    
        }
        if (configSdkVersion != null) {
            request.addPostParam("Config.SdkVersion", configSdkVersion);
    
        }
        if (configTimeStep != null) {
            request.addPostParam("ConfigTimeStep", configTimeStep.toString());
    
        }
        if (configSkew != null) {
            request.addPostParam("ConfigSkew", configSkew.toString());
    
        }
        if (configCodeLength != null) {
            request.addPostParam("ConfigCodeLength", configCodeLength.toString());
    
        }
        if (configAlg != null) {
            request.addPostParam("ConfigAlg", configAlg.toString());
    
        }
        if (configNotificationPlatform != null) {
            request.addPostParam("Config.NotificationPlatform", configNotificationPlatform);
    
        }
    }
}
