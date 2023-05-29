import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int blue = 0;
    static int white = 0;

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

        binarySearch(0,0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    static void binarySearch(int x, int y, int N) {

        if (check(x, y, N)) {
            if (map[x][y] == 0) white ++;
            else blue ++;
            return;
        }

        int NN = N / 2;

        binarySearch(x, y, NN);
        binarySearch(x + NN, y, NN);
        binarySearch(x, y + NN, NN);
        binarySearch(x + NN, y + NN, NN);
    }

    static boolean check(int x, int y, int N) {
        
        for (int i = x; i < x + N; i++) {
            for (int j = y; j < y + N; j++) {
                if (map[x][y] != map[i][j]) return false;
            }
        }

        return true;
    }
}