package Task31512;

import java.util.Scanner;
public class QuotientReminder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float number1 = input.nextFloat();
        System.out.print("Enter second number: ");
        float  number2 = input.nextFloat();
        float quotient = number1 / number2;
        float remainder = number1 % number2;
        System.out.println("The quotient is " +quotient +" and remainder is " +remainder +" of two numbers " +number1 +" and " +number2);
    }
}
