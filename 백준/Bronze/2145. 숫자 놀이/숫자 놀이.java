import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            String str = in.nextLine();
            if (str.equals("0")) break;

            while (true) {

                if (str.length() == 1) {
                    System.out.println(str);
                    break;
                }

                int sum = 0;
                for (int i = 0; i < str.length(); i++) {
                    sum += str.charAt(i) - '0';
                }

                str = String.valueOf(sum);
            }
        }
    }
}