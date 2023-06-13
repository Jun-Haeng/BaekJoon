import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];

        int maxSum = 0;

        for (int i = 1; i <= N; i++) {
            int max = 0;

            for (int j = 1; j <= i - 1; j++) {
                if (arr[j] < arr[i]) {
                    max = Math.max(dp[j], max);
                }
            }

            dp[i] = max + arr[i];
            maxSum = Math.max(maxSum, dp[i]);
        }

        System.out.println(maxSum);
    }
}