import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Node {
        int end;
        int cost;

        public Node (int end, int cost) {
            this.end = end;
            this.cost = cost;
        }
    }

    static ArrayList<Node>[] graph;
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        graph = new ArrayList[V+1];
        visited = new boolean[V+1];
        dist = new int[V+1];

        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph[u].add(new Node(v, w));
        }

        solve(K);

        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) System.out.println("INF");
            else System.out.println(dist[i]);
        }
    }

    public static void solve(int start) {

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> (o1.cost - o2.cost));
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node now = pq.remove();

            if (!visited[now.end]) visited[now.end] = true;

            for (Node next : graph[now.end]) {
                if (!visited[next.end] && dist[next.end] > now.cost + next.cost) {
                    dist[next.end] = now.cost + next.cost;
                    pq.add(new Node(next.end, dist[next.end]));
                }
            }
        }
    }
}