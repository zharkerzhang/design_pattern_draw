package com.zharker.designpattern.observer.weatherheadfirst;

import com.zharker.designpattern.observer.Observer;

public interface WeatherObserver extends Observer{
    public default void update() {}
    public void update(float temp, float humidity, float pressure);
}
