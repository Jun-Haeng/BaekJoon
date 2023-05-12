import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            int[] arr = new int[26];

            String str = in.nextLine();
            if (str.equals("*")) break;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') continue;
                arr[str.charAt(i) - 'a'] = 1;
            }

            boolean flag = true;

            for (int i : arr) {
                if (i != 1) {
                    flag = false;
                    break;
                }
            }

            if (flag) System.out.println("Y");
            else System.out.println("N");

        }
    }
}