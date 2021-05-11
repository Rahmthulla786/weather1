package com.weather.weatherdemoproj.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sources",
        "nearesr-station",
        "untis"


})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flags {
    @JsonProperty("sources")
    private List<String> sources=null;
    @JsonProperty("nearest-station")
    private Double nearestStattion;
    @JsonProperty("units")
    private  String units;



}
