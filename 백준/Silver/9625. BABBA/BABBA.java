import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int K = in.nextInt();

        int[] a = new int[46];
        int[] b = new int[46];

        a[0] = 1;
        b[0] = 0;
        a[1] = 0;
        b[1] = 1;
        a[2] = 1;
        b[2] = 1;

        for (int i = 3; i <= 45; i++) {
            a[i] = a[i-1] + a[i-2];
            b[i] = b[i-1] + b[i-2];
        }

        System.out.println(a[K] + " " + b[K]);

    }
}