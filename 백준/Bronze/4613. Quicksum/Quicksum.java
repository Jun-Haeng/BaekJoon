import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String str = br.readLine();

            if (str.equals("#")) break;

            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') continue;
                sum = sum + (i + 1) * (str.charAt(i) - 'A' + 1);
            }

            System.out.println(sum);
        }
    }
}