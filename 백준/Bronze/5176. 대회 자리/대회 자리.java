import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {
            int P = in.nextInt();
            int M = in.nextInt();

            int cnt = 0;

            int[] arr = new int[M+1];

            for (int i = 0; i < P; i++) {
                int tmp = in.nextInt();
                if (arr[tmp] == 1) cnt++;
                else arr[tmp] = 1;
            }

            System.out.println(cnt);
        }
    }
}