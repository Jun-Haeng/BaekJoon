import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long start = 0;
        long end = 0;

        long[] arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            end = Math.max(end, arr[i]);
        }

        end++;

        while (start < end) {
            long mid = (start + end) / 2;
            int cnt = 0;

            for (long value : arr) {
                cnt += value / mid;
            }

            if (cnt < N) end = mid;
            else start = mid + 1;
        }

        System.out.println(start - 1);
    }
}