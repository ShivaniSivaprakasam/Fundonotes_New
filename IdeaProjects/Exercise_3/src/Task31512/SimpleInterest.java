package Task31512;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        double principle  = input.nextDouble();
        System.out.print("Enter interest rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter time:  ");
        double time = input.nextDouble();
        double simpleInterest = (principle * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest +" for Principle " +principle +"," +" Rate of Interest " +rate +" and Time " +time +".");
    }
}
