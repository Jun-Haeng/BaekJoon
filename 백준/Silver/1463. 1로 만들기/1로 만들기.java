import java.util.Scanner;

public class Main {

    static int[] dp;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        dp = new int[N+1];

        System.out.println(solve(N));
    }

    static int solve(int N) {

        if (N == 1) return 0;

        if (dp[N] == 0) {

            if (N % 6 == 0) {
                dp[N] = Math.min(Math.min(solve(N / 3), solve(N / 2)),
                                solve(N - 1)) + 1;

            } else if (N % 3 == 0) {
                dp[N] = Math.min(solve(N / 3), solve(N - 1)) + 1;

            } else if (N % 2 == 0){
                dp[N] = Math.min(solve(N / 2), solve(N - 1)) + 1;

            } else {
                dp[N] = solve(N - 1) + 1;
            }
        }

        return dp[N];
    }
}