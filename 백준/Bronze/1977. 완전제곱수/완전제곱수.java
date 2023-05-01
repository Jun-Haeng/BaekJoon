import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();

        int sum = 0;
        int tmp = 0;
        boolean f = true;

        for (int i = M; i <= N; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                f = false;
                sum += i;
                if (tmp == 0) tmp = i;
            }
        }

        if (!f) {
            System.out.println(sum);
            System.out.println(tmp);
        } else {
            System.out.println(-1);
        }
    }
}