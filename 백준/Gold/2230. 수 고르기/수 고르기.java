import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = 0;
        int sum;

        ArrayList<Integer> res = new ArrayList<>();

        while (true) {

            if (right >= N || left >= N) break;

            sum = arr[right] - arr[left];

            if (sum < M) right++;
            else if (sum == M) {
                System.out.println(M);
                return;
            }
            else {
                left++;
                res.add(sum);
            }
        }

        int a = Integer.MAX_VALUE;

        for (Integer re : res) {
            if (re > 3) a = Math.min(a, re);
        }

        System.out.println(a);

    }
}