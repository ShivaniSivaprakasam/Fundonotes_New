package Task21512;

import java.util.Scanner;
public class UniversityDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee in INR: ");
        double fee = input.nextDouble();
        System.out.print("Enter the discount percentage (divide by 100) : ");
        double discountPercent = input.nextDouble();
        double discount = fee *  discountPercent;
        double discountedFee = fee -  discount;
        System.out.println("The discount amount is INR " +discount + " and final discounted fee is INR " +discountedFee + ".");
    }
}
