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

package com.twilio.rest.preview.deployedDevices;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Fleet extends Resource {
    private static final long serialVersionUID = 162068485825595L;

    public static FleetCreator creator(){
        return new FleetCreator();
    }

    public static FleetDeleter deleter(final String pathSid){
        return new FleetDeleter(pathSid);
    }

    public static FleetFetcher fetcher(final String pathSid){
        return new FleetFetcher(pathSid);
    }

    public static FleetReader reader(){
        return new FleetReader();
    }

    public static FleetUpdater updater(final String pathSid){
        return new FleetUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a Fleet object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Fleet object represented by the provided JSON
    */
    public static Fleet fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Fleet.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Fleet object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Fleet object represented by the provided JSON
    */
    public static Fleet fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Fleet.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final URI url;
    private final String uniqueName;
    private final String friendlyName;
    private final String accountSid;
    private final String defaultDeploymentSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final Map<String, String> links;

    @JsonCreator
    private Fleet(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("default_deployment_sid")
        final String defaultDeploymentSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.sid = sid;
        this.url = url;
        this.uniqueName = uniqueName;
        this.friendlyName = friendlyName;
        this.accountSid = accountSid;
        this.defaultDeploymentSid = defaultDeploymentSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.links = links;
    }

        public final String getSid() {
            return this.sid;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getDefaultDeploymentSid() {
            return this.defaultDeploymentSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Fleet other = (Fleet) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(url, other.url) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(defaultDeploymentSid, other.defaultDeploymentSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, url, uniqueName, friendlyName, accountSid, defaultDeploymentSid, dateCreated, dateUpdated, links);
    }

}

