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

package com.twilio.rest.api.v2010.account.recording;

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

import java.util.Objects;


import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Transcription extends Resource {
    private static final long serialVersionUID = 169453036448500L;

    public static TranscriptionDeleter deleter(final String pathRecordingSid, final String pathSid){
        return new TranscriptionDeleter(pathRecordingSid, pathSid);
    }
    public static TranscriptionDeleter deleter(final String pathAccountSid, final String pathRecordingSid, final String pathSid){
        return new TranscriptionDeleter(pathAccountSid, pathRecordingSid, pathSid);
    }

    public static TranscriptionFetcher fetcher(final String pathRecordingSid, final String pathSid){
        return new TranscriptionFetcher(pathRecordingSid, pathSid);
    }
    public static TranscriptionFetcher fetcher(final String pathAccountSid, final String pathRecordingSid, final String pathSid){
        return new TranscriptionFetcher(pathAccountSid, pathRecordingSid, pathSid);
    }

    public static TranscriptionReader reader(final String pathRecordingSid){
        return new TranscriptionReader(pathRecordingSid);
    }
    public static TranscriptionReader reader(final String pathAccountSid, final String pathRecordingSid){
        return new TranscriptionReader(pathAccountSid, pathRecordingSid);
    }

    /**
    * Converts a JSON String into a Transcription object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Transcription object represented by the provided JSON
    */
    public static Transcription fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Transcription.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Transcription object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Transcription object represented by the provided JSON
    */
    public static Transcription fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Transcription.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Status {
        IN_PROGRESS("in-progress"),
        COMPLETED("completed"),
        FAILED("failed");

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
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String duration;
    private final BigDecimal price;
    private final Currency priceUnit;
    private final String recordingSid;
    private final String sid;
    private final Transcription.Status status;
    private final String transcriptionText;
    private final String type;
    private final String uri;

    @JsonCreator
    private Transcription(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("api_version")
        final String apiVersion,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("duration")
        final String duration,

        @JsonProperty("price")
        final BigDecimal price,

        @JsonProperty("price_unit")
        @JsonDeserialize(using = com.twilio.converter.CurrencyDeserializer.class)
        final Currency priceUnit,

        @JsonProperty("recording_sid")
        final String recordingSid,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("status")
        final Transcription.Status status,

        @JsonProperty("transcription_text")
        final String transcriptionText,

        @JsonProperty("type")
        final String type,

        @JsonProperty("uri")
        final String uri
    ) {
        this.accountSid = accountSid;
        this.apiVersion = apiVersion;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.duration = duration;
        this.price = price;
        this.priceUnit = priceUnit;
        this.recordingSid = recordingSid;
        this.sid = sid;
        this.status = status;
        this.transcriptionText = transcriptionText;
        this.type = type;
        this.uri = uri;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getApiVersion() {
            return this.apiVersion;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getDuration() {
            return this.duration;
        }
        public final BigDecimal getPrice() {
            return this.price;
        }
        public final Currency getPriceUnit() {
            return this.priceUnit;
        }
        public final String getRecordingSid() {
            return this.recordingSid;
        }
        public final String getSid() {
            return this.sid;
        }
        public final Transcription.Status getStatus() {
            return this.status;
        }
        public final String getTranscriptionText() {
            return this.transcriptionText;
        }
        public final String getType() {
            return this.type;
        }
        public final String getUri() {
            return this.uri;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Transcription other = (Transcription) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(apiVersion, other.apiVersion) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(duration, other.duration) &&  Objects.equals(price, other.price) &&  Objects.equals(priceUnit, other.priceUnit) &&  Objects.equals(recordingSid, other.recordingSid) &&  Objects.equals(sid, other.sid) &&  Objects.equals(status, other.status) &&  Objects.equals(transcriptionText, other.transcriptionText) &&  Objects.equals(type, other.type) &&  Objects.equals(uri, other.uri)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, apiVersion, dateCreated, dateUpdated, duration, price, priceUnit, recordingSid, sid, status, transcriptionText, type, uri);
    }

}

