import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /*
        구현하는 아이디어 까지는 생각해낼수 있었지만,
        실제로 표현하는 방법이 부족했던거 같다. 노가다로 하나하나 다 경우의
        수를 정해서 구해보려 했는데 밑에와 같이 재귀함수로 풀면 정말
        간단하게 해결할수 있었다는 점을 알지 못했었다..
     */

    static int[][] arr = new int[4][8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            String line = br.readLine();
            for (int j = 0; j < 8; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        int k = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int index = Integer.parseInt(st.nextToken()) - 1;
            int direction = Integer.parseInt(st.nextToken());
            gearOperation(index, direction);
        }

        int res = 0;

        for (int i = 0; i < 4; i++) {
            res += Math.pow(2, i) * arr[i][0];
        }

        System.out.println(res);
    }

    public static void gearOperation(int index, int direction) {

        leftRotation(index - 1, -direction);
        rightRotation(index + 1, -direction);
        rotation(index, direction);
    }

    public static void leftRotation(int index, int direction) {

        if (index < 0) return;
        if (arr[index][2] == arr[index+1][6]) return;
        leftRotation(index - 1, -direction);
        rotation(index, direction);
    }

    public static void rightRotation(int index, int direction) {

        if (index > 3) return;
        if (arr[index][6] == arr[index-1][2]) return;
        rightRotation(index + 1, -direction);
        rotation(index, direction);
    }

    public static void rotation(int index, int direction) {

        if (direction == 1) {
            int tmp = arr[index][7];
            for (int i = 7; i >= 1; i--) {
                arr[index][i] = arr[index][i-1];
            }
            arr[index][0] = tmp;

        } else {
            int tmp = arr[index][0];
            for (int i = 0; i < 7; i++) {
                arr[index][i] = arr[index][i+1];
            }
            arr[index][7] = tmp;
        }

    }
}