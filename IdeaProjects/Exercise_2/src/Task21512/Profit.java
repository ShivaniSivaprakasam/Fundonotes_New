package Task21512;

public class Profit {
    public static void main(String[] args) {
        double CP = 129;
        double SP = 191;
        double profit = SP - CP;
        double profitPercentage = (profit/CP) * 100;
        System.out.println("The Cost price is INR " + CP + " and the Selling Price is INR " + SP + ".");
        System.out.println("The profit is INR " + profit + " and the Task21512.Profit Percentage is: " + profitPercentage + "%.");
    }
}
