import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cnt = 0;

        int[] arr = new int[101];

        for (int i = 0; i < N; i++) {
            int p = in.nextInt();

            if (arr[p] == 1) cnt++;
            else arr[p] = 1;
        }

        System.out.println(cnt);
    }
}