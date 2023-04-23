import java.util.Scanner;

public class Main {

    static boolean[] isPrime = new boolean[1000001];
    static StringBuilder sb = new StringBuilder();
    static int T, N;
    static int left, right, count;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        T = in.nextInt();

        getPrime();

        while (T-- > 0) {
            N = in.nextInt();

            left = right = N / 2;
            count = 0;

            while (true) {

                if (left <= 0) break;

                if (!isPrime[left] && !isPrime[right]) {
                    count++;
                }

                left--;
                right++;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    static void getPrime() {

        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(1000000); i++) {

            if (isPrime[i]) continue;
            for (int j = i * i; j <= 1000000; j += i) {
                isPrime[j] = true;
            }
        }
    }
}