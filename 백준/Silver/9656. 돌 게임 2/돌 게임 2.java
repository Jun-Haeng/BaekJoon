import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int cnt = N % 3 + N / 3;

        if (cnt % 2 == 0) System.out.println("SK");
        else System.out.println("CY");
    }
}