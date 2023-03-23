import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int n = str.length() / 10;
        int m = str.length() % 10;

        int start = 0;

        while (true) {
            if (start == n) break;

            for (int i = start * 10; i < (start + 1) * 10; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println();

            start++;
        }

        if (m > 0) {
            for (int i = str.length() - m; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}