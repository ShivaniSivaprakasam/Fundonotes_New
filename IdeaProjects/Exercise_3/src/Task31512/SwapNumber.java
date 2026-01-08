package Task31512;

import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (number1): ");
        int number1 = input.nextInt();
        System.out.print("Enter number (number2): ");
        int number2 = input.nextInt();
        System.out.println("Original(number1) : " +number1);
        System.out.println("Original(number2) : " +number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The swapped numbers are " +number1 + " and " + number2 + ".");
    }
}
