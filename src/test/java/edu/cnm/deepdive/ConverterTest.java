package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

  static final double TOLERANCE = 0.0001;
  static final double[][] temperaturePairs = {
      {-40, -40},
      {0, 32},
      {100, 212},
      {37.1, 98.78}
  };

  @Test
  void convertC2F() {
    for (double[] testcase : temperaturePairs) {
      double celsius = testcase[0];
      double expectedFahrenheit = testcase[1];
      double actualFahrenheit = Converter.convertC2F(celsius);
      assertEquals(expectedFahrenheit, actualFahrenheit, TOLERANCE);
    }
  }

  @Test
  void convertF2C() {
    for (double[] testcase : temperaturePairs) {
      double fahrenheit = testcase[1];
      double expectedCelsius = testcase[0];
      double actualCelsius = Converter.convertF2C(fahrenheit);
      assertEquals(expectedCelsius, actualCelsius, TOLERANCE);
    }
  }
}