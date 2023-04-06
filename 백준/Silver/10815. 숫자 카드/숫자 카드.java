import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            if (binarySearch(Integer.parseInt(st.nextToken()))) {
                sb.append("1 ");
            } else sb.append("0 ");
        }
        System.out.println(sb);
    }

    public static boolean binarySearch(int target) {
        int left = 0;
        int right = N - 1;

        while (left <= right) {

            int midIndex = (left + right) / 2;
            int mid = arr[midIndex];

            if (target == mid) return true;
            else if (target > mid) left = midIndex + 1;
            else right = midIndex - 1;
        }

        return false;
    }
}