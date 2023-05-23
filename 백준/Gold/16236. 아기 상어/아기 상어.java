import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int size = 2;
    static int[][] map;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int cnt = 0;
    static int grow = 2;
    static int a, b;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        int sharkX = 0;
        int sharkY = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 9) {
                    sharkX = i;
                    sharkY = j;
                    map[i][j] = 0;
                }
            }
        }

        a = sharkX;
        b = sharkY;

        while (true) {

            int[] tmp = BFS(a, b);
            if (tmp[0] == -1 && tmp[1] == -1) break;

            a = tmp[0];
            b = tmp[1];
        }

        System.out.println(cnt);
    }

    static int[] BFS(int a, int b) {

        q.add(new int[] {a, b});

        int[][] distance = new int[N][N];
        boolean[][] visited = new boolean[N][N];

        visited[a][b] = true;
        int x = -1;
        int y = -1;
        int min = Integer.MAX_VALUE;

        while (!q.isEmpty()) {

            int[] tmp = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (!isAbleToMove(nx, ny)) continue;
                if (visited[nx][ny]) continue;

                distance[nx][ny] = distance[tmp[0]][tmp[1]] + 1;
                q.add(new int[] {nx, ny});
                visited[nx][ny] = true;
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                if (isAbleToEat(i, j) && distance[i][j] != 0 &&
                        distance[i][j] <= min) {
                    x = i;
                    y = j;
                    min = distance[i][j];
                }
            }
        }

        if (x == -1 && y == -1) {
            return new int[] {x, y};
        }

        map[x][y] = 0;
        grow--;

        if (grow == 0) {
            size++;
            grow = size;
        }

        cnt += distance[x][y];

        return new int[] {x, y};
    }

    static boolean isAbleToMove(int x, int y) {
        return map[x][y] <= size;
    }

    static boolean isAbleToEat(int x, int y) {
        return map[x][y] != 0 && map[x][y] < size;
    }
}