package com.weather.weatherdemoproj.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
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
public class Hourly
{
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("icon")
    private  String icon;
    @JsonProperty("data")
    private List<Datahourly> data=null;
}
