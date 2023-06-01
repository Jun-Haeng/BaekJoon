import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] map = new char[N+1][M+1];
        char[][] compareWhite = new char[N+1][M+1];
        char[][] compareBlack = new char[N+1][M+1];

        for (int i = 1; i < N+1; i++) {
            String tmp = br.readLine();

            for (int j = 1; j < M+1; j++) {
                map[i][j] = tmp.charAt(j-1);
            }
        }

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < M+1; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        compareWhite[i][j] = 'W';
                    } else {
                        compareWhite[i][j] = 'B';
                    }
                } else {
                    if (j % 2 != 0) {
                        compareWhite[i][j] = 'B';
                    } else {
                        compareWhite[i][j] = 'W';
                    }
                }
            }
        }

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < M+1; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        compareBlack[i][j] = 'B';
                    } else {
                        compareBlack[i][j] = 'W';
                    }
                } else {
                    if (j % 2 != 0) {
                        compareBlack[i][j] = 'W';
                    } else {
                        compareBlack[i][j] = 'B';
                    }
                }
            }
        }


        int minValue = Integer.MAX_VALUE;

        for (int i = 1; i < N + 1 - 7; i++) {
            for (int j = 1; j < M + 1 - 7; j++) {

                int cnt1 = 0;
                int cnt2 = 0;

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (map[k][l] != compareWhite[k][l]) cnt1++;
                        if (map[k][l] != compareBlack[k][l]) cnt2++;
                    }
                }

                minValue = Math.min(Math.min(cnt1, cnt2), minValue);
            }
        }

        System.out.println(minValue);
    }
}