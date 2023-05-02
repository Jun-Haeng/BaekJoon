import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int tmp = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();

            if (a == 1) tmp++;
            else tmp = 0;

            sum += tmp;
        }

        System.out.println(sum);
    }
}