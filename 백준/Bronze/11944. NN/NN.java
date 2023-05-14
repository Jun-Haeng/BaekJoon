import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        int M = Integer.parseInt(st.nextToken());

        int length = Integer.parseInt(N);

        String ans = "";

        for (int i = 0; i < length; i++) {
            ans += N;
        }
        
        if (ans.length() >= M) {
            System.out.println(ans.substring(0, M));
        } else {
            System.out.println(ans);
        }


    }
}