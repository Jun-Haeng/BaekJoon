import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        // A 300 B 60 C 10

        int a = T / 300;
        T = T % 300;
        int b = T / 60;
        T = T % 60;
        int c = T / 10;
        T = T % 10;
        
        if (T != 0) System.out.println(-1);
        else System.out.print(a + " " + b + " " + c);

    }
}