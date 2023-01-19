/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Voice
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.voice.v1;

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

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class SourceIpMapping extends Resource {
    private static final long serialVersionUID = 45000058150157L;

    public static SourceIpMappingCreator creator(final String ipRecordSid, final String sipDomainSid){
        return new SourceIpMappingCreator(ipRecordSid, sipDomainSid);
    }

    public static SourceIpMappingDeleter deleter(final String pathSid){
        return new SourceIpMappingDeleter(pathSid);
    }

    public static SourceIpMappingFetcher fetcher(final String pathSid){
        return new SourceIpMappingFetcher(pathSid);
    }

    public static SourceIpMappingReader reader(){
        return new SourceIpMappingReader();
    }

    public static SourceIpMappingUpdater updater(final String pathSid, final String sipDomainSid){
        return new SourceIpMappingUpdater(pathSid, sipDomainSid);
    }

    /**
    * Converts a JSON String into a SourceIpMapping object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SourceIpMapping object represented by the provided JSON
    */
    public static SourceIpMapping fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SourceIpMapping.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SourceIpMapping object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SourceIpMapping object represented by the provided JSON
    */
    public static SourceIpMapping fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SourceIpMapping.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String ipRecordSid;
    private final String sipDomainSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private SourceIpMapping(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("ip_record_sid")
        final String ipRecordSid,

        @JsonProperty("sip_domain_sid")
        final String sipDomainSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.ipRecordSid = ipRecordSid;
        this.sipDomainSid = sipDomainSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getIpRecordSid() {
            return this.ipRecordSid;
        }
        public final String getSipDomainSid() {
            return this.sipDomainSid;
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

        SourceIpMapping other = (SourceIpMapping) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(ipRecordSid, other.ipRecordSid) &&  Objects.equals(sipDomainSid, other.sipDomainSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, ipRecordSid, sipDomainSid, dateCreated, dateUpdated, url);
    }

}

