package Task21512;

import java.util.Scanner;
public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        float feet = input.nextFloat();
        float yard = feet/3;
        float mile = yard/1760;
        System.out.println("Your distance in feet is " +feet +" ft " + " while in yard is " +yard +" yd " + " and in mile is " +mile + " mi.");
    }
}
