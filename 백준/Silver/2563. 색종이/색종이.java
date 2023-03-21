import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] map = new int[100][100];

        while (N-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int i = a; i < a + 10; i++) {
                for (int j = b; j < b + 10; j++) {
                    map[i][j] = 1;
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (map[i][j] == 1) cnt++;
            }
        }

        System.out.println(cnt);
    }
}