import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] arr;
    static int[] operator;

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        operator = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int num, int depth) {

        if (depth == N) {

            max = Math.max(num, max);
            min = Math.min(num, min);

            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] >= 1) {

                operator[i]--;

                switch (i) {
                    case 0 : dfs(num + arr[depth], depth + 1); break;
                    case 1 : dfs(num - arr[depth], depth + 1); break;
                    case 2 : dfs(num * arr[depth], depth + 1); break;
                    case 3 : dfs(num / arr[depth], depth + 1); break;
                }

                operator[i]++;
            }
        }
    }
}