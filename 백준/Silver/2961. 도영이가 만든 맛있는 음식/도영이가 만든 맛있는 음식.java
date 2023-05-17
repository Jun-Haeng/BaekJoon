import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] S;
    static int[] B;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        S = new int[N];
        B = new int[N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            S[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(1, 0, 0, 0);
        System.out.println(min);
    }

    static void backTracking(int num1, int num2, int depth, int cnt) {

        if (depth == N) {

            if (cnt != 0) {
                min = Math.min(Math.abs(num1 - num2), min);
            }
            return;
        }

        // cnt라는 변수를 통해서 더욱 간단하게 만들수 이씀.. 시간초과도 안나고

        backTracking(num1 * S[depth], num2 + B[depth], depth + 1, cnt + 1);
        backTracking(num1, num2, depth + 1, cnt);
    }
}