import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals("END")) break;

            String ans = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                ans += str.charAt(i);
            }

            System.out.println(ans);
        }
    }
}