/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Sync
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.sync.v1.service.synclist;

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


public class SyncListItemUpdater extends Updater<SyncListItem>{
    private String pathServiceSid;
    private String pathListSid;
    private Integer pathIndex;
    private String ifMatch;
    private Map<String, Object> data;
    private Integer ttl;
    private Integer itemTtl;
    private Integer collectionTtl;

    public SyncListItemUpdater(final String pathServiceSid, final String pathListSid, final Integer pathIndex){
        this.pathServiceSid = pathServiceSid;
        this.pathListSid = pathListSid;
        this.pathIndex = pathIndex;
    }

    public SyncListItemUpdater setIfMatch(final String ifMatch){
        this.ifMatch = ifMatch;
        return this;
    }
    public SyncListItemUpdater setData(final Map<String, Object> data){
        this.data = data;
        return this;
    }
    public SyncListItemUpdater setTtl(final Integer ttl){
        this.ttl = ttl;
        return this;
    }
    public SyncListItemUpdater setItemTtl(final Integer itemTtl){
        this.itemTtl = itemTtl;
        return this;
    }
    public SyncListItemUpdater setCollectionTtl(final Integer collectionTtl){
        this.collectionTtl = collectionTtl;
        return this;
    }

    @Override
    public SyncListItem update(final TwilioRestClient client){
        String path = "/v1/Services/{ServiceSid}/Lists/{ListSid}/Items/{Index}";

        path = path.replace("{"+"ServiceSid"+"}", this.pathServiceSid.toString());
        path = path.replace("{"+"ListSid"+"}", this.pathListSid.toString());
        path = path.replace("{"+"Index"+"}", this.pathIndex.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.SYNC.toString(),
            path
        );
        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("SyncListItem update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SyncListItem.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (data != null) {
            request.addPostParam("Data",  Converter.mapToJson(data));
    
        }
        if (ttl != null) {
            request.addPostParam("Ttl", ttl.toString());
    
        }
        if (itemTtl != null) {
            request.addPostParam("ItemTtl", itemTtl.toString());
    
        }
        if (collectionTtl != null) {
            request.addPostParam("CollectionTtl", collectionTtl.toString());
    
        }
    }
    private void addHeaderParams(final Request request) {
        if (ifMatch != null) {
            request.addHeaderParam("If-Match", ifMatch);

        }
    }
}
