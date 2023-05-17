import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    static int N, K;
    static int[] arr;
    static HashSet<Integer> set = new HashSet<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        arr = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        backTracking("", 0);

        System.out.println(set.size());
    }

    static void backTracking(String num, int depth) {

        if (depth == K) {
            set.add(Integer.parseInt(num));

            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backTracking(num + arr[i], depth + 1);
                visited[i] = false;
            }
        }
    }
}