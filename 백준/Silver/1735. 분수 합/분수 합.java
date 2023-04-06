import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        int res = B * D / gcd(B, D);

        int num1 = res / B;
        int num2 = res / D;

        int newNum1 = A * num1 + C * num2;
        
        int r = gcd(newNum1, res);

        if (r != 1) {
            newNum1 = newNum1 / r;
            res = res / r;
        }

        System.out.print(newNum1 + " ");
        System.out.print(res);
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}