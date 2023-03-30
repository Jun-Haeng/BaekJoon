import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();

            if (isPrime(a)) cnt++;
        }

        System.out.println(cnt);
    }

    public static boolean isPrime(int num) {

        if (num == 1) return false;
        if (num == 2 || num == 3) return true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}