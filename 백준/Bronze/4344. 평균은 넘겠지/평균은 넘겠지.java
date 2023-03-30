import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int C = in.nextInt();

        double[] arr;

        for (int i = 0; i < C; i++) {

            int n = in.nextInt();

            arr = new double[n];

            double sum = 0;

            for (int j = 0; j < n; j++) {
                int tmp = in.nextInt();

                arr[j] = tmp;
                sum += tmp;
            }

            sum = sum / n;

            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] > sum) cnt++;
            }

            System.out.printf("%.3f", (double) cnt / n * 100);
            System.out.print("%");
            System.out.println();
        }
    }
}