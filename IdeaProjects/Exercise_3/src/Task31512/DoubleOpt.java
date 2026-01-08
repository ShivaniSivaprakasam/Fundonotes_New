package Task31512;

import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a =  input.nextDouble();
        System.out.print("Enter second number: ");
        double b =  input.nextDouble();
        System.out.print("Enter third number: ");
        double c = input.nextDouble();
        double operation1 = a + b *c;
        double operation2 = a * b + c;
        double operation3 = c + a / b;
        double operation4 = a % b + c;
        System.out.println("The results of the Int Operations are " +operation1 +" , " +operation2 +" , " +operation3 +" and " +operation4 +".");
    }
}
