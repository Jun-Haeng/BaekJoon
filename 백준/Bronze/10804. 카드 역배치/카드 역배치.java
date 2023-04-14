import java.util.Scanner;

public class Main {

    static int[] arr;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;

            int num = (b - a + 1) / 2;
            int cnt = 0;

            for (int j = 0; j < num; j++) {
                int tmp = arr[a + cnt];
                arr[a + cnt] = arr[b - cnt];
                arr[b - cnt] = tmp;
                cnt++;
            }
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}