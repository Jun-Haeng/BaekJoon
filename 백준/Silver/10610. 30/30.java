import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char[] c = in.nextLine().toCharArray();
        Integer[] arr = new Integer[c.length];

        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < c.length; i++) {
            sum += c[i] - '0';
            arr[i] = Integer.parseInt(String.valueOf(c[i]));

            if (c[i] == '0') flag = true;
        }

        if (!flag || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (Integer integer : arr) {
            System.out.print(integer);
        }

    }
}