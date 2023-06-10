import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        int[] B = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        int s1 = 0;
        int s2 = 0;

        while (true) {

            while (s1 != N && s2 == M) sb.append(A[s1++]).append(" ");
            while (s1 == N && s2 != M) sb.append(B[s2++]).append(" ");

            if (s1 == N && s2 == M) break;

            if (A[s1] < B[s2]) sb.append(A[s1++]).append(" ");
            else sb.append(B[s2++]).append(" ");
        }

        System.out.println(sb);
    }
}