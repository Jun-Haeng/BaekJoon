import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int P = in.nextInt();

        if (P >= C) {
            B += (P - C) * D;
        }

        System.out.println(Math.min(A * P, B));
    }
}