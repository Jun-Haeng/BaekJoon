import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        A += D / 3600;
        D = D % 3600;

        B += D / 60;
        D = D % 60;

        C += D;

        if (C >= 60) {
            B += C / 60;
            C = C % 60;
        }

        if (B >= 60) {
            A += B / 60;
            B = B % 60;
        }

        if (A >= 24) {
            A = A % 24;
        }

        System.out.print(A + " " + B + " " + C);
    }
}