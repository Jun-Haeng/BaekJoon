import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] sortedArr = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            sortedArr[i] = arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedArr);

        int rank = 0;
        for (int value : sortedArr) {

            if (!map.containsKey(value)) {
                map.put(value, rank);
                rank++;
            }
        }


        for (int value : arr) {
            sb.append(map.get(value)).append(' ');
        }

        System.out.println(sb);

    }
}