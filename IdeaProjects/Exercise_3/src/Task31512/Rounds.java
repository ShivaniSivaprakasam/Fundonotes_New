package Task31512;

import java.util.Scanner;
public class Rounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        float side1 = input.nextFloat();
        System.out.print("Enter second side: ");
        float side2 = input.nextFloat();
        System.out.print("Enter third side: ");
        float side3 = input.nextFloat();
        float perimeter = side1+side2+side3;
        float rounds = 5/perimeter;
        System.out.println("The total number of rounds the athlete will run is " +rounds +" to complete 5 km.");
    }
}
