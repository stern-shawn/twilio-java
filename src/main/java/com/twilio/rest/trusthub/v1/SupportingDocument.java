/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Trusthub
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.trusthub.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
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
public class SupportingDocument extends Resource {
    private static final long serialVersionUID = 13014832865593L;

    public static SupportingDocumentCreator creator(final String friendlyName, final String type){
        return new SupportingDocumentCreator(friendlyName, type);
    }

    public static SupportingDocumentDeleter deleter(final String pathSid){
        return new SupportingDocumentDeleter(pathSid);
    }

    public static SupportingDocumentFetcher fetcher(final String pathSid){
        return new SupportingDocumentFetcher(pathSid);
    }

    public static SupportingDocumentReader reader(){
        return new SupportingDocumentReader();
    }

    public static SupportingDocumentUpdater updater(final String pathSid){
        return new SupportingDocumentUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a SupportingDocument object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SupportingDocument object represented by the provided JSON
    */
    public static SupportingDocument fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SupportingDocument.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SupportingDocument object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SupportingDocument object represented by the provided JSON
    */
    public static SupportingDocument fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SupportingDocument.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Status {
        DRAFT("draft"),
        PENDING_REVIEW("pending-review"),
        REJECTED("rejected"),
        APPROVED("approved"),
        EXPIRED("expired"),
        PROVISIONALLY_APPROVED("provisionally-approved");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final String mimeType;
    private final SupportingDocument.Status status;
    private final String type;
    private final Map<String, Object> attributes;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private SupportingDocument(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("mime_type")
        final String mimeType,

        @JsonProperty("status")
        final SupportingDocument.Status status,

        @JsonProperty("type")
        final String type,

        @JsonProperty("attributes")
        final Map<String, Object> attributes,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.mimeType = mimeType;
        this.status = status;
        this.type = type;
        this.attributes = attributes;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getMimeType() {
            return this.mimeType;
        }
        public final SupportingDocument.Status getStatus() {
            return this.status;
        }
        public final String getType() {
            return this.type;
        }
        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final URI getUrl() {
            return this.url;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SupportingDocument other = (SupportingDocument) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(mimeType, other.mimeType) &&  Objects.equals(status, other.status) &&  Objects.equals(type, other.type) &&  Objects.equals(attributes, other.attributes) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, friendlyName, mimeType, status, type, attributes, dateCreated, dateUpdated, url);
    }

}

