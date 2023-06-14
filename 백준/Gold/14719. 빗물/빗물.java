import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[] arr = new int[W];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < W; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int res = 0;

        for (int i = 0; i < W; i++) {

            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            for (int j = i + 1; j < W; j++) {
                right = Math.max(right, arr[j]);
            }

            if (left > arr[i] && right > arr[i]) {
                res += Math.min(left, right) - arr[i];
            }
        }

        System.out.println(res);
    }
}