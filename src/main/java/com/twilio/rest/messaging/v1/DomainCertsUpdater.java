/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.messaging.v1;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class DomainCertsUpdater extends Updater<DomainCerts>{
    private String pathDomainSid;
    private String tlsCert;

    public DomainCertsUpdater(final String pathDomainSid, final String tlsCert){
        this.pathDomainSid = pathDomainSid;
        this.tlsCert = tlsCert;
    }

    public DomainCertsUpdater setTlsCert(final String tlsCert){
        this.tlsCert = tlsCert;
        return this;
    }

    @Override
    public DomainCerts update(final TwilioRestClient client){
        String path = "/v1/LinkShortening/Domains/{DomainSid}/Certificate";

        path = path.replace("{"+"DomainSid"+"}", this.pathDomainSid.toString());
        path = path.replace("{"+"TlsCert"+"}", this.tlsCert.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.MESSAGING.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("DomainCerts update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return DomainCerts.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (tlsCert != null) {
            request.addPostParam("TlsCert", tlsCert);
    
        }
    }
}
