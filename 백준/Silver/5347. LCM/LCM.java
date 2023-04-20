import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            long a = in.nextLong();
            long b = in.nextLong();

            long res = a * b / gcd(a, b);

            System.out.println(res);
        }
    }

    static long gcd(long a, long b) {

        while (b > 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}