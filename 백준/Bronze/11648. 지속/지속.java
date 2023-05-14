import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String N = in.next();

        int cnt = 0;

        while (true) {

            if (N.length() == 1) {
                System.out.println(cnt);
                break;
            }

            cnt++;
            int tmp = 1;

            for (int i = 0; i < N.length(); i++) {
                tmp *= (N.charAt(i) - '0');
            }

            N = String.valueOf(tmp);
        }
    }
}