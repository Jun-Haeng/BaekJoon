import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int cnt = 0;

        while (true) {

            if (str.length() == 1) {
                System.out.println(cnt);
                if (Integer.parseInt(str) % 3 == 0) System.out.println("YES");
                else System.out.println("NO");
                break;
            }

            int tmpInteger = 0;

            for (int i = 0; i < str.length(); i++) {
                tmpInteger += str.charAt(i) - '0';
            }

            str = String.valueOf(tmpInteger);
            cnt++;
        }
    }
}