import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int idx = 1;

        while (N-- > 0) {

            int[] arr = new int[26];
            String str = br.readLine().toLowerCase(Locale.ROOT);

            for (int i = 0; i < str.length(); i++) {
                int tmp = str.charAt(i) - 'a';

                if (tmp >= 0 && tmp < 26) {
                    arr[tmp]++;
                }
            }
            int min = Integer.MAX_VALUE;

            for (int i = arr.length - 1; i >= 0; i--) {
                min = Math.min(min, arr[i]);
            }

            String ans = "";
            if (min == 0) {ans = "Not a pangram";}
            else if (min == 1) {ans = "Pangram!";}
            else if (min == 2) {ans = "Double pangram!!";}
            else {ans = "Triple pangram!!!";}

            System.out.println("Case " + idx + ": " + ans);
            idx++;

        }
    }
}