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
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = "";

            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();

                if (tmp.length() == 1) str += tmp + " ";
                else {
                    for (int j = tmp.length() - 1; j >= 0; j--) {
                        str += tmp.charAt(j);
                    }
                    str += " ";
                }
            }

            System.out.println(str);

        }

    }
}