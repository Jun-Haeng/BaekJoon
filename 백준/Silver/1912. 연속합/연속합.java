import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static int[] dp;
    static int max;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n+1];
        dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = arr[1];
        max = dp[1];

        solve(n);

        System.out.println(max);
    }

    static int solve(int n) {

        if (n == 1) return dp[n];

        if (dp[n] == 0) {
            dp[n] = Math.max(solve(n-1) + arr[n], arr[n]);

            max = Math.max(max, dp[n]);
        }

        return dp[n];
    }
}