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

package com.twilio.rest.api.v2010.account;

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
import com.twilio.http.HttpMethod;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Application extends Resource {
    private static final long serialVersionUID = 64877918712545L;

    public static ApplicationCreator creator(){
        return new ApplicationCreator();
    }
    public static ApplicationCreator creator(final String pathAccountSid){
        return new ApplicationCreator(pathAccountSid);
    }

    public static ApplicationDeleter deleter(final String pathSid){
        return new ApplicationDeleter(pathSid);
    }
    public static ApplicationDeleter deleter(final String pathAccountSid, final String pathSid){
        return new ApplicationDeleter(pathAccountSid, pathSid);
    }

    public static ApplicationFetcher fetcher(final String pathSid){
        return new ApplicationFetcher(pathSid);
    }
    public static ApplicationFetcher fetcher(final String pathAccountSid, final String pathSid){
        return new ApplicationFetcher(pathAccountSid, pathSid);
    }

    public static ApplicationReader reader(){
        return new ApplicationReader();
    }
    public static ApplicationReader reader(final String pathAccountSid){
        return new ApplicationReader(pathAccountSid);
    }

    public static ApplicationUpdater updater(final String pathSid){
        return new ApplicationUpdater(pathSid);
    }
    public static ApplicationUpdater updater(final String pathAccountSid, final String pathSid){
        return new ApplicationUpdater(pathAccountSid, pathSid);
    }

    /**
    * Converts a JSON String into a Application object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Application object represented by the provided JSON
    */
    public static Application fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Application.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Application object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Application object represented by the provided JSON
    */
    public static Application fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Application.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String apiVersion;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String friendlyName;
    private final URI messageStatusCallback;
    private final String sid;
    private final HttpMethod smsFallbackMethod;
    private final URI smsFallbackUrl;
    private final HttpMethod smsMethod;
    private final URI smsStatusCallback;
    private final URI smsUrl;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final String uri;
    private final Boolean voiceCallerIdLookup;
    private final HttpMethod voiceFallbackMethod;
    private final URI voiceFallbackUrl;
    private final HttpMethod voiceMethod;
    private final URI voiceUrl;

    @JsonCreator
    private Application(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("api_version")
        final String apiVersion,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("message_status_callback")
        final URI messageStatusCallback,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("sms_fallback_method")
        final HttpMethod smsFallbackMethod,

        @JsonProperty("sms_fallback_url")
        final URI smsFallbackUrl,

        @JsonProperty("sms_method")
        final HttpMethod smsMethod,

        @JsonProperty("sms_status_callback")
        final URI smsStatusCallback,

        @JsonProperty("sms_url")
        final URI smsUrl,

        @JsonProperty("status_callback")
        final URI statusCallback,

        @JsonProperty("status_callback_method")
        final HttpMethod statusCallbackMethod,

        @JsonProperty("uri")
        final String uri,

        @JsonProperty("voice_caller_id_lookup")
        final Boolean voiceCallerIdLookup,

        @JsonProperty("voice_fallback_method")
        final HttpMethod voiceFallbackMethod,

        @JsonProperty("voice_fallback_url")
        final URI voiceFallbackUrl,

        @JsonProperty("voice_method")
        final HttpMethod voiceMethod,

        @JsonProperty("voice_url")
        final URI voiceUrl
    ) {
        this.accountSid = accountSid;
        this.apiVersion = apiVersion;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.messageStatusCallback = messageStatusCallback;
        this.sid = sid;
        this.smsFallbackMethod = smsFallbackMethod;
        this.smsFallbackUrl = smsFallbackUrl;
        this.smsMethod = smsMethod;
        this.smsStatusCallback = smsStatusCallback;
        this.smsUrl = smsUrl;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.uri = uri;
        this.voiceCallerIdLookup = voiceCallerIdLookup;
        this.voiceFallbackMethod = voiceFallbackMethod;
        this.voiceFallbackUrl = voiceFallbackUrl;
        this.voiceMethod = voiceMethod;
        this.voiceUrl = voiceUrl;
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
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final URI getMessageStatusCallback() {
            return this.messageStatusCallback;
        }
        public final String getSid() {
            return this.sid;
        }
        public final HttpMethod getSmsFallbackMethod() {
            return this.smsFallbackMethod;
        }
        public final URI getSmsFallbackUrl() {
            return this.smsFallbackUrl;
        }
        public final HttpMethod getSmsMethod() {
            return this.smsMethod;
        }
        public final URI getSmsStatusCallback() {
            return this.smsStatusCallback;
        }
        public final URI getSmsUrl() {
            return this.smsUrl;
        }
        public final URI getStatusCallback() {
            return this.statusCallback;
        }
        public final HttpMethod getStatusCallbackMethod() {
            return this.statusCallbackMethod;
        }
        public final String getUri() {
            return this.uri;
        }
        public final Boolean getVoiceCallerIdLookup() {
            return this.voiceCallerIdLookup;
        }
        public final HttpMethod getVoiceFallbackMethod() {
            return this.voiceFallbackMethod;
        }
        public final URI getVoiceFallbackUrl() {
            return this.voiceFallbackUrl;
        }
        public final HttpMethod getVoiceMethod() {
            return this.voiceMethod;
        }
        public final URI getVoiceUrl() {
            return this.voiceUrl;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Application other = (Application) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(apiVersion, other.apiVersion) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(messageStatusCallback, other.messageStatusCallback) &&  Objects.equals(sid, other.sid) &&  Objects.equals(smsFallbackMethod, other.smsFallbackMethod) &&  Objects.equals(smsFallbackUrl, other.smsFallbackUrl) &&  Objects.equals(smsMethod, other.smsMethod) &&  Objects.equals(smsStatusCallback, other.smsStatusCallback) &&  Objects.equals(smsUrl, other.smsUrl) &&  Objects.equals(statusCallback, other.statusCallback) &&  Objects.equals(statusCallbackMethod, other.statusCallbackMethod) &&  Objects.equals(uri, other.uri) &&  Objects.equals(voiceCallerIdLookup, other.voiceCallerIdLookup) &&  Objects.equals(voiceFallbackMethod, other.voiceFallbackMethod) &&  Objects.equals(voiceFallbackUrl, other.voiceFallbackUrl) &&  Objects.equals(voiceMethod, other.voiceMethod) &&  Objects.equals(voiceUrl, other.voiceUrl)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, apiVersion, dateCreated, dateUpdated, friendlyName, messageStatusCallback, sid, smsFallbackMethod, smsFallbackUrl, smsMethod, smsStatusCallback, smsUrl, statusCallback, statusCallbackMethod, uri, voiceCallerIdLookup, voiceFallbackMethod, voiceFallbackUrl, voiceMethod, voiceUrl);
    }

}

