package com.weather.weatherdemoproj.Model;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "summary",
        "icon",
        "Dailydata"



})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataDaily
{
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("icon")
    private  String icon;
    @JsonProperty("Dailydata")
    private List<Daily> Dailydata=null;
}
