import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            if (binarySearch(arr, tmp)) sb.append(1).append(' ');
            else sb.append(0).append(' ');
        }

        System.out.println(sb);
    }

    static boolean binarySearch(int[] arr, int num) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (num <= arr[mid]) end = mid;
            else start = mid + 1;
        }

        if (arr[start] == num) return true;
        else return false;
    }
}