import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            String N = in.next();

            if (N.equals("0")) break;

            while (true) {
                if (N.length() == 1) {
                    System.out.println(N);
                    break;
                }

                int sum = 0;
                for (int i = 0; i < N.length(); i++) {
                    sum += (N.charAt(i) - '0');
                }

                N = String.valueOf(sum);
            }
        }
    }
}