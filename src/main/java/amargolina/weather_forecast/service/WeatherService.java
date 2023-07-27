package amargolina.weather_forecast.service;

import amargolina.weather_forecast.model.Weather;

public interface WeatherService {
    public Weather getWeather(String city);
}
