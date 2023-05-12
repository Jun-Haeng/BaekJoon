import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String str = br.readLine();
            if (str.equals("EOI")) break;

            String ans = "";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c >= 'A' && c <= 'Z') {
                    c = String.valueOf(c).toLowerCase().charAt(0);
                }

                ans += c;
            }

            if (ans.contains("nemo")) System.out.println("Found");
            else System.out.println("Missing");
        }
    }
}