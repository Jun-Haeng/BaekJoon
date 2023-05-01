import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int M = in.nextInt();

        int target = 1;

        while (M-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();

            if (x == target) target = y;
            else if (y == target) target = x;
        }

        System.out.println(target);
    }
}