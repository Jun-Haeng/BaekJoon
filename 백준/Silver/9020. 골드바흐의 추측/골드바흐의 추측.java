import java.util.Scanner;

public class Main {
    
    // 에라토스 어쩌구의 체를 너무 멋없게 짠거같음.. 더 시간 줄일수 있는데
    // 그리고 솔직히 1씩 증가 1씩 감소는 동일하게 하는게 맞는건데 왜 저런식으로
    // 생각했을지에 대해서는... 좀 그렇다 . 시간낭비 너무 심했던듯

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        boolean[] prime = new boolean[100002];

        for (int i = 2; i <= Math.sqrt(100001); i++) {
            for (int j = i*i; j <= 100001; j += i) {
                if (!prime[j]) prime[j] = true;
            }
        }

        for (int t = 0; t < T; t++) {
            StringBuilder sb = new StringBuilder();
            int n = in.nextInt();

            int mid = n / 2;
            int l = mid;
            int r = mid;

            while (true) {

                if (!prime[l] && !prime[r] && (l + r) == n) {
                    sb.append(l).append(" ").append(r);
                    break;
                }

                l--;

                if (!prime[l] && !prime[r] && (l + r) == n) {
                    sb.append(l).append(" ").append(r);
                    break;
                }

                r++;

            }

            System.out.println(sb);
        }

    }
}