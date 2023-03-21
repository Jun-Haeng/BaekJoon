import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = String.valueOf(sc.nextInt());

        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (num == 6) arr[9]++;
            else arr[num]++;
        }

        int max = 0;

        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) max = arr[i];
        }
        int nine = arr[9] / 2;
        if (arr[9] % 2 == 1) nine++;

        max = Math.max(nine, max);

        System.out.println(max);
    }
}