import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {

            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(LCM(a, b));
        }

    }

    public static int GCD(int a, int b) {
        if (a % b == 0) return b;
        return GCD(b, a % b);
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}