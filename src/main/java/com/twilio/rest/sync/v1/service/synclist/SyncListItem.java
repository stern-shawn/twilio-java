/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Sync
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.sync.v1.service.synclist;

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
public class SyncListItem extends Resource {
    private static final long serialVersionUID = 92711713432732L;

    public static SyncListItemCreator creator(final String pathServiceSid, final String pathListSid, final Map<String, Object> data){
        return new SyncListItemCreator(pathServiceSid, pathListSid, data);
    }

    public static SyncListItemDeleter deleter(final String pathServiceSid, final String pathListSid, final Integer pathIndex){
        return new SyncListItemDeleter(pathServiceSid, pathListSid, pathIndex);
    }

    public static SyncListItemFetcher fetcher(final String pathServiceSid, final String pathListSid, final Integer pathIndex){
        return new SyncListItemFetcher(pathServiceSid, pathListSid, pathIndex);
    }

    public static SyncListItemReader reader(final String pathServiceSid, final String pathListSid){
        return new SyncListItemReader(pathServiceSid, pathListSid);
    }

    public static SyncListItemUpdater updater(final String pathServiceSid, final String pathListSid, final Integer pathIndex){
        return new SyncListItemUpdater(pathServiceSid, pathListSid, pathIndex);
    }

    /**
    * Converts a JSON String into a SyncListItem object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SyncListItem object represented by the provided JSON
    */
    public static SyncListItem fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncListItem.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SyncListItem object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SyncListItem object represented by the provided JSON
    */
    public static SyncListItem fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncListItem.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum QueryFromBoundType {
        INCLUSIVE("inclusive"),
        EXCLUSIVE("exclusive");

        private final String value;

        private QueryFromBoundType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static QueryFromBoundType forValue(final String value) {
            return Promoter.enumFromString(value, QueryFromBoundType.values());
        }
    }
    public enum QueryResultOrder {
        ASC("asc"),
        DESC("desc");

        private final String value;

        private QueryResultOrder(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static QueryResultOrder forValue(final String value) {
            return Promoter.enumFromString(value, QueryResultOrder.values());
        }
    }

    private final Integer index;
    private final String accountSid;
    private final String serviceSid;
    private final String listSid;
    private final URI url;
    private final String revision;
    private final Map<String, Object> data;
    private final ZonedDateTime dateExpires;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String createdBy;

    @JsonCreator
    private SyncListItem(
        @JsonProperty("index")
        final Integer index,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("list_sid")
        final String listSid,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("revision")
        final String revision,

        @JsonProperty("data")
        final Map<String, Object> data,

        @JsonProperty("date_expires")
        final String dateExpires,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("created_by")
        final String createdBy
    ) {
        this.index = index;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.listSid = listSid;
        this.url = url;
        this.revision = revision;
        this.data = data;
        this.dateExpires = DateConverter.iso8601DateTimeFromString(dateExpires);
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.createdBy = createdBy;
    }

        public final Integer getIndex() {
            return this.index;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final String getListSid() {
            return this.listSid;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final String getRevision() {
            return this.revision;
        }
        public final Map<String, Object> getData() {
            return this.data;
        }
        public final ZonedDateTime getDateExpires() {
            return this.dateExpires;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getCreatedBy() {
            return this.createdBy;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SyncListItem other = (SyncListItem) o;

        return Objects.equals(index, other.index) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(listSid, other.listSid) &&  Objects.equals(url, other.url) &&  Objects.equals(revision, other.revision) &&  Objects.equals(data, other.data) &&  Objects.equals(dateExpires, other.dateExpires) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(createdBy, other.createdBy)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, accountSid, serviceSid, listSid, url, revision, data, dateExpires, dateCreated, dateUpdated, createdBy);
    }

}

