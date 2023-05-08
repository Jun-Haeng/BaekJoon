import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            if (i == 0) sum1 += tmp * 3600;
            else if (i == 1) sum1 += tmp * 60;
            else sum1 += tmp;
        }

        int sum2 = 0;
        st = new StringTokenizer(br.readLine(), ":");

        for (int i = 0; i < 3; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            if (i == 0) sum2 += tmp * 3600;
            else if (i == 1) sum2 += tmp * 60;
            else sum2 += tmp;
        }

        int tmp = sum1 - sum2;

        if (tmp < 0) {

            tmp = tmp * -1;

            int a = tmp / 3600;
            tmp = tmp % 3600;

            int b = tmp / 60;
            tmp = tmp % 60;

            solve(a, b, tmp);


        } else {
            tmp = 24 * 3600 - tmp;

            int a = tmp / 3600;
            tmp = tmp % 3600;

            int b = tmp / 60;
            tmp = tmp % 60;

            solve(a, b, tmp);

        }
    }

    static void solve(int a, int b, int c) {
        if (a < 10) System.out.print(0);
        System.out.print(a + ":");
        if (b < 10) System.out.print(0);
        System.out.print(b + ":");
        if (c < 10) System.out.print(0);
        System.out.print(c);
    }
}