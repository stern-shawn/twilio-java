/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Serverless
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.serverless.v1.service.asset;

import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.base.Page;



public class AssetVersionReader extends Reader<AssetVersion> {
    private String pathServiceSid;
    private String pathAssetSid;
    private Integer pageSize;

    public AssetVersionReader(final String pathServiceSid, final String pathAssetSid){
        this.pathServiceSid = pathServiceSid;
        this.pathAssetSid = pathAssetSid;
    }

    public AssetVersionReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<AssetVersion> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<AssetVersion> firstPage(final TwilioRestClient client) {
        String path = "/v1/Services/{ServiceSid}/Assets/{AssetSid}/Versions";
        path = path.replace("{"+"ServiceSid"+"}", this.pathServiceSid.toString());
        path = path.replace("{"+"AssetSid"+"}", this.pathAssetSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.SERVERLESS.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<AssetVersion> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("AssetVersion read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "asset_versions",
            response.getContent(),
            AssetVersion.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<AssetVersion> previousPage(final Page<AssetVersion> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.SERVERLESS.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<AssetVersion> nextPage(final Page<AssetVersion> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.SERVERLESS.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<AssetVersion> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if(getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
