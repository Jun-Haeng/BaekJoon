import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int R, C;
    static char[][] map;
    static boolean[][] v;
    static boolean[] arr = new boolean[26];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int max = 0;
    static Deque<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        v = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String tmp = br.readLine();

            for (int j = 0; j < C; j++) {
                map[i][j] = tmp.charAt(j);
            }
        }

        backTracking(0, 0, 1);

        System.out.println(max);
    }

    static void backTracking(int x, int y, int depth) {

        q.add(new int[] {x, y});
        v[x][y] = true;
        int pos = map[x][y] - 'A';
        arr[pos] = true;

        while (!q.isEmpty()) {

            int[] tmp = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                if (v[nx][ny]) continue;
                pos = map[nx][ny] - 'A';
                if (arr[pos]) continue;

                backTracking(nx, ny, depth + 1);

                q.pollLast();
                v[nx][ny] = false;
                arr[pos] = false;
            }
        }

        max = Math.max(depth, max);
    }
}