import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        boolean[] prime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {

            for (int j = i; j <= N; j += i) {
                if (!prime[j]) {
                    prime[j] = true;
                    K--;

                    if (K == 0) System.out.println(j);
                }
            }
        }
    }
}