/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Events
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.events.v1.subscription;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class SubscribedEventFetcher extends Fetcher<SubscribedEvent> {
    private String pathSubscriptionSid;
    private String pathType;

    public SubscribedEventFetcher(final String pathSubscriptionSid, final String pathType){
        this.pathSubscriptionSid = pathSubscriptionSid;
        this.pathType = pathType;
    }


    @Override
    public SubscribedEvent fetch(final TwilioRestClient client) {
        String path = "/v1/Subscriptions/{SubscriptionSid}/SubscribedEvents/{Type}";

        path = path.replace("{"+"SubscriptionSid"+"}", this.pathSubscriptionSid.toString());
        path = path.replace("{"+"Type"+"}", this.pathType.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.EVENTS.toString(),
            path
        );
        Response response = client.request(request);

        if (response == null) {
        throw new ApiConnectionException("SubscribedEvent fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SubscribedEvent.fromJson(response.getStream(), client.getObjectMapper());
    }
}
