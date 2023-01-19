/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.ipmessaging.v1.service;

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
public class User extends Resource {
    private static final long serialVersionUID = 136391609300437L;

    public static UserCreator creator(final String pathServiceSid, final String identity){
        return new UserCreator(pathServiceSid, identity);
    }

    public static UserDeleter deleter(final String pathServiceSid, final String pathSid){
        return new UserDeleter(pathServiceSid, pathSid);
    }

    public static UserFetcher fetcher(final String pathServiceSid, final String pathSid){
        return new UserFetcher(pathServiceSid, pathSid);
    }

    public static UserReader reader(final String pathServiceSid){
        return new UserReader(pathServiceSid);
    }

    public static UserUpdater updater(final String pathServiceSid, final String pathSid){
        return new UserUpdater(pathServiceSid, pathSid);
    }

    /**
    * Converts a JSON String into a User object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return User object represented by the provided JSON
    */
    public static User fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, User.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a User object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return User object represented by the provided JSON
    */
    public static User fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, User.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final String attributes;
    private final String friendlyName;
    private final String roleSid;
    private final String identity;
    private final Boolean isOnline;
    private final Boolean isNotifiable;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final Integer joinedChannelsCount;
    private final Map<String, String> links;
    private final URI url;

    @JsonCreator
    private User(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("attributes")
        final String attributes,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("role_sid")
        final String roleSid,

        @JsonProperty("identity")
        final String identity,

        @JsonProperty("is_online")
        final Boolean isOnline,

        @JsonProperty("is_notifiable")
        final Boolean isNotifiable,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("joined_channels_count")
        final Integer joinedChannelsCount,

        @JsonProperty("links")
        final Map<String, String> links,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.attributes = attributes;
        this.friendlyName = friendlyName;
        this.roleSid = roleSid;
        this.identity = identity;
        this.isOnline = isOnline;
        this.isNotifiable = isNotifiable;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.joinedChannelsCount = joinedChannelsCount;
        this.links = links;
        this.url = url;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final String getAttributes() {
            return this.attributes;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getRoleSid() {
            return this.roleSid;
        }
        public final String getIdentity() {
            return this.identity;
        }
        public final Boolean getIsOnline() {
            return this.isOnline;
        }
        public final Boolean getIsNotifiable() {
            return this.isNotifiable;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final Integer getJoinedChannelsCount() {
            return this.joinedChannelsCount;
        }
        public final Map<String, String> getLinks() {
            return this.links;
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

        User other = (User) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(attributes, other.attributes) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(roleSid, other.roleSid) &&  Objects.equals(identity, other.identity) &&  Objects.equals(isOnline, other.isOnline) &&  Objects.equals(isNotifiable, other.isNotifiable) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(joinedChannelsCount, other.joinedChannelsCount) &&  Objects.equals(links, other.links) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, serviceSid, attributes, friendlyName, roleSid, identity, isOnline, isNotifiable, dateCreated, dateUpdated, joinedChannelsCount, links, url);
    }

}

