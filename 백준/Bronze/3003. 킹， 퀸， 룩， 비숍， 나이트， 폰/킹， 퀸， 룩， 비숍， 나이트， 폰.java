import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {

            int a = in.nextInt();

            if (i < 2) {

                if (a > 1) System.out.print(1 - a);
                else if (a == 1) System.out.print(0);
                else System.out.print(1 - a);
            }

            else if (i < 5) {

                if (a > 2) System.out.print(2 - a);
                else if (a == 2) System.out.print(0);
                else System.out.print(2 - a);
            }

            else {

                if (a > 8) System.out.print(8 - a);
                else if (a == 8) System.out.print(0);
                else System.out.print(8 - a);
            }
            
            if (i == 5) continue;
            else System.out.print(" ");
        }
    }
}