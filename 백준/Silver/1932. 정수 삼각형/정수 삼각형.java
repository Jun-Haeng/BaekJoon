import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        dp = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            dp[N - 1][i] = arr[N - 1][i];
        }

        System.out.println(solve(0, 0));

    }

    static int solve(int idx, int depth) {

        if (depth == N - 1) return dp[depth][idx];
        
        if (dp[depth][idx] == 0) {
            dp[depth][idx] = Math.max(solve(idx+1, depth+1),
                    solve(idx, depth+1)) + arr[depth][idx];
        }

        return dp[depth][idx];
    }
}