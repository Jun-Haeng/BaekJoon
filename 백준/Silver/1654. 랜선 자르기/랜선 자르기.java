import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int K, N;
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new long[K];

        long end = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            end = Math.max(end, arr[i]);
        }

        end++;

        long start = 0;
        long mid = 0;

        while (start < end) {

            mid = (start + end) / 2;
            long cnt = 0;

            for (int i = 0; i < K; i++) {
                cnt += (arr[i] / mid);
            }

            if (cnt < N) end = mid;
            else start = mid + 1;
        }

        System.out.println(start - 1);
    }
}
