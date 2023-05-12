import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int idx = 1;
        while (T-- > 0) {
            String str = br.readLine();

            String ans = "";
            for (int i = 0; i < str.length(); i++) {
                int tmp = (str.charAt(i) + 1);

                if (tmp >= 'Z' + 1) tmp = 'A';

                ans += (char) tmp;
            }

            System.out.println("String #" + idx);
            System.out.println(ans);
            System.out.println();
            idx++;
        }
    }
}