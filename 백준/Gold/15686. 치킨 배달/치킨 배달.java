import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M;
    static int[][] map;
    static List<int[]> homeArr = new ArrayList<>();
    static List<int[]> chickenArr = new ArrayList<>();
    static boolean[] open;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 1) homeArr.add(new int[]{i, j});
                else if (map[i][j] == 2) chickenArr.add(new int[]{i, j});
            }
        }

        open = new boolean[chickenArr.size()];
        dfs(0, 0);
        System.out.println(answer);
    }

    static void dfs(int start, int depth) {

        if (depth == M) {
            int sum = 0;

            for (int i = 0; i < homeArr.size(); i++) {
                int min = Integer.MAX_VALUE;

                for (int j = 0; j < chickenArr.size(); j++) {
                    if (open[j]) {
                        int d = Math.abs(homeArr.get(i)[0] - chickenArr.get(j)[0])
                                + Math.abs(homeArr.get(i)[1] - chickenArr.get(j)[1]);

                        min = Math.min(min, d);
                    }
                }

                sum += min;
            }

            answer = Math.min(answer, sum);
            return;
        }

        for (int i = start; i < chickenArr.size(); i++) {
            open[i] = true;
            dfs(i + 1, depth + 1);
            open[i] = false;
        }
    }
}