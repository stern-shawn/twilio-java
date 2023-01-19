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

package com.twilio.rest.supersim.v1;

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

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class IpCommand extends Resource {
    private static final long serialVersionUID = 232445526954174L;

    public static IpCommandCreator creator(final String sim, final String payload, final Integer devicePort){
        return new IpCommandCreator(sim, payload, devicePort);
    }

    public static IpCommandFetcher fetcher(final String pathSid){
        return new IpCommandFetcher(pathSid);
    }

    public static IpCommandReader reader(){
        return new IpCommandReader();
    }

    /**
    * Converts a JSON String into a IpCommand object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return IpCommand object represented by the provided JSON
    */
    public static IpCommand fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, IpCommand.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a IpCommand object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return IpCommand object represented by the provided JSON
    */
    public static IpCommand fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, IpCommand.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Direction {
        TO_SIM("to_sim"),
        FROM_SIM("from_sim");

        private final String value;

        private Direction(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Direction forValue(final String value) {
            return Promoter.enumFromString(value, Direction.values());
        }
    }
    public enum PayloadType {
        TEXT("text"),
        BINARY("binary");

        private final String value;

        private PayloadType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static PayloadType forValue(final String value) {
            return Promoter.enumFromString(value, PayloadType.values());
        }
    }
    public enum Status {
        QUEUED("queued"),
        SENT("sent"),
        RECEIVED("received"),
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

    private final String sid;
    private final String accountSid;
    private final String simSid;
    private final String simIccid;
    private final IpCommand.Status status;
    private final IpCommand.Direction direction;
    private final String deviceIp;
    private final Integer devicePort;
    private final IpCommand.PayloadType payloadType;
    private final String payload;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private IpCommand(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("sim_sid")
        final String simSid,

        @JsonProperty("sim_iccid")
        final String simIccid,

        @JsonProperty("status")
        final IpCommand.Status status,

        @JsonProperty("direction")
        final IpCommand.Direction direction,

        @JsonProperty("device_ip")
        final String deviceIp,

        @JsonProperty("device_port")
        final Integer devicePort,

        @JsonProperty("payload_type")
        final IpCommand.PayloadType payloadType,

        @JsonProperty("payload")
        final String payload,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.simSid = simSid;
        this.simIccid = simIccid;
        this.status = status;
        this.direction = direction;
        this.deviceIp = deviceIp;
        this.devicePort = devicePort;
        this.payloadType = payloadType;
        this.payload = payload;
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
        public final String getSimSid() {
            return this.simSid;
        }
        public final String getSimIccid() {
            return this.simIccid;
        }
        public final IpCommand.Status getStatus() {
            return this.status;
        }
        public final IpCommand.Direction getDirection() {
            return this.direction;
        }
        public final String getDeviceIp() {
            return this.deviceIp;
        }
        public final Integer getDevicePort() {
            return this.devicePort;
        }
        public final IpCommand.PayloadType getPayloadType() {
            return this.payloadType;
        }
        public final String getPayload() {
            return this.payload;
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

        IpCommand other = (IpCommand) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(simSid, other.simSid) &&  Objects.equals(simIccid, other.simIccid) &&  Objects.equals(status, other.status) &&  Objects.equals(direction, other.direction) &&  Objects.equals(deviceIp, other.deviceIp) &&  Objects.equals(devicePort, other.devicePort) &&  Objects.equals(payloadType, other.payloadType) &&  Objects.equals(payload, other.payload) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, simSid, simIccid, status, direction, deviceIp, devicePort, payloadType, payload, dateCreated, dateUpdated, url);
    }

}

