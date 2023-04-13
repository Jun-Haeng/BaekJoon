import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int N;
    static String[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new String[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }
        /*
            적록색약이 아닌사람이 보았을때
         */

        visited = new boolean[N][N];

        int cnt1 = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(arr[i][j], i, j);
                    cnt1++;
                }
            }
        }

        System.out.print(cnt1 + " ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j].equals("R")) arr[i][j] = "G";
            }
        }

        visited = new boolean[N][N];

        int cnt2 = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(arr[i][j], i, j);
                    cnt2++;
                }
            }
        }

        System.out.print(cnt2);
    }

    static void bfs(String s, int a, int b) {
        q.add(new int[] {a, b});
        visited[a][b] = true;

        while (!q.isEmpty()) {
            int[] tmp = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (!s.equals(arr[nx][ny]) || visited[nx][ny]) continue;

                visited[nx][ny] = true;
                q.add(new int[] {nx, ny});
            }
        }
    }
}