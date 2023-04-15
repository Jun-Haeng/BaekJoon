import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        backTracking(0, 1);

        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            if (visited[i]) cnt++;
        }

        System.out.println(cnt);
    }

    static void backTracking(int depth, int start) {

        if (depth == 2) return;

        for (int i = 1; i <= n; i++) {
            if (graph[start][i] == 1) {

                visited[i] = true;
                backTracking(depth + 1, i);
            }
        }
    }
}