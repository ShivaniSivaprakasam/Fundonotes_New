package Task31512;

import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weight = input.nextFloat();
        double kg = weight * 2.2;
        System.out.println("The weight of the person in pounds is " +weight +" lb " +" and in kg is " +kg +" kg.");
    }
}

