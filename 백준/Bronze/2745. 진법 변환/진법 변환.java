import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = i + 10;
        }

        String str = in.next();
        int B = in.nextInt();

        int idx = 0;

        int sum = 0;

        for (int i = str.length() - 1; i >= 0; i--) {

            int c = str.charAt(i) - 'A';
            if (c < 0) sum += Integer.parseInt(String.valueOf(str.charAt(i))) * Math.pow(B, idx);
            else sum += arr[c] * Math.pow(B, idx);
            idx++;
        }

        System.out.println(sum);

        in.close();
    }
}