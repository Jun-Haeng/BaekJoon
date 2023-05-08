import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static char[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            String temp = br.readLine();

            String strArr = br.readLine();

            arr = new char[26];

            for (int i = 0; i < 26; i++) {
                arr[i] = strArr.charAt(i);
            }

            System.out.println(solve(temp));
        }
    }

    static String solve(String str) {

        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            if (String.valueOf(str.charAt(i)).equals(" ")) ans += " ";
            else ans += arr[str.charAt(i) - 'A'];
        }

        return ans;
    }
}