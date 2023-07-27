package amargolina.weather_forecast.controller;

import amargolina.weather_forecast.model.Weather;
import amargolina.weather_forecast.service.WeatherService;
import amargolina.weather_forecast.service.WeatherServiceProduction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService1){
        this.weatherService=weatherService1;
    }
    @GetMapping("/weather/{city}")
    public ResponseEntity<Weather> getWeather(@PathVariable("city") String city){
        return ResponseEntity.ok(weatherService.getWeather(city));
    }

}
