/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Wireless
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.wireless.v1;

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

import java.util.List;
import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class RatePlan extends Resource {
    private static final long serialVersionUID = 28369111129985L;

    public static RatePlanCreator creator(){
        return new RatePlanCreator();
    }

    public static RatePlanDeleter deleter(final String pathSid){
        return new RatePlanDeleter(pathSid);
    }

    public static RatePlanFetcher fetcher(final String pathSid){
        return new RatePlanFetcher(pathSid);
    }

    public static RatePlanReader reader(){
        return new RatePlanReader();
    }

    public static RatePlanUpdater updater(final String pathSid){
        return new RatePlanUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a RatePlan object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return RatePlan object represented by the provided JSON
    */
    public static RatePlan fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RatePlan.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a RatePlan object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return RatePlan object represented by the provided JSON
    */
    public static RatePlan fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RatePlan.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String uniqueName;
    private final String accountSid;
    private final String friendlyName;
    private final Boolean dataEnabled;
    private final String dataMetering;
    private final Integer dataLimit;
    private final Boolean messagingEnabled;
    private final Boolean voiceEnabled;
    private final Boolean nationalRoamingEnabled;
    private final Integer nationalRoamingDataLimit;
    private final List<String> internationalRoaming;
    private final Integer internationalRoamingDataLimit;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private RatePlan(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("data_enabled")
        final Boolean dataEnabled,

        @JsonProperty("data_metering")
        final String dataMetering,

        @JsonProperty("data_limit")
        final Integer dataLimit,

        @JsonProperty("messaging_enabled")
        final Boolean messagingEnabled,

        @JsonProperty("voice_enabled")
        final Boolean voiceEnabled,

        @JsonProperty("national_roaming_enabled")
        final Boolean nationalRoamingEnabled,

        @JsonProperty("national_roaming_data_limit")
        final Integer nationalRoamingDataLimit,

        @JsonProperty("international_roaming")
        final List<String> internationalRoaming,

        @JsonProperty("international_roaming_data_limit")
        final Integer internationalRoamingDataLimit,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.dataEnabled = dataEnabled;
        this.dataMetering = dataMetering;
        this.dataLimit = dataLimit;
        this.messagingEnabled = messagingEnabled;
        this.voiceEnabled = voiceEnabled;
        this.nationalRoamingEnabled = nationalRoamingEnabled;
        this.nationalRoamingDataLimit = nationalRoamingDataLimit;
        this.internationalRoaming = internationalRoaming;
        this.internationalRoamingDataLimit = internationalRoamingDataLimit;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final Boolean getDataEnabled() {
            return this.dataEnabled;
        }
        public final String getDataMetering() {
            return this.dataMetering;
        }
        public final Integer getDataLimit() {
            return this.dataLimit;
        }
        public final Boolean getMessagingEnabled() {
            return this.messagingEnabled;
        }
        public final Boolean getVoiceEnabled() {
            return this.voiceEnabled;
        }
        public final Boolean getNationalRoamingEnabled() {
            return this.nationalRoamingEnabled;
        }
        public final Integer getNationalRoamingDataLimit() {
            return this.nationalRoamingDataLimit;
        }
        public final List<String> getInternationalRoaming() {
            return this.internationalRoaming;
        }
        public final Integer getInternationalRoamingDataLimit() {
            return this.internationalRoamingDataLimit;
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

        RatePlan other = (RatePlan) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(dataEnabled, other.dataEnabled) &&  Objects.equals(dataMetering, other.dataMetering) &&  Objects.equals(dataLimit, other.dataLimit) &&  Objects.equals(messagingEnabled, other.messagingEnabled) &&  Objects.equals(voiceEnabled, other.voiceEnabled) &&  Objects.equals(nationalRoamingEnabled, other.nationalRoamingEnabled) &&  Objects.equals(nationalRoamingDataLimit, other.nationalRoamingDataLimit) &&  Objects.equals(internationalRoaming, other.internationalRoaming) &&  Objects.equals(internationalRoamingDataLimit, other.internationalRoamingDataLimit) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, uniqueName, accountSid, friendlyName, dataEnabled, dataMetering, dataLimit, messagingEnabled, voiceEnabled, nationalRoamingEnabled, nationalRoamingDataLimit, internationalRoaming, internationalRoamingDataLimit, dateCreated, dateUpdated, url);
    }

}

