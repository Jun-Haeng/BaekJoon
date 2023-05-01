import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = N; i >= 0; i--) {

            String str = String.valueOf(i);
            boolean f = false;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != '4' && str.charAt(j) != '7') {
                    f = true;
                }
            }

            if (!f) {
                System.out.println(i);
                break;
            }
        }
    }
}