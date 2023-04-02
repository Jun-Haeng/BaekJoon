import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = in.nextInt();
            arr2[i] = in.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int x = arr1[N-1] - arr1[0];
        int y = arr2[N-1] - arr2[0];

        System.out.println(x * y);
    }
}