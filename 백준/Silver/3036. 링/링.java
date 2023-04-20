import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int first = arr[0];

        for (int i = 1; i < N; i++) {
            int gcd = gcd(first, arr[i]);

            System.out.println(first / gcd + "/" + arr[i] / gcd);
        }
    }

    public static int gcd(int a, int b) {

        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}