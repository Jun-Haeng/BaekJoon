import java.util.Scanner;

public class Main {

    static int N, S;
    static int cnt = 0;
    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        S = in.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        backTracking(0, 0);
        if (S == 0) System.out.println(cnt - 1);
        else System.out.println(cnt);
    }

    static void backTracking(int depth, int sum) {
        if (depth == N) {
            if (sum == S) cnt++;
            return;
        }

        backTracking(depth + 1, sum + arr[depth]);
        backTracking(depth + 1, sum);
    }
}