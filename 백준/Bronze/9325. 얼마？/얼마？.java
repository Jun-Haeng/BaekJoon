import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {
            int s = in.nextInt();
            int n = in.nextInt();

            for (int i = 0; i < n; i++) {
                s += in.nextInt() * in.nextInt();
            }

            System.out.println(s);
        }
    }
}