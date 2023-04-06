import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long A = in.nextLong();
        long B = in.nextLong();

        long num = gcd(Math.max(A, B), Math.min(A, B));

        System.out.println(A * B / num);
    }

    public static long gcd(long a, long b) {

        while (b > 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}