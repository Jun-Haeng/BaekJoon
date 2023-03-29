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
            LIS(i);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }

    static int LIS(int N) {
        if (dp[N] == null) {
            dp[N] = arr[N];

            for (int i = N - 1; i >= 0; i--) {
                if (arr[N] > arr[i]) {
                    dp[N] = Math.max(dp[N], LIS(i) + arr[N]);
                }
            }
        }

        return dp[N];
    }
}