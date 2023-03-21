import java.util.Scanner;

public class Main {

    static int N, M;
    static int[][] graph;
    static boolean[] visit;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new int[N+1][N+1];
        visit = new boolean[N+1];

        for (int i = 1; i <= M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(1);
        System.out.println(cnt);
        sc.close();
    }

    private static void dfs(int start) {
        visit[start] = true;

        for (int i = 1; i <= N; i++) {
            if (visit[i] == false && graph[start][i] == 1) {
                dfs(i);
                cnt++;
            }
        }
    }
}