import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int res = 0;

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            if (a == 1) res++;
            else res--;
        }

        if (res < 0) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");
    }
}