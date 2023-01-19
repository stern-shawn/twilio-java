/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Bulkexports
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 * A new change to demo!!
 */

package com.twilio.rest.bulkexports.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ExportConfiguration extends Resource {
    private static final long serialVersionUID = 268277535772365L;

    public static ExportConfigurationFetcher fetcher(final String pathResourceType){
        return new ExportConfigurationFetcher(pathResourceType);
    }

    public static ExportConfigurationUpdater updater(final String pathResourceType){
        return new ExportConfigurationUpdater(pathResourceType);
    }

    /**
    * Converts a JSON String into a ExportConfiguration object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return ExportConfiguration object represented by the provided JSON
    */
    public static ExportConfiguration fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ExportConfiguration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a ExportConfiguration object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return ExportConfiguration object represented by the provided JSON
    */
    public static ExportConfiguration fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ExportConfiguration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final Boolean enabled;
    private final URI webhookUrl;
    private final String webhookMethod;
    private final String resourceType;
    private final URI url;

    @JsonCreator
    private ExportConfiguration(
        @JsonProperty("enabled")
        final Boolean enabled,

        @JsonProperty("webhook_url")
        final URI webhookUrl,

        @JsonProperty("webhook_method")
        final String webhookMethod,

        @JsonProperty("resource_type")
        final String resourceType,

        @JsonProperty("url")
        final URI url
    ) {
        this.enabled = enabled;
        this.webhookUrl = webhookUrl;
        this.webhookMethod = webhookMethod;
        this.resourceType = resourceType;
        this.url = url;
    }

        public final Boolean getEnabled() {
            return this.enabled;
        }
        public final URI getWebhookUrl() {
            return this.webhookUrl;
        }
        public final String getWebhookMethod() {
            return this.webhookMethod;
        }
        public final String getResourceType() {
            return this.resourceType;
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

        ExportConfiguration other = (ExportConfiguration) o;

        return Objects.equals(enabled, other.enabled) &&  Objects.equals(webhookUrl, other.webhookUrl) &&  Objects.equals(webhookMethod, other.webhookMethod) &&  Objects.equals(resourceType, other.resourceType) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, webhookUrl, webhookMethod, resourceType, url);
    }

}

