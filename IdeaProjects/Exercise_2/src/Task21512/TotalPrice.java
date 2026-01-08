package Task21512;

import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price in INR: ");
        float unitPrice = input.nextFloat();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        float price = unitPrice*quantity;
        System.out.println("The total purchase price is INR " +price + " if the quantity is " +quantity + " and the unit price is INR " +unitPrice);
    }
}
