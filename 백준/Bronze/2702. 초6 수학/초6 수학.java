import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();

            int tmp = gcd(a, b);

            System.out.println(a * b / tmp);
            System.out.println(tmp);
        }
    }

    static int gcd(int a, int b) {

        if (b == 0) return a;
        return gcd(b, a % b);
    }
}