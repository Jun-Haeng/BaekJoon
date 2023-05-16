import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int L, C;
    static char[] arr;
    static char[] ans;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        arr = new char[C];
        ans = new char[L];

        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        // 최소 한개의 모음, 두개의 자음..

        dfs(0, 0);

        System.out.println(sb);
    }

    static void dfs(int at, int depth) {
        if (depth == L) {
            if (possible(ans)) {
                for (char an : ans) {
                    sb.append(an);
                }
                sb.append('\n');
            }
            return;
        }

        for (int i = at; i < C; i++) {
            ans[depth] = arr[i];
            dfs(i + 1, depth + 1);
        }

    }

    static boolean possible(char[] ans) {
        int a = 0;
        int b = 0;

        for (char c : ans) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') a++;
            else b++;
        }

        return a >= 1 && b >= 2;
    }
}