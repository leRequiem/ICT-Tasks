import java.util.Scanner;

public class RegEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        boolean mask1 = text.matches("\\d{2}\\.\\d{2}\\.\\d{4}");
        boolean mask2 = text.matches("\\d{2}\\.\\d{2}\\.\\d{2}");
        boolean mask3 = text.matches("\\d{4}\\.\\d{2}\\.\\d{2}");
        boolean mask4 = text.matches("\\d{2}\\.\\D{1,3}\\.\\d{4}");
        if (mask1 | (mask1|mask2) | mask3 | mask4) System.out.println("Дата введена верно");
        else System.out.println("Дата введена некорректно");
    }
}