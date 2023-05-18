import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 기록남기기용 코드 주석으로 만듬
 * 아마 모든 0에 대해서 확인해보는 절차를 갖다보니
 * 시간초과가 나는거 같아서 다른사람 풀이를 참조하여
 * 풀었음...
 */

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    static int[][] map;
//    static int cnt = 0;
//    static String str = "";
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        map = new int[9][9];
//
//        StringTokenizer st;
//        for (int i = 0; i < 9; i++) {
//            st = new StringTokenizer(br.readLine()," ");
//
//            for (int j = 0; j < 9; j++) {
//                map[i][j] = Integer.parseInt(st.nextToken());
//
//                if (map[i][j] == 0) cnt++;
//            }
//        }
//
//        backTracking(0);
//    }
//
//    static void backTracking(int depth) {
//
//        if (depth == cnt) {
//
//            for (int i = 0; i < 9; i++) {
//                for (int j = 0; j < 9; j++) {
//                    System.out.print(map[i][j] + " ");
//                }
//
//                System.out.println();
//            }
//
//            System.exit(0);
//        }
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//
//                if (map[i][j] == 0) {
//                    for (int k = 1; k <= 9; k++) {
//
//                        if (check(i, j, k)) {
//                            map[i][j] = k;
//                            backTracking(depth + 1);
//                        }
//                    }
//                }
//
//                  map[i][j] = 0;
//            }
//        }
//    }
//
//    static boolean check(int x, int y, int value) {
//
//        int a = (x / 3) * 3;
//        int b = (y / 3) * 3;
//
//        // 9사분면 내에서의 체크
//        for (int i = a; i < a + 3 ; i++) {
//            for (int j = b; j < b + 3; j++) {
//                if (map[i][j] == value) return false;
//            }
//        }
//
//        // 가로에서의 체크
//        for (int j = 0; j < 9; j++) {
//            if (map[x][j] == value) return false;
//        }
//
//        // 세로에서의 체크
//        for (int i = 0; i < 9; i++) {
//            if (map[i][y] == value) return false;
//        }
//
//        return true;
//    }
//}


public class Main {

    static int[][] arr = new int[9][9];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
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
                    sb.append(arr[i][j]).append(' ');
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