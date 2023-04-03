import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a0 = in.nextInt();
        int a1 = in.nextInt();

        int c = in.nextInt();

        int n0 = in.nextInt();

        if ( (c - a0) * n0 >= a1 && c >= a0) System.out.println(1);
        else System.out.println(0);

    }
}