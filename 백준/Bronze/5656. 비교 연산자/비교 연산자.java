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

            int a = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            int b = Integer.parseInt(st.nextToken());

            if (str.equals("E")) break;

            boolean flag = true;
            if (str.equals(">=")) flag = a >= b;
            else if (str.equals(">")) flag = a > b;
            else if (str.equals("<")) flag = a < b;
            else if (str.equals("<=")) flag = a <= b;
            else if (str.equals("==")) flag = a == b;
            else if (str.equals("!=")) flag = a != b;

            System.out.println("Case " + idx + ": " + flag);

            idx++;
        }
    }
}