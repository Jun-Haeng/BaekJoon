import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Character[][] arr = new Character[5][15];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            String str = in.nextLine();
            if (max < str.length()) max = str.length();

            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == null) continue;
                sb.append(arr[j][i]);
            }
        }

        System.out.println(sb);

        in.close();
    }
}