import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        boolean[] prime = new boolean[100002];

        for (int i = 2; i <= Math.sqrt(100001); i++) {
            for (int j = i*i; j <= 100001; j += i) {
                if (!prime[j]) prime[j] = true;
            }
        }

        for (int t = 0; t < T; t++) {
            StringBuilder sb = new StringBuilder();
            int n = in.nextInt();

            int mid = n / 2;
            int l = mid;
            int r = mid;

            while (true) {

                if (!prime[l] && !prime[r] && (l + r) == n) {
                    sb.append(l).append(" ").append(r);
                    break;
                }

                l--;

                if (!prime[l] && !prime[r] && (l + r) == n) {
                    sb.append(l).append(" ").append(r);
                    break;
                }

                r++;

            }

            System.out.println(sb);
        }

    }
}