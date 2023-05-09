import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int pos = 1;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == 'A') {
                if (pos == 1) pos = 2;
                else if (pos == 2) pos = 1;
            }

            else if (c == 'B') {
                if (pos == 2) pos = 3;
                else if (pos == 3) pos = 2;
            }

            else {
                if (pos == 1) pos = 3;
                else if (pos == 3) pos = 1;
            }

        }

        System.out.println(pos);

    }
}