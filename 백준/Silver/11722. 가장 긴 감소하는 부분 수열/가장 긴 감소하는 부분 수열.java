import java.util.Scanner;

public class Main {

    static Integer dp[];
    static int arr[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        dp = new Integer[N];
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            LDS(i);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }

    static int LDS(int N) {
        if (dp[N] == null) {
            dp[N] = 1;

            for (int i = N - 1; i >= 0; i--) {

                if (arr[i] > arr[N]) {
                    dp[N] = Math.max(dp[N], LDS(i) + 1);
                }

            }
        }

        return dp[N];
    }
}