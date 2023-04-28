import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int L, W;
    static char[][] map;
    static int[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> q;
    static int time = 0;
    static int ans = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        L = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        map = new char[L][W];
        visited = new int[L][W];

        for (int i = 0; i < L; i++) {
            String str = br.readLine();

            for (int j = 0; j < W; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < W; j++) {

                if (map[i][j] == 'L') {
                    bfs(i, j);
                }
            }
        }

        System.out.println(ans - 1);
    }

    public static void bfs(int i, int j) {
        visited = new int[L][W];
        q = new LinkedList<>();

        q.add(new int[] {i, j});
        visited[i][j] = 1;

        while (!q.isEmpty()) {
            int[] tmp = q.poll();

            for (int k = 0; k < 4; k++) {
                int cx = tmp[0] + dx[k];
                int cy = tmp[1] + dy[k];

                if (cx < 0 || cy < 0 || cx >= L || cy >= W) continue;
                if (map[cx][cy] == 'W' || visited[cx][cy] != 0) continue;

                visited[cx][cy] = visited[tmp[0]][tmp[1]] + 1;

                q.add(new int[] {cx, cy});
            }
        }

        for (int k = 0; k < L; k++) {
            for (int a = 0; a < W; a++) {
                time = Math.max(time, visited[k][a]);
            }
        }

        ans = Math.max(time, ans);
    }
}