package Task21512;

import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        double inch = height/2.54;
        double feet = inch/12;
        System.out.print("your Height in cm is " +height + " cm while in feet is " +feet + " ft and inches is " +inch +"″");
    }
}
