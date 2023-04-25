import java.util.Scanner;

public class Main {

    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        cost = new int[N][3];
        dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            cost[i][0] = in.nextInt();
            cost[i][1] = in.nextInt();
            cost[i][2] = in.nextInt();
        }

        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        System.out.println(Math.min(Math.min(paintCost(N-1, 0),
                paintCost(N-1, 1)),
                paintCost(N-1, 2)));
    }

    static int paintCost(int N, int color) {

        if (dp[N][color] == 0) {

            if (color == 0) {
                dp[N][color] = Math.min(paintCost(N-1, 1),
                            paintCost(N-1, 2)) + cost[N][0];
            } else if (color == 1) {
                dp[N][color] = Math.min(paintCost(N-1, 0),
                            paintCost(N-1, 2)) + cost[N][1];
            } else {
                dp[N][color] = Math.min(paintCost(N-1, 1),
                            paintCost(N-1, 0)) + cost[N][2];
            }
        }
        
        return dp[N][color];
    }
}