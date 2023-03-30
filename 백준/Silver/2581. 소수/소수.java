import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] prime = new int[M + 1];

        for (int i = 2; i <= M; i++) {
            prime[i] = i;
        }

        for (int i = 2; i * i < M; i++) {

            for (int j = i + i; j <= M; j += i) {
                if (prime[j] == 0) continue;

                prime[j] = 0;
            }
        }

        int sum = 0;

        for (int i = N; i <= M; i++) {
            sum += prime[i];
        }

        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);

            for (int i = N; i<= M; i++) {
                if (prime[i] != 0) {
                    System.out.println(prime[i]);
                    break;
                }
            }
        }

        in.close();
    }
}