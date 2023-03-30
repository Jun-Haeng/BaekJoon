import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        String b = in.next();

        int sum = 0;
        int n = 1;

        for (int i = 2; i >= 0; i--) {
            int tmp = a * (b.charAt(i) - '0');
            sum += tmp * n;

            n *= 10;

            System.out.println(tmp);
        }

        System.out.println(sum);
    }
}