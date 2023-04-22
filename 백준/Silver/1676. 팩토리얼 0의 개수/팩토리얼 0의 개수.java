import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] arr = new int[N+1][2];

        for (int i = 1; i <= N; i++) {
            int idx = i;
            int tmp = i;

            if (i % 2 == 0 || i % 5 == 0) {
                while (tmp % 2 == 0) {
                    tmp = tmp / 2;
                    arr[idx][0]++;
                }

                while (tmp % 5 == 0) {
                    tmp = tmp / 5;
                    arr[idx][1]++;
                }
            }
        }

        int two = 0;
        int five = 0;

        for (int[] ints : arr) {
            two += ints[0];
            five += ints[1];
        }

        System.out.println(Math.min(two, five));
    }
}