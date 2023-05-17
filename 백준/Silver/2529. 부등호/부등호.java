import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static char[] arr;
    static boolean[] visited = new boolean[10];
    static List<String> res = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        backTracking("", 0);
        Collections.sort(res);

        System.out.println(res.get(res.size() - 1));
        System.out.println(res.get(0));
    }

    static void backTracking(String num, int depth) {

        if (depth == N + 1) {

            res.add(num);
            return;
        }

        for (int i = 0; i < 10; i++) {

            if (depth == 0 || !visited[i] && check(num.charAt(num.length() - 1) - '0',
                    i, arr[depth - 1])) {

                visited[i] = true;
                backTracking(num + i, depth + 1);
                visited[i] = false;
            }
        }
    }

    static boolean check(int before, int now, int chk) {
        if (chk == '<') return before < now;
        else return before > now;
    }
}