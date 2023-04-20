import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {

            int n = in.nextInt();
            boolean[] arr = new boolean[n+1];

            for (int j = 1; j <= n + 1; j++) {

                int idx = 1;
                while (true) {
                    int pos = j * idx;

                    if (pos >= n + 1) break;

                    if (!arr[pos]) arr[pos] = true;
                    else arr[pos] = false;

                    idx++;
                }
            }

            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j]) cnt++;
            }

            System.out.println(cnt);
        }
    }
}