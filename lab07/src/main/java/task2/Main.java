package task2;

public class Main {
    public static void main(String[] args) {
        double[] newDot = new double[] {0, 0};

        Point point1 = new Point();
        point1.getPoint();

        newDot[0] += point1.sumX;
        newDot[1] += point1.sumY;

        Point point2 = new Point();
        point2.getPoint();

        newDot[0] += point2.sumX;
        newDot[1] += point2.sumY;

        System.out.println(newDot[0]/2 + "; " + newDot[1]/2);
    }
}