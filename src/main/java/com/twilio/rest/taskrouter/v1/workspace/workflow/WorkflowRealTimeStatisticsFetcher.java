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

package com.twilio.rest.taskrouter.v1.workspace.workflow;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class WorkflowRealTimeStatisticsFetcher extends Fetcher<WorkflowRealTimeStatistics> {
    private String pathWorkspaceSid;
    private String pathWorkflowSid;
    private String taskChannel;

    public WorkflowRealTimeStatisticsFetcher(final String pathWorkspaceSid, final String pathWorkflowSid){
        this.pathWorkspaceSid = pathWorkspaceSid;
        this.pathWorkflowSid = pathWorkflowSid;
    }

    public WorkflowRealTimeStatisticsFetcher setTaskChannel(final String taskChannel){
        this.taskChannel = taskChannel;
        return this;
    }

    @Override
    public WorkflowRealTimeStatistics fetch(final TwilioRestClient client) {
        String path = "/v1/Workspaces/{WorkspaceSid}/Workflows/{WorkflowSid}/RealTimeStatistics";

        path = path.replace("{"+"WorkspaceSid"+"}", this.pathWorkspaceSid.toString());
        path = path.replace("{"+"WorkflowSid"+"}", this.pathWorkflowSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.TASKROUTER.toString(),
            path
        );
        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
        throw new ApiConnectionException("WorkflowRealTimeStatistics fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return WorkflowRealTimeStatistics.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addQueryParams(final Request request) {
        if (taskChannel != null) {
    
            request.addQueryParam("TaskChannel", taskChannel);
        }
    }
}
