import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if (A == B && B == C) System.out.println(10000 + A * 1000);
        else if (A == B) System.out.println(1000 + A * 100);
        else if (B == C) System.out.println(1000 + B * 100);
        else if (A == C) System.out.println(1000 + C * 100);
        else {
            System.out.println(Math.max(Math.max(A, B), C) * 100);
        }

    }
}