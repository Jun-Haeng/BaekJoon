import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[81];

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    arr[i+j+k]++;
                }
            }
        }

        int cnt = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > cnt) {
                cnt = arr[i];
                ans = i;
            }
        }

        System.out.println(ans);
    }
}