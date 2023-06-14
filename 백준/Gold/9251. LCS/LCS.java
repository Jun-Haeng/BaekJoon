import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();

        int l = A.length();
        int r = B.length();

        int[][] dp = new int[l][r];

        for (int i = 0; i < r; i++) {
            if (A.charAt(0) == B.charAt(i)) {

                for (int j = i; j < r; j++) {
                    dp[0][j] = 1;
                }
                break;
            }
        }

        for (int i = 0; i < l; i++) {
            if (B.charAt(0) == A.charAt(i)) {

                for (int j = i; j < l; j++) {
                    dp[j][0] = 1;
                }
                break;
            }
        }

        for (int i = 1; i < l; i++) {
            for (int j = 1; j < r; j++) {

                if (A.charAt(i) == B.charAt(j)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1],
                            Math.max(dp[i-1][j], dp[i][j-1]));
                }
            }
        }

//        for (int[] ints : dp) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        System.out.println(dp[l-1][r-1]);
    }
}