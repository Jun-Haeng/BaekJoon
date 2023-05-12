import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        int idx = 1;
        while (T-- > 0) {
            int[] arr = new int[3];

            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            arr[2] = in.nextInt();

            Arrays.sort(arr);

            int a = arr[0];
            int b = arr[1];
            int c = arr[2];
            String ans = "";

            if (arr[2] >= arr[1] + arr[0]) ans = "invalid!";
            else {
                if (a == b && b == c) ans = "equilateral";
                else if (a == b || b == c || c == b) ans = "isosceles";
                else ans = "scalene";
            }

            System.out.println("Case #" + idx + ": " + ans);
            idx++;
        }
    }
}