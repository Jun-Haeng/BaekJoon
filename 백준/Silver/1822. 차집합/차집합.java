import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
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

        Arrays.sort(A);
        Arrays.sort(B);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (!binarySearch(B, A[i])) {
                cnt++;
                sb.append(A[i]).append(' ');
            }
        }

        if (cnt == 0) System.out.println(0);
        else {
            System.out.println(cnt);
            System.out.println(sb);
        }
    }

    static boolean binarySearch(int[] arr, int num) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num < arr[mid]) end = mid - 1;
            else if (num > arr[mid]) start = mid + 1;
            else return true;
        }

        return false;
    }
}