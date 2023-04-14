import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            int a = in.nextInt();

            if (a % 2 != 0) {
                sum += a;
                min = Math.min(min, a);
            }
        }
        
        if (min == Integer.MAX_VALUE) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}