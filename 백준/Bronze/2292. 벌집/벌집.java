import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int p = 1;
        int step = 6;
        int ans = 1;

        while (true) {
            if (p >= N) break;
            p += step * ans;
            ans++;
        }

        System.out.println(ans);
    }
}