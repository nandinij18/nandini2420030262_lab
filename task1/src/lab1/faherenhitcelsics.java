package lab1;

import java.util.Scanner;

public class faherenhitcelsics {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double  fahrenheit;
		double celsius;
	     System.out.print("Enter temperature in Fahrenheit: ");
	     fahrenheit = scanner.nextDouble();
          celsius = (fahrenheit - 32) * 5 / 9;
          System.out.println("Temperature in Celsius: " + celsius);
	}
	}

