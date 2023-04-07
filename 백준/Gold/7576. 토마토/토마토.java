import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
    이런식으로 시작점이 2개 이상인 경우에는 먼저 q에다가 시작점들을 넣어두고
    bfs를 돌리는 식으로 하면 되는거같음.. queue의 자료 구조에 대해 얼마나
    파악하고 있냐를 판단해주는 문제도 되는듯 하다.
 */

public class Main {

    static int n, m;
    static int[][] map;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    q.add(new int[] {i, j});
                }
            }
        }

        System.out.println(bfs());

    }

    private static int bfs() {

        while (!q.isEmpty()) {
            int[] tmp = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if (map[nx][ny] == 0) {
                    map[nx][ny] = map[tmp[0]][tmp[1]] + 1;
                    q.add(new int[] {nx, ny});
                }
            }
        }

        int max = Integer.MIN_VALUE;

        if (isZero()) return -1;
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    max = Math.max(max, map[i][j]);
                }
            }

            return max - 1;
        }
    }

    public static boolean isZero() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) return true;
            }
        }

        return false;
    }
}