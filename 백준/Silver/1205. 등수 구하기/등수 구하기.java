import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int score = in.nextInt();
        int P = in.nextInt();
        int cnt = 0;
        int same = 0;

        for (int i = 0; i < N; i++) {
            int tmp = in.nextInt();
            if (tmp > score) cnt++;
            else if (tmp == score) same++;
        }

        if (cnt + same >= P) System.out.println(-1);
        else System.out.println(cnt + 1);

    }
}