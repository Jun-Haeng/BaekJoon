import java.util.*;

public class Main {

    static int N;
    static int[] arr;
    static int[] visited;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        arr = new int[N];

        int M = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            M += arr[i];
        }

        visited = new int[M+1];

        backTracking(0, 0);

        boolean f = true;

        for (int i = 1; i <= M; i++) {
            if (visited[i] == 0) {
                System.out.println(i);
                f = false;
                break;
            }
        }


        if (f) System.out.println(M+1);

    }

    static void backTracking(int depth, int sum) {
        if (depth == N) {
            visited[sum] = 1;
            return;
        }

        backTracking(depth + 1, sum + arr[depth]);
        backTracking(depth + 1, sum);
    }
}