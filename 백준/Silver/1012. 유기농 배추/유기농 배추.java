import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int T, N, M, K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                map[a][b] = 1;
            }

            int cnt = 0;

            for (int k = 0; k < M; k++) {
                for (int s = 0; s < N; s++) {
                    if (!visited[k][s] && map[k][s] == 1) {
                        bfs(k, s);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    private static void bfs(int x, int y) {
        visited[x][y] = true;

        queue.add(new int[] {x, y});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                    continue;
                }

                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[] {nx, ny});

                    visited[nx][ny] = true;
                }
            }
        }
    }
}