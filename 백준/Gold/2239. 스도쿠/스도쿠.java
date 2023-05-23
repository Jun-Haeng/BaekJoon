import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr = new int[9][9];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            String tmp = br.readLine();

            for (int j = 0; j < 9; j++) {
                arr[i][j] = tmp.charAt(j) - '0';
            }
        }

        backTracking(0, 0);
    }

    static void backTracking(int row, int col) {

        if (col == 9) {
            backTracking(row + 1, 0);
            return;
        }

        if (row == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]);
                }
                sb.append('\n');
            }

            System.out.println(sb);
            System.exit(0);
        }

        if (arr[row][col] == 0) {

            for (int i = 1; i <= 9; i++) {
                if (possibility(row, col, i)) {
                    arr[row][col] = i;
                    backTracking(row, col + 1);
                }
            }

            arr[row][col] = 0;
            return;
        }

        backTracking(row, col + 1);
    }

    static boolean possibility(int row, int col, int value) {

        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == value) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == value) return false;
        }

        int setRow = (row / 3) * 3;
        int setCol = (col / 3) * 3;

        for (int i = setRow; i < setRow + 3; i++) {
            for (int j = setCol; j < setCol + 3; j++) {
                if (arr[i][j] == value) return false;
            }
        }

        return true;
    }
}