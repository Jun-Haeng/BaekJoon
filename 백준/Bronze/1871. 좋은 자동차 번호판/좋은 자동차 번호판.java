import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine(), "-");

            String str = st.nextToken();
            int number = Integer.parseInt(st.nextToken());

            int tmp = 0;
            int idx = 2;

            for (int i = 0; i < 3; i++) {

                tmp += Math.pow(26, idx) * (str.charAt(i) - 'A');
                idx--;
            }

            if (Math.abs(tmp - number) <= 100) System.out.println("nice");
            else System.out.println("not nice");
        }
    }
}