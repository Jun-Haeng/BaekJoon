import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            cnt = 1;
            String str = br.readLine();

            System.out.print(isPalindrome(str) + " " + cnt);
            System.out.println();
        }
    }

    static int recursion(String str, int l, int r) {
        if (l >= r) return 1;
        else if (str.charAt(l) != str.charAt(r)) return 0;
        else {
            cnt++;
            return recursion(str, l+1, r-1);
        }
    }

    static int isPalindrome(String str) {
        return recursion(str, 0, str.length() - 1);
    }
}