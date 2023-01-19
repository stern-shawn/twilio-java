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

package com.twilio.rest.preview.sync.service;

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


public class DocumentUpdater extends Updater<Document>{
    private String pathServiceSid;
    private String pathSid;
    private Map<String, Object> data;
    private String ifMatch;

    public DocumentUpdater(final String pathServiceSid, final String pathSid, final Map<String, Object> data){
        this.pathServiceSid = pathServiceSid;
        this.pathSid = pathSid;
        this.data = data;
    }

    public DocumentUpdater setData(final Map<String, Object> data){
        this.data = data;
        return this;
    }
    public DocumentUpdater setIfMatch(final String ifMatch){
        this.ifMatch = ifMatch;
        return this;
    }

    @Override
    public Document update(final TwilioRestClient client){
        String path = "/Sync/Services/{ServiceSid}/Documents/{Sid}";

        path = path.replace("{"+"ServiceSid"+"}", this.pathServiceSid.toString());
        path = path.replace("{"+"Sid"+"}", this.pathSid.toString());
        path = path.replace("{"+"Data"+"}", this.data.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Document update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Document.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (data != null) {
            request.addPostParam("Data",  Converter.mapToJson(data));
    
        }
    }
    private void addHeaderParams(final Request request) {
        if (ifMatch != null) {
            request.addHeaderParam("If-Match", ifMatch);

        }
    }
}
