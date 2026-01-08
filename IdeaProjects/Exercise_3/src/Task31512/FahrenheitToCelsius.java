package Task31512;

import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double fahrenheit = input.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5/9;
        System.out.println("The " +fahrenheit +" fahrenheit is " +celsiusResult +" celsius.");
    }
}
