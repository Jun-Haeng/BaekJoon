import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(r, c, d);

        System.out.println(cnt);
    }

    static void solve(int r, int c, int d) {

        map[r][c] = -1;

        for (int i = 0; i < 4; i++) {
            d = (d + 3) % 4;
            int nx = r + dx[d];
            int ny = c + dy[d];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M
                && map[nx][ny] == 0) {
                cnt++;
                solve(nx, ny, d);

                return;
            }
        }

        int backUp = (d + 2) % 4;
        int nx = r + dx[backUp];
        int ny = c + dy[backUp];

        if (nx >= 0 && ny >= 0 && nx < N && ny < M
            && map[nx][ny] != 1) {
            solve(nx, ny, d);
        }

    }
}
