import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long a = 5;
        long d = 7;

        for (int i = 0; i < N - 1; i++) {
            a += d;
            d += 3;
        }

        System.out.println(a % 45678);
    }
}