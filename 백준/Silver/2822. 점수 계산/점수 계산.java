import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] tmp = new int[8];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        Arrays.sort(tmp);

        int sum = 0;

        for (int i = 7; i >= 3; i--) {
            sum += tmp[i];
        }

        System.out.println(sum);

        List<Integer> res = new ArrayList<>();

        for (int i = 7; i >= 3; i--) {
            for (int j = 0; j < 8; j++) {
                if (tmp[i] == arr[j]) {
                    res.add(j+1);
                }
            }
        }

        Collections.sort(res);

        for (Integer value : res) {
            System.out.print(value + " ");
        }

    }
}