import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        n = 1000 - n;

        int[] arr = new int[] {500, 100, 50, 10, 5, 1};

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {

            int coin = arr[i];

            while (true) {

                if (n < coin) break;

                n -= coin;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}