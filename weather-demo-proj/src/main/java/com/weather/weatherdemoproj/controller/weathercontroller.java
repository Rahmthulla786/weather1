package com.weather.weatherdemoproj.controller;

import com.weather.weatherdemoproj.Model.Daily;
import com.weather.weatherdemoproj.Model.Weaather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@RestController
public class weathercontroller
{
    @Autowired
    private RestTemplate restTemplates;
    @GetMapping(value = "/daily/{latitude},{longitude}")
    public List<Daily> getDailydata(@PathVariable("latitude") Double latitude, @PathVariable("longitude") Double longtitude)
    {
        String url="https://api.darksky.net/forecast/872811fd57e5728712ea3a17d08f15b3/12.9175419,77.5837702";
        Weaather weathers=restTemplates.getForObject(url,Weaather.class);
        return (List<Daily>) weathers.getDaily();
    }
}
