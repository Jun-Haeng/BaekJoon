import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int f = 2;
        int res = 0;

        for (int i = 0; i < N; i++) {
            f += Math.pow(2, i);
        }

        System.out.println((int)Math.pow(f, 2));
    }
}