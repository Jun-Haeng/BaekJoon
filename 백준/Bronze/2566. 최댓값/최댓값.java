
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int max = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]) max = arr[i][j];
            }
        }

        int idxI = -1;
        int idxJ = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max == arr[i][j]) {
                    idxI = i + 1;
                    idxJ = j + 1;
                    break;
                }
            }
        }

        System.out.println(max);
        System.out.println(idxI + " " +idxJ);
    }
}