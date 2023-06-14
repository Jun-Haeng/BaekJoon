import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int F, S, G, U, D;
    static int[] graph;
    static boolean[] visited;
    static Queue<Integer> q = new LinkedList<>();
    static final String s = "use the stairs";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        graph = new int[F+1];
        visited = new boolean[F+1];
        
        if (S == G) {
            System.out.println(0);
            return;
        }

        bfs();

        if (graph[G] == 0) System.out.println(s);
        else System.out.println(graph[G]);
    }

    public static void bfs() {
        q.add(S);
        visited[S] = true;

        while (!q.isEmpty()) {

            int now = q.poll();

            int up = now + U;
            int down = now - D;

            if (up <= F && !visited[up]) {
                visited[up] = true;
                graph[up] = graph[now] + 1;
                q.add(up);
            }

            if (down > 0 && !visited[down]) {
                visited[down] = true;
                graph[down] = graph[now] + 1;
                q.add(down);
            }
        }
    }
}