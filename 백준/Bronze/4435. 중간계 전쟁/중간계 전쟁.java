import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] arr1 = {1, 2, 3, 3, 4, 10};
        int[] arr2 = {1, 2, 2, 2, 3, 5, 10};

        int index = 1;

        StringTokenizer st;
        while (T-- > 0) {

            int sum1 = 0;
            int sum2 = 0;

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 6; i++) {
                sum1 += Integer.parseInt(st.nextToken()) * arr1[i];
            }

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 7; i++) {
                sum2 += Integer.parseInt(st.nextToken()) * arr2[i];
            }

            if (sum1 > sum2) {
                System.out.println("Battle " + index + ": Good triumphs over Evil");
            } else if (sum1 < sum2) {
                System.out.println("Battle " + index + ": Evil eradicates all trace of Good");
            } else {
                System.out.println("Battle " + index + ": No victor on this battle field");
            }

            index++;
        }
    }
}