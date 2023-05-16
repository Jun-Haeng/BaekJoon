import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[] arr = new int[11];
        arr[0] = H;

        for (int i = 1; i <= 10; i++) {
            arr[i] = (int) (arr[i-1] * (1.05));

            if (i - 3 >= 0) {
                arr[i] = Math.max(arr[i], (int) (arr[i-3] * (1.2)));
            }

            if (i - 5 >= 0) arr[i] =
                    Math.max(arr[i], (int) (arr[i-5] * (1.35)));
        }

        System.out.println(arr[Y]);

    }
}