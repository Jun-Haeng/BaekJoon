import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int sum = 1;
        for (int i = 0; i < N; i++) {
            sum += in.nextInt() - 1;
        }

        System.out.println(sum);
    }
}