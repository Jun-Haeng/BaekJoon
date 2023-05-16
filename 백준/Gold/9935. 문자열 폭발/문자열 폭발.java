import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String boom = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            sb.append(c);

            if (sb.length() >= boom.length()) {
                if (sb.substring(sb.length() - boom.length(),
                        sb.length()).equals(boom)) {
                    sb.replace(sb.length() - boom.length(),
                            sb.length(), "");
                }
            }
        }
        if (sb.toString().equals("")) System.out.println("FRULA");
        else System.out.println(sb.toString());

    }
}