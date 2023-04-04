import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();

        int x = (e*c - b*f) / (a*e - b*d);
        int y = (c*d - a*f) / (b*d - e*a);

        System.out.print(x + " " + y);

        in.close();

    }
}