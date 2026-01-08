package Task31512;

import  java.util.Scanner;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        float salary = input.nextFloat();
        System.out.print("Enter bonus: ");
        float bonus = input.nextFloat();
        float income = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + "." + "Hence the total income is INR " + income + ".");
    }
}
