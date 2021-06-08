package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

  static double[] celsiusValues = {-40, 0, 100, 37.1};
  static double[] expectedFahrenheitValues = {-40, 32, 212, 98.78};
  static final double TOLERANCE = 0.0001;

  @Test
  void convertC2F() {
    for (int i = 0; i < celsiusValues.length; i++) {
      double celsius = celsiusValues[i];
      double expectedFahrenheit = expectedFahrenheitValues[i];
      double actualFahrenheit = Converter.convertC2F(celsius);
      assertEquals(expectedFahrenheit, actualFahrenheit, TOLERANCE);
    }
  }

  @Test
  void convertF2C() {
  } //TODO implement test for fahrenheit to celsius conversion
}