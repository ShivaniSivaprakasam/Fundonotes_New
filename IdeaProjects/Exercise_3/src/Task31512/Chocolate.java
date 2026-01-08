package Task31512;

import java.util.Scanner;
public class Chocolate {
    public static void divideChocolates(int numberOfChocolates, int numberOfChildren) {
        int eachChildGets = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " +eachChildGets +" and the number of remaining chocolates are " +remaining +".");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        divideChocolates(numberOfChocolates, numberOfChildren);
    }
}
