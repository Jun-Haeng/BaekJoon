import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] W;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        W = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            W[i] = (Integer.parseInt(st.nextToken()));
        }

        backTracking(0, 0);
        System.out.println(max);
    }

    static void backTracking(int num, int depth) {
        if (depth == N - 2) {
            max = Math.max(max, num);
            return;
        }

        for (int i = 1; i < N - 1; i++) {

            if (W[i] != 0) {
                int tmp = W[i];
                W[i] = 0;

                int a = i - 1;
                int b = i + 1;

                while (true) {
                    if (W[a] != 0) break;
                    a--;
                }

                while (true) {
                    if (W[b] != 0) break;
                    b++;
                }
                backTracking(num + W[a] * W[b], depth + 1);
                W[i] = tmp;
            }
        }

    }
}