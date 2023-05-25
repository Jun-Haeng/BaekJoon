import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int start = 0;
        int end = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            end = Math.max(end, arr[i]);
        }

        end++;

        int M = Integer.parseInt(br.readLine());

        while (start < end) {

            int sum = 0;
            int mid = (start + end) / 2;

            for (int value : arr) {
                sum += Math.min(value, mid);
            }

            if (M < sum) end = mid;
            else start = mid + 1;
        }

        System.out.println(start - 1);
    }
}