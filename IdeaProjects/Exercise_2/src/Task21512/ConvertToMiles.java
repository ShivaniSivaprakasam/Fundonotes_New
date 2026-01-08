package Task21512;

import java.util.Scanner;
public class ConvertToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        double km = input.nextDouble();
        double miles = km/1.6;
        System.out.println("The total miles is " +miles + " mi miles for the given km " +km +" km.");
    }
}

