import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();

        int ans = 10;

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' ) {
                if (str.charAt(i-1) == '(') ans += 5;
                else ans += 10;
            } else {
                if (str.charAt(i-1) == ')' ) ans += 5;
                else ans += 10;
            }
        }

        System.out.println(ans);
    }
}