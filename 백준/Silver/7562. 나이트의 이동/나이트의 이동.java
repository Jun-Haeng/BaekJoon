
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {-2,-1,1,2,2,1,-1,-2};
    static int[] dy = {1,2,2,1,-1,-2,-2,-1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int l = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int[][] map = new int[l][l];

            if (a == c && b == d) {
                System.out.println(0);
                continue;
            }

            BFS(map, a, b, c, d);
        }
    }

    public static void BFS(int[][] map, int a, int b, int c, int d) {

        int cnt = 0;
        int l = map.length;
        boolean[][] visited = new boolean[l][l];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {a, b});
        visited[a][b] = true;

        while (!q.isEmpty()) {

            int[] tmp = q.poll();

            if (tmp[0] == c && tmp[1] == d) {
                System.out.println(map[tmp[0]][tmp[1]]);
                break;
            }

            for (int i = 0; i < 8; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= l || ny >= l) continue;
                if (visited[nx][ny]) continue;

                visited[nx][ny] = true;
                q.add(new int[] {nx, ny});
                map[nx][ny] = map[tmp[0]][tmp[1]] + 1;

            }
        }
    }
}