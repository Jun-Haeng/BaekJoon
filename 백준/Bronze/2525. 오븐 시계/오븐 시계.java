import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int HC = C / 60;
        int MC = C % 60;

        A += HC;
        B += MC;

        if (B >= 60) {
            B -= 60;
            A += 1;
        }

        if (A >= 24) A -= 24;

        System.out.println(A + " " + B);
    }
}