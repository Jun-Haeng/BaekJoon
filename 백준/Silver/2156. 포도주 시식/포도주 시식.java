import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        dp = new Integer[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[1];

        if (N >= 2) dp[2] = arr[1] + arr[2];

        System.out.println(solve(N));
    }

    public static int solve(int N) {

        if (dp[N] == null) {

            dp[N] = Math.max(Math.max(solve(N-3) + arr[N-1], solve(N-2))
                + arr[N], solve(N-1));
        }

        return dp[N];
    }
}