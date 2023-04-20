import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());

            long[] arr = new long[N];

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long res = 0;

            for (int j = 0; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    res += gcd(arr[j], arr[k]);
                }
            }

            System.out.println(res);
        }
    }

    public static long gcd(long a, long b) {

        while (b > 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}