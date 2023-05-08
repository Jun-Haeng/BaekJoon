import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            int pos = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            String ans = "";

            for (int i = 0; i < str.length(); i++) {
                if (i == pos - 1) continue;

                ans += str.charAt(i);
            }

            System.out.println(ans);
        }
    }
}