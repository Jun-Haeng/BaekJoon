import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int idx = 0;

        boolean flag = true;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) idx++;

            if (idx == K) {
                System.out.println(i);
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("0");
    }
}