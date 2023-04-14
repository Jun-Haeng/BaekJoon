import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int M, N, H;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int[][][] map;
    static boolean[][][] visited;
    static Queue<int[]> q = new LinkedList<>();
    static int cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][N][M];
        visited = new boolean[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < M; k++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());

                    if (map[i][j][k] == 1) {
                        q.add(new int[]{i, j, k});
                        visited[i][j][k] = true;
                    }
                }
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {

        while (!q.isEmpty()) {
            int[] tmp = q.poll();

            for (int i = 0; i < 6; i++) {
                int nx = tmp[1] + dx[i];
                int ny = tmp[2] + dy[i];
                int nz = tmp[0] + dz[i];

                if (nx < 0 || ny < 0 || nz < 0) continue;
                if (nx >= N || ny >= M || nz >= H) continue;
                if (visited[nz][nx][ny]) continue;
                if (map[nz][nx][ny] != 0) continue;

                map[nz][nx][ny] = map[tmp[0]][tmp[1]][tmp[2]] + 1;

                q.add(new int[] {nz, nx, ny});
                visited[nz][nx][ny] = true;

            }
        }

        int max = 0;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[i][j][k] == 0) return -1;
                    max = Math.max(max, map[i][j][k]);
                }
            }
        }

        return max - 1;
    }
}