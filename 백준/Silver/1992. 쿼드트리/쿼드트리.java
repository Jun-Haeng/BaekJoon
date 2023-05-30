import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();

            for (int j = 0; j < N; j++) {
                arr[i][j] = tmp.charAt(j) - '0';
            }
        }

        binarySearch(0, 0, N);

        System.out.println(sb);
    }

    public static void binarySearch(int x, int y, int size) {

        if (check(x, y, size)) {
            sb.append(arr[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append('(');

        binarySearch(x, y , newSize);
        binarySearch(x, y + newSize, newSize);
        binarySearch(x + newSize, y, newSize);
        binarySearch(x + newSize, y + newSize, newSize);

        sb.append(')');
    }

    public static boolean check(int x, int y, int size) {

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[x][y] != arr[i][j]) return false;
            }
        }

        return true;
    }
}