/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Taskrouter
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.taskrouter.v1.workspace.task;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class ReservationFetcher extends Fetcher<Reservation> {
    private String pathWorkspaceSid;
    private String pathTaskSid;
    private String pathSid;

    public ReservationFetcher(final String pathWorkspaceSid, final String pathTaskSid, final String pathSid){
        this.pathWorkspaceSid = pathWorkspaceSid;
        this.pathTaskSid = pathTaskSid;
        this.pathSid = pathSid;
    }


    @Override
    public Reservation fetch(final TwilioRestClient client) {
        String path = "/v1/Workspaces/{WorkspaceSid}/Tasks/{TaskSid}/Reservations/{Sid}";

        path = path.replace("{"+"WorkspaceSid"+"}", this.pathWorkspaceSid.toString());
        path = path.replace("{"+"TaskSid"+"}", this.pathTaskSid.toString());
        path = path.replace("{"+"Sid"+"}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.TASKROUTER.toString(),
            path
        );
        Response response = client.request(request);

        if (response == null) {
        throw new ApiConnectionException("Reservation fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Reservation.fromJson(response.getStream(), client.getObjectMapper());
    }
}
