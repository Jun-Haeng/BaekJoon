import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int ans = 0;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= arr[i+1]) {
                int tmp = arr[i] - arr[i+1] +1;

                ans += tmp;
                arr[i] = arr[i] - tmp;
            }
        }

        System.out.println(ans);
    }
}