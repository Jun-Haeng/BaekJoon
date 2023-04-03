import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int[] arr = new int[3];

            arr[0] = a;
            arr[1] = b;
            arr[2] = c;

            Arrays.sort(arr);

            if (arr[2] >= arr[1] + arr[0]) System.out.println("Invalid");
            else if (a == b  && b == c) System.out.println("Equilateral");
            else if (a == b || b == c || c == a) System.out.println("Isosceles");
            else System.out.println("Scalene");
        }
    }
}