import java.util.Scanner;

public class Main {

    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        System.out.println((int) (Math.pow(2, N) - 1));
        hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    static void hanoi(int N, int start, int mid, int to) {

        if (N == 1) {
            sb.append(start + " " + to).append('\n');
            return;
        }

        hanoi(N - 1, start, to, mid);
        sb.append(start + " " + to).append('\n');
        hanoi(N - 1, mid, start, to);
    }
}