import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] arr;
    static boolean[] v;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        v = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            v[i] = true;
            backTracking(i, i, 0, 0);
        }

        System.out.println(min);

    }

    public static void backTracking(int start, int now, int nums, int depth) {

        if (depth == N - 1) {
            
            if (arr[now][start] != 0) {
                min = Math.min(min, nums + arr[now][start]);
            }
            
            return;
        }

        for (int i = 0; i < N; i++) {
            if (arr[now][i] != 0 && !v[i]) {
                v[i] = true;
                backTracking(start, i, nums + arr[now][i], depth + 1);
                v[i] = false;
            }
        }
    }
}