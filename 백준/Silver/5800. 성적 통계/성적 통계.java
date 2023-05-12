import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int K = in.nextInt();

        int idx = 1;
        while (K-- > 0) {

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int gap = 0;

            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();

                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }

            Arrays.sort(arr);

            for (int i = 0; i < n; i++) {
                if (i != 0) gap = Math.max(gap, Math.abs(arr[i] - arr[i-1]));
            }

            System.out.println("Class " + idx);
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);

            idx++;
        }
    }
}