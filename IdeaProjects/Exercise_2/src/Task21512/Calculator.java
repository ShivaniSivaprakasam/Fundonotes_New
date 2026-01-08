package Task21512;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = input.nextFloat();
        float addition =  num1 + num2;
        float subtraction =  num1 - num2;
        float multiplication =  num1 * num2;
        float division =  num1 / num2;
        System.out.println("The addition, subtraction, multiplication and division values of 2 numbers " +num1 +" and " +num2 +" is " + addition +"," + subtraction +"," + multiplication +" and " +division);

    }
}
