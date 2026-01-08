package Task21512;

import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is " + area +" cm^2.");
        double heightInch = height / 2.54;
        double heightFoot = height/heightInch;
        System.out.println("your height in cm is " +height +" cm " + " while in feet is " +heightFoot +" ft " + " and in inches is " +heightInch +"″");
    }
}
