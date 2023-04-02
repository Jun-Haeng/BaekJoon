import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int res = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == 'A' || c == 'B' || c == 'C') {
                res += 3;
            }

            else if (c == 'D' || c == 'E' || c == 'F') {
                res += 4;
            }

            else if (c == 'G' || c == 'H' || c == 'I') {
                res += 5;
            }

            else if (c == 'J' || c == 'K' || c == 'L') {
                res += 6;
            }

            else if (c == 'M' || c == 'N' || c == 'O') {
                res += 7;
            }

            else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                res += 8;
            }

            else if (c == 'T' || c == 'U' || c == 'V') {
                res += 9;
            }

            else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
                res += 10;
            }
        }

        System.out.println(res);
    }
}