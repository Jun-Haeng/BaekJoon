import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N+1];

        for (int i = N; i >= 1; i--) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];

        // 10 20 20 10 30 10

        int maxCount = 0;

        for (int i = 1; i <= N; i++) {
            int max = 1;

            for (int j = 1; j <= i - 1; j++) {
                if (arr[i] > arr[j]) {
                    max = Math.max(max, dp[j] + 1);
                }
            }

            dp[i] = max;
            maxCount = Math.max(dp[i], maxCount);
        }

        System.out.println(maxCount);

//        System.out.println();
//        for (int i : dp) {
//            System.out.print(i + " ");
//        }

    }
}