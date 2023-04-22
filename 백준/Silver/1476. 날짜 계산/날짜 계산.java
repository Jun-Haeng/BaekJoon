import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int E = in.nextInt();
        int S = in.nextInt();
        int M = in.nextInt();

        int a = 1;
        int b = 1;
        int c = 1;
        int cnt = 1;

        while (true) {

            if (a == E && b == S && c == M) {
                System.out.println(cnt);
                break;
            }

            a++;
            b++;
            c++;
            cnt++;

            if (a > 15) a = 1;
            if (b > 28) b = 1;
            if (c > 19) c = 1;
        }
    }
}