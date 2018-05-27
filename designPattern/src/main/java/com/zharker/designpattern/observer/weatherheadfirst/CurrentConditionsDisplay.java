package com.zharker.designpattern.observer.weatherheadfirst;

import com.zharker.designpattern.observer.DisplayElement;
import com.zharker.designpattern.observer.Subject;

public class CurrentConditionsDisplay implements WeatherObserver, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
