package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Transfer {
    Scanner in = new Scanner(System.in);
    double x = in.nextDouble();
    double y = in.nextDouble();

    void moving() {
        System.out.println("Введите перенос: ");
        double delta1 = in.nextDouble();
        double delta2 = in.nextDouble();
        double[] coords = new double[] {x + delta1, y + delta2};

        System.out.println("Новые координаты точки: ");
        System.out.print(Arrays.toString(coords));
    }
}
