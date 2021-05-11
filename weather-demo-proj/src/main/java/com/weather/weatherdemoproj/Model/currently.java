package com.weather.weatherdemoproj.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "time",
        "summary",
        "icon",
        "precipIntensity",
        "precipProbability",
        "precipType",
        "temperature",
        "dewPoint",
        "humidity",
        "pressure",
        "windSpeed",
        "windGust",
        "windBearing",
        "cloudCover",
        "uvIndex",
        "visibility",
        "ozone"


})
@JsonIgnoreProperties
@Data
@AllArgsConstructor
@NoArgsConstructor
public class currently {

    @JsonProperty("time")
    private String name;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("precipIntensity")
    private Double precipIntensity;
    @JsonProperty("precipProbability")
    private Double precipProbability;
    @JsonProperty("precipType")
    private String precipType;
    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("apparentTemperature")
    private Double apparentTemperature;
    @JsonProperty("dewPoint")
    private  Double dewPoint;
    @JsonProperty("humidity")
    private  Double humidity;
    @JsonProperty("pressure")
    private  Double pressure;
    @JsonProperty("windSpeed")
    private  Double windSpeed;
    @JsonProperty("windGust")
    private  Double windGust;
    @JsonProperty("windBearing")
    private int windBearing;
    @JsonProperty("cloudCover")
    private  Double cloudCover;
    @JsonProperty("uvIndex")
    private  int uvIndex;
    @JsonProperty("visibility")
    private int visibility;
    @JsonProperty("ozone")
    private  Double ozone;



}
