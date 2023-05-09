import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = 3;
        while (T-- > 0) {

            String str = in.nextLine();

            char c = str.charAt(0);
            int cnt = 1;
            int max = 1;

            for (int i = 1; i < 8; i++) {
                char n = str.charAt(i);

                if (n == c) cnt++;
                else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                    c = n;
                }

                max = Math.max(max, cnt);
            }

            System.out.println(max);
        }
    }
}