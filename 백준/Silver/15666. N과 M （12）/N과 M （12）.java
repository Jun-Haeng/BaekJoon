import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static boolean[] visited;
    static int[] arr;
    static int[] graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];
        arr = new int[n];
        graph = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0, 0);
        System.out.println(sb);

    }

    public static void dfs(int at, int depth) {

        if (depth == m) {
            for (int value : graph) {
                sb.append(value).append(" ");
            }
            sb.append('\n');
            return;
        }

        int before = 0;
        for (int i = at; i < n; i++) {

            if (arr[i] == before) continue;

            graph[depth] = arr[i];
            dfs(i, depth + 1);
            before = arr[i];
        }
    }
}