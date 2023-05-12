import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {
            String str = in.next();

            int mid = str.length() / 2;

            if (str.charAt(mid) == str.charAt(mid - 1)) {
                System.out.println("Do-it");
            } else {
                System.out.println("Do-it-Not");
            }
        }
    }
}