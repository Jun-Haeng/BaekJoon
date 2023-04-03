import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[3];

        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        arr[2] = in.nextInt();

        Arrays.sort(arr);

        if (arr[2] < arr[1] + arr[0]) System.out.println(arr[0] + arr[1] + arr[2]);
        else System.out.println((arr[1] + arr[0]) * 2 - 1);
    }
}