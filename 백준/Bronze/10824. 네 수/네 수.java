import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();
        String c = in.next();
        String d = in.next();

        System.out.printf("%.0f", Double.parseDouble(a+b) + Double.parseDouble(c+d));
    }
}