import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {
            String a = in.next();
            String b = in.next();

            int cnt = 0;

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) cnt++;
            }

            System.out.println("Hamming distance is " + cnt + ".");
        }
    }
}