import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 0;

        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            end = Math.max(end, arr[i]);
        }

        while (start + 1 < end) {

            int mid = (start + end) / 2;

            if (check(mid)) start = mid;
            else end = mid;
        }

        System.out.println(start);
    }

    static boolean check(int num) {

        long sum = 0;
        long tree;

        for (int i = 0; i < N; i++) {
            tree = arr[i];

            if (tree >= num) sum += tree - num;
        }

        if (sum >= M) return true;
        else return false;
    }
}
