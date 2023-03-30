import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            int a = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < 4; j++) {
                if (st.nextToken().equals("0")) a++;
            }

            if (a == 0) System.out.println("E");
            else if (a == 1) System.out.println("A");
            else if (a == 2) System.out.println("B");
            else if (a == 3) System.out.println("C");
            else System.out.println("D");
        }
    }
}