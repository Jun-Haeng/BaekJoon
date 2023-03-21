import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int sumArr = Arrays.stream(arr).sum();

        int a = 0;
        int b = 0;

        Loop1 :
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sumArr - (arr[i] + arr[j]) == 100) {
                    a = arr[i];
                    b = arr[j];
                    break Loop1;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i] == a || arr[i] == b) continue;
            else System.out.println(arr[i]);
        }
    }
}