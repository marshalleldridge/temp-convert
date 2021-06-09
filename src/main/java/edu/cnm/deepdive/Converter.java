package edu.cnm.deepdive;

import java.util.Scanner;

public class Converter {

  private static final String INPUT_PROMPT =
      "Please type a celsius temperature (blank to quit): ";
  private static final String FAHRENHEIT_OUTPUT_FORMAT =
      "Fahrenheit temperature is: %,.2f degrees%nPlease type a celsius temperature (blank to quit): ";
  private static final String PARSE_EXCEPTION_FORMAT =
      "Unable to parse \"%s\". Please try again.";
  private static final String CELSIUS_OUTPUT_FORMAT =
      "Celsius temperature is: %,.2f degrees%nPlease type a fahrenheit temperature (blank to quit): ";


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(INPUT_PROMPT);
    String userInput = scanner.nextLine().trim();
    while (!userInput.isEmpty()) {
      try {
        //TODO Check last character of userInput; if 'f', treat as fahrenheit, otherwise celsius.
        System.out.printf(
            FAHRENHEIT_OUTPUT_FORMAT,
            convertC2F(Double.parseDouble(userInput)));

        System.out.printf(
            CELSIUS_OUTPUT_FORMAT,
            convertF2C(Double.parseDouble(userInput)));

      } catch (NumberFormatException e) {
        System.out.printf(PARSE_EXCEPTION_FORMAT, userInput);
      }
      userInput = scanner.nextLine().trim();
    }
  }

  public static double convertC2F(double celsius) {
    return 32 + celsius * 9 / 5;
  }

  public static double convertF2C(double fahrenheit) {
    return 5 * (fahrenheit - 32) / 9; // TODO implement fahrenheit to celsius formula
  }

}
