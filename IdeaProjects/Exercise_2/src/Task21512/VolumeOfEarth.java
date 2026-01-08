package Task21512;

public class VolumeOfEarth {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radiusKm = 6378;
        double radiusMi = 6378 * 1.6;
        double volumeKm = (4/3) * PI * radiusKm;
        double volumeMi = (4/3) * PI * radiusMi;
        System.out.println("The volume of earth in cubic kilometers is " +volumeKm +" km^3" + " and cubic miles is " +volumeMi +" mi^3.");
    }
}
