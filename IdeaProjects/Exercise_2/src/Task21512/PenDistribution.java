package Task21512;

public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        int penDistribution = totalPens/totalStudents;
        int remainder = totalPens %  totalStudents;
        System.out.println("The Pen per student is " +penDistribution + " and the remaining pen not distributed is " + remainder +".");
    }
}
