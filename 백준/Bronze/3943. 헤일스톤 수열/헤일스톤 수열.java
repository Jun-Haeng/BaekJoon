import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        while (T-- > 0) {
            int n = in.nextInt();
            int max = 1;

            while (true) {
                if (n == 1) break;

                max = Math.max(max, n);

                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n * 3 + 1;
                }
            }

            System.out.println(max);
        }
    }
}