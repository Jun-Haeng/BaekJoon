import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            int a = in.nextInt();
            int b = in.nextInt();

            if (a == 0 && b == 0) break;

            if (a % b == 0) System.out.println("multiple");
            else if (b % a == 0) System.out.println("factor");
            else System.out.println("neither");

        }

        in.close();
    }
}