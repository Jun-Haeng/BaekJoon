import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int num = A * B * C;
        String str = String.valueOf(num);

        int[] arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int idx = Integer.parseInt(String.valueOf(str.charAt(i)));
            arr[idx] += 1;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}