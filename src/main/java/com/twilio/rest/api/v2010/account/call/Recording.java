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

package com.twilio.rest.api.v2010.account.call;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import java.util.Currency;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.converter.CurrencyDeserializer;
import com.twilio.exception.ApiConnectionException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.time.ZonedDateTime;

import java.util.Map;
import java.util.Objects;


import java.util.Map;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Recording extends Resource {
    private static final long serialVersionUID = 269042081197241L;

    public static RecordingCreator creator(final String pathCallSid){
        return new RecordingCreator(pathCallSid);
    }
    public static RecordingCreator creator(final String pathAccountSid, final String pathCallSid){
        return new RecordingCreator(pathAccountSid, pathCallSid);
    }

    public static RecordingDeleter deleter(final String pathCallSid, final String pathSid){
        return new RecordingDeleter(pathCallSid, pathSid);
    }
    public static RecordingDeleter deleter(final String pathAccountSid, final String pathCallSid, final String pathSid){
        return new RecordingDeleter(pathAccountSid, pathCallSid, pathSid);
    }

    public static RecordingFetcher fetcher(final String pathCallSid, final String pathSid){
        return new RecordingFetcher(pathCallSid, pathSid);
    }
    public static RecordingFetcher fetcher(final String pathAccountSid, final String pathCallSid, final String pathSid){
        return new RecordingFetcher(pathAccountSid, pathCallSid, pathSid);
    }

    public static RecordingReader reader(final String pathCallSid){
        return new RecordingReader(pathCallSid);
    }
    public static RecordingReader reader(final String pathAccountSid, final String pathCallSid){
        return new RecordingReader(pathAccountSid, pathCallSid);
    }

    public static RecordingUpdater updater(final String pathCallSid, final String pathSid, final Recording.Status status){
        return new RecordingUpdater(pathCallSid, pathSid, status);
    }
    public static RecordingUpdater updater(final String pathAccountSid, final String pathCallSid, final String pathSid, final Recording.Status status){
        return new RecordingUpdater(pathAccountSid, pathCallSid, pathSid, status);
    }

    /**
    * Converts a JSON String into a Recording object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Recording object represented by the provided JSON
    */
    public static Recording fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Recording.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Recording object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Recording object represented by the provided JSON
    */
    public static Recording fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Recording.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Source {
        DIALVERB("DialVerb"),
        CONFERENCE("Conference"),
        OUTBOUNDAPI("OutboundAPI"),
        TRUNKING("Trunking"),
        RECORDVERB("RecordVerb"),
        STARTCALLRECORDINGAPI("StartCallRecordingAPI"),
        STARTCONFERENCERECORDINGAPI("StartConferenceRecordingAPI");

        private final String value;

        private Source(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Source forValue(final String value) {
            return Promoter.enumFromString(value, Source.values());
        }
    }
    public enum Status {
        IN_PROGRESS("in-progress"),
        PAUSED("paused"),
        STOPPED("stopped"),
        PROCESSING("processing"),
        COMPLETED("completed"),
        ABSENT("absent");

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

    private final String accountSid;
    private final String apiVersion;
    private final String callSid;
    private final String conferenceSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final ZonedDateTime startTime;
    private final String duration;
    private final String sid;
    private final BigDecimal price;
    private final String uri;
    private final Map<String, Object> encryptionDetails;
    private final Currency priceUnit;
    private final Recording.Status status;
    private final Integer channels;
    private final Recording.Source source;
    private final Integer errorCode;
    private final String track;

    @JsonCreator
    private Recording(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("api_version")
        final String apiVersion,

        @JsonProperty("call_sid")
        final String callSid,

        @JsonProperty("conference_sid")
        final String conferenceSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("start_time")
        final String startTime,

        @JsonProperty("duration")
        final String duration,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("price")
        final BigDecimal price,

        @JsonProperty("uri")
        final String uri,

        @JsonProperty("encryption_details")
        final Map<String, Object> encryptionDetails,

        @JsonProperty("price_unit")
        @JsonDeserialize(using = com.twilio.converter.CurrencyDeserializer.class)
        final Currency priceUnit,

        @JsonProperty("status")
        final Recording.Status status,

        @JsonProperty("channels")
        final Integer channels,

        @JsonProperty("source")
        final Recording.Source source,

        @JsonProperty("error_code")
        final Integer errorCode,

        @JsonProperty("track")
        final String track
    ) {
        this.accountSid = accountSid;
        this.apiVersion = apiVersion;
        this.callSid = callSid;
        this.conferenceSid = conferenceSid;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.startTime = DateConverter.rfc2822DateTimeFromString(startTime);
        this.duration = duration;
        this.sid = sid;
        this.price = price;
        this.uri = uri;
        this.encryptionDetails = encryptionDetails;
        this.priceUnit = priceUnit;
        this.status = status;
        this.channels = channels;
        this.source = source;
        this.errorCode = errorCode;
        this.track = track;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getApiVersion() {
            return this.apiVersion;
        }
        public final String getCallSid() {
            return this.callSid;
        }
        public final String getConferenceSid() {
            return this.conferenceSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final ZonedDateTime getStartTime() {
            return this.startTime;
        }
        public final String getDuration() {
            return this.duration;
        }
        public final String getSid() {
            return this.sid;
        }
        public final BigDecimal getPrice() {
            return this.price;
        }
        public final String getUri() {
            return this.uri;
        }
        public final Map<String, Object> getEncryptionDetails() {
            return this.encryptionDetails;
        }
        public final Currency getPriceUnit() {
            return this.priceUnit;
        }
        public final Recording.Status getStatus() {
            return this.status;
        }
        public final Integer getChannels() {
            return this.channels;
        }
        public final Recording.Source getSource() {
            return this.source;
        }
        public final Integer getErrorCode() {
            return this.errorCode;
        }
        public final String getTrack() {
            return this.track;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Recording other = (Recording) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(apiVersion, other.apiVersion) &&  Objects.equals(callSid, other.callSid) &&  Objects.equals(conferenceSid, other.conferenceSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(startTime, other.startTime) &&  Objects.equals(duration, other.duration) &&  Objects.equals(sid, other.sid) &&  Objects.equals(price, other.price) &&  Objects.equals(uri, other.uri) &&  Objects.equals(encryptionDetails, other.encryptionDetails) &&  Objects.equals(priceUnit, other.priceUnit) &&  Objects.equals(status, other.status) &&  Objects.equals(channels, other.channels) &&  Objects.equals(source, other.source) &&  Objects.equals(errorCode, other.errorCode) &&  Objects.equals(track, other.track)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, apiVersion, callSid, conferenceSid, dateCreated, dateUpdated, startTime, duration, sid, price, uri, encryptionDetails, priceUnit, status, channels, source, errorCode, track);
    }

}

