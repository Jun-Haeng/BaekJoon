import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            String str1 = in.next();
            String str2 = in.next();

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            String newStr1 = new String(arr1);
            String newStr2 = new String(arr2);

            if (newStr1.equals(newStr2)) System.out.println("Possible");
            else System.out.println("Impossible");
        }

        in.close();
    }
}