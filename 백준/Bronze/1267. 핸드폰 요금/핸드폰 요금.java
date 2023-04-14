import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int minSik = 0;
        int yeongSik = 0;

        for (int i = 0; i < N; i++) {
            int tmp = in.nextInt();

            minSik += (tmp / 60) * 15 + 15;

            yeongSik += (tmp / 30) * 10 + 10;
        }

        if (minSik < yeongSik) System.out.println("M " + minSik);
        else if (minSik > yeongSik) System.out.println("Y " + yeongSik);
        else System.out.println("Y M " + minSik);
    }
}