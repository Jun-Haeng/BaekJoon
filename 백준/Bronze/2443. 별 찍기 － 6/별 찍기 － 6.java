import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String str = " ";

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int k = 2*(N-i-1); k >= 0; k--) System.out.print("*");

            System.out.println();
        }
    }
}