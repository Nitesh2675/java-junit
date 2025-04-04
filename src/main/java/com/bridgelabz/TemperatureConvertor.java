package com.bridgelabz;

public class TemperatureConvertor {
    public static double celsiusToFahrenheit(double c) {
        return c*((double) 9 /5)+32;
    }
    public static double FahrenheitTocelsius(double f) {
        return (f-32)*((double) 5 /9);
    }

}
