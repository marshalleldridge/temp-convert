package edu.cnm.deepdive;

import java.util.Scanner;

public class Converter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please type a celsius temperature (blank to quit): ");
    String userInput = scanner.nextLine();
    while(!userInput.isEmpty()){
      System.out.printf("Fahrenheit temperature is: %,.2f degrees%nPlease type a celsius temperature (blank to quit): ", convertC2F(Double.parseDouble(userInput)));
      userInput = scanner.nextLine();
    }
  }

  public static double convertC2F(double celsius) {
    return 32 + celsius * 9 / 5;
  }
}
