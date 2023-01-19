/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Supersim
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.supersim.v1.sim;

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
import java.time.ZonedDateTime;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class BillingPeriod extends Resource {
    private static final long serialVersionUID = 154829037650501L;

    public static BillingPeriodReader reader(final String pathSimSid){
        return new BillingPeriodReader(pathSimSid);
    }

    /**
    * Converts a JSON String into a BillingPeriod object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return BillingPeriod object represented by the provided JSON
    */
    public static BillingPeriod fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BillingPeriod.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a BillingPeriod object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return BillingPeriod object represented by the provided JSON
    */
    public static BillingPeriod fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BillingPeriod.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum BpType {
        READY("ready"),
        ACTIVE("active");

        private final String value;

        private BpType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static BpType forValue(final String value) {
            return Promoter.enumFromString(value, BpType.values());
        }
    }

    private final String sid;
    private final String accountSid;
    private final String simSid;
    private final ZonedDateTime startTime;
    private final ZonedDateTime endTime;
    private final BillingPeriod.BpType periodType;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;

    @JsonCreator
    private BillingPeriod(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("sim_sid")
        final String simSid,

        @JsonProperty("start_time")
        final String startTime,

        @JsonProperty("end_time")
        final String endTime,

        @JsonProperty("period_type")
        final BillingPeriod.BpType periodType,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.simSid = simSid;
        this.startTime = DateConverter.iso8601DateTimeFromString(startTime);
        this.endTime = DateConverter.iso8601DateTimeFromString(endTime);
        this.periodType = periodType;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getSimSid() {
            return this.simSid;
        }
        public final ZonedDateTime getStartTime() {
            return this.startTime;
        }
        public final ZonedDateTime getEndTime() {
            return this.endTime;
        }
        public final BillingPeriod.BpType getPeriodType() {
            return this.periodType;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BillingPeriod other = (BillingPeriod) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(simSid, other.simSid) &&  Objects.equals(startTime, other.startTime) &&  Objects.equals(endTime, other.endTime) &&  Objects.equals(periodType, other.periodType) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, simSid, startTime, endTime, periodType, dateCreated, dateUpdated);
    }

}

