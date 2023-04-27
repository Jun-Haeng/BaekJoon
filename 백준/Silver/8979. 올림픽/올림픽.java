import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][4];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        
        boolean[][] v = new boolean[N][2];

        int gold = arr[M-1][1];
        int silver = arr[M-1][2];
        int bronze = arr[M-1][3];
        int cnt = 0;

        for (int i = 0; i < N; i++) {

            if (arr[i][1] > gold) cnt++;
            else if (arr[i][1] == gold) v[i][0] = true;
        }

        for (int i = 0; i < N; i++) {
            if (v[i][0]) {
                if (arr[i][2] > silver) cnt++;
                else if (arr[i][2] == silver) v[i][1] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            if (v[i][1]) {
                if (arr[i][3] > bronze) cnt++;
            }
        }

        System.out.println(cnt + 1);

    }
}