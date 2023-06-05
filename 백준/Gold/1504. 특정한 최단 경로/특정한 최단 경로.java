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

        public Node (int end, int cost){
            this.end = end;
            this.cost = cost;
        }
    }

    static ArrayList<Node>[] graph;
    static boolean[] visited;
    static int[] dist;
    static int N, E;
    static final int INF = 200000000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        dist = new int[N+1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph[u].add(new Node(v, w));
            graph[v].add(new Node(u, w));
        }

        st = new StringTokenizer(br.readLine(), " ");
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        // 1 -> v1
        // 1 -> v2
        // v1 -> v2
        // v2 -> v1
        // v2 -> N
        // v1 -> N

        int path1 = solve(1, v1);
        int path2 = solve(1, v2);

        int path3 = solve(v1, v2);

        int path4 = solve(v2, N);
        int path5 = solve(v1, N);

        int a = path1 + path3 + path4;
        int b = path2 + path3 + path5;

        if (a >= INF && b >= INF) System.out.println(-1);
        else System.out.println(Math.min(a, b));

    }

    // 1에서 v1, v2로 가는거 구해보고
    // v1에서 n, v2에서 N 가는거 구해서
    // 최소값하면되지않을까?

    // 양방향으로 만들어야하고
    // 1 -> 2 -> 3 -> 1 -> 4 가
    // 1 -> 2 -> 3 -> 4 보다 cost가 적을수있음
    // 그래서 visited가 없는거로 구현해야함

    public static int solve(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        pq.add(new Node(start, 0));

        for (int i = 1; i <= N; i++) {
            dist[i] = INF;
        }

        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node now = pq.remove();

            for (Node next : graph[now.end]) {

                if (dist[next.end] > now.cost + next.cost) {
                    dist[next.end] = now.cost + next.cost;
                    pq.add(new Node(next.end, dist[next.end]));
                }
            }
        }

        return dist[end];
    }
}