package com.xworkz.gold;

public class weatherRunner {
    public static void main(String[] args) {
        Weather weather = new Weather();
        WeatherStation station = new WeatherStation(weather);
        station.update();
    }
}

