import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while ((str = br.readLine()) != null) {

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;

            for (int i = 0; i < str.length(); i++) {
                char num = str.charAt(i);

                if (num >= 97 && num <= 122) a++;
                else if (num >= 65 && num <= 90) b++;
                else if (num == ' ') c++;
                else d++;
            }

            System.out.print(a + " " + b + " " + d + " " + c);
            System.out.println();
        }
    }
}