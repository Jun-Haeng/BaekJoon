import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static boolean[][] visited;
    static int[][] map;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    arr.add(bfs(i, j));
                    cnt++;
                }
            }
        }

        Collections.sort(arr);

        System.out.println(cnt);
        for (Integer x : arr) {
            System.out.println(x);
        }

    }

    public static int bfs(int x, int y) {
        q.add(new int[] {x, y});

        visited[x][y] = true;

        int apartment = 1;

        while (!q.isEmpty()) {
            int[] tmp = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if (visited[nx][ny] || map[nx][ny] == 0) continue;

                visited[nx][ny] = true;
                q.add(new int[] {nx, ny});
                apartment++;
            }
        }

        return apartment;
    }
}