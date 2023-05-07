import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int L = in.nextInt();
        int P = in.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.print((in.nextInt() - L * P) + " ");
        }
    }
}