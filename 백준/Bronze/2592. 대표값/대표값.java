import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[1001];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int N = in.nextInt();
            arr[N]++;

            sum += N;
        }

        System.out.println(sum / 10);

        int max = 0;

        for (int i = 0; i < 1001; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < 1001; i++) {
            if (max == arr[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}