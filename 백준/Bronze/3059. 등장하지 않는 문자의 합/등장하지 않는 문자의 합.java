import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = i + 65;
        }

        while (T-- > 0) {
            String S = in.next();
            int tmp = 0;

            boolean[] flag = new boolean[26];

            for (int i = 0; i < S.length(); i++) {
                flag[S.charAt(i) - 'A'] = true;
            }

            for (int i = 0; i < 26; i++) {
                if (!flag[i]) {
                    tmp += arr[i];
                }
            }

            System.out.println(tmp);

        }
    }
}