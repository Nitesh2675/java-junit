package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConverrtorTest {

    @Test
    public void celsiusToFahrenheitTest(){
        double a=TemperatureConvertor.celsiusToFahrenheit(25);
        Assertions.assertEquals(77,a);
    }
    @Test
    public void FahrenheitToCelsius(){
        double a=TemperatureConvertor.FahrenheitTocelsius(77);
        Assertions.assertEquals(25,a);
    }

}
