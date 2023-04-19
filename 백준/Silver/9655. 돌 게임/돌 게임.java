import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        
        int a = N / 3;
        int b = N % 3;

        int res = a + b;

        if (res % 2 == 0) System.out.println("CY");
        else System.out.println("SK");
    }
}