import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int L, C;
    static char[] arr;
    static char[] res;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        res = new char[C];
        arr = new char[L];

        for (int i = 0; i < C; i++) {
            res[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(res);
        backTracking(0, 0);
    }

    static void backTracking(int depth, int index) {
        if (depth == L) {
            if (possible(arr)) {
                for (char c : arr) {
                    System.out.print(c);
                }
                System.out.println();
            }

            return;
        }

        for (int i = index; i < C ; i++) {
            arr[depth] = res[i];
            backTracking(depth + 1, i + 1);
        }
    }

    static boolean possible(char[] arr) {
        int a = 0;
        int b = 0;

        for (char c : arr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u') a++;
            else b++;
        }

        if (a >= 1 && b >= 2) return true;
        return false;
    }
}