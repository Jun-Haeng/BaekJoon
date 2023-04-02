import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < 3; i++) {
            arr1[i] = in.nextInt();
            arr2[i] = in.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int x = 0;
        int y = 0;

        if (arr1[0] != arr1[1]) x = arr1[0];
        else if (arr1[1] != arr1[2]) x = arr1[2];

        if (arr2[0] != arr2[1]) y = arr2[0];
        else if (arr2[1] != arr2[2]) y = arr2[2];

        System.out.println(x + " " + y);
    }
}