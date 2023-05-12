import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tmp = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();

        if (tmp % 2 != 0) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(i)) {
                    System.out.println("Deletion failed");
                    return;
                }
            }
            System.out.println("Deletion succeeded");

        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    System.out.println("Deletion failed");
                    return;
                }
            }
            System.out.println("Deletion succeeded");

        }
    }
}