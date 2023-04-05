import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Long N = in.nextLong();

        System.out.println(factorial(N));
    }

    private static Long factorial(Long n) {

        if (n < 2) return 1L;

        return factorial(n - 1) * n;
    }
}