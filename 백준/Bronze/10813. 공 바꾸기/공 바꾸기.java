import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            int tmp = arr[b];
            arr[b] = arr[a];
            arr[a] = tmp;
        }

        for (int i = 1; i < N + 1; i++) {
            if (i == N) System.out.println(arr[i]);
            else System.out.print(arr[i] + " ");
        }
    }
}