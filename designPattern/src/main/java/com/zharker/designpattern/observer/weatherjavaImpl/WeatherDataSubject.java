package com.zharker.designpattern.observer.weatherjavaImpl;

import java.util.Observable;

public class WeatherDataSubject extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataSubject() { }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
