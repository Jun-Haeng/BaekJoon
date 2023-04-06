import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        if (N == 1) System.out.println(0);
        else System.out.println((N * (N - 1)));
        
    }
}