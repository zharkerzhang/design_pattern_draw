package com.zharker.designpattern.observer.weatherheadfirst;

import com.zharker.designpattern.observer.Observer;
import com.zharker.designpattern.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataSubject(){
        this.observers = new ArrayList<>();
    }

    public WeatherDataSubject(float temperature, float humidity, float pressure) {
        this();
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        if(o != null && !observers.contains(o)){
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(o->((WeatherObserver)o).update(this.temperature,this.humidity,this.pressure));
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
