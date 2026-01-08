package Task21512;

public class FeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 0.10;
        double discount = fee *  discountPercent;
        double discountedFee = fee -  discount;
        System.out.println("The discount amount is INR " +discount + " and final discounted fee is INR " +discountedFee + ".");
    }
}
