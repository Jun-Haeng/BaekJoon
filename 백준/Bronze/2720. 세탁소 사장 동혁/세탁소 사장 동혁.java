import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {

            int[] arr = new int[4];
            int cost = in.nextInt();

            while (true) {

                if (cost == 0) break;

                if (cost >= 25) {
                    arr[0] = cost / 25;
                    cost = cost % 25;
                }

                else if (cost >= 10) {
                    arr[1] = cost / 10;
                    cost = cost % 10;
                }

                else if (cost >= 5) {
                    arr[2] = cost / 5;
                    cost = cost % 5;
                }

                else {
                    arr[3] = cost / 1;
                    cost = 0;
                }
            }

            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}