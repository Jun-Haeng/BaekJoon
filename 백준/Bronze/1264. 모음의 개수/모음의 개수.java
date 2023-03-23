import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int cnt;

        char[] c = new char[] {'a', 'e', 'i', 'o', 'u'};

        while (true) {

            str = br.readLine().toLowerCase(Locale.ROOT);
            if (str.equals("#")) break;

            cnt = 0;

            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < c.length; j++) {
                    if (c[j] == str.charAt(i)) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}