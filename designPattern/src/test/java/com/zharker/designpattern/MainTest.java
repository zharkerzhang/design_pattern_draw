package com.zharker.designpattern;

import com.zharker.designpattern.observer.commonImpl.ConcreteObserver;
import com.zharker.designpattern.observer.commonImpl.ConcreteSubject;
import com.zharker.designpattern.observer.Observer;
import com.zharker.designpattern.observer.Subject;
import com.zharker.designpattern.observer.weatherheadfirst.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void testObserver1(){

        Subject subject = new ConcreteSubject();
        Observer o1 = new ConcreteObserver("01");
        Observer o2 = new ConcreteObserver("o2");
        subject.registerObserver(o1);
        subject.registerObserver(o2);
        subject.notifyObservers();
        subject.removeObserver(o1);
        subject.notifyObservers();
    }

    @Test
    public void testObserver2(){
        com.zharker.designpattern.observer.enhanceImpl.ConcreteSubject subject = new com.zharker.designpattern.observer.enhanceImpl.ConcreteSubject();
        Observer o1 = new com.zharker.designpattern.observer.enhanceImpl.ConcreteObserver(subject, "O1");
        Observer o2 = new com.zharker.designpattern.observer.enhanceImpl.ConcreteObserver(subject, "o2");
        subject.setState("2333");
        subject.notifyObservers();
        subject.removeObserver(o2);
        subject.setState("5555");
        subject.notifyObservers();

    }

    @Test
    public void testObserver3(){
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject(50,50,25.5f);
        WeatherObserver currentDisplay = new CurrentConditionsDisplay(weatherDataSubject);
        WeatherObserver statisticsDisplay = new StatisticsDisplay(weatherDataSubject);
        WeatherObserver forecastDisplay = new ForecastDisplay(weatherDataSubject);
        WeatherObserver heatIndexDisplay = new HeatIndexDisplay(weatherDataSubject);

        weatherDataSubject.measurementsChanged();
        weatherDataSubject.setMeasurements(80, 65, 30.4f);
        weatherDataSubject.setMeasurements(82, 70, 29.2f);
        weatherDataSubject.setMeasurements(78, 90, 29.2f);

    }

    @Test
    public void testObserver4(){
        com.zharker.designpattern.observer.weatherjavaImpl.WeatherDataSubject weatherData = new com.zharker.designpattern.observer.weatherjavaImpl.WeatherDataSubject();
        com.zharker.designpattern.observer.weatherjavaImpl.CurrentConditionsDisplay currentConditions = new com.zharker.designpattern.observer.weatherjavaImpl.CurrentConditionsDisplay(weatherData);
        com.zharker.designpattern.observer.weatherjavaImpl.StatisticsDisplay statisticsDisplay = new com.zharker.designpattern.observer.weatherjavaImpl.StatisticsDisplay(weatherData);
        com.zharker.designpattern.observer.weatherjavaImpl.ForecastDisplay forecastDisplay = new com.zharker.designpattern.observer.weatherjavaImpl.ForecastDisplay(weatherData);
        com.zharker.designpattern.observer.weatherjavaImpl.HeatIndexDisplay heatIndexDisplay = new com.zharker.designpattern.observer.weatherjavaImpl.HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(10, 45, 5.4f);
        weatherData.setMeasurements(12, 30, 6.2f);
        weatherData.setMeasurements(18, 20, 7.2f);
    }
}
