import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        boolean flag = false;

        for (int i = 1; i < N; i++) {

            String str = String.valueOf(i);

            int sum = i;

            for (int j = 0; j < str.length(); j++) {
                sum += str.charAt(j) - '0';
            }

            if (sum == N) {
                flag = true;
                System.out.println(i);
                break;
            }
        }

        if (!flag) System.out.println(0);
        
    }
}