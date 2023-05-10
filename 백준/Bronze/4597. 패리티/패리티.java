import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("#")) break;

            int cnt = 0;

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == '1') cnt++;
            }


            char c = str.charAt(str.length() - 1);

            if (c == 'e') {
                if (cnt % 2 == 0) {
                    str = str.substring(0, str.length() - 1) + "0";
                } else {
                    str = str.substring(0, str.length() - 1) + "1";
                }
            }

            else if (c == 'o') {
                if (cnt % 2 == 0) {
                    str = str.substring(0, str.length() - 1) + "1";
                } else {
                    str = str.substring(0, str.length() - 1) + "0";
                }
            }

            System.out.println(str);
        }
    }
}