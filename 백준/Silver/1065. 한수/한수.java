import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        // 1 or 10의 자리일때
        if (N < 100) System.out.println(N);

        // 100의 자리일때

        else {
            int cnt = 99;

            for (int i = 100; i <= N; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                if ((a - b) == (b - c)) cnt++;
            }

            System.out.println(cnt);
        }
    }
}