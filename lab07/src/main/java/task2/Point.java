package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Point {
    double sumX;
    double sumY;
    void getPoint() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double[] tempArray = new double[] {x, y};

        System.out.println("Кооринаты точки: " + Arrays.toString(tempArray));
        sumX += tempArray[0];
        sumY += tempArray[1];
    }
}