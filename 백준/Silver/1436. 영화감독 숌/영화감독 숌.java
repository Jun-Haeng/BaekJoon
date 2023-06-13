import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        int res = 0;

        while (true) {
            if (cnt == N) break;

            res++;

            String tmp = String.valueOf(res);
            if (tmp.contains("666")) cnt++;
        }

        System.out.println(res);
    }
}