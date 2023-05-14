import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int idx = 1;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");

            double a = Double.parseDouble(st.nextToken());
            if (a == 0) break;
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());

            double tmp = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));

            if (a * 2 >= tmp) {
                System.out.println("Pizza "+ idx + " fits on the table.");
            } else {
                System.out.println("Pizza "+ idx + " does not fit on the table.");
            }

            idx++;
        }
    }
}