import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final int M = 1003003;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[M + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(M); i++) {

            if (!prime[i]) {
                for (int j = i * i; j <= M; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = N; i <= M; i++) {
            if (!prime[i] && palindrome(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    // 0 1 2 3 4
    // 0 1 2 3

    public static boolean palindrome(int num) {

        String tmp = String.valueOf(num);
        int l = tmp.length();

        for (int i = 0; i < l/2; i++) {
            if (tmp.charAt(i) != tmp.charAt(l - i - 1)) return false;
        }

        return true;
    }
}