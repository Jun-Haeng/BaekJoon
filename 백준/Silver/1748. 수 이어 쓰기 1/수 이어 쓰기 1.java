import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int plus = 1;
        int a = 10;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            if (i % a == 0) {
                plus++;
                a = a * 10;
            }
            
            cnt += plus;
        }

        System.out.println(cnt);
    }
}