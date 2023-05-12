import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine();

            int mid = str.length();

            boolean flag = true;

            char[] arr = new char[str.length()];

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c >= 65 && c <= 90) {
                    String s = String.valueOf(c).toLowerCase(Locale.ROOT);
                    arr[i] = s.charAt(0);
                }
                else {
                    arr[i] = c;
                }
            }

            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    flag = false;
                    break;
                }
            }

            if (flag) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}