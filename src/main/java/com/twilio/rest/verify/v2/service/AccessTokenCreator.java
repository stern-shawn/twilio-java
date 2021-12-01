/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2.service;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class AccessTokenCreator extends Creator<AccessToken> {
    private final String pathServiceSid;
    private final String identity;
    private final AccessToken.FactorTypes factorType;
    private String factorFriendlyName;

    /**
     * Construct a new AccessTokenCreator.
     *
     * @param pathServiceSid Service Sid.
     * @param identity Unique external identifier of the Entity
     * @param factorType The Type of this Factor
     */
    public AccessTokenCreator(final String pathServiceSid,
                              final String identity,
                              final AccessToken.FactorTypes factorType) {
        this.pathServiceSid = pathServiceSid;
        this.identity = identity;
        this.factorType = factorType;
    }

    /**
     * The friendly name of the factor that is going to be created with this access
     * token.
     *
     * @param factorFriendlyName The factor friendly name
     * @return this
     */
    public AccessTokenCreator setFactorFriendlyName(final String factorFriendlyName) {
        this.factorFriendlyName = factorFriendlyName;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created AccessToken
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public AccessToken create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.VERIFY.toString(),
            "/v2/Services/" + this.pathServiceSid + "/AccessTokens"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("AccessToken creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return AccessToken.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (identity != null) {
            request.addPostParam("Identity", identity);
        }

        if (factorType != null) {
            request.addPostParam("FactorType", factorType.toString());
        }

        if (factorFriendlyName != null) {
            request.addPostParam("FactorFriendlyName", factorFriendlyName);
        }
    }
}