import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int A = Math.min(Math.min(a, b), c);
        int B = Math.min(d, e);

        System.out.println(A + B - 50);
    }
}