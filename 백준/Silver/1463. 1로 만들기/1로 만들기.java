import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N+1];

        System.out.println(solve(N));
    }

    public static int solve(int N) {
        
        // 초기값 설정
        if (N == 1) return 0;
        
        // 과정
        if (dp[N] == null) {

            if (N % 6 == 0) {
                dp[N] = Math.min(Math.min(solve(N / 3), solve(N / 2)
                ), solve(N - 1)) + 1;

            } else if (N % 3 == 0) {
                dp[N] = Math.min(solve(N / 3), solve(N - 1)) + 1;

            } else if (N % 2 == 0) {
                dp[N] = Math.min(solve(N / 2), solve(N - 1)) + 1;

            } else {
                dp[N] = solve(N - 1) + 1;

            }
        }

        return dp[N];
    }
}