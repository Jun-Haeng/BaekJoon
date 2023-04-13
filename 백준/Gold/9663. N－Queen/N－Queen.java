import java.util.Scanner;

public class Main {

    static int N;
    static int count = 0;
    static int[] arr;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        arr = new int[N];

        backTracking(0);
        System.out.println(count);
    }

    static void backTracking(int depth) {

        if (depth == N) {
            count++;
            return;
        }


        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (possibility(depth)) backTracking(depth + 1);
        }
    }

    static boolean possibility(int col) {

        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) return false;
            if (Math.abs(arr[col] - arr[i]) == Math.abs(col - i)) return false;
        }

        return true;
    }
}