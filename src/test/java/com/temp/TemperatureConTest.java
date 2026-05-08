package com.temp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.temp.TemperatureCon;

public class TemperatureConTest {

    TemperatureCon tc = new TemperatureCon();

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(98.6, tc.celsiusToFahrenheit(37), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(37.0, tc.fahrenheitToCelsius(98.6), 0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(310.15, tc.celsiusToKelvin(37), 0.01);
    }
    @Test
    public void testKelvinToCelsius() {
        assertEquals(37.0, tc.kelvinToCelsius(310.15), 0.01);
    }
}