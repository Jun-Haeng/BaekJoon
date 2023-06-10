import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        // 1 2 3 4 5 7

        int left = 0;
        int right = N - 1;
        int cnt = 0;

        while (true) {
            if (left >= right) break;

            int sum = arr[left] + arr[right];

            if (sum >= M) right--;
            else left++;

            if (sum == M) cnt++;
        }

        System.out.println(cnt);
    }
}