import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt() - 1;

        String ans = in.next();

        int[] ansArr = new int[26];
        for (int i = 0; i < ans.length(); i++) {
            int index = ans.charAt(i) - 'A';
            ansArr[index]++;
        }

        int cnt = 0;

        while (N-- > 0) {

            String str = in.next();

            int[] strArr = new int[26];
            for (int i = 0; i < str.length(); i++) {
                int index = str.charAt(i) - 'A';
                strArr[index]++;
            }

            int differentCount = 0;
            int a = 0;
            int b = 0;
            
            for (int i = 0; i < 26; i++) {
                differentCount += Math.abs(strArr[i] - ansArr[i]);
                a += strArr[i];
                b += ansArr[i];
            }

            if (differentCount <= 1) cnt++;
            else if (differentCount == 2 && a == b) cnt++;
        }

        System.out.println(cnt);

    }
}