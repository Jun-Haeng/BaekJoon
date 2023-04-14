import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        in.close();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            arr1[i] = Math.abs(arr1[i] - arr2[i]);
        }

        int res = 0;

        for (int value : arr1) {
            res += value;
        }

        System.out.println(res);

    }
}