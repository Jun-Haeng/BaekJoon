import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            char[] ch = br.readLine().toCharArray();
            int x;

            String ans = "";

            for (int i = 0; i < ch.length; i++) {
                x = ch[i] - 'A';
                ch[i] = (char)(((a * x + b) % 26) + 'A');
            }

            System.out.println(new String(ch));
        }
    }
}