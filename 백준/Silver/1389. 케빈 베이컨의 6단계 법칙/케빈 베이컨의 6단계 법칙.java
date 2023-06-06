import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] dist;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dist = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                dist[i][j] = 100000;
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            dist[u][v] = dist[v][u] = 1;
        }
        
        for (int k = 1; k <= N; k++) {

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        int[] ans = new int[N+1];
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {

            int sum = 0;
            for (int j = 1; j <= N; j++) {
                sum += dist[i][j];
            }

            min = Math.min(sum, min);
            ans[i] = sum;
        }
        
        for (int i = 1; i <= N; i++) {
            if (min == ans[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}