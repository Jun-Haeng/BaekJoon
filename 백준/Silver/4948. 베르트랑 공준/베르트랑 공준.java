import java.util.Scanner;

public class Main {

    static final int number = 123456 * 2 + 1;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean[] arr = new boolean[number];
        arr[1] = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (!arr[i]) {
                for (int j = i*i; j <= number; j += i) {
                    arr[j] = true;
                }
            }
        }

        while (true) {

            int n = in.nextInt();

            if (n == 0) break;

            int cnt = 0;

            for (int i = n + 1; i <= n * 2; i++) {
                if (!arr[i]) cnt++;
            }

            System.out.println(cnt);
        }

        in.close();
    }
}