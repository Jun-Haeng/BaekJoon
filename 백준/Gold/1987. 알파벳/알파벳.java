import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int R, C;
    static int[][] map;
    static boolean[] visited = new boolean[26];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int ans = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];

        for (int i = 0; i < R; i++) {
            String tmp = br.readLine();

            for (int j = 0; j < C; j++) {
                map[i][j] = tmp.charAt(j) - 'A';
            }
        }
        
        backTracking(0, 0, 0);

        System.out.println(ans);
    }

    static void backTracking(int x, int y, int depth) {
        if (visited[map[x][y]]) {
            ans = Math.max(ans, depth);
            return;
        }

        visited[map[x][y]] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
            backTracking(nx, ny, depth + 1);
        }

        visited[map[x][y]] = false;
    }
}