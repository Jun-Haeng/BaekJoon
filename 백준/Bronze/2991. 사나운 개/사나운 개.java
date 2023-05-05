import java.util.Scanner;

public class Main {

    static int A, B, C, D;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        int P = in.nextInt();
        int M = in.nextInt();
        int N = in.nextInt();

        solve(P);
        solve(M);
        solve(N);
    }

    static void solve(int man) {
        int cnt = 0;

        if (man % (A + B) <= A && man % (A + B) > 0) cnt++;
        if (man % (C + D) <= C && man % (C + D) > 0) cnt++;

        System.out.println(cnt);
    }
}