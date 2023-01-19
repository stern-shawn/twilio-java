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

package com.twilio.rest.api.v2010.account.sip.domain.authtypes.authtypecalls;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class AuthCallsIpAccessControlListMappingCreator extends Creator<AuthCallsIpAccessControlListMapping>{
    private String pathDomainSid;
    private String ipAccessControlListSid;
    private String pathAccountSid;

    public AuthCallsIpAccessControlListMappingCreator(final String pathDomainSid, final String ipAccessControlListSid) {
        this.pathDomainSid = pathDomainSid;
        this.ipAccessControlListSid = ipAccessControlListSid;
    }
    public AuthCallsIpAccessControlListMappingCreator(final String pathAccountSid, final String pathDomainSid, final String ipAccessControlListSid) {
        this.pathAccountSid = pathAccountSid;
        this.pathDomainSid = pathDomainSid;
        this.ipAccessControlListSid = ipAccessControlListSid;
    }

    public AuthCallsIpAccessControlListMappingCreator setIpAccessControlListSid(final String ipAccessControlListSid){
        this.ipAccessControlListSid = ipAccessControlListSid;
        return this;
    }

    @Override
    public AuthCallsIpAccessControlListMapping create(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/SIP/Domains/{DomainSid}/Auth/Calls/IpAccessControlListMappings.json";

        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        path = path.replace("{"+"AccountSid"+"}", this.pathAccountSid.toString());
        path = path.replace("{"+"DomainSid"+"}", this.pathDomainSid.toString());
        path = path.replace("{"+"IpAccessControlListSid"+"}", this.ipAccessControlListSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("AuthCallsIpAccessControlListMapping creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return AuthCallsIpAccessControlListMapping.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (ipAccessControlListSid != null) {
            request.addPostParam("IpAccessControlListSid", ipAccessControlListSid);
    
        }
    }
}
