import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        in.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * (N - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = N - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * (N - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}