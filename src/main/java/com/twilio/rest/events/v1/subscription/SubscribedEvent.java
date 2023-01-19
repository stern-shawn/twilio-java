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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class SubscribedEvent extends Resource {
    private static final long serialVersionUID = 216550539675838L;

    public static SubscribedEventCreator creator(final String pathSubscriptionSid, final String type){
        return new SubscribedEventCreator(pathSubscriptionSid, type);
    }

    public static SubscribedEventDeleter deleter(final String pathSubscriptionSid, final String pathType){
        return new SubscribedEventDeleter(pathSubscriptionSid, pathType);
    }

    public static SubscribedEventFetcher fetcher(final String pathSubscriptionSid, final String pathType){
        return new SubscribedEventFetcher(pathSubscriptionSid, pathType);
    }

    public static SubscribedEventReader reader(final String pathSubscriptionSid){
        return new SubscribedEventReader(pathSubscriptionSid);
    }

    public static SubscribedEventUpdater updater(final String pathSubscriptionSid, final String pathType){
        return new SubscribedEventUpdater(pathSubscriptionSid, pathType);
    }

    /**
    * Converts a JSON String into a SubscribedEvent object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SubscribedEvent object represented by the provided JSON
    */
    public static SubscribedEvent fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SubscribedEvent.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SubscribedEvent object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SubscribedEvent object represented by the provided JSON
    */
    public static SubscribedEvent fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SubscribedEvent.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String type;
    private final Integer schemaVersion;
    private final String subscriptionSid;
    private final URI url;

    @JsonCreator
    private SubscribedEvent(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("type")
        final String type,

        @JsonProperty("schema_version")
        final Integer schemaVersion,

        @JsonProperty("subscription_sid")
        final String subscriptionSid,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.type = type;
        this.schemaVersion = schemaVersion;
        this.subscriptionSid = subscriptionSid;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getType() {
            return this.type;
        }
        public final Integer getSchemaVersion() {
            return this.schemaVersion;
        }
        public final String getSubscriptionSid() {
            return this.subscriptionSid;
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

        SubscribedEvent other = (SubscribedEvent) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(type, other.type) &&  Objects.equals(schemaVersion, other.schemaVersion) &&  Objects.equals(subscriptionSid, other.subscriptionSid) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, type, schemaVersion, subscriptionSid, url);
    }

}

