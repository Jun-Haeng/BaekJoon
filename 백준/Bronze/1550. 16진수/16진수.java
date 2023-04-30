import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int sum = 0;
        int idx = 0;

        for (int i = str.length() - 1; i >= 0; i--) {

            char c = str.charAt(i);
            int tmp = 0;

            if (c - 'A' >= 0) tmp = tmp + 10 + c - 'A';
            else tmp = c - '0';

            sum += Math.pow(16, idx) * tmp;
            idx++;
        }

        System.out.println(sum);

    }
}