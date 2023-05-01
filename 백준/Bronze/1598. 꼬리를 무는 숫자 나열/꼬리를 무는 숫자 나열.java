import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;

        System.out.println(Math.abs(a / 4 - b / 4) + Math.abs(a % 4 - b % 4));
    }
}