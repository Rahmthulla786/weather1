package com.weather.weatherdemoproj.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "latitude",
        "longitude",
        "timezone",
        "currently",
        "hourly",
        "daily",
        "flags",
        "offset"


})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weaather
{
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private  Double longitude;
    @JsonProperty("timezone")
    private  String timezone;
    @JsonProperty("currently")
    private  currently currently;
    @JsonProperty("hourly")
    private Hourly hourly;
    @JsonProperty("daily")
    private Daily daily;
    @JsonProperty("flags")
    private  Flags flags;
    @JsonProperty("offset")
    private  Double offset;

    public List<Daily> DailyData()
    {
        return  null;
    }
}
