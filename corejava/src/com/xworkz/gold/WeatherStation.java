package com.xworkz.gold;

public class WeatherStation {
        Weather weather;

        public WeatherStation(Weather weather) {
            System.out.println("Constructor in WeatherStation");
            this.weather = weather;
        }

        public void update() {
            System.out.println("Updating weather information...");
            if (weather != null) {
                weather.temperature();
            } else {
                System.out.println("Weather data is not available");
            }
        }
    }

