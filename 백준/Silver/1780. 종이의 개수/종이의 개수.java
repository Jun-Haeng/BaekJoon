import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int minus = 0;
    static int zero = 0;
    static int one = 0;
    static int[][] map;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        binarySearch(0, 0, N);

        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);

    }

    static void binarySearch(int x, int y, int N) {

        if (check(x, y, N)) {
            if (map[x][y] == -1) minus++;
            else if (map[x][y] == 0) zero++;
            else one++;

            return;
        }

        int NN = N / 3;

        binarySearch(x, y, NN);
        binarySearch(x, y + NN, NN);
        binarySearch(x, y + 2 * NN, NN);

        binarySearch(x + NN, y, NN);
        binarySearch(x + NN, y + NN, NN);
        binarySearch(x + NN, y + 2 * NN, NN);

        binarySearch(x + 2 * NN, y, NN);
        binarySearch(x + 2 * NN, y + NN, NN);
        binarySearch(x + 2 * NN, y + 2 * NN, NN);
    }

    static boolean check(int x, int y, int N) {

        for (int i = x; i < x + N; i++) {
            for (int j = y; j < y + N; j++) {
                if (map[i][j] != map[x][y]) return false;
            }
        }

        return true;
    }
}