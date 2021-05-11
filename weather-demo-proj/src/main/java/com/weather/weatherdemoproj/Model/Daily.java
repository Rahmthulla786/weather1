package com.weather.weatherdemoproj.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "summary",
        "icon",
        "data"


})
public class Daily
{
    @JsonProperty("summary")
    private  String summary;
    @JsonProperty("icon")
    private  String icon;
    @JsonProperty("data")
    private List<DataDaily> data=null;
}
