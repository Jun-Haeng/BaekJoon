import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A;
    static boolean[] visited;
    static StringTokenizer st;
    static int[] numArr;
    static int[] arr;
    static int size;
    static int idx;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        A = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        size = 1;

        for (int i = 1; i <= N; i++) {
            size *= i;
        }

        numArr = new int[N];
        arr = new int[size];
        idx = 0;

        dfs(0);

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        System.out.println(max);
    }
    private static void dfs(int depth) {
        if (depth == N) {
            for (int i = 0; i < numArr.length - 1; i++) {
                arr[idx] += Math.abs(numArr[i] - numArr[i+1]);
            }

            idx++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                numArr[depth] = A[i];
                dfs(depth + 1);
                visited[i] = false;
             }
        }
    }
}