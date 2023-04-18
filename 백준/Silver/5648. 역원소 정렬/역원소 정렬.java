import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = reverse(in.next());
        }

        Arrays.sort(arr);
        for (long value : arr) {
            System.out.println(value);
        }
    }

    static long reverse(String str) {
        char[] c = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = c.length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }

        return Long.parseLong(sb.toString());
    }
}