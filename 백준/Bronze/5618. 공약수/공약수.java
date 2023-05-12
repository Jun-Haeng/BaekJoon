import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            min = Math.min(min, arr[i]);
        }

        for (int i = 1; i <= min; i++) {
            boolean flag = true;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) System.out.println(i);
         }
    }
}