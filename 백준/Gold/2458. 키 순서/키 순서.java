import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Main {

    static final int INF = 1000000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] dist = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                else dist[i][j] = INF;
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            dist[u][v] = 1;
        }

        for (int k = 1; k <= N; k++) {

            for (int i = 1; i <= N; i++) {
                if (k == i) continue;

                for (int j = 1; j <= N; j++) {
                    if (i == j || k == j) continue;
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (dist[i][j] != INF) dist[j][i] = dist[i][j];
                if (dist[j][i] != INF) dist[i][j] = dist[j][i];
            }
        }

        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            boolean flag = true;

            for (int j = 1; j <= N; j++) {
                if (dist[i][j] == INF) {
                    flag = false;
                    continue;
                }
            }

            if (flag) cnt++;
        }

        System.out.println(cnt);
    }
}