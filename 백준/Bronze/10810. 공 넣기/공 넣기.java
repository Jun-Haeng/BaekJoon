import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] basket = new int[N];

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            for (int j = a - 1; j <= b - 1; j++) {
                basket[j] = c;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            if (i == basket.length - 1) System.out.println(basket[i]);
            else System.out.print(basket[i] + " ");
        }
    }
}