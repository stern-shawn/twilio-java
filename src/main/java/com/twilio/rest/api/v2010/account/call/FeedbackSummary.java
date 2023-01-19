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
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.time.ZonedDateTime;

import java.util.List;
import java.util.Map;
import java.util.Objects;


import java.util.Map;
import java.time.LocalDate;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class FeedbackSummary extends Resource {
    private static final long serialVersionUID = 230453795109955L;

    public static FeedbackSummaryCreator creator(final LocalDate startDate, final LocalDate endDate){
        return new FeedbackSummaryCreator(startDate, endDate);
    }
    public static FeedbackSummaryCreator creator(final String pathAccountSid, final LocalDate startDate, final LocalDate endDate){
        return new FeedbackSummaryCreator(pathAccountSid, startDate, endDate);
    }

    public static FeedbackSummaryDeleter deleter(final String pathSid){
        return new FeedbackSummaryDeleter(pathSid);
    }
    public static FeedbackSummaryDeleter deleter(final String pathAccountSid, final String pathSid){
        return new FeedbackSummaryDeleter(pathAccountSid, pathSid);
    }

    public static FeedbackSummaryFetcher fetcher(final String pathSid){
        return new FeedbackSummaryFetcher(pathSid);
    }
    public static FeedbackSummaryFetcher fetcher(final String pathAccountSid, final String pathSid){
        return new FeedbackSummaryFetcher(pathAccountSid, pathSid);
    }

    /**
    * Converts a JSON String into a FeedbackSummary object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return FeedbackSummary object represented by the provided JSON
    */
    public static FeedbackSummary fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FeedbackSummary.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a FeedbackSummary object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return FeedbackSummary object represented by the provided JSON
    */
    public static FeedbackSummary fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FeedbackSummary.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Status {
        QUEUED("queued"),
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
    private final Integer callCount;
    private final Integer callFeedbackCount;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final LocalDate endDate;
    private final Boolean includeSubaccounts;
    private final List<Map<String, Object>> issues;
    private final BigDecimal qualityScoreAverage;
    private final BigDecimal qualityScoreMedian;
    private final BigDecimal qualityScoreStandardDeviation;
    private final String sid;
    private final LocalDate startDate;
    private final FeedbackSummary.Status status;

    @JsonCreator
    private FeedbackSummary(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("call_count")
        final Integer callCount,

        @JsonProperty("call_feedback_count")
        final Integer callFeedbackCount,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("end_date")
        final String endDate,

        @JsonProperty("include_subaccounts")
        final Boolean includeSubaccounts,

        @JsonProperty("issues")
        final List<Map<String, Object>> issues,

        @JsonProperty("quality_score_average")
        final BigDecimal qualityScoreAverage,

        @JsonProperty("quality_score_median")
        final BigDecimal qualityScoreMedian,

        @JsonProperty("quality_score_standard_deviation")
        final BigDecimal qualityScoreStandardDeviation,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("start_date")
        final String startDate,

        @JsonProperty("status")
        final FeedbackSummary.Status status
    ) {
        this.accountSid = accountSid;
        this.callCount = callCount;
        this.callFeedbackCount = callFeedbackCount;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.endDate = DateConverter.localDateFromString(endDate);
        this.includeSubaccounts = includeSubaccounts;
        this.issues = issues;
        this.qualityScoreAverage = qualityScoreAverage;
        this.qualityScoreMedian = qualityScoreMedian;
        this.qualityScoreStandardDeviation = qualityScoreStandardDeviation;
        this.sid = sid;
        this.startDate = DateConverter.localDateFromString(startDate);
        this.status = status;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final Integer getCallCount() {
            return this.callCount;
        }
        public final Integer getCallFeedbackCount() {
            return this.callFeedbackCount;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final LocalDate getEndDate() {
            return this.endDate;
        }
        public final Boolean getIncludeSubaccounts() {
            return this.includeSubaccounts;
        }
        public final List<Map<String, Object>> getIssues() {
            return this.issues;
        }
        public final BigDecimal getQualityScoreAverage() {
            return this.qualityScoreAverage;
        }
        public final BigDecimal getQualityScoreMedian() {
            return this.qualityScoreMedian;
        }
        public final BigDecimal getQualityScoreStandardDeviation() {
            return this.qualityScoreStandardDeviation;
        }
        public final String getSid() {
            return this.sid;
        }
        public final LocalDate getStartDate() {
            return this.startDate;
        }
        public final FeedbackSummary.Status getStatus() {
            return this.status;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FeedbackSummary other = (FeedbackSummary) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(callCount, other.callCount) &&  Objects.equals(callFeedbackCount, other.callFeedbackCount) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(endDate, other.endDate) &&  Objects.equals(includeSubaccounts, other.includeSubaccounts) &&  Objects.equals(issues, other.issues) &&  Objects.equals(qualityScoreAverage, other.qualityScoreAverage) &&  Objects.equals(qualityScoreMedian, other.qualityScoreMedian) &&  Objects.equals(qualityScoreStandardDeviation, other.qualityScoreStandardDeviation) &&  Objects.equals(sid, other.sid) &&  Objects.equals(startDate, other.startDate) &&  Objects.equals(status, other.status)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, callCount, callFeedbackCount, dateCreated, dateUpdated, endDate, includeSubaccounts, issues, qualityScoreAverage, qualityScoreMedian, qualityScoreStandardDeviation, sid, startDate, status);
    }

}

