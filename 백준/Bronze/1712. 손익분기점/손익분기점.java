import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if (B >= C) System.out.println(-1);
        else {
            int tmp = A / (C - B);
            System.out.println(tmp + 1);
        }
    }
}