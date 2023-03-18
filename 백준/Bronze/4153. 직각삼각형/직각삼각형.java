import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A, B, C;
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0 && C == 0) break;

            int max = (int) Math.pow(Math.max(A, Math.max(B, C)), 2);
            int powA = (int) Math.pow(A, 2);
            int powB = (int) Math.pow(B, 2);
            int powC = (int) Math.pow(C, 2);

            if (powA + powB + powC == 2 * max) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}