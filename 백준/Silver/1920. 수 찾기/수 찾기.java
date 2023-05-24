import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {

            long tmp = Integer.parseInt(st.nextToken());
            if (binarySearch(arr, tmp)) sb.append(1).append('\n');
            else sb.append(0).append('\n');
        }

        System.out.println(sb);
    }

    static boolean binarySearch(long[] arr, long key) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (key < arr[mid]) end = mid - 1;
            else if (key > arr[mid]) start = mid + 1;
            else return true;
        }

        return false;
    }
}