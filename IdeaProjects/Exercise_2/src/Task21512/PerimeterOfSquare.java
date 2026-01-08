package Task21512;

import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter of square in cm: ");
        double perimeter = input.nextDouble();
        double side = perimeter/4;
        System.out.println("The length of the size is " +side +" cm " + " whose perimeter is " +perimeter +" cm.");
    }
}
