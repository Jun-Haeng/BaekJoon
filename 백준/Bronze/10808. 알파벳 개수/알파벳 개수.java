import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        in.close();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';

            arr[idx] += 1;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}