import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] arr = new int[N][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int[] maxNum = new int[N];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            max = Integer.MIN_VALUE;

            for (int j = 0; j < 3; j++) {
                for (int k = j+1; k < 4; k++) {
                    for (int h = k+1; h < 5; h++) {
                        int sum = (arr[i][j] + arr[i][k] + arr[i][h]) % 10;
                        max = Math.max(max, sum);
                    }
                }
            }

            maxNum[i] = max;
        }

        int max2 = 0;

        for (int i : maxNum) {
            max2 = Math.max(max2, i);
        }

        for (int i = N - 1; i >= 0; i--) {
            if (max2 == maxNum[i]) {
                System.out.println(i + 1);
                break;
            }
        }

    }
}