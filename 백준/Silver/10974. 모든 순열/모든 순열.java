import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        visited = new boolean[N];

        backTracking(0);
        System.out.println(sb);
    }

    public static void backTracking(int depth) {

        if (depth == N) {

            for (int value : arr) {
                sb.append(value).append(' ');
            }

            sb.append('\n');

            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                backTracking(depth + 1);
                visited[i] = false;
            }
        }
    }

}