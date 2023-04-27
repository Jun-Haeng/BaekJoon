import java.util.Scanner;

public class Main {

    static int[] dp;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        dp = new int[N + 1];

        if (N == 3) {
            System.out.println(1);
            return;
        } else if (N == 4) {
            System.out.println(-1);
            return;
        }

        dp[1] = -1;
        dp[2] = -1;
        dp[3] = 1;
        dp[4] = -1;
        dp[5] = 1;

        solve(N);

        System.out.println(dp[N]);

    }

    static int solve(int N) {

        if (dp[N] == 0) {

            int a = solve(N - 3) + 1;
            int b = solve(N - 5) + 1;

            if (a == 0 && b == 0) {
                dp[N] = -1;
            } else if (a == 0) {
                dp[N] = b;
            } else if (b == 0){
                dp[N] = a;
            } else {
                dp[N] = Math.min(a, b);
            }
        }

        return dp[N];
    }
}