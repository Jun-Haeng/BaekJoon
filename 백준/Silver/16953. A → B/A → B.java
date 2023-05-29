import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long max = -2;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        dfs(0, A, B);

        if (max == -1) System.out.println(-1);
        else System.out.println(max + 1);
    }

    public static void dfs(int cnt, long start, long target) {

        if (start > target) return;

        if (start == target) {

            max = Math.max(max, cnt);
            return;
        }

        dfs(cnt + 1, start * 2, target);
        dfs(cnt + 1, Long.parseLong(
                    start + "1"), target);

    }
}