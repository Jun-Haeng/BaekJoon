import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int[][] arr;
    static int node, line, start;
    static Queue<Integer> q = new LinkedList<>();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine(), " ");
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        visited = new boolean[node+1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        sb.append("\n");
        visited = new boolean[node+1];

        bfs(start);
        System.out.println(sb);
    }

    static void dfs(int start) {
        visited[start] = true;
        sb.append(start + " ");

        for (int i = 1; i <= node; i++) {
            if (arr[start][i] == 1 && !visited[i]) dfs(i);
        }
    }

    static void bfs(int start) {
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            start = q.poll();
            sb.append(start + " ");

            for (int i = 1; i <= node; i++) {
                if (arr[start][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}