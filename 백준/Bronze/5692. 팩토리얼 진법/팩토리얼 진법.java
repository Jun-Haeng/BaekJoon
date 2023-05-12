import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            int n = in.nextInt();
            if (n == 0) break;

            String str = String.valueOf(n);

            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += factorial(str.length() - i) * (str.charAt(i) - '0');
            }

            System.out.println(sum);
        }
    }

    static int factorial(int n) {

        if (n <= 1) return 1;

        return n * factorial(n - 1);
    }
}