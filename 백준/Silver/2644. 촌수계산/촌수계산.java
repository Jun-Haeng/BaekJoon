import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int start, target;
    static boolean[] visited;
    static int[][] arr;
    static boolean flag;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        start = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        flag = false;
        dfs(start, 0);
        if (!flag) System.out.println(-1);
    }

    private static void dfs(int start, int depth) {

        if (start == target) {
            flag = true;
            System.out.println(depth);
            return;
        }

        visited[start] = true;

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && arr[start][i] == 1) {

                dfs(i, depth + 1);
                visited[i] = true;
            }
        }
    }
}