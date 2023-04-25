import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        int[][] arr = new int[41][2];

        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            arr[i][0] = arr[i-1][0] + arr[i-2][0];
            arr[i][1] = arr[i-1][1] + arr[i-2][1];
        }

        while (T-- > 0) {

            int n = in.nextInt();
            System.out.println(arr[n][0] + " " +arr[n][1]);
        }
    }
}