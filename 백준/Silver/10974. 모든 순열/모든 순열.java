import java.util.Scanner;

public class Main {

    static int[] arr;
    static boolean[] visited;
    static int N;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        sb = new StringBuilder();

        N = in.nextInt();

        arr = new int[N];
        visited = new boolean[N];

        dfs(0);

        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == N) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}