import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int X = solve(in.next());
        int Y = solve(in.next());

        System.out.println(solve(String.valueOf(X + Y)));
    }

    static int solve(String num) {

        StringBuilder tmp = new StringBuilder();

        for (int i = num.length() - 1; i >= 0; i--) {
            tmp.append(num.charAt(i));
        }

        return Integer.parseInt(tmp.toString());
    }
}