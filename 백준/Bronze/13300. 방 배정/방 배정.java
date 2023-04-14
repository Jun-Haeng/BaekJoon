import java.util.Scanner;

public class Main {

    static int N, K;
    static int cnt;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        K = in.nextInt();

        int[] one = new int[2];
        int[] two = new int[2];
        int[] three = new int[2];
        int[] four = new int[2];
        int[] five = new int[2];
        int[] six = new int[2];

        for (int i = 0; i < N; i++) {
            int S = in.nextInt();
            int Y = in.nextInt();

            if (Y == 1) {
                if (S == 0) one[0] += 1;
                else one[1] += 1;
            }

            else if (Y == 2) {
                if (S == 0) two[0] += 1;
                else two[1] += 1;
            }

            else if (Y == 3) {
                if (S == 0) three[0] += 1;
                else three[1] += 1;
            }

            else if (Y == 4) {
                if (S == 0) four[0] += 1;
                else four[1] += 1;
            }

            else if (Y == 5) {
                if (S == 0) five[0] += 1;
                else five[1] += 1;
            }

            else {
                if (S == 0) six[0] += 1;
                else six[1] += 1;
            }
        }

        cnt = 0;

        count(one);
        count(two);
        count(three);
        count(four);
        count(five);
        count(six);

        System.out.println(cnt);
    }

    static void count(int[] arr) {
        for (int i = 0; i < 2; i++) {
            if (arr[i] != 0 && arr[i] % K != 0) cnt++;
            cnt += arr[i] / K;
        }
    }
}