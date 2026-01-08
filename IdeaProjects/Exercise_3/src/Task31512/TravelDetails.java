package Task31512;

import java.util.Scanner;
public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter to city: ");
        String toCity = input.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        float fromToVia = input.nextFloat();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        float viaToFinalCity = input.nextFloat();
        System.out.print("Enter total time taken (in hours): ");
        float time = input.nextFloat();

        float totalDistance = fromToVia + viaToFinalCity;
        float speed = totalDistance / time;
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + speed + " miles/hour");
        System.out.println(
                "The results of Int Operations are "
                        + totalDistance + " and " + speed
        );
    }
}

